using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace L000110_lab_13
{
    public partial class Form1 : Form
    {
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
            toolTip2.ToolTipTitle = "Ya!";
        }

        private void pictureBox1_MouseMove(object sender, MouseEventArgs e)
        {
            Point p = pictureBox1.Location;   // позиция левого верхнего угла pictureBox1
            Point p1 = this.Location;        // позиция левого верхнего угла формы
            // e.X и e.Y погиция курсора в pictureBox1
            int XX, YY;
            XX = e.X + p.X + p1.X; YY = e.Y + p.Y + p1.Y;
            Bitmap bmp = new Bitmap(1, 1);
            using (Graphics g = Graphics.FromImage(bmp))
            { g.CopyFromScreen(XX, YY, 0, 0, new Size(1, 1)); }
            Color color = bmp.GetPixel(0, 0);
            string SS;
            SS = Convert.ToString(color);
            toolTip1.ToolTipTitle = SS;
            toolTip1.SetToolTip(this.pictureBox1, " ");
        }

        bool MouseState = false;
        Point PrevMousePos;

        private void pictureBox2_MouseDown(object sender, MouseEventArgs e)
        {
            PrevMousePos = new Point(e.X, e.Y);
            if (e.Button == MouseButtons.Left) { this.MouseState = true; }
        }

        private void pictureBox2_MouseUp(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left) { this.MouseState = false; }
        }

        private void pictureBox2_MouseMove(object sender, MouseEventArgs e)
        {
            if (this.MouseState)
            {
                int dx = e.X - PrevMousePos.X;
                int dy = e.Y - PrevMousePos.Y;
                pictureBox2.Location = new Point(pictureBox2.Location.X + dx, pictureBox2.Location.Y + dy);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}

