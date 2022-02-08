using Antlr4.Runtime;
using System;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;

namespace Marlowe.Analysis
{
    class Program
    {
        static void Main(string[] args)
        {
            Analyser analyser;
                try
                {
                    string input = "";
                    StringBuilder text = new StringBuilder();
                    Console.WriteLine("Input the chat.");

                    // to type the EOF character and end the input: use CTRL+D, then press <enter>
                    while ((input = Console.ReadLine()) != "u0004")
                    {
                        text.AppendLine(input);
                    }
                analyser = new Analyser(text.ToString());

                    
                }
                catch (Exception ex)
                {
                    Console.WriteLine("Error: " + ex);
                }
        }
  
    }
}
