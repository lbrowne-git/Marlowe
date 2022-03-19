using System;
using Marlowe.CSharp;
using Marlowe.Utilities;
using System.IO;
using Marlowe.Visitor;

namespace Marlowe
{
    public class Program
    {
        public static void Main(string[] args){
            string fileName = "dummy.ss";
            string FileContents = File.ReadAllText(fileName);
            // string FileContents = "int x = 4";
            IAnalyser analyser = new CSharpAnalyser(FileContents);
            try{
                analyser.CommonTokenStream.Fill();
                CSharpParser codeParser = (CSharpParser)analyser.Parser;
                CSharpVisitor cSharpVisitor = (CSharpVisitor)analyser.Visitor;
                cSharpVisitor.VisitCompilation_unit(codeParser.compilation_unit());
                Logger.GenerateContext(cSharpVisitor);
            }
            catch (Exception ex){
                Console.WriteLine("Error: " + ex);
            }
        }

   
  
    }
}