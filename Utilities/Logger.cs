using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Configuration;

namespace Marlowe.Utilities
{
    public static class Logger
    {
        public enum Levels : ushort
        {
            Info = 0,
            Notice = 1,
            Warring = 2,
            Error = 4
        };


        
        private static void WriteHeader(string heading = "")
        {
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

        private static void WriteSymbolNode(IDictionary<string, ISymbolNode> dictonary, string header = ""){
            
            WriteHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach (KeyValuePair<string, ISymbolNode> node in dictonary)
            {
                WriterContent($"{node.Key}\t:" + $"\t{node.Value}");
            }
        }
    }
}
