using System.Collections.Generic;
using Marlowe.Utilities;
namespace Marlowe.Logger
{
    /// <summary>
    /// Logging <see langword="interface"/>, extendable for use by different logging systems. Provides access to the <see cref="ILogger.Levels"/> for debug purposes.
    /// </summary>
    public interface ILogger
    {
        enum Levels : ushort{
            Info = 0,
            Notice = 1,
            Warning = 2,
            Error = 3
        };
        
        abstract void WriteHeader(string heading);
        abstract void WriteHeader(string heading, Levels level);
        abstract void WriteContent(string content);
        abstract void WriteContent(string content, Levels level);
        abstract void LogSymbolTable(SymbolTable symbolTable);
        abstract void WriteSymbolNode(IDictionary<string, SymbolNode> dictonary, string header = "");
        abstract void WriteClassTable(SymbolTable symbolTable);
        public void WriteFunctionNode(IDictionary<string, SymbolFunctionNode> dictonary, string header = "");

    }
}
