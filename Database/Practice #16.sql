--1. Создать статический курсор по данным таблицы Books с полями Code_book, Title_book.
use DB_books
DECLARE cursor1 INSENSITIVE CURSOR FOR (select Code_book, Title_book from Books)
------------------------------------------------------------------------------------------
--2.Создать динамический курсор по данным таблицы поставщиков (таблица Deliveries) с 
--полями Name_delivery, Name_company.
DECLARE cursor2 CURSOR FOR (select Name_delivery, Name_company from Deliveries)
------------------------------------------------------------------------------------------
--3. Создать статический курсор по данным таблицы Books и Authors с полями:
 --Code_book, Title_book, Name_author.
 DECLARE cursor3 INSENSITIVE CURSOR FOR (select Code_book, Title_book,Name_author 
 from Books b, Authors a 
 where b.Code_author = a.Code_author)
 ------------------------------------------------------------------------------------------
--4. Создать статический курсор по данным таблицы Books и Publishing_house с полями:
 --Code_book, Title_book, Publish.
 DECLARE cursor4 INSENSITIVE CURSOR FOR (select Code_book, Title_book, Publish 
 from Books B, Publishing_house P
 where B.Code_publish = P.Code_publish)
 ------------------------------------------------------------------------------------------
 --5. Создать динамический курсор для чтения по данным таблицы Deliveries с полями 
--Code_delivery, Name_delivery. 
--Вывести данные 3-й записи.
DECLARE cursor5 SCROLL CURSOR FOR (select Code_delivery, Name_delivery from Deliveries)
DECLARE @a1 int, @b1 char(15)
OPEN cursor5
	FETCH first from cursor5 into @a1, @b1
	FETCH next from cursor5 into @a1, @b1
	FETCH next from cursor5 into @a1, @b1
		print @a1 
		print @b1
CLOSE cursor5
DEALLOCATE cursor5
------------------------------------------------------------------------------------------
--6. Сделать текущей БД db_books. Поместить в курсор данные таблицы Purchases. 
--Перебрать все записи таблицы Purchases. Просуммировать значения произведений полей 
--Cost и Amount и результат сохранить в переменной Sum_table, которую после суммирования 
--вывести на экран. Закрыть и удалить из памяти курсор.
use DB_books
DECLARE cursor6 SCROLL CURSOR FOR (select Cost, Amount from Purchases)
DECLARE @a2 float, @b2 int, @Sum_table float, @totalSum char(30)
set @Sum_table = 0
open cursor6
FETCH FIRST FROM cursor6 INTO @a2, @b2
set @Sum_table = @Sum_table + (@a2 * @b2)
WHILE @@FETCH_STATUS = 0 
	begin
		FETCH NEXT FROM cursor6 INTO @a2, @b2
		set @Sum_table = @Sum_table + @a2 * @b2
	end
set @totalSum = 'Переменная Sum_table = ' + cast(@Sum_table AS CHAR)
print @totalSum
CLOSE cursor6
DEALLOCATE cursor6
------------------------------------------------------------------------------------------
--7. Объявить статический курсор по данным таблиц Authors и Books. Вывести данные 5-й записи.
use DB_books
set DATEFORMAT dmy
DECLARE cursor7 INSENSITIVE SCROLL CURSOR FOR 
			(select name_author,Birthday,p.Title_book,p.Code_book from Authors, Books as p)
DECLARE @x1 varchar(20), @x2 datetime, @x3 varchar(50), @x4 int 
DECLARE @total VARCHAR(150)
OPEN cursor7
	FETCH first from cursor7 into @x1,@x2,@x3,@x4
	FETCH next from cursor7 into @x1,@x2,@x3,@x4
	FETCH next from cursor7 into @x1,@x2,@x3,@x4
	FETCH next from cursor7 into @x1,@x2,@x3,@x4
	FETCH next from cursor7 into @x1,@x2,@x3,@x4
set @total ='Данные 5-ой записи: ' + @x1 + '|' + cast(@x2 as char) + '|' 
								   + @x3 + '|' + cast(@x4 as char)
print @total
CLOSE cursor7
DEALLOCATE cursor7
------------------------------------------------------------------------------------------
--8. Удалить в тексте лишние пробелы. Лишними считаются те, которые идут непосредственно 
--за пробелом. Подсчитать количество исправлений.
DECLARE @string VARCHAR(1000)				--проверяемая строка
DECLARE @oneChar CHAR(1)				--отдельный символ
DECLARE @beforeChar	CHAR(1)				--предыдущий символ
DECLARE @count INT						--счетчик цикла
DECLARE	@numberOfSpace INT				--счетчик пробелов

set @string = 'Once you  have completed    the course, you  will   have   learned object-oriented  Java programming and have  the ability to write   clear and   valid code in almost   no time at  all.'
set @numberOfSpace = 0
set @count = 2
set @beforeChar = SUBSTRING(@string,1,1)

while @count < LEN(@string) + 1
begin
	set @oneChar = SUBSTRING(@string,@count,1)
	if (@beforeChar = ' ') and (@oneChar = ' ')
		begin
			set @string = (select stuff (@string,@count-1,1,''))
			set @numberOfSpace = @numberOfSpace + 1
		end
	set @beforeChar = @oneChar
	set @count = @count + 1
end		
select @string [Форматированная строка]		
select @numberOfSpace [Число лишних пробелов]
------------------------------------------------------------------------------------------
--9. Подсчитать количество встреч каждой из следующих букв: "а", "в","и", "п" в базовом тексте.
DECLARE @string1 VARCHAR(1000)				--проверяемая строка
DECLARE @currentChar CHAR(1)				--отдельный символ
DECLARE @count1 INT							--счетчик цикла
DECLARE @countChar INT 

set @string1 = 'Подсчитать доли процентов встречи следующих букв'
set @count1 = 1
set @countChar = 0

while @count1 < LEN(@string1) + 1
begin
	set @currentChar = SUBSTRING(@string1,@count1,1)
	if (@currentChar = 'а')
		begin
			set @countChar = @countChar + 1
		end
	set @count1 = @count1 + 1
end		
select @countChar [Число встреч буквы "а"]
--------------------------------------------------------
set @count1 = 1
set @countChar = 0
while @count1 < LEN(@string1) + 1
begin
	set @currentChar = SUBSTRING(@string1,@count1,1)
	if (@currentChar = 'в')
		begin
			set @countChar = @countChar + 1
		end
	set @count1 = @count1 + 1
end		
select @countChar [Число встреч буквы "в"]
--------------------------------------------------------
set @count1 = 1
set @countChar = 0
while @count1 < LEN(@string1) + 1
begin
	set @currentChar = SUBSTRING(@string1,@count1,1)
	if (@currentChar = 'и')
		begin
			set @countChar = @countChar + 1
		end
	set @count1 = @count1 + 1
end		
select @countChar [Число встреч буквы "и"]
--------------------------------------------------------
set @count1 = 1
set @countChar = 0
while @count1 < LEN(@string1) + 1
begin
	set @currentChar = SUBSTRING(@string1,@count1,1)
	if (@currentChar = 'п')
		begin
			set @countChar = @countChar + 1
		end
	set @count1 = @count1 + 1
end		
select @countChar [Число встреч буквы "п"]
--------------------------------------------------------------------------------------------------
--10. Подсчитать доли процентов встречи следующих букв: "е", "о"
DECLARE @string2 VARCHAR(1000)				--проверяемая строка
DECLARE @currentChar1 CHAR(1)				--отдельный символ
DECLARE @a INT							--счетчик цикла
DECLARE @countChar1 INT
DECLARE @numberOfSpace1 INT 
DECLARE @percent float

set @string2 = 'Подсчитать доли процентов встречи следующих букв еееееееееееееееее'
set @a = 1
set @countChar1 = 0
set @numberOfSpace1 = 0

while @a < LEN(@string2) + 1
begin
	set @currentChar1 = SUBSTRING(@string2,@a,1)
	if (@currentChar1 = 'е')
		begin
			set @countChar1 = @countChar1 + 1
		end
	if (@currentChar1 = ' ')
		begin 
			set @numberOfSpace1 = @numberOfSpace1 +1			
		end		
	set @a = @a + 1
end		
set @percent = @countChar1 * 100 / (@a - @numberOfSpace1)
select @percent [Процент встреч буквы "е", %]

set @a = 1
set @countChar1 = 0
set @numberOfSpace1 = 0

while @a < LEN(@string2) + 1
begin
	set @currentChar1 = SUBSTRING(@string2,@a,1)
	if (@currentChar1 = 'о')
		begin
			set @countChar1 = @countChar1 + 1
		end
	set @a = @a + 1
end		
set @percent = @countChar1 * 100 / (@a - @numberOfSpace1)
select @percent [Процент встреч буквы "о", %]
--------------------------------------------------------------------------------------------------
--11. По правилам оформления машинописных текстов перед знаками .,!?:; пробелы 
--не ставятся, но обязательно ставятся после этих знаков. Удалите лишние пробелы. 
--Подсчитать количество исправлений.
DECLARE @stringText VARCHAR(1000)			--проверяемая строка
DECLARE @oneChar3 CHAR(1)				--отдельный символ
DECLARE @beforeChar3	CHAR(1)				--предыдущий символ
DECLARE @count3 INT						--счетчик цикла
DECLARE	@numberOfCorrections INT				--счетчик пробелов

set @stringText = 'Once you  .  have completed  :  the course   ,  you  will   have  learned   ;  object-oriented  Java programming   ; have  the ability to write   clear and   valid code in almost   no time at  all ! ?'
set @numberOfCorrections = 0
set @count3 = 2
set @beforeChar3 = SUBSTRING(@stringText,1,1)
--first pass
while @count3 < LEN(@stringText) + 1
begin
	set @oneChar3 = SUBSTRING(@stringText,@count3,1)
	if ((@beforeChar3 = ' ') and ((@oneChar3 = ' ') or (@oneChar3 = '.') or (@oneChar3 = ',') or
								  (@oneChar3 = ':') or (@oneChar3 = ';') or (@oneChar3 = '!') or
								  (@oneChar3 = '?')))
		begin
			set @stringText = (select stuff (@stringText,@count3-1,1,''))
			set @numberOfCorrections = @numberOfCorrections + 1
		end
	set @beforeChar3 = @oneChar3
	set @count3 = @count3 + 1
end		

--second pass
set @count3 = 2
set @beforeChar3 = SUBSTRING(@stringText,1,1)

while @count3 < LEN(@stringText) + 1
begin
	set @oneChar3 = SUBSTRING(@stringText,@count3,1)
	if ((@beforeChar3 = ' ') and ((@oneChar3 = ' ') or (@oneChar3 = '.') or (@oneChar3 = ',') or
								  (@oneChar3 = ':') or (@oneChar3 = ';') or (@oneChar3 = '!') or
								  (@oneChar3 = '?')))
		begin
			set @stringText = (select stuff (@stringText,@count3-1,1,''))
			set @numberOfCorrections = @numberOfCorrections + 1
		end
	set @beforeChar3 = @oneChar3
	set @count3 = @count3 + 1
end

--third pass
set @count3 = 2
set @beforeChar3 = SUBSTRING(@stringText,1,1)

while @count3 < LEN(@stringText) + 1
begin
	set @oneChar3 = SUBSTRING(@stringText,@count3,1)
	if (((@beforeChar3 = '?') or (@beforeChar3 = '.') or (@beforeChar3 = ',') or
		 (@beforeChar3 = ':') or (@beforeChar3 = ';') or (@beforeChar3 = '!')) and (@oneChar3 = ''))
		begin
			set @stringText = (select stuff(@stringText,@count3+1,1,' '))
			set @numberOfCorrections = @numberOfCorrections + 1
		end
	set @beforeChar3 = @oneChar3
	set @count3 = @count3 + 1
end	
--third pass
set @count3 = 2
set @beforeChar3 = SUBSTRING(@stringText,1,1)

while @count3 < LEN(@stringText) + 1
begin
	set @oneChar3 = SUBSTRING(@stringText,@count3,1)
	if (((@beforeChar3 = '?') or (@beforeChar3 = '.') or (@beforeChar3 = ',') or
		 (@beforeChar3 = ':') or (@beforeChar3 = ';') or (@beforeChar3 = '!')) and (@oneChar3 = ''))
		begin
			set @stringText = (select stuff(@stringText,@count3+1,1,' '))
			set @numberOfCorrections = @numberOfCorrections + 1
		end
	set @beforeChar3 = @oneChar3
	set @count3 = @count3 + 1
end	
select @stringText [Форматированная строка]		
select @numberOfCorrections [Количество исправлений]
---------------------------------------------------------------------------------------------------------------
--13. Найти из исходного текста второе предложение и вернуть его в переменную Perem, 
--а также вывести на экран весь исходный текст и найденное предложение.
DECLARE @stringText5 VARCHAR(1000)			--проверяемая строка
DECLARE @oneChar5 CHAR(1)
DECLARE @count5 INT
DECLARE @cutString VARCHAR(1000)
set @stringText5 = 'An array is a collection of variables of the same type. When you need to store a list of values, such as numbers, you can store them in an array, '
set @oneChar5 = SUBSTRING(@stringText5,1,1)
set @count5 = 2

while @count5 < LEN(@stringText5) + 1
begin
	set @oneChar5 = SUBSTRING(@stringText5,@count5,1)
	if (@oneChar5 = '.') 
	begin 
		break
	end
	set @count5 = @count5 + 1
end
set @cutString = SUBSTRING(@stringText5,@count5 + 1, LEN(@stringText5)-@count5)
select @cutString [Второе предложение строки @stringText5]
---------------------------------------------------------------------------------------------------------------
--14. Удалить из базового текста 2, 4, 6, 8 слова.
DECLARE @stringText4 VARCHAR(1000), @str VARCHAR(1000)
DECLARE @count4 int, @position int, @word int
set @stringText4 = 'word1 word2 word3 word4 word5 word6 word7 word8 word9 word10'

set @count4 = 0
set @str = ''

while (@position > 0)
begin 
	set @count4 = @count4 + 1
	if @word !=2 and @word !=4 and @word !=6 and @word !=8
	begin
		set @str = @str + SUBSTRING(@stringText4,1,@position)
	end
	+


---------------------------------------------------------------------------------------------------------------
--16. Вставить в базовый текст вместо букв «а» - «АА».
DECLARE @stringText6 VARCHAR(1000)
set @stringText6 = 'An array is a collection of variables of the same type.'
select REPLACE(@stringText6, 'a','AA') [Измененная строка]
---------------------------------------------------------------------------------------------------------------
--17. Вставить в базовый текст вместо букв «е» и «о» - «ББ».
DECLARE @baseText7 VARCHAR(200)
DECLARE @modifiedText7 VARCHAR(200)
set @baseText7 = 'При добавлении элементов в область конструктора отчетов эти элементы автоматически добавляются на панель «Данные отчета».'
set @modifiedText7 = REPLACE(@baseText7, 'е','ББ')
set @modifiedText7 = REPLACE(@modifiedText7, 'о','ББ')
select @modifiedText7[Измененная строка]
---------------------------------------------------------------------------------------------------------------
--18. Поменять местами первое и последнее слова в базовом тексте. 
DECLARE @stringText8 VARCHAR(1000)
DECLARE @firstWord VARCHAR(10)
DECLARE @lastWord VARCHAR(10)
DECLARE @middle VARCHAR(1000)
DECLARE @numberOfSpace8 int
DECLARE @position8_1 int
DECLARE @position8_2 int
DECLARE @oneChar8 CHAR(1)
DECLARE @count8 INT

set @stringText8 = 'An array is a collection of variables of the same type'

set @oneChar8 = SUBSTRING(@stringText8,1,1)
set @count8 = 2
while @count8 < LEN(@stringText8) + 1
begin
	set @oneChar8 = SUBSTRING(@stringText8,@count8,1)
	
	if (@oneChar8 = ' ')
	begin
		break
	end
	set @position8_1 = @count8
	set @count8 = @count8 + 1
end
set @firstWord = SUBSTRING(@stringText8,1,@position8_1)

set @count8 = 2
while @count8 < LEN(@stringText8) + 1
begin
	set @oneChar8 = SUBSTRING(@stringText8,@count8,1)
	
	if (@oneChar8 = ' ')
	begin
		set @position8_2 = @count8
	end
	set @count8 = @count8 + 1
end
set @lastWord = SUBSTRING(@stringText8,@position8_2 + 1,LEN(@stringText8) - @position8_2)
set @middle = SUBSTRING(@stringText8,@position8_1+1,@position8_2 - @position8_1)
set @stringText8 = @lastWord + @middle + @firstWord
select @stringText8
/*select @firstWord
select @position8_1 [@position8_1]
select @position8_2 [@position8_2]
select @lastWord
select @middle [@middle]
select LEN(@stringText8) - @position8_2 - @position8_1
select RIGHT(@stringText8,LEN(@stringText8) - @position8_2)*/

---------------------------------------------------------------------------------------------------------------
