using System;
using System.Collections.Generic;
using System.IO;

namespace Marlowe.Utilities
{

    /// <summary>
    ///     Allows For the writing of logging information to a specified file or defaults to a file in the build location.
    ///     Implements <seealso cref="ILogger"/>.
    /// </summary>
    public class WriteLogger : ILogger
    {

        private readonly ILogger.Levels Level;
        private string FileName = "log.txt";

        public WriteLogger(ILogger.Levels lvl){
            this.Level = lvl;
        }
        public WriteLogger(ILogger.Levels level, string dir){
            this.Level = level;
            FileName = dir + FileName;
        }

        public void WriteHeader(string heading)
        {
            File.WriteAllText(FileName,$"|{DateTime.Now}|");
        }

        public void WriteHeader(string heading, ILogger.Levels level)
        {
            if (level >= Level){
                Console.WriteLine($"|{DateTime.Now}|");
            }
        }
        public void WriteContent(string content)
        {

            File.WriteAllText(FileName,$"{content}");

        }
        public void WriteContent(string content, ILogger.Levels level)
        {
            if(level >= Level)
            {
                Console.WriteLine($"{content}");
            }
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
                WriteContent($"{node.Key}\t:" + $"\t{node.Value}");
            }
        }

    }
}
