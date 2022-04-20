using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Utilities
{
    public class ConsoleAndWriteLogger : ILogger
    {
        private readonly ConsoleLogger consoleLogger;
        private readonly WriteLogger fileLogger;


        public ConsoleAndWriteLogger(ILogger.Levels level)
        {
            consoleLogger = new ConsoleLogger(level);
            fileLogger = new WriteLogger(level);
        }

        public void LogSymbolTable(SymbolTable symbolTable)
        {
            consoleLogger.LogSymbolTable(symbolTable);
            fileLogger.LogSymbolTable(symbolTable);
        }

        public void WriteContent(string content)
        {
            consoleLogger.WriteContent(content);
            fileLogger.WriteContent(content);
        }

        public void WriteContent(string content, ILogger.Levels level)
        {
            consoleLogger.WriteContent(content, level);
            fileLogger.WriteContent(content, level);
        }

        public void WriteHeader(string heading)
        {
            consoleLogger.WriteHeader(heading);
            fileLogger.WriteHeader(heading);
        }

        public void WriteHeader(string heading, ILogger.Levels level)
        {
            consoleLogger.WriteHeader(heading, level);
            fileLogger.WriteHeader(heading, level);
        }

        public void WriteSymbolNode(IDictionary<string, ISymbolNode> dictonary, string header = "")
        {
            consoleLogger.WriteSymbolNode(dictonary, header);
            fileLogger.WriteSymbolNode(dictonary, header);
        }
    }
}
