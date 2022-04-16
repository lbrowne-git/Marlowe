using System;
using Marlowe.CSharp;
using Marlowe.Utilities;
using System.IO;
using Marlowe.Visitor;
using System.Diagnostics;

namespace Marlowe
{
    public class Program
    {
        private static Stopwatch timer = new Stopwatch();
        public static void Main(string[] args)
        {
            timer.Start();
            string fileName = "dummy.ss";
            if (args.Length > 0){
                foreach (string argument in args){
                    if (argument.StartsWith("--fn="))
                    {
                        fileName = argument.Remove(0, 5);
                    }
                    else if (argument.StartsWith("--fl=")){
                        fileName = Environment.GetEnvironmentVariable(argument.Remove(0,5));
                        DirectoryInfo d = new DirectoryInfo(fileName);

                        foreach (var file in d.GetFiles("*.cs"))
                        {
                            Console.WriteLine(file);
                        }
                    }
                }
            }
            string FileContents = File.ReadAllText(fileName);
         // string FileContents = "int x = 4";
            IAnalyser analyser = new CSharpAnalyser(FileContents);
            try{
                analyser.CommonTokenStream.Fill();
                CSharpParser codeParser = (CSharpParser)analyser.Parser;
                CSharpVisitor cSharpVisitor = (CSharpVisitor)analyser.Visitor;
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