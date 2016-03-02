using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace L000104_Csharp_PrototypeData_DropDownList_lab_8
{
    static class Program
    {
        /// <summary>
        /// Главная точка входа для приложения.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form2());
        }
    }
}
