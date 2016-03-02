using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace L000104_Csharp_PrototypeData_DropDownList_lab_8
{
    public partial class Form2 : Form
    {
        public class Attr
        {
            public string Name;
            public byte Value;
            public int Code;
            public Attr(string name, byte value, int code)
            {
                this.Name = name;
                this.Value = value;
                this.Code = code;
            }
        }

        Attr[] att = new Attr[50];
        public int Numb;
        public Form2()
        {
            InitializeComponent();
            att[0] = new Attr("sin", 4, 8); this.comboBox1.Items.Add(att[0].Name);
            att[1] = new Attr("cos", 6, 9); this.comboBox1.Items.Add(att[1].Name);
            att[2] = new Attr("exp", 4, 5); this.comboBox1.Items.Add(att[2].Name);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double x, y; string st;
            y = -1;
            x = Convert.ToDouble(textBox1.Text);
            int ind = this.comboBox1.SelectedIndex;
            if (ind != -1)
            {
                if (att[ind].Name == "sin") y = Math.Sin(x);
                else if (att[ind].Name == "cos") y = Math.Cos(x);
                else if (att[ind].Name == "exp") y = Math.Exp(x);
            }

            st = String.Format("{0,4:0.###########}", y);
            textBox2.Text = st;
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int ind = this.comboBox1.SelectedIndex;
            Numb = ind;
            this.textBox3.Text = Convert.ToString(att[ind].Value);
            this.textBox4.Text = Convert.ToString(att[ind].Code);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            for (int i = this.comboBox1.SelectedIndex; i < this.comboBox1.Items.Count - 1; i++)
            {
                att[i].Value = att[i + 1].Value; att[i].Code = att[i + 1].Code;
                att[i].Name = att[i + 1].Name;
            }
            this.comboBox1.Items.RemoveAt(this.comboBox1.SelectedIndex);
            this.textBox3.Text = "";
            this.textBox4.Text = "";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            int II = this.comboBox1.Items.Count;
            if (II < 50)
            {
                att[II] = new Attr(comboBox1.Text, Convert.ToByte(this.textBox3.Text), Convert.ToInt32(this.textBox4.Text));
                this.comboBox1.Items.Add(this.comboBox1.Text);
            }
            else MessageBox.Show("Слишком длинный список");
        }

        private void button5_Click(object sender, EventArgs e)
        {
            int m = Numb;
            att[m].Value = Convert.ToByte(this.textBox3.Text);
            att[m].Code = Convert.ToInt32(this.textBox4.Text);
            att[m].Name = this.comboBox1.Text;
            this.comboBox1.Items.RemoveAt(m);
            this.comboBox1.Items.Insert(m, this.comboBox1.Text);
        }
    }
}
