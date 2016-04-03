using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace L000110_lab13_individual
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        //Addition of complex numbers
        //z = (x1 + x2, y1 + y2);
        public class ComplexSumm
        {
            public int Summ1(int a1, int a2)
            {
                int A = a1 + a2;
                return A;
            }
            public int Summ2(int b1, int b2)
            {
                int B = b1 + b2;
                return B;
            }
        }

        //Difference of complex numbers
        //z = z1 - z2 = (x1 - x2, y1 - y2)
        public class ComplexDif
        {
            public int Dif1(int a1, int a2)
            {
                int A = a1 - a2;
                return A;
            }
            public int Dif2(int b1, int b2)
            {
                int B = b1 - b2;
                return B;
            }
        }

        //Multiplication of complex numbers
        //z = (x1x2 - y1y2, x1y2 + x2y1);
        public class ComplexMult
        {
            public int MultMinus(int a1, int a2, int b1, int b2)
            {
                int A = a1 * a2 - b1 * b2;
                return A;
            }
            public int MultPlus(int a1, int a2, int b1, int b2)
            {
                int B = a1 * b2 + a2 * b1;
                return B;
            }
        }

        //Button "Calculate"
        private void button1_Click(object sender, EventArgs e)
        {
            int[] NumA = new int[2] { Convert.ToInt16(textBox1.Text), Convert.ToInt16(textBox2.Text) };
            int[] NumB = new int[2] { Convert.ToInt16(textBox3.Text), Convert.ToInt16(textBox4.Text) };

            ComplexMult Bmult = new ComplexMult();
            ComplexDif ABdif = new ComplexDif();
            ComplexSumm ABsum = new ComplexSumm();
            ComplexMult Y = new ComplexMult();

            //calculate b*b
            int B1 = Bmult.MultMinus(NumB[0], NumB[0], NumB[1], NumB[1]);
            int B2 = Bmult.MultPlus(NumB[0], NumB[0], NumB[1], NumB[1]);

            //calculate a-b*b
            int ABminus1 = ABdif.Dif1(NumA[0], B1);         //a2
            int ABminus2 = ABdif.Dif2(NumA[1], B2);         //b2

            //calculate a+b
            int ABplus1 = ABsum.Summ1(NumA[0], NumB[0]);    //a1
            int ABplus2 = ABsum.Summ2(NumA[1], NumB[1]);    //b1

            //calculate y
            int y1 = Y.MultMinus(ABplus1, ABminus1, ABplus2, ABminus2);
            int y2 = Y.MultPlus(ABplus2, ABminus2, ABminus1, ABplus2);  //int B = a1 * b2 + a2 * b1;

            textBox5.Text = Convert.ToString(y1);
            textBox6.Text = Convert.ToString(y2);

        }

        private void button2_Click_1(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text = "";
            textBox5.Text = "";
            textBox6.Text = "";
        }
    }
}
