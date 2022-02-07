using System;

namespace Marlowe
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = "Console.Writeline(\"hello\")";

            Console.WriteLine("Input:\t{0}",input);
            Analyser analyser = new Analyser(input);
            //analyser.HandleRequest();
        }
    }
}
