using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Configuration;

namespace Marlowe.Utilities
{

    /// <summary>
    ///     Allows For the writing of logging information to the console.
    ///     Implements <seealso cref="ILogger"/>.
    /// </summary>
    public class ConsoleLogger : ILogger
    {

        private readonly ILogger.Levels Level;

        public ConsoleLogger(ILogger.Levels levels = ILogger.Levels.Error){
            Level= levels;
        }
        
        public void WriteHeader(string heading = "")
        {
            Console.WriteLine($"*******************************************\n\t\t{heading}\n*******************************************");
        }

        public void WriteHeader(string heading, ILogger.Levels level)
        {
            if (level >= Level)
            {
                Console.WriteLine($"*******************************************\n\t\t{heading}\n*******************************************");
            }
        }
        public void WriteContent(string content){

            Console.WriteLine($"{content}");
        }

        public void WriteContent(string content, ILogger.Levels level){
            if (level >= Level) {
                Console.WriteLine($"{content}");
            }
        }


        public void LogSymbolTable(SymbolTable symbolTable)
        {
            WriteSymbolNode(symbolTable.Variables, "Variables");
            WriteSymbolNode(symbolTable.Functions, "Functions");
            WriteSymbolNode(symbolTable.Directives, "");
        }

        public void LogSymbolTable(SymbolTable symbolTable, string heading)
        {
            WriteSymbolNode(symbolTable.Variables, heading);
            WriteSymbolNode(symbolTable.Functions, "Functions");
            WriteSymbolNode(symbolTable.Directives, "");
        }

        public void WriteSymbolNode(IDictionary<string, ISymbolNode> dictonary, string header = ""){
            WriteHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach (KeyValuePair<string, ISymbolNode> node in dictonary)
            {
                WriteContent($"{node.Key}\t:" + $"\t{node.Value}");
            }
        }

     

    }
}
