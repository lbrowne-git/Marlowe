using System.Collections.Generic;

namespace Marlowe.Utilities
{
    /// <summary>
    /// Abstract logging <see langword="interface"/>, extended for use by different logging systems. Provides access to the <see cref="ILogger.Levels"/> for debug purposes.
    /// </summary>
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
