import os
import re
import telebot
import requests
import xml.etree.ElementTree as ET
from telebot import types as tg_types
from reportlab.lib.pagesizes import letter
from reportlab.platypus import SimpleDocTemplate, Paragraph
from reportlab.lib.styles import getSampleStyleSheet, ParagraphStyle
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont

# ==================== НАСТРОЙКИ АГЕНТА ====================
TELEGRAM_TOKEN = "..."
# ==========================================================

bot = telebot.TeleBot(TELEGRAM_TOKEN)

# Регистрируем стандартный системный шрифт Windows Arial для корректного отображения русского языка в PDF
try:
    pdfmetrics.registerFont(TTFont('Arial', 'C:\\Windows\\Fonts\\arial.ttf'))
except:
    pass

def get_main_keyboard():
    markup = tg_types.ReplyKeyboardMarkup(resize_keyboard=True, row_width=2)
    markup.add(tg_types.KeyboardButton("🏁 Старт / Инструкция"), tg_types.KeyboardButton("🔄 Перезапустить бота"))
    return markup

def get_pdf_inline_keyboard():
    """Создает инлайн-кнопку под сообщением для генерации PDF"""
    markup = tg_types.InlineKeyboardMarkup()
    btn_pdf = tg_types.InlineKeyboardButton(text="📄 Создать PDF-отчет", callback_data="generate_pdf")
    markup.add(btn_pdf)
    return markup

def create_pdf_report(text, filename="workout_report.pdf"):
    """Создает чистый PDF-файл из текстового отчета"""
    doc = SimpleDocTemplate(filename, pagesize=letter, rightMargin=40, leftMargin=40, topMargin=40, bottomMargin=40)
    styles = getSampleStyleSheet()
    
    custom_style = ParagraphStyle(
        'RussianStyle',
        parent=styles['Normal'],
        fontName='Arial',
        fontSize=11,
        leading=16,
        spaceAfter=10
    )
    
    story = []
    formatted_text = text.replace('\n', '<br/>')
    formatted_text = formatted_text.replace('**', '')
    
    story.append(Paragraph(formatted_text, custom_style))
    doc.build(story)
    return filename
def compress_tcx(file_path):
    try:
        xml_text = open(file_path, 'r', encoding='utf-8', errors='ignore').read()
        xml_text = re.sub(r'xmlns="[^"]*"', '', xml_text) 
        root = ET.fromstring(xml_text)
        
        # Переменные для точного подсчета итогов всей тренировки
        total_session_seconds = 0.0
        total_session_meters = 0.0
        total_session_calories = 0
        
        sport_type = "Не определен"
        activity_tag = root.find('.//Activity')
        if activity_tag is not None:
            raw_sport = activity_tag.get('Sport', '').lower()
            if 'running' in raw_sport or 'running' in xml_text.lower(): sport_type = "Бег"
            elif 'biking' in raw_sport or 'biking' in xml_text.lower() or 'cycling' in raw_sport: sport_type = "Велосипед"
            elif 'swimming' in raw_sport: sport_type = "Плавание"

        summary = []
        for i, lap in enumerate(root.findall('.//Lap')):
            total_time = lap.find('TotalTimeSeconds')
            dist = lap.find('DistanceMeters')
            max_hr = lap.find('.//MaximumHeartRateBpm/Value')
            avg_hr = lap.find('.//AverageHeartRateBpm/Value')
            calories = lap.find('Calories')
            
            if total_time is not None: total_session_seconds += float(total_time.text)
            if dist is not None: total_session_meters += float(dist.text)
            if calories is not None: total_session_calories += int(calories.text)
            
            lap_info = f"Круг {i+1}: "
            if total_time is not None: lap_info += f"Время: {round(float(total_time.text)/60, 1)} мин, "
            if dist is not None: lap_info += f"Дистанция: {round(float(dist.text)/1000, 2)} км, "
            if avg_hr is not None: lap_info += f"Ср.Пульс: {avg_hr.text}, "
            if max_hr is not None: lap_info += f"Макс.Пульс: {max_hr.text}, "
            summary.append(lap_info)
            
        # Счётчики секунд для каждой пульсовой зоны
        z1_sec = z2_sec = z3_sec = z4_sec = z5_sec = z6_sec = 0
        
        trackpoints = root.findall('.//Trackpoint')
        points_summary = ["\nКраткая выборка графиков по ходу тренировки (раз в минуту):"]
        
        # Посекундный обход ВСЕХ точек для точной калькуляции времени в зонах ЧСС
        for idx, p in enumerate(trackpoints):
            hr_tag = p.find('.//HeartRateBpm/Value')
            if hr_tag is not None:
                hr = int(hr_tag.text)
                
                # Математический расчёт зон на уровне Python
                if sport_type == "Велосипед":
                    if hr <= 102: z1_sec += 1
                    elif hr <= 114: z2_sec += 1
                    elif hr <= 125: z3_sec += 1
                    elif hr <= 134: z4_sec += 1
                    elif hr <= 146: z5_sec += 1
                    else: z6_sec += 1
                else:  # Для бега и плавания по умолчанию считаем беговые лабораторные зоны
                    if hr < 120: z1_sec += 1
                    elif hr <= 133: z2_sec += 1
                    elif hr <= 146: z3_sec += 1
                    elif hr <= 154: z4_sec += 1
                    else: z5_sec += 1

            # Для ИИ оставляем компактный поминутный срез (раз в 60 точек)
            if idx % 60 == 0:
                p_time = p.find('Time')
                cad = p.find('.//Cadence')
                speed = p.find('.//Extensions//Speed')
                p_info = ""
                if p_time is not None: p_info += f"Время: {p_time.text[-13:-5]} | "
                if hr_tag is not None: p_info += f"Пульс: {hr_tag.text} | "
                if cad is not None: p_info += f"Каденс: {cad.text} | "
                if speed is not None: p_info += f"Скорость: {round(float(speed.text)*3.6, 1)} км/ч"
                if p_info: points_summary.append(p_info)
            
        final_minutes = round(total_session_seconds / 60, 1)
        final_kilometers = round(total_session_meters / 1000, 2)
        
        # Переводим посекундные суммы зон в минуты для удобства ИИ
        z1_min = round(z1_sec / 60, 1)
        z2_min = round(z2_sec / 60, 1)
        z3_min = round(z3_sec / 60, 1)
        z4_min = round(z4_sec / 60, 1)
        z5_min = round(z5_sec / 60, 1)
        z6_min = round(z6_sec / 60, 1)
        
        # Формируем жесткую, неоспоримую текстовую статистику зон
        if sport_type == "Велосипед":
            zones_text = (f"Зона 1 (Восстановление): {z1_min} мин\n"
                          f"Зона 2 (Выносливость): {z2_min} мин\n"
                          f"Зона 3 (Темповая): {z3_min} мин\n"
                          f"Зона 4 (Анаэробный порог): {z4_min} мин\n"
                          f"Зона 5 (МПК): {z5_min} мин\n"
                          f"Зона 6 (Анаэробная емкость): {z6_min} мин")
        else:
            zones_text = (f"Зона 1 (Восстановление): {z1_min} мин\n"
                          f"Зона 2 (Аэ выносливость): {z2_min} мин\n"
                          f"Зона 3 (Смешанная): {z3_min} мин\n"
                          f"Зона 4 (Пороговая): {z4_min} мин\n"
                          f"Зона 5 (МПК): {z5_min} мин")

        header_summary = [
            f"ОФИЦИАЛЬНЫЙ ТИП СПОРТА ИЗ ДАТЧИКОВ: {sport_type}",
            f"ИТОГОВОЕ ОБЩЕЕ ВРЕМЯ ВСЕЙ ТРЕНИРОВКИ: {final_minutes} мин",
            f"ИТОГОВАЯ ОБЩАЯ ДИСТАНЦИЯ ВСЕЙ ТРЕНИРОВКИ: {final_kilometers} км",
            f"ИТОГОВЫЕ ОБЩИЕ КАЛОРИИ ВСЕЙ ТРЕНИРОВКИ: {total_session_calories} ккал",
            f"\nТОЧНОЕ ВРЕМЯ В ЛАБОРАТОРНЫХ ЗОНАХ ЧСС (ПОСЕКУНДНЫЙ РАСЧЕТ ЯДРА PYTHON):\n{zones_text}\n"
        ]
        
        full_compressed_text = "\n".join(header_summary) + "\n".join(summary) + "\n" + "\n".join(points_summary[:100])
        return sport_type, final_minutes, final_kilometers, total_session_calories, zones_text, full_compressed_text
        
    except Exception as e:
        return "Не определен", 0, 0, 0, "Ошибка", f"Ошибка обработки файла: {e}"
    try:
        xml_text = open(file_path, 'r', encoding='utf-8', errors='ignore').read()
        xml_text = re.sub(r'xmlns="[^"]*"', '', xml_text) 
        root = ET.fromstring(xml_text)
        
        # Переменные для точного подсчета итогов всей тренировки
        total_session_seconds = 0.0
        total_session_meters = 0.0
        total_session_calories = 0
        
        sport_type = "Не определен"
        activity_tag = root.find('.//Activity')
        if activity_tag is not None:
            raw_sport = activity_tag.get('Sport', '').lower()
            if 'running' in raw_sport or 'running' in xml_text.lower(): sport_type = "Бег"
            elif 'biking' in raw_sport or 'biking' in xml_text.lower() or 'cycling' in raw_sport: sport_type = "Велосипед"
            elif 'swimming' in raw_sport: sport_type = "Плавание"

        summary = []
        
        # Перебираем круги, собираем информацию и суммируем общие показатели
        for i, lap in enumerate(root.findall('.//Lap')):
            total_time = lap.find('TotalTimeSeconds')
            dist = lap.find('DistanceMeters')
            max_hr = lap.find('.//MaximumHeartRateBpm/Value')
            avg_hr = lap.find('.//AverageHeartRateBpm/Value')
            calories = lap.find('Calories')
            intensity = lap.find('Intensity')
            
            # Аккумулируем данные датчиков
            if total_time is not None: total_session_seconds += float(total_time.text)
            if dist is not None: total_session_meters += float(dist.text)
            if calories is not None: total_session_calories += int(calories.text)
            
            lap_info = f"Круг {i+1}: "
            if total_time is not None: lap_info += f"Время: {round(float(total_time.text)/60, 1)} мин, "
            if dist is not None: lap_info += f"Дистанция: {round(float(dist.text)/1000, 2)} км, "
            if avg_hr is not None: lap_info += f"Ср.Пульс: {avg_hr.text}, "
            if max_hr is not None: lap_info += f"Макс.Пульс: {max_hr.text}, "
            summary.append(lap_info)
            
        # Переводим общие суммы в понятные для ИИ единицы измерения
        final_minutes = round(total_session_seconds / 60, 1)
        final_kilometers = round(total_session_meters / 1000, 2)
        
        # Помещаем жесткие итоговые цифры в самый верх текстовой выжимки
        header_summary = [
            f"ОФИЦИАЛЬНЫЙ ТИП СПОРТА ИЗ ДАТЧИКОВ: {sport_type}",
            f"ИТОГОВОЕ ОБЩЕЕ ВРЕМЯ ВСЕЙ ТРЕНИРОВКИ: {final_minutes} мин",
            f"ИТОГОВАЯ ОБЩАЯ ДИСТАНЦИЯ ВСЕЙ ТРЕНИРОВКИ: {final_kilometers} км",
            f"ИТОГОВЫЕ ОБЩИЕ КАЛОРИИ ВСЕЙ ТРЕНИРОВКИ: {total_session_calories} ккал\n"
        ]
        
        trackpoints = root.findall('.//Trackpoint')
        points_summary = ["\nВыборка телеметрии по ходу тренировки (раз в минуту):"]
        for p_idx in range(0, len(trackpoints), 60):
            p = trackpoints[p_idx]
            p_time = p.find('Time')
            hr = p.find('.//HeartRateBpm/Value')
            cad = p.find('.//Cadence')
            speed = p.find('.//Extensions//Speed')
            p_info = ""
            if p_time is not None: p_info += f"Время: {p_time.text[-13:-5]} | "
            if hr is not None: p_info += f"Пульс: {hr.text} | "
            if cad is not None: p_info += f"Каденс: {cad.text} | "
            if speed is not None: p_info += f"Скорость: {round(float(speed.text)*3.6, 1)} км/ч"
            if p_info: points_summary.append(p_info)
            
        # Объединяем всё в один поток данных для Ollama
        full_compressed_text = "\n".join(header_summary) + "\n".join(summary) + "\n" + "\n".join(points_summary[:100])
        return sport_type, final_minutes, final_kilometers, total_session_calories, full_compressed_text
        
    except Exception as e:
        return "Не определен", 0, 0, 0, f"Ошибка обработки файла: {e}"
    try:
        xml_text = open(file_path, 'r', encoding='utf-8', errors='ignore').read()
        xml_text = re.sub(r'xmlns="[^"]*"', '', xml_text) 
        root = ET.fromstring(xml_text)
        
        sport_type = "Не определен"
        activity_tag = root.find('.//Activity')
        if activity_tag is not None:
            raw_sport = activity_tag.get('Sport', '').lower()
            if 'running' in raw_sport or 'running' in xml_text.lower(): sport_type = "Бег"
            elif 'biking' in raw_sport or 'biking' in xml_text.lower() or 'cycling' in raw_sport: sport_type = "Велосипед"
            elif 'swimming' in raw_sport: sport_type = "Плавание"

        summary = [f"ОФИЦИАЛЬНЫЙ ТИП СПОРТА ИЗ ДАТЧИКОВ: {sport_type}"]
        for i, lap in enumerate(root.findall('.//Lap')):
            total_time = lap.find('TotalTimeSeconds')
            dist = lap.find('DistanceMeters')
            max_hr = lap.find('.//MaximumHeartRateBpm/Value')
            avg_hr = lap.find('.//AverageHeartRateBpm/Value')
            calories = lap.find('Calories')
            intensity = lap.find('Intensity')
            lap_info = f"Круг {i+1}: "
            if total_time is not None: lap_info += f"Время: {round(float(total_time.text)/60, 1)} мин, "
            if dist is not None: lap_info += f"Дистанция: {round(float(dist.text)/1000, 2)} км, "
            if avg_hr is not None: lap_info += f"Ср.Пульс: {avg_hr.text}, "
            if max_hr is not None: lap_info += f"Макс.Пульс: {max_hr.text}, "
            if calories is not None: lap_info += f"Калории: {calories.text}, "
            if intensity is not None: lap_info += f"Интенсивность: {intensity.text}"
            summary.append(lap_info)
            
        trackpoints = root.findall('.//Trackpoint')
        summary.append("\nВыборка телеметрии по ходу тренировки (раз в минуту):")
        for p_idx in range(0, len(trackpoints), 60):
            p = trackpoints[p_idx]
            p_time = p.find('Time')
            hr = p.find('.//HeartRateBpm/Value')
            cad = p.find('.//Cadence')
            speed = p.find('.//Extensions//Speed')
            p_info = ""
            if p_time is not None: p_info += f"Время: {p_time.text[-13:-5]} | "
            if hr is not None: p_info += f"Пульс: {hr.text} | "
            if cad is not None: p_info += f"Каденс: {cad.text} | "
            if speed is not None: p_info += f"Скорость: {round(float(speed.text)*3.6, 1)} км/ч"
            if p_info: summary.append(p_info)
            
        return sport_type, "\n".join(summary[:120])
    except Exception as e:
        return "Не определен", f"Ошибка обработки файла: {e}"

@bot.message_handler(commands=['start', 'help'])
@bot.message_handler(func=lambda message: message.text == "🏁 Старт / Инструкция")
def send_welcome(message):
    bot.send_message(message.chat.id, "Привет! Я твой автономный ИИ-тренер на базе локальной Ollama 💻\n\nОтправь мне файл **.tcx**, и я выдам разбор нагрузки, пульсовые зоны и сушащее меню. Под отчетом будет кнопка для выгрузки отчета в PDF.", reply_markup=get_main_keyboard())

@bot.message_handler(func=lambda message: message.text == "🔄 Перезапустить бота")
def restart_bot(message):
    bot.send_message(message.chat.id, "🔄 Бот успешно перезапущен! Жду файл **.tcx**.", reply_markup=get_main_keyboard())
@bot.message_handler(content_types=['document'])
def handle_tcx_file(message):
    file_name = message.document.file_name
    if not file_name.lower().endswith('.tcx'):
        bot.reply_to(message, "❌ Пожалуйста, отправь файл с расширением **.tcx**.", reply_markup=get_main_keyboard())
        return
    bot.reply_to(message, "⏳ Файл получен. Оптимизирую телеметрию и отправляю локальной нейросети Ollama...")
    try:
        file_info = bot.get_file(message.document.file_id)
        downloaded_file = bot.download_file(file_info.file_path)
        local_path = f"temp_{file_name}"
        with open(local_path, 'wb') as new_file:
            new_file.write(downloaded_file)
        detected_sport, calc_min, calc_km, calc_kcal, calc_zones, compressed_content = compress_tcx(local_path)
        os.remove(local_path)

        user_prompt = f"""
        Проанализируй эту выполненную тренировку по нашему стандартному текстовому шаблону (без таблиц):
        
         📊 **1. ОСНОВНЫЕ ПОКАЗАТЕЛИ СЕССИИ**
         - **Вид спорта:** {detected_sport} (пиши строго этот вид спорта!)
         - **Длительность:** {calc_min} мин
         - **Дистанция:** {calc_km} км
         - **Расход энергии:** {calc_kcal} ккал
         - **Пульс средний / макс:** [Значение] / [Значение] уд/мин
         - **Распределение по зонам ЧСС:** [Оцени по телеметрии распределение в процентах или минутах по нашим лабораторным зонам]

        ⚡ **2. ТРЕНЕРСКИЙ ЭФФЕКТ (TRAINING EFFECT)**
        - **Аэробный эффект (0-10):** [Оценка от 0.0 до 10.0] — [Распиши детально влияние балла на аэробную базу]
        - **Анаэробный эффект (0-10):** [Оценка от 0.0 до 10.0] — [Распиши детально влияние балла на МПК и закисление]

        🚨 **3. БИОМЕХАНИЧЕСКИЙ АНАЛИЗ РИСКОВ**
        - **Анализ пульса:** [Оцени кардио-дрейф]
        - **Защита поясницы и коленей:** [Свяжи каденс и скорость с риском обострения протрузии поясницы из-за длинной рамы 56 размера. Дай рекомендацию по удержанию позиции на лежаке ISM PN 3.0]

        🍏 **4. ВОССТАНОВИТЕЛЬНОЕ ПИТАНИЕ ДЛЯ СУШКИ**
        - **Белки:** ~[Значение] г (целевой расчет на сухой вес 61.5 кг)
        - **Углеводы:** ~[Значение] г
        - **Жиры:** ~[Значение] г
        - **Итого окно Ккал после сессии:** [Значение] ккал (с учетом дефицита 935 ккал)

        🍽 **Вариант меню на день из разрешенных продуктов:**
        - **Завтрак:** [Блюдо с точным весом]
        - **Обед:** [Блюдо с точным весом]
        - **Ужин:** [Блюдо с точным весом]

        🟢/🟡/🔴 **5. СТАТУС НА ЗАВТРА**
        - [Тип нагрузки]
        
        Телеметрия тренировки с датчиков:
        {compressed_content}
        """

        print("Стучусь в локальную модель my_coach...")
        ollama_response = requests.post("http://localhost:11434/api/generate", json={
            "model": "my_coach",
            "prompt": user_prompt,
            "stream": False
        }, timeout=180)
        response_text = ollama_response.json().get("response", "Ошибка: Модель вернула пустой ответ.")

        if len(response_text) <= 4000:
            try: bot.send_message(message.chat.id, response_text, parse_mode="Markdown", reply_markup=get_pdf_inline_keyboard())
            except: bot.send_message(message.chat.id, response_text, reply_markup=get_pdf_inline_keyboard())
        else:
            current_chunk = ""
            for line in response_text.split('\n'):
                if len(current_chunk) + len(line) + 1 > 4000:
                    try: bot.send_message(message.chat.id, current_chunk, parse_mode="Markdown")
                    except: bot.send_message(message.chat.id, current_chunk)
                    current_chunk = line + '\n'
                else: current_chunk += line + '\n'
            if current_chunk:
                try: bot.send_message(message.chat.id, current_chunk, parse_mode="Markdown", reply_markup=get_pdf_inline_keyboard())
                except: bot.send_message(message.chat.id, current_chunk, reply_markup=get_pdf_inline_keyboard())
        print("Отчет успешно отправлен!")
    except Exception as e:
        bot.send_message(message.chat.id, f"❌ Ошибка локального ИИ: {str(e)}", reply_markup=get_main_keyboard())

@bot.callback_query_handler(func=lambda call: call.data == "generate_pdf")
def callback_inline(call):
    try:
        bot.answer_callback_query(call.id, text="⏳ Генерирую PDF-документ...")
        report_text = call.message.text
        pdf_file = create_pdf_report(report_text, filename="Отчет_тренера.pdf")
        with open(pdf_file, 'rb') as f:
            bot.send_document(call.message.chat.id, f, caption="💪 Твой официальный тренировочный отчет сформирован!")
        os.remove(pdf_file)
    except Exception as e:
        bot.send_message(call.message.chat.id, f"❌ Не удалось создать PDF: {str(e)}")

if __name__ == "__main__":
    print("🤖 Автономный Бот-тренер на базе Ollama (с кнопкой PDF) запущен...")
    bot.infinity_polling()
