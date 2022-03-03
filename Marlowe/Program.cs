using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using Marlowe.CSharp;

namespace Marlowe
{
    class Program
    {
        static void Main(string[] args){
            string fileName = "dummy.ss";
            //string FileContents = File.ReadAllText(fileName);
            string FileContents = "public class dummy{\n\rint x = 2 + 4;}\n\r";
            CSharpAnalyser analyser = new CSharpAnalyser(FileContents);
            try{
                analyser.CommonTokenStream.Fill();
                CSharpParser codeParser= (CSharpParser)analyser.Parser;
                CSharpParser.Compilation_unitContext context = codeParser.compilation_unit();
                CSharpParserBaseVisitor<object?> cSharpVisitor = (CSharpParserBaseVisitor<object?>)analyser.Visitor;
                if (codeParser.BuildParseTree){
                }
                cSharpVisitor.VisitCompilation_unit(context);
                cSharpVisitor.
                codeParser.AddErrorListener(new BaseErrorListener());
                Dictionary<string, object?> keys = cSharpVisitor;
                foreach (var item in keys){

                }
            }
            catch (Exception ex){
                Console.WriteLine("Error: " + ex);
            }
        }
  
    }
}