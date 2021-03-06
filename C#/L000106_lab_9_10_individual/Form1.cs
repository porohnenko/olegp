﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Text.RegularExpressions;


namespace L000106_lab_9_individual
{
    public partial class Form1 : Form
    {
        public double FirstEquation(int x)
        {
            double y = (double)((4 + Math.Pow(x, 4) * Math.Pow(Math.Sin(x), 2) + Math.Exp(Math.Pow(x, 2))) /
                       (Math.Pow(x, 3) + Math.Log(Math.Pow(x, 2) + 4)) + Math.Abs(Math.Pow(x, 3)));
            return y;
        }

        public double SecondEquation(int x)
        {
            double y = (Math.Sqrt(Math.Abs(x - 1)) - Math.Pow(Math.Abs(x), 1 / 3)) * (Math.Abs(Math.Pow(x, 3) - 4)) /
                       (1 + Math.Pow(x, 2) / 2 + Math.Pow(x, 4) / 4);
            return y;
        }

        public double ThirdEquation(int x, int z)
        {

            double y = Math.Log(Math.Pow(x, 2) + 1) * (x / 3 + z) / ((Math.Pow(Math.Cos(z), 2) + Math.Pow(Math.Cos(x), 2)) *
                       (Math.Pow(x, 3) + Math.Pow(z, 2))) + (x + z) * Math.Exp(z - x) / (Math.Pow(z, 2) * Math.Pow(x, 3));
            //double y = 256 / x + 564 / z;
            return y;
        }


        public Form1()
        {
            InitializeComponent();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            DialogResult result = MessageBox.Show("Do you want to exit program?", "", MessageBoxButtons.YesNo, MessageBoxIcon.Question, MessageBoxDefaultButton.Button2);
            if (result == DialogResult.Yes)
            {
                this.Close();
            }
        }

        /*public void DivZeroChecker(double fun,string txtBox3)
        {
            try
            {
                textBox = Convert.ToString(fun);
            }
            catch (DivideByZeroException)
            {
                DialogResult result = MessageBox.Show("Sorry, divide by zero!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }*/


        //Button "Calculate"
        private void button1_Click(object sender, EventArgs e)
        {
            if (radioButton1.Checked || radioButton2.Checked || radioButton3.Checked)
            {
                int a = Convert.ToInt16(textBox1.Text);
                if (radioButton1.Checked)
                {
                    if (textBox1.Text == "")
                    {
                        DialogResult result = MessageBox.Show("Please, enter all fields!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    }
                    else
                    {
                        try
                        {
                            FirstEquation(a);
                            textBox2.Text = Convert.ToString(FirstEquation(a));

                        }
                        catch (DivideByZeroException)
                        {
                            DialogResult result = MessageBox.Show("Sorry, divide by zero!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        }
                        finally
                        {
                            if (double.IsInfinity(FirstEquation(a)))
                            {
                                DialogResult result = MessageBox.Show("Sorry, divide by zero!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                            }
                        }
                    }
                }

                if (radioButton2.Checked)
                {
                    if (textBox1.Text == "")
                    {
                        DialogResult result = MessageBox.Show("Please, enter all fields!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    }
                    else
                    {
                        try
                        {
                            SecondEquation(a);
                            textBox2.Text = Convert.ToString(SecondEquation(a));

                        }
                        catch (DivideByZeroException)
                        {
                            DialogResult result = MessageBox.Show("Sorry, divide by zero!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        }
                        finally
                        {
                            if (double.IsInfinity(SecondEquation(a)))
                            {
                                DialogResult result = MessageBox.Show("Sorry, divide by zero!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                            }
                        }


                    }
                }

                if (radioButton3.Checked)
                {
                    if (textBox1.Text == "" || textBox3.Text == "")
                    {
                        DialogResult result = MessageBox.Show("Please, enter all fields!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    }
                    else
                    {
                        int c = Convert.ToInt16(textBox3.Text);
                        try
                        {
                            ThirdEquation(a, c);
                            textBox2.Text = Convert.ToString(ThirdEquation(a, c));

                        }
                        catch (DivideByZeroException)
                        {
                            DialogResult result = MessageBox.Show("Sorry, divide by zero!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                        }
                        finally
                        {
                            if (double.IsInfinity(ThirdEquation(a, c)))
                            {
                                textBox2.Text = "divide by zero!";
                                textBox2.ForeColor = Color.DarkSlateGray;
                                textBox2.ReadOnly = true;
                                DialogResult result = MessageBox.Show("Sorry, divide by zero!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                            }
                        }
                    }
                }
            }
            else
            {
                DialogResult result = MessageBox.Show("Please, select equation and enter all fields!", "", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            ToolTip t = new ToolTip();
            t.SetToolTip(textBox1, "Введите число из диапазона -26 ... 26");

            textBox1.Clear();
            textBox2.Clear();
            if (textBox3.ReadOnly == false)
            {
                textBox3.Clear();
            }

            textBox3.Text = "not use in this equation...";
            textBox3.ForeColor = Color.DarkSlateGray;
            textBox3.ReadOnly = true;
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();

            if (textBox3.ReadOnly == false)
            {
                textBox3.Clear();
            }

            textBox3.Text = "not use in this equation...";
            textBox3.ForeColor = Color.DarkSlateGray;
            textBox3.ReadOnly = true;
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            //textBox3.Clear();
            textBox3.ReadOnly = false;
            textBox3.ForeColor = Color.Black;
        }

        //Button "Clear"
        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();

            if (textBox3.ReadOnly == false)
            {
                textBox3.Clear();
            }
        }
    }
}
