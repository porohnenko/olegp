using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace L000108_lab_11_individual
{
    public class Num
    {
        private double q1;

        public Num()                // constructor
            : this(0)
        {
        }

        public Num(double w)           // constructor
        {
            q1 = w;
        }
        
        public override string ToString()
        {
            return (System.String.Format("{0}", q1));
        }

        //method for override operator "+"
        public static Num operator +(Num x, Num y)
        {
            return new Num((3 * x.q1) + (4 * y.q1));
        }

        //method for override operator "×"
        public static Num operator *(Num x, Num y)
        {
            return new Num((1 + x.q1) * (5 + y.q1));
        }
    }
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
            textBox4.Clear();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Num A = new Num(Convert.ToDouble(textBox1.Text));
            Num B = new Num(Convert.ToDouble(textBox2.Text));
            Num Z1 = A + B;
            Num Z2 = A * B;

            textBox3.Text = Convert.ToString(Z1);
            textBox4.Text = Convert.ToString(Z2);
        }
    }
}
