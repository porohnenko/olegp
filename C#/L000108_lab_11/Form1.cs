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

namespace L000108_lab_11
{
    public partial class Form1 : Form
    {
        long[,] OKL = new long[12, 50];
        byte[,] PRP = new byte[12, 50];

        public Form1()
        {
            InitializeComponent();
        }

        private void textBox5_MouseClick(object sender, MouseEventArgs e)
        {
            //Окрываем диалоговое окно
            OpenFileDialog ofn = new OpenFileDialog();
            ofn.InitialDirectory = "D:\\";              //Диск D:
            ofn.Filter = "txt files |*.txt";          //Указываем тип открываемых файлов
            ofn.FilterIndex = 2;

            if (ofn.ShowDialog() == DialogResult.OK)
            {
                textBox5.Text = ofn.FileName;
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
            // comboBox2.Text = "";
            // comboBox3.Text = "";
            // comboBox4.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DialogResult result = MessageBox.Show("Do you want to exit programm?", "Message", MessageBoxButtons.YesNo);
            if (result == DialogResult.Yes)
            {
                this.Close();
            }
        }

        private void UST(int i, int j)
        {
            textBox1.Text = OKL[i, j].ToString();
            textBox2.Text = PRP[i, j].ToString();
            float pr = OKL[i, j] * PRP[i, j] / 100;
            textBox4.Text = pr.ToString();
            pr += OKL[i, j];
            textBox3.Text = pr.ToString();

        }

        private void Form1_Activated(object sender, EventArgs e)
        {
            comboBox2.Items.Add("Иванов И.И.");
            comboBox2.Items.Add("Петров П.П.");
            comboBox2.Items.Add("Сидоров С.С.");
            comboBox2.Items.Add("Яковлев Я.Я.");
            comboBox2.SelectedIndex = 0;
            for (int i = 0; i < 12; i++)
                for (int j = 0; j < 50; j++)
                {
                    OKL[i, j] = 1000000; PRP[i, j] = 30;
                }
            axTabStrip1.Tabs.Clear();
            axTabStrip1.Tabs.Add("янв"); axTabStrip1.Tabs.Add("фев"); axTabStrip1.Tabs.Add("март");
            axTabStrip1.Tabs.Add("апр"); axTabStrip1.Tabs.Add("май"); axTabStrip1.Tabs.Add("июнь");
            axTabStrip1.Tabs.Add("июль"); axTabStrip1.Tabs.Add("авг"); axTabStrip1.Tabs.Add("сен");
            axTabStrip1.Tabs.Add("окт"); axTabStrip1.Tabs.Add("ноя"); axTabStrip1.Tabs.Add("дек");
            axTabStrip1.Value = 0;
            UST(0, 0);

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            UST(comboBox1.SelectedIndex, axTabStrip1.Value);
        }

        private void axTabStrip1_Change(object sender, EventArgs e)
        {
            UST(comboBox1.SelectedIndex, axTabStrip1.Value);
        }

        private void textBox1_MouseLeave(object sender, EventArgs e)
        {
            int i = comboBox1.SelectedIndex;
            int j = axTabStrip1.Value;
            OKL[i, j] = Convert.ToInt64(textBox1.Text);
            UST(i, j);
        }

        private void textBox2_MouseLeave(object sender, EventArgs e)
        {
            int i = comboBox1.SelectedIndex;
            int j = axTabStrip1.Value;
            PRP[i, j] = Convert.ToByte(textBox2.Text);
            UST(i, j);
        }

        private void textBox1_KeyUp(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                int i = comboBox1.SelectedIndex;
                int j = axTabStrip1.Value;
                OKL[i, j] = Convert.ToInt64(textBox1.Text);
                UST(i, j);
            }
        }

        private void textBox2_KeyUp(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                int i = comboBox1.SelectedIndex;
                int j = axTabStrip1.Value;
                PRP[i, j] = Convert.ToByte(textBox2.Text);
                UST(i, j);
            }

        }



    }

}
