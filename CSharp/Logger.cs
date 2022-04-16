using Marlowe.Utilities;
using Marlowe.Visitor;
using System;
using System.Collections.Generic;

namespace Marlowe.CSharp
{
    public static class Logger
    {
        private static bool writable = false;
        public enum Levels : ushort
        {
            Info = 0,
            Notice = 1,
            Warring = 2,
            Error = 4
        };

        private static Levels level = Levels.Info;

        
        private static void CreateHeader(string heading = "")
        {
            if (heading == ""){
                heading = level.ToString();
            }
            Console.WriteLine($"*******************************************\n\t\t{heading}\n*******************************************");
        }

        public static void LogSymbolTable(SymbolTable symbolTable)
        {
            HandleSymbolNode(symbolTable.Variables, "Variables");
            HandleSymbolNode(symbolTable.Functions, "Functions");
            HandleSymbolNode(symbolTable.Directives, "");
        }

        private static void HandleSymbolNode(IDictionary<string, ISymbolNode> dictonary, string header = ""){
            
            CreateHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach (KeyValuePair<string, ISymbolNode> node in dictonary)
            {
                Console.WriteLine($"{node.Key}\t:" +
                    $"\t{node.Value}");
            }
            Console.WriteLine("\n");
        }
    }
}
