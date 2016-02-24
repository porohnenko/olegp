using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace L000100_Csharp_ModalUserForms_lab_4
{
    public partial  class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        void button1_Click(object sender, EventArgs e)
        {
            double x, y; string st;
            x = Convert.ToDouble(textBox3.Text);
            y = Math.Sin(x) + 4.5;
            st = String.Format("{0,4:0.##}", y);
            textBox4.Text = st;

        }

        
    }
}
