using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using Marlowe.CSharp;
using Marlowe.Utilities;
using Marlowe.Cobol;
using System.IO;
using Antlr4.Runtime.Tree;
using Utilities;

namespace Marlowe
{
    public class Program
    {
        public static void Main(){
            string fileName = "dummy.ss";
            string FileContents = File.ReadAllText(fileName);
           // string FileContents = "int x = 4";
            IAnalyser analyser = new CSharpAnalyser(FileContents);
            try{
                analyser.CommonTokenStream.Fill();
                CSharpParser codeParser = (CSharpParser)analyser.Parser;
                CSharpParser.Compilation_unitContext context = codeParser.compilation_unit();
                CSharpVisitor cSharpVisitor = (CSharpVisitor)analyser.Visitor;
                cSharpVisitor.VisitCompilation_unit(context);
                Logger.GenerateContext(cSharpVisitor);

            }
            catch (Exception ex){
                Console.WriteLine("Error: " + ex);
            }
        }

   
  
    }
}