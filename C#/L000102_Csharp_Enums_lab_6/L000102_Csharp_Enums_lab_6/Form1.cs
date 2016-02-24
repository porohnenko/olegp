using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace L000102_Csharp_Enums_lab_6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        public static double z = 10;

        private void button1_Click_1(object sender, EventArgs e)
        {
            double x, y; string st;
            x = Convert.ToDouble(textBox1.Text);
            y = Math.Sin(x) + 66 + Form1.z;
            st = String.Format("{0,4:0.##}", y);
            textBox2.Text = st;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

              
        
    }
}
