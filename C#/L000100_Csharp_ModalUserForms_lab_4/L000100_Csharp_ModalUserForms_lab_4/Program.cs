using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace L000100_Csharp_ModalUserForms_lab_4
{
    public class Program
    {
        /// <summary>
        /// Главная точка входа для приложения.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Form1 f1 = new Form1();
            Form2 f2 = new Form2();
            DialogResult ss = f1.ShowDialog();
            if (ss == DialogResult.OK) f2.textBox3.Text = f1.textBox1.Text;
            f2.ShowDialog();

        }
    }
}
