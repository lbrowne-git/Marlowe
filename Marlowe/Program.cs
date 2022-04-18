using System;
using Marlowe.CSharp;
using Marlowe.Utilities;
using System.IO;
using Marlowe.Visitor;
using System.Diagnostics;

namespace Marlowe
{

    /**
     * Summary: 
     *      The entry point of this application. Reads HLL 
     *      source code and passes it onto the Analyser.
     * 
     */
    public class Program
    {
        private static Stopwatch timer = new Stopwatch();
        public string test = "hello";
        public static void Main(string[] args)
        {
            timer.Start();


            // Loads files that are passed through cli args
            string fileName = "dummy.ss";
            if (args.Length > 0){
                foreach (string argument in args)
                {
                    if (argument.StartsWith("--fn="))
                    {
                        fileName = argument.Remove(0, 5);
                    }
                    else if (argument.StartsWith("--fl="))
                    {
                        fileName = Environment.GetEnvironmentVariable(argument.Remove(0,5));
                        DirectoryInfo d = new DirectoryInfo(fileName);

                        foreach (var file in d.GetFiles("*.cs"))
                        {
                            Console.WriteLine(file);
                        }
                    }
                }
            }
            
            // Parser Content

            string FileContents = File.ReadAllText(fileName);
         // string FileContents = "int x = 4";

            IAnalyser analyser = new CSharpAnalyser(FileContents);
            try{
                analyser.CommonTokenStream.Fill();

                /** Accesses abstract parser generator and casts to CSharp implemenation.
                 *  Allowing for substituion with other  parsers and visitors.
                 *  
                 */
                CSharpParser codeParser = (CSharpParser)analyser.Parser;
                codeParser.RemoveErrorListeners();
                CSharpSemanticAnalyser cSharpVisitor = (CSharpSemanticAnalyser)analyser.Visitor;
                cSharpVisitor.VisitCompilation_unit(codeParser.compilation_unit());


                Logger.LogSymbolTable(cSharpVisitor);
                TimeSpan timeSpan = timer.Elapsed;
                Console.WriteLine($"the application took {timeSpan.Milliseconds}ms to complete this run");
            }
            catch (Exception ex){
                Console.WriteLine("Error: " + ex);
            }
        }
    }
}