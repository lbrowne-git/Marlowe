using System;
using System.Collections.Generic;

namespace Marlowe.Utilities
{
    public class WriteLogger : ILogger
    {
        public enum Levels : ushort
        {
            Info = 0,
            Notice = 1,
            Warring = 2,
            Error = 4
        };

        private bool Writeable { get => Writeable; set => Writeable = value; }

        private Levels Level { set => this.Level = value; }
        private string Dir { set => this.Dir = value; }

        private string FileName = "log.txt";

        public WriteLogger(bool write, Levels lvl)
        {
            this.Writeable = write;
            this.Level = lvl;
        }
        public WriteLogger(bool write, Levels levels, string dir){

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
