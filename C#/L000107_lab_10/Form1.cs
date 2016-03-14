using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace L000107_lab_10
{
    public partial class Form1 : Form
    {
        public void TabSelectStatus()
        {
            if (tabControl1.TabIndex == 0)
            {
                toolStripStatusLabel1.Text = "Tab #1";
            }
            else
            {
                toolStripStatusLabel1.Text = "Tab #2";
            }
        }

        public Form1()
        {
            InitializeComponent();

            TabSelectStatus();

        }

        private void tabControl1_Selected(object sender, TabControlEventArgs e)
        {

            if (e.TabPageIndex == 0)
            {
                toolStripStatusLabel1.Text = "Tab #1";
            }
            if (e.TabPageIndex == 1)
            {
                toolStripStatusLabel1.Text = "Tab #2";
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double x, y; string st;
            x = Convert.ToDouble(textBox1.Text);
            y = Math.Sin(x);
            st = String.Format("{0,4:0.##########}", y);
            textBox2.Text = st;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            double x, y; string st;
            x = Convert.ToDouble(textBox4.Text);
            y = Math.Cos(x);
            st = String.Format("{0,4:0.##########}", y);
            textBox3.Text = st;

        }

    }
}
