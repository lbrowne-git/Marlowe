using System;
using System.Collections.Generic;
using System.IO;
using Marlowe.CSharp;
using Marlowe.Utilities;

namespace Marlowe.Tests
{
    /// <summary>
    /// Stub implementation of The Interpeter Engine.
    /// </summary>
    public  class InterpeterStub : ComputableAPI
    {
        private static readonly string dir = "F:\\Libraries\\Libraries\\College\\FYP\\Marlowe\\Testing Files";
        public static List<string> files = new List<string>();
        public InterpeterStub(){            
            Setup();
        }

        public virtual void Setup()
        {
            foreach (string file in Directory.GetFiles(dir, " *.cs"))
            {
                if (File.Exists(file))
                {
                    files.Add(file);
                    ExecuteAnalyser(files);
                }
            }
        }

        public void ExecuteAnalyser(List<string> files)
        {
            foreach (string file in files)  // passes through each file in a directory
            {
                try
                {
                    //string FileContents = File.ReadAllText(file);

                    Analyser analyser = new AnalyserStub(file);
                    analyser.CommonTokenStream.Fill();

                    // Casts the abstract Analyser types to their CSharp implementation.
                    CSharpParser codeParser = (CSharpParser)analyser.Parser;
                    codeParser.RemoveErrorListeners();
                    CSharpVisitor cSharpVisitor = (CSharpVisitor)analyser.Visitor;
                    cSharpVisitor.VisitCompilation_unit(codeParser.compilation_unit());


                    //Populates with a file's SymbolTable.
                    symbolTables.Add(cSharpVisitor);

                }
                catch (Exception ex)
                {
                    Console.WriteLine("Error: " + ex);
                }
            }
        }

    }
}