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

namespace L000104_lab_8_individual
{
    public partial class Form1 : Form
    {


        public class AttrMonth
        {
            public string Month;
            public AttrMonth(string month)
            {
                this.Month = month;
                //this.Salary = salary;
            }
        }

        public class AttrYear
        {
            public int Year;
            public AttrYear(int year)
            {
                this.Year = year;
            }
        }

        public class AttrSalary
        {
            public int Salary;
            public AttrSalary(int salary)
            {
                this.Salary = salary;
            }
        }

        public class AttrPerson
        {
            public string Person;
            public AttrPerson(string person)
            {
                this.Person = person;
            }
        }

        AttrMonth[] att1 = new AttrMonth[15];
        AttrYear[] att2 = new AttrYear[5];
        AttrSalary[] att3 = new AttrSalary[10];
        AttrPerson[] att4 = new AttrPerson[35];

        public Form1()
        {
            InitializeComponent();

            //Month
            att1[0] = new AttrMonth("January"); this.comboBox2.Items.Add(att1[0].Month);
            att1[1] = new AttrMonth("February"); this.comboBox2.Items.Add(att1[1].Month);
            att1[2] = new AttrMonth("March"); this.comboBox2.Items.Add(att1[2].Month);
            att1[3] = new AttrMonth("April"); this.comboBox2.Items.Add(att1[3].Month);
            att1[4] = new AttrMonth("May"); this.comboBox2.Items.Add(att1[4].Month);
            att1[5] = new AttrMonth("June"); this.comboBox2.Items.Add(att1[5].Month);
            att1[6] = new AttrMonth("July"); this.comboBox2.Items.Add(att1[6].Month);
            att1[7] = new AttrMonth("August"); this.comboBox2.Items.Add(att1[7].Month);
            att1[8] = new AttrMonth("September"); this.comboBox2.Items.Add(att1[8].Month);
            att1[9] = new AttrMonth("October"); this.comboBox2.Items.Add(att1[9].Month);
            att1[10] = new AttrMonth("November"); this.comboBox2.Items.Add(att1[10].Month);
            att1[11] = new AttrMonth("December"); this.comboBox2.Items.Add(att1[11].Month);

            //Year
            att2[0] = new AttrYear(2015); this.comboBox3.Items.Add(att2[0].Year);
            att2[1] = new AttrYear(2016); this.comboBox3.Items.Add(att2[1].Year);

            //Salary
            att3[0] = new AttrSalary(9000000); this.comboBox4.Items.Add(att3[0].Salary);
            att3[1] = new AttrSalary(10000000); this.comboBox4.Items.Add(att3[1].Salary);
            att3[2] = new AttrSalary(11000000); this.comboBox4.Items.Add(att3[2].Salary);
            att3[3] = new AttrSalary(12000000); this.comboBox4.Items.Add(att3[3].Salary);
            att3[4] = new AttrSalary(13000000); this.comboBox4.Items.Add(att3[4].Salary);
            att3[5] = new AttrSalary(14000000); this.comboBox4.Items.Add(att3[5].Salary);



        }

        private void button3_Click(object sender, EventArgs e)
        {
            DialogResult result = MessageBox.Show("Do you want to exit programm?", "Warning!!!", MessageBoxButtons.YesNo);
            if (result == DialogResult.Yes)
            {
                this.Close();
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Окрываем диалоговое окно
            OpenFileDialog ofn = new OpenFileDialog();
            ofn.InitialDirectory = "D:\\";              //Диск D:
            ofn.Filter = "txt files |*.txt";          //Указываем тип открываемых файлов
            ofn.FilterIndex = 2;

            if (ofn.ShowDialog() == DialogResult.OK)
            {
                richTextBox1.Text = ofn.FileName;
                //richTextBox2.Text = File.ReadAllText(ofn.FileName);
                //str = richTextBox1.Text;
            }

            StreamReader streamreader = new StreamReader(ofn.FileName);
            String item;
            while ((item = streamreader.ReadLine()) != null)
            {
                comboBox1.Items.Add(item);
            }
            streamreader.Close();

            comboBox1.Text = "";
            comboBox2.Text = "";
            comboBox3.Text = "";
            comboBox4.Text = "";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            //Диалоговое окно сохранения отформатированного файла
            SaveFileDialog ofn1 = new SaveFileDialog();
            ofn1.Filter = "txt files |*.txt";
            ofn1.FilterIndex = 2;
            MemoryStream memorystream = new System.IO.MemoryStream();
            Stream filestream;
            if (ofn1.ShowDialog() == DialogResult.OK)
            {
                //ассоциируем поток с именем файла - если файла нет создаем
                filestream = ofn1.OpenFile();
                memorystream.Position = 0;
                //сохраняем в поток содержимое richTextBox2
                richTextBox2.SaveFile(memorystream, RichTextBoxStreamType.PlainText);
                //переносим в файл информацию и закрываем поток
                memorystream.WriteTo(filestream);
                filestream.Close();
            }
        }

        private void button5_Click(object sender, EventArgs e)
        {
            //MessageBox.Show("Attention! All strings will be done!");       
            DialogResult result = MessageBox.Show("Clear all data?", "Warning!!!", MessageBoxButtons.YesNo);
            if (result == DialogResult.Yes)
            {
                string nullString = "";
                richTextBox2.Text = nullString;
                comboBox1.Text = nullString;
                comboBox2.Text = nullString;
                comboBox3.Text = nullString;
                comboBox4.Text = nullString;
            }
        }

        //Button Generate
        private void button2_Click(object sender, EventArgs e)
        {
            if (comboBox1.Text == ""
                     || comboBox2.Text == ""
                     || comboBox3.Text == ""
                     || comboBox4.Text == "")
            {
                MessageBox.Show("Please, fill all fields!");
            }
            else
            {
                richTextBox2.Text += "Person:  " + comboBox1.SelectedItem.ToString()
                                    + "\nMonth:   " + comboBox2.SelectedItem.ToString()
                                    + "\nYear:    " + comboBox3.SelectedItem.ToString()
                                    + "\nSalary:  " + comboBox4.SelectedItem.ToString()
                                    + "\n------------------------------------------------------------------------------\n";
            }
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }


    }
}
