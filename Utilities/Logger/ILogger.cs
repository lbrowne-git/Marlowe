using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Utilities
{
    public interface ILogger
    {
        public enum Levels : ushort
        {
            Info = 0,
            Notice = 1,
            Warring = 2,
            Error = 3
        };
        
        abstract void WriteHeader(string heading = "");

        abstract void WriterContent(string content);

        abstract void LogSymbolTable(SymbolTable symbolTable);
        abstract void WriteSymbolNode(IDictionary<string, ISymbolNode> dictonary, string header = "");
    }
}
