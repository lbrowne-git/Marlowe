using System.Collections.Generic;

namespace Marlowe.Utilities
{
    public interface ILogger
    {
        enum Levels : ushort{
            Info = 0,
            Notice = 1,
            Warring = 2,
            Error = 3
        };
        
        abstract void WriteHeader(string heading);
        abstract void WriteHeader(string heading, Levels level);
        abstract void WriteContent(string content);
        abstract void WriteContent(string content, Levels level);
        abstract void LogSymbolTable(SymbolTable symbolTable);
        abstract void WriteSymbolNode(IDictionary<string, ISymbolNode> dictonary, string header = "");
    }
}
