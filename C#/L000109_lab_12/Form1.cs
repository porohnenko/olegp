using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Text.RegularExpressions;

namespace L000109_lab_12
{
    public partial class Form1 : Form
    {
        public string str;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double x, y; string st;
            x = Convert.ToDouble(textBox1.Text);
            y = Math.Sin(x);
            st = String.Format("{0,4:0.##}", y);
            textBox2.Text = st;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //lab12_1
            /*ToolTip toolTip2 = new ToolTip();

            toolTip2.AutoPopDelay = 5000;
            toolTip2.InitialDelay = 100;
            toolTip2.ReshowDelay = 50;
            toolTip2.BackColor = Color.Azure;
            toolTip2.ShowAlways = true;
            toolTip2.SetToolTip(this.button1, " ");
            toolTip2.ToolTipTitle = "note...";*/

            //lab12_2
            /////////////////////////////////////////////////////////////////////////////////////////////////
            // Create the ToolTip and associate with the Form container.
            ToolTip toolTip2 = new ToolTip();

            // Set up the delays for the ToolTip.
            toolTip2.AutoPopDelay = 5000;
            toolTip2.InitialDelay = 100;
            toolTip2.ReshowDelay = 50;
            toolTip2.BackColor = Color.Azure;
            // Force the ToolTip text to be displayed whether or not the form is active.
            toolTip2.ShowAlways = true;

            // Set up the ToolTip text for the Button and Checkbox.
            toolTip2.SetToolTip(this.button1, " ");
            toolTip2.ToolTipTitle = "4444444";
            /////////////////////////////////////////////////////////////////////////////////////////////////

            /*// Create the ToolTip and associate with the Form container.
            ToolTip toolTip2 = new ToolTip();

            // Set up the delays for the ToolTip.
            toolTip2.AutoPopDelay = 5000;
            toolTip2.InitialDelay = 100;
            toolTip2.ReshowDelay = 50;
            toolTip2.BackColor = Color.Azure;
            // Force the ToolTip text to be displayed whether or not the form is active.
            toolTip2.ShowAlways = true;

            // Set up the ToolTip text for the Button and Checkbox.
            toolTip2.SetToolTip(this.button1, " ");
            toolTip2.ToolTipTitle = "4444444";*/

        }

        private void pictureBox1_MouseMove(object sender, MouseEventArgs e)
        {
            //lab12_1
            /*Point p = pictureBox1.Location;   // позиция левого верхнего угла pictureBox1
            Point p1 = this.Location;        // позиция левого верхнего угла формы
            // e.X и e.Y позиция курсора в pictureBox1
            int XX, YY;
            XX = e.X + p.X + p1.X; YY = e.Y + p.Y + p1.Y;
            toolTip1.ToolTipTitle = Convert.ToString(XX) + "; " + Convert.ToString(YY);
            toolTip1.SetToolTip(this.pictureBox1, " ");*/

            //lab12_2
            Point p = pictureBox1.Location;   // позиция левого верхнего угла pictureBox1
            Point p1 = this.Location;        // позиция левого верхнего угла формы
            // e.X и e.Y позиция курсора в pictureBox1
            int XX, YY;
            XX = e.X + p.X + p1.X; YY = e.Y + p.Y + p1.Y;
            /*Bitmap bmp = new Bitmap(1, 1);
            using (Graphics g = Graphics.FromImage(bmp))
            { g.CopyFromScreen(XX, YY, 0, 0, new Size(1, 1)); }
            Color color = bmp.GetPixel(0, 0);
            string SS;
            SS = Convert.ToString(color);
            toolTip1.ToolTipTitle = SS;*/

            toolTip1.ToolTipTitle = "x=" + Convert.ToString(XX) + "; " + "y=" + Convert.ToString(YY);
            toolTip1.SetToolTip(this.pictureBox1, " ");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //Окрываем диалоговое окно
            OpenFileDialog ofn = new OpenFileDialog();
            ofn.InitialDirectory = "D:\\";              //Диск D:
            ofn.Filter = "txt files |*.txt";          //Указываем тип открываемых файлов
            ofn.FilterIndex = 2;

            if (ofn.ShowDialog() == DialogResult.OK)
            {
                textBox3.Text = ofn.FileName;
                richTextBox1.Text = File.ReadAllText(ofn.FileName);
                str = richTextBox1.Text;
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            StreamReader data = new StreamReader(str, Encoding.GetEncoding(1251));
            string str1 = data.ReadLine();
            int i;

            string[] mas = str1.Split(' ');
            for (i = 0; i < mas.Length; i++)
            {
                str1 +=mas[i].Replace('m', 'M') + " ";
            }
            str1 = richTextBox1.Text;


            //Алгоритм фильтрации
            string pattern = @"<[^>]*>";
            Regex newReg = new Regex(pattern);
            richTextBox1.Text = Regex.Replace(str, @"<[^>]*>", String.Empty);
        }
    }
}
