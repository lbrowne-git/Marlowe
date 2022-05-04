using System.Collections.Generic;
using Marlowe.Utilities;

namespace Marlowe.Logger
{
    /// <summary>
    ///     Acts as a controller for both <see cref="ConsoleLogger"/> and <see cref="WriteLogger"/>.
    ///     Implements <seealso cref="ILogger"/>.
    /// </summary>
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

        public void WriteClassTable(SymbolTable symbolTable)
        {
            consoleLogger.WriteClassTable(symbolTable);
            fileLogger.WriteClassTable(symbolTable);
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

        public void WriteFunctionNode(IDictionary<string, SymbolFunctionNode> dictonary, string header = "")
        {
            throw new System.NotImplementedException();
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

        public void WriteSymbolNode(IDictionary<string, SymbolNode> dictonary, string header = "")
        {
            consoleLogger.WriteSymbolNode(dictonary, header);
            fileLogger.WriteSymbolNode(dictonary, header);
        }
    }
}
