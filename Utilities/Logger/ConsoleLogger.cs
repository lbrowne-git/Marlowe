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
            WriteFunctionNode(symbolTable.Functions, "Functions");
            WriteSymbolNode(symbolTable.Directives, "Directives");
        }

        public void LogSymbolTable(SymbolTable symbolTable, string heading)
        {
            WriteSymbolNode(symbolTable.Variables, heading);
            WriteFunctionNode(symbolTable.Functions, "Functions");
            WriteSymbolNode(symbolTable.Directives, "");
        }

        public void WriteClassTable(SymbolTable symbolTable)
        {
  
            foreach (string Namespace in symbolTable.GatherNamespaces())
            {
                bool NamespaceExists = false;
                bool ClassExists = false;
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
                            foreach (string classes in symbolTable.GatherClasses())
                            {
                                try
                                {

                                    if (item.Value.ClassName == classes)
                                    {
                                        if (!ClassExists)
                                        {
                                            ClassExists = true;
                                            WriteHeader(classes);
                                            WriteContent($"{item.Key}\t:" + $"\t{item.Value}");

                                        }
                                    }
                                    else if (ClassExists)   //If the Namespace has moved to another class
                                    {
                                        WriteContent($"{item.Key}\t:" + $"\t{item.Value}");
                                    }
                                }
                                catch
                                {
                                    Console.WriteLine("we have gone here");

                                }
                            }
                        }
                    }
                    catch (Exception ex)
                    {
                        //throw new Exception($"A Class is Missing a Namespace");
                    }
                }



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
                            foreach (string classes in symbolTable.GatherClasses())
                            {
                                try
                                {
                                    if (functions.Value.ClassName == classes)
                                    {
                                        if (!ClassExists)
                                        {
                                            ClassExists = true;
                                            WriteHeader(classes);
                                        }
                                        WriteContent($"{functions.Key}\t:" + $"\t{functions.Value}");
                                    }
                                }
                                catch
                                {
                                    Console.WriteLine("we have gone here");
                                }
             
                            }



                        }

                    }
                    catch(Exception ex)
                    {

                    }
                    
                    }

            }
        }

      


        public void WriteSymbolNode(IDictionary<string, SymbolNode> dictonary, string header = ""){
            WriteHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach (KeyValuePair<string, SymbolNode> node in dictonary)
            {
                WriteContent($"{node.Key}\t:" + $"\t{node.Value}");
            }
        }
        public void WriteFunctionNode(IDictionary<string, SymbolFunctionNode> dictonary, string header = "")
        {
            WriteHeader(header);
            Console.WriteLine($"Total:\t {dictonary.Count}");
            foreach(KeyValuePair<string, SymbolFunctionNode> node in dictonary)
            {
                WriteContent($"{node.Key}\t:" + $"\t{node.Value}");
            }
        }

    }
}
