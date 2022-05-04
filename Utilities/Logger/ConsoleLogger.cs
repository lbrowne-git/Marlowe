using Marlowe.Utilities;
using System;
using System.Collections.Generic;

namespace Marlowe.Logger
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

            Console.WriteLine($"{content}\n");
        }

        public void WriteContent(string content, ILogger.Levels level){
            if (level >= Level) {
                Console.WriteLine($"{content}");
            }
        }


        public void LogSymbolTable(SymbolTable symbolTable)
        {
            WriteSymbolNode(symbolTable.Variables, "Variables");
            WriteFunctionNode(symbolTable.Functions, "Functions");
            WriteSymbolNode(symbolTable.Directives, "Directives");
        }

        public void LogSymbolTable(SymbolTable symbolTable, string heading)
        {
            WriteSymbolNode(symbolTable.Variables, heading);
            WriteFunctionNode(symbolTable.Functions, "Functions");
            WriteSymbolNode(symbolTable.Directives, "");
        }


        /// <summary>
        ///     Analyses a <see cref="SymbolTable"/> and ouputs class information about a class.
        /// </summary>
        /// <param name="symbolTable"></param>
        public void WriteClassTable(SymbolTable symbolTable)
        {
            Dictionary<string,string> WrittenClassContent = new Dictionary<string,string>();
            foreach (string Namespace in symbolTable.GatherNamespaces())
            {
                bool NamespaceExists = false;
                bool ClassExists = false;


                WriteHeader("Variables");
                foreach (KeyValuePair<string,SymbolNode> item in symbolTable.Variables)
                {
                    try
                    {

                        if (item.Value.Namespace == Namespace)
                        {
                            if (!NamespaceExists)
                            {
                                NamespaceExists = true;
                                WriteHeader(Namespace);
                            }

                            if (!WrittenClassContent.ContainsKey(item.Value.ClassName))
                            {
                                ClassExists = true;
                                WrittenClassContent[item.Value.ClassName] = $"{item.Value.Type.Name} {item.Key}: \t{item.Value}";
                            }
                            else
                            {
                                WrittenClassContent[item.Value.ClassName] += $"{item.Value.Type.Name} {item.Key}\t:" + $"\t{item.Value}";
                            }
                        }
                    }
                    catch (Exception ex)
                    {
                        //throw new Exception($"A Class is Missing a Namespace");
                    }
                }


                WriteHeader("Functions");

                foreach (KeyValuePair<string, SymbolFunctionNode> functions in symbolTable.Functions)
                {
                    try
                    {
                        if (functions.Value.Namespace == Namespace)
                        {
                            if (!NamespaceExists)
                            {
                                NamespaceExists = true;
                                WriteHeader(Namespace);
                            }

                            if (!WrittenClassContent.ContainsKey(functions.Value.ClassName))
                            {
                                ClassExists = true;
                                WrittenClassContent[functions.Value.ClassName] = $"{functions.Key}\t:" + $"\t{functions.Value}";
                            }
                            else
                            {
                                WrittenClassContent[functions.Value.ClassName] += $"({functions.Value.Type.Name}) {functions.Key}\t:" + $"\t{functions.Value}";
                            }

                        }
                    }
                    catch (Exception ex)
                    {

                    }
                    
                }

                foreach (var item in WrittenClassContent)
                {
                    WriteHeader(item.Key);
                    WriteContent(item.Value);
                }
            }
        }

      


        public void WriteSymbolNode(IDictionary<string, SymbolNode> dictonary, string header = ""){
            WriteHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach (KeyValuePair<string, SymbolNode> node in dictonary)
            {
                try
                {
                    WriteContent($"{node.Value.Type.Name} {node.Key} :\n{node.Value}");
                }
                catch
                {// used for directives.
                    WriteContent($"{node.Key}");
                }
            }
        }
        public void WriteFunctionNode(IDictionary<string, SymbolFunctionNode> dictonary, string header = "")
        {
            WriteHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach(KeyValuePair<string, SymbolFunctionNode> node in dictonary)
            {
                WriteContent($"{node.Key} :\n{node.Value}");
            }
        }

    }
}
