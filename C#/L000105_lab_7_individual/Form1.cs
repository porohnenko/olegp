using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Text.RegularExpressions;

namespace L000105_lab_7_individual
{
    public partial class Form1 : Form
    {
        public string str;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Окрываем диалоговое окно
            OpenFileDialog ofn = new OpenFileDialog();
            ofn.InitialDirectory = "D:\\";              //Диск D:
            ofn.Filter = "html files |*.html";          //Указываем тип открываемых файлов
            ofn.FilterIndex = 2;

            if (ofn.ShowDialog() == DialogResult.OK)
            {
                textBox1.Text = ofn.FileName;
                richTextBox2.Text = File.ReadAllText(ofn.FileName);
                str = richTextBox2.Text;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            //Алгоритм фильтрации
            string pattern = @"<[^>]*>";
            Regex newReg = new Regex(pattern);
            richTextBox2.Text = Regex.Replace(str, @"<[^>]*>", String.Empty);
            //удаление лишних строк и пробелов
            //richTextBox2.Text = Regex.Replace(richTextBox2.Text, @"[\s\r\n]+", " ").Trim();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //Диалоговое окно сохранения отформатированного файла
            SaveFileDialog ofn1 = new SaveFileDialog();
            ofn1.Filter = "txt files |*.txt";
            ofn1.FilterIndex = 2;
            MemoryStream memorystream = new System.IO.MemoryStream();
            Stream filestream;
            if (ofn1.ShowDialog() == DialogResult.OK)
            {
                //ассоциируем поток с именем файла - если фйла нет создаем
                filestream = ofn1.OpenFile();
                memorystream.Position = 0;
                //сохраняем в поток содержимое richTextBox2
                richTextBox2.SaveFile(memorystream, RichTextBoxStreamType.PlainText);
                //переносим в файл информацию и закрываем поток
                memorystream.WriteTo(filestream);
                filestream.Close();
            }
        }
    }
}
