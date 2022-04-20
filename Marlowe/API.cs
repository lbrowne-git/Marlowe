using System;
using Marlowe.CSharp;
using Marlowe.Utilities;
using System.IO;
using System.Diagnostics;
using CommandLine;
using System.Collections.Generic;


namespace Marlowe
{
    
    
     ///<summary>
     ///      The entry point of this application. Reads HLL 
     ///      source code and passes it onto the Analyser.
     ///      
     ///</summary>
    public class API
    {
        private static readonly Stopwatch Timer = new Stopwatch();
        public static ILogger.Levels Level = ILogger.Levels.Error;
        public static ILogger Logger;
        public static bool ShowSymbolTable = false;
        private static readonly List<SymbolTable> symbolTables = new List<SymbolTable>();
        private readonly List<object> NodeObjects = new List<object>();

        private static void Main(string[] args){
            List<string> files = new List<string>();
            #region CLI Handler
            Timer.Start();
            Parser.Default.ParseArguments<Options>(args)
                   .WithParsed<Options>(o =>{
                       // Logging
                       if (o.Loggable){
                           if (o.Writeable){
                               Level = Options.LogHandler();
                               Logger = new ConsoleAndWriteLogger(Level);
                           }
                           else{
                               Level = Options.LogHandler();
                               Logger = new ConsoleLogger(Options.LogHandler());
                           }
                       }
                       else if(o.Writeable){
                           Timer.Start();
                           if(o.WriteDir != null){
                               Logger = new WriteLogger(Options.LogHandler(), o.WriteDir);
                           }
                       }

                       // Symbol Table
                       if (o.SymbolTable){
                           ShowSymbolTable = o.SymbolTable;
                       }

                       // File Handling
                       if(o.File != null){
                           files.Add(o.File);
                       }
                       else if(o.Directory != null){
                           foreach (string file in Directory.GetFiles(o.Directory, "*.cs"))
                           {
                               if (File.Exists(file))
                               {
                                   files.Add(file);
                               }
                           }
                       }

                   });
            #endregion

            Execute(files);
        }

        /// <summary>
        ///     Generates A list of class objects that can be gotten using <see cref="GetClassObject(string)"/> or <see cref="GetClassObjects(List{string})"/>.
        ///     By reading the files content at a directory that shave been passed to it. This is <see langword="static"/> so it can be used with <see cref="Main(string[])"/>.
        /// </summary>
        /// <param name="files">A collection of files that will analysed by the system</param>.
        public static void Execute(List<string> files)
        {
            foreach (string file in files)
            {
                try{
                    string FileContents = File.ReadAllText(file);

                    Analyser analyser = new CSharpAnalyser(FileContents);
                    analyser.CommonTokenStream.Fill();

           
                    CSharpParser codeParser = (CSharpParser)analyser.Parser;
                    codeParser.RemoveErrorListeners();
                    CSharpVisitor cSharpVisitor = (CSharpVisitor)analyser.Visitor;
                    cSharpVisitor.VisitCompilation_unit(codeParser.compilation_unit());
                    if (Logger != null)
                    {
                        if (ShowSymbolTable)
                        {
                            Logger.LogSymbolTable(cSharpVisitor);
                        }

                    }
                    symbolTables.Add(cSharpVisitor);

                }
                catch (Exception ex)
                {
                    Console.WriteLine("Error: " + ex);
                }
            }
            foreach (SymbolTable symbolTable in symbolTables){
                object test = SymbolNodeToClassBuilder.CreateNewObject(symbolTable);
                Console.WriteLine("Sucessfully created class \t" + test.GetType() + " \nIt has the following properities:");
                foreach (var item in test.GetType().GetProperties())
                {
                    Console.WriteLine(item.Name + "\t" + item.PropertyType);
                }
            }
            TimeSpan timeSpan = Timer.Elapsed;
            Console.WriteLine($"the application took {timeSpan.Milliseconds}ms to complete this run");

        }


        public List<object> GetClassObjects(List<string> files)
        {
            Execute(files);
            return NodeObjects;
        }

        public List<object> GetClassObject(string file)
        {
            Execute(new List<string>() { file });
            return NodeObjects;
        }


        /// <summary>
        ///Handles the CLI of this applicaiton
        /// </summary>
        public class Options
        {
            [Option('f', "file", Required = false, HelpText = "The name of the file that will be interpeted.")]
            public string File { get; set; }

            [Option('d', "dir", Required = false, HelpText = "The directory that will interpetated. Requires a file to have a main as an entry point")]
            public string Directory { get; set; }

            [Option('s', "st", Required = false, HelpText = "Will output a symbol table instead of actually executing any code, can be used to view the contents of a class")]
            public bool SymbolTable { get; set; }

            [Option('l', "Log", Required = false, HelpText = "Toggleable logger, accepts true or false. This is on by default")]
            public bool Loggable { get; set; } = true;

            [Option('w', "Write", Required = false, HelpText = "Toggleable writer, accepts true or false and writes to a .txt within Marlowe ")]
            public bool Writeable { get; set; }

            [Option("wdir", Required = false, HelpText = "Custom write location accepts a directory to create a txt file.")]
            public string WriteDir { get; set; }

            [Option("LogLevel", Required = false, HelpText = "Allows for verbose or minimalistic log details accepts: \nInfo = 0,\nNotice = 1,\nWarring = 2,\nError = 3 (default)")]
            public static string LogLevel { get; set; }

            public static ILogger.Levels LogHandler()
            {
                try
                {
                    if (LogLevel != null)
                    {
                        switch (LogLevel.ToUpper())
                        {
                            case "INFO":
                            case "0":
                                return ILogger.Levels.Info;
                            case "NOTICE":
                            case "1":
                                return ILogger.Levels.Notice;
                            case "WARNING":
                            case "2":
                                return ILogger.Levels.Warring;
                            case "ERROR":
                            case "3":
                                return ILogger.Levels.Error;

                            default:    // This when a logging level is not specified.
                                return ILogger.Levels.Error;
                        }
                    }
                    else
                    {
                        return Level;
                    }
                }
                catch(Exception ex)
                {
                    return Level;
                }
            }
        }
    }
}