using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Text.RegularExpressions;

namespace L000105_Csharp_RegularExpressions_Taimer_lab_7
{
    public partial class Form2 : Form
    {
        bool kod;
        Timer tm = new Timer();
        public Form2()
        {
            InitializeComponent();
            tm.Interval = 300;
            this.tm.Tick += new System.EventHandler(this.tm_Tick);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // останавливается таймер
            // если правильные данные, то окно закрывается
            this.label1.ForeColor = Color.Black;
            tm.Stop();
            this.label1.Visible = true;
            if (kod) this.Close();
        }
        
        // Таймер через интервал времени вызывает это событие
        // В нем в режиме флип-флоп изменяетсЯ видимость метки, чтобы она мигала

        private void tm_Tick(object sender, EventArgs e)
        {
            this.label1.Visible = !this.label1.Visible;
            tm.Start();
        }

        private void textBox1_MouseLeave(object sender, EventArgs e)
        {
            kod=true;
            Regex r= new Regex(@"[^\d,+-]|([,\d][+-])|[+-]{2.}|(\d*,\d*,\d*)",RegexOptions.IgnoreCase);
                if (r.IsMatch(textBox1.Text))
                {
                        // неправильный формат данных в окгне textBox1
                        // стартуется таймер для мигания надписи X=
                    kod = false;
                    this.label1.ForeColor = Color.Red;
                    tm.Start();
                }

        }

    }
}
