using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace L000100_Csharp_ModalUserForms_lab_4_individual
{
    class Program
    {
        static void Main(string[] args)
        {            
            StreamReader data = new StreamReader(@"d:\MY\Git\C#\data.txt", Encoding.GetEncoding(1251));
            string st = data.ReadLine();
            int i;
            Console.WriteLine("Initial line:");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------------------------------");
            Console.WriteLine(st + "\n\n");

            Console.WriteLine("The resulting string:");
            Console.WriteLine("---------------------------------------------------------------------------------------------------------------------------------------------");
                string[] mas = st.Split(' ');
                for (i = 0; i < mas.Length; i++)
                {
                    Console.Write(mas[i].Replace('m', 'M') + " ");
                }
                Console.ReadLine();
                data.Close();
        }
        
    }
}

