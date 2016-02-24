using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Diagnostics;

namespace L000101_Csharp_MassivesDependSwitch_lab_5
{
    public partial class Form1 : Form
    {
        float[,] Xmas = new float[10, 10];

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {

            if (radioButton1.Checked)
            {
                using (StreamWriter sw = new StreamWriter("log.txt"))
                {
                    sw.Write("Двумерный массив:");
                    sw.WriteLine();
                    sw.Write("-------------------------------------------------------------------------------------------------------------");
                    sw.WriteLine();
                    sw.WriteLine();
                    for (int i = 0; i < 10; i++)
                    {
                        float x = 1 + i / 3;
                        for (int j = 0; j < 10; j++)
                        {
                            float y = -2 + j / 12;
                            Xmas[i, j] = Convert.ToSingle((Math.Exp(-x * y) + Math.Exp(x * y)) /
                                (1 + Math.Abs(Math.Pow(Math.Sin(x), 2) + Math.Pow(Math.Cos(x), 2))));
                            sw.Write(Xmas[i, j].ToString());
                            sw.Write("   ");
                        }
                        sw.WriteLine();
                        sw.WriteLine();
                    }
                    sw.Write("-------------------------------------------------------------------------------------------------------------");
                    sw.WriteLine();

                    //Трансопонирование
                    sw.Write("Транспонированный массив:");
                    sw.WriteLine();
                    sw.Write("-------------------------------------------------------------------------------------------------------------");
                    sw.WriteLine();
                    sw.WriteLine();
                    for (int i = 0; i < 10; i++)
                    {
                        float x = 1 + i / 3;
                        for (int j = 0; j < 10; j++)
                        {
                            float y = -2 + j / 12;
                            Xmas[i, j] = Convert.ToSingle((Math.Exp(-x * y) + Math.Exp(x * y)) /
                                (1 + Math.Abs(Math.Pow(Math.Sin(x), 2) + Math.Pow(Math.Cos(x), 2))));
                            float t = Xmas[i, j];
                            Xmas[i, j] = Xmas[j, i];
                            Xmas[j, i] = t;

                            sw.Write(Xmas[i, j].ToString());
                            sw.Write("   ");
                        }
                        sw.WriteLine();
                        sw.WriteLine();
                    }
                    sw.Write("-------------------------------------------------------------------------------------------------------------");
                    sw.WriteLine();

                }

                radioButton5.Checked = false;
            }

        }

        private void radioButton5_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton5.Checked)
            {

                float Y = 0;
                for (int i = 0; i < 10; i++)
                {
                    for (int j = 0; j < 10; j++)
                    {
                        Y += Xmas[i, j];
                    }
                }
                textBox1.Text = String.Format("{0,5:f4}", Y / 100);
            }

        }

        private void radioButton7_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton7.Checked)
            {

                float Y = 1.0e33f;
                for (int i = 0; i < 10; i++)
                {
                    for (int j = 0; j < 10; j++)
                    {
                        if (Y > Xmas[i, j]) Y = Xmas[i, j];
                    }
                }
                textBox1.Text = String.Format("{0,5:f4}", Y);

            }


        }

        private void button2_Click(object sender, EventArgs e)
        {
            string path = "log.txt";
            if (File.Exists(path))
                Process.Start(path);
            else
                MessageBox.Show("Файл не найден");
        }

        private void radioButton9_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton9.Checked)
            {

                float Y = -1.0e33f;
                for (int i = 0; i < 10; i++)
                {
                    for (int j = 0; j < 10; j++)
                    {
                        if (Xmas[i, j] > Y) Y = Xmas[i, j];
                    }
                }
                textBox1.Text = String.Format("{0,5:f4}", Y);

            }
        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton4.Checked)
            {

                float Y = 0;
                for (int i = 0; i < 10; i++)
                {
                    for (int j = 0; j < 10; j++)
                    {
                        if (i == j)
                            Y += Xmas[i, j];
                    }
                }
                textBox1.Text = String.Format("{0,5:f4}", Y / 100);
            }
        }

        private void radioButton6_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton6.Checked)
            {

                float Y = 0;
                for (int i = 0; i < 10; i++)
                {
                    for (int j = 0; j < 10; j++)
                    {
                        Y += Xmas[i, j];
                    }
                }
                textBox1.Text = String.Format("{0,5:f4}", Y);
            }

        }

        private void radioButton8_CheckedChanged(object sender, EventArgs e)
        {
            if (radioButton8.Checked)
            {

                int k = 0;
                for (int i = 0; i < 10; i++)
                {
                    for (int j = 0; j < 10; j++)
                    {
                        if (Xmas[i, j] > 0)
                            k = k + 1;
                    }
                }
                textBox1.Text = String.Format("{0,5:f0}", k);
            }
        }
    }
}
