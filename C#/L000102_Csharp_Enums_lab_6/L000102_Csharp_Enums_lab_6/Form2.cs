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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }
        
        private void button1_Click_1(object sender, EventArgs e)
        {
            this.Close();
        }

        private void textBox1_MouseLeave_1(object sender, EventArgs e)
        {
            double w;
            Form1.z = Convert.ToDouble(textBox1.Text);
            w = Form1.z;
            textBox2.Text =Convert.ToString(w);
        }

        

               
    }
}
