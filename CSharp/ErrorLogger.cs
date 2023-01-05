using Marlowe.Logger;
using Marlowe.Utilities;
using System.Collections.Generic;

namespace Marlowe.CSharp
{
    public class ErrorLogger : ILogger
    {
        private readonly ConsoleLogger ConsoleLogger = new ConsoleLogger();
        private readonly ILogger.Levels LogLevel;

        public ErrorLogger(ILogger.Levels logLevel)
        {
            LogLevel = logLevel;
        }

        public void LogSymbolTable(SymbolTable symbolTable)
        {
            ConsoleLogger.LogSymbolTable(symbolTable);
        }

        public void WriteClassTable(SymbolTable symbolTable)
        {
            ConsoleLogger.WriteClassTable(symbolTable);
        }

        public void WriteContent(string content)
        {
            ConsoleLogger.WriteContent(content);
        }

        public void WriteContent(string content, ILogger.Levels level)
        {
            if (level >= LogLevel)
            {
                throw new System.Exception($"{content}");
            }
            else
            {
                System.Console.WriteLine($"content");
            }
        }

        public void WriteHeader(string heading)
        {
            ConsoleLogger.WriteHeader(heading);
        }

        public void WriteHeader(string heading, ILogger.Levels level)
        {
            if (level >= LogLevel)
            {
                throw new System.Exception($"{heading}");
            }
            else
            {
                ConsoleLogger.WriteHeader($"{heading}");
            }
        }

        public void WriteSymbolNode(IDictionary<string, SymbolNode> dictonary, string header = "")
        {
            ConsoleLogger?.WriteSymbolNode(dictonary, header);
        }
        public void WriteFunctionNode(IDictionary<string, SymbolFunctionNode> dictonary, string header = "")
        {
            ConsoleLogger?.WriteFunctionNode(dictonary, header);
        }
    }
}