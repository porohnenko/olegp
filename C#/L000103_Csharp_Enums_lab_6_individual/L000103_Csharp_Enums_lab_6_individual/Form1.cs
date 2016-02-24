using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace L000102_Csharp_Enums_lab_6_individual
{
    public partial class Form1 : Form
    {
        public string st;
        public enum MilitaryRank
        { Soldier, Sergeant, Major, General }

        public Form1()
        {
            InitializeComponent();
        }
              

        private void textBox1_MouseLeave(object sender, EventArgs e)
        {
            MilitaryRank x, y;
            int m;
            m = Convert.ToInt32(textBox1.Text);

            if (m == 1)
            {
                x = MilitaryRank.Soldier;
                st = String.Format("{0}", x);
                textBox2.Text = st;
            }

            if (m == 2)
            {
                x = MilitaryRank.Sergeant;
                st = String.Format("{0}", x);
                textBox2.Text = st;
            }

            if (m == 3)
            {
                x = MilitaryRank.Major;
                st = String.Format("{0}", x);
                textBox2.Text = st;
            }

            if (m == 4)
            {
                x = MilitaryRank.General;
                st = String.Format("{0}", x);
                textBox2.Text = st;
            }

            if (m > 4) MessageBox.Show("Error! Please, enter new number no more than 4.");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
