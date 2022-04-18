using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Utilities
{
    public interface ILogger
    {
        private static void WriteHeader(string heading = "")
        {
            if (heading == "")
            {
                heading = "wew";
            }
            Console.WriteLine($"*******************************************\n\t\t{heading}\n*******************************************");
        }

        private static void WriterContent(string content)
        {

            Console.WriteLine($"{content}");

        }


        public static void LogSymbolTable(SymbolTable symbolTable)
        {
            WriteSymbolNode(symbolTable.Variables, "Variables");
            WriteSymbolNode(symbolTable.Functions, "Functions");
            WriteSymbolNode(symbolTable.Directives, "");
        }

        private static void WriteSymbolNode(IDictionary<string, ISymbolNode> dictonary, string header = "")
        {

            WriteHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach (KeyValuePair<string, ISymbolNode> node in dictonary)
            {
                WriterContent($"{node.Key}\t:" + $"\t{node.Value}");
            }
        }


    }
}
