using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Configuration;

namespace Marlowe.Utilities
{
    public class ConsoleLogger : ILogger
    {
  
        private ILogger.Levels Level { set => this.Level = value; }


        public ConsoleLogger(bool write, ILogger.Levels levels, string dir){

        }
        
        public void WriteHeader(string heading = "")
        {
            Console.WriteLine($"*******************************************\n\t\t{heading}\n*******************************************");
        }

        public void WriterContent(string content)
        {

            Console.WriteLine($"{content}");

        }


        public void LogSymbolTable(SymbolTable symbolTable)
        {
            WriteSymbolNode(symbolTable.Variables, "Variables");
            WriteSymbolNode(symbolTable.Functions, "Functions");
            WriteSymbolNode(symbolTable.Directives, "");
        }

        public void WriteSymbolNode(IDictionary<string, ISymbolNode> dictonary, string header = ""){
            WriteHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach (KeyValuePair<string, ISymbolNode> node in dictonary)
            {
                WriterContent($"{node.Key}\t:" + $"\t{node.Value}");
            }
        }
    }
}
