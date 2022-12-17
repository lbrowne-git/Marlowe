using System;
using Marlowe.CSharp;
using Marlowe.Utilities;
using Marlowe.Logger;
using System.IO;
using System.Diagnostics;
using CommandLine;
using System.Collections.Generic;


namespace Marlowe{
     ///<summary>
     ///      The entry point of this application. Reads HLL 
     ///      source code and passes it onto the Analyser.
     ///      
     ///</summary>
    public class Program : CommandObjectHandler
    {
   
        private static void Main(string[] args){
            Timer.Start();

            CommandHandler.ParseArguments(args);

            // Populates SymbolTables
            ExecuteAnalyser(Files);
            
            //Entry point into interpetation.
            Interpeter interpeter = new Interpeter(SymbolTables, Logger);
            interpeter.Execute();
            if (ShowSymbolTable)
            {
                interpeter.LogExecutedSymbolTable();
            }


            TimeSpan timeSpan = Timer.Elapsed;
            Console.WriteLine($"the application took {timeSpan.Milliseconds}ms to complete this run");
  

        }

        /// <summary>
        ///     Generates a list of class objects that can be gotten using <see cref="GetClassObject(string)"/> or <see cref="GetClassObjects(List{string})"/>.
        ///     This is done by making use of the concrete implementation of <see cref="Analyser"/>, and its analyser type can be changed.</summary>
        ///     
        /// <remarks>
        ///     This is <see langword="static"/> so it can be used with <see cref="Main(string[])"/>.
        /// </remarks>
        /// <param name="files">A collection of files that will analysed by the system</param>.
        public static void ExecuteAnalyser(List<string> files)
        {
            foreach (string file in files)  // passes through each file in a directory
            {
                try{
                    string FileContents = File.ReadAllText(file);

                    Analyser analyser = new CSharpAnalyser(FileContents);
                    analyser.CommonTokenStream.Fill();

                    // Casts the abstract Analyser types to their CSharp implementation.
                    CSharpParser codeParser = (CSharpParser)analyser.Parser;
                    codeParser.RemoveErrorListeners();
                    CSharpVisitor cSharpVisitor = (CSharpVisitor)analyser.Visitor;
                    cSharpVisitor.VisitCompilation_unit(codeParser.compilation_unit());
         

                    //Populates with a file's SymbolTable.
                    SymbolTables.Add(cSharpVisitor);

                }
                catch (Exception ex)
                {
                    Console.WriteLine("Error: " + ex);
                }
            }
        }


        public List<object> GetClassObjects(List<string> files)
        {
            ExecuteAnalyser(files);
            return NodeObjects;
        }

        public List<object> GetClassObject(string file)
        {
            ExecuteAnalyser(new List<string>() { file });
            return NodeObjects;
        }
        /// <summary>
        ///Handles the CLI of this applicaiton
        /// </summary>
  
    }
}