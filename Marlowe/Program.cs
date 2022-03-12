using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using Marlowe.CSharp;
using Marlowe.Utilities;
using Marlowe.Cobol;
using System.IO;
using Antlr4.Runtime.Tree;

namespace Marlowe
{
    public class Program
    {
        public static void Main(){
            string fileName = "dummy.ss";
            string FileContents = File.ReadAllText(fileName);
            string language = "cs";
            IAnalyser analyser = new CSharpAnalyser(FileContents);
            try{

                if (language == "cs")
                {

                    analyser.CommonTokenStream.Fill();
                    CSharpParser codeParser = (CSharpParser)analyser.Parser;
                    CSharpParser.Compilation_unitContext context = codeParser.compilation_unit();
                    CSharpVisitor cSharpVisitor = (CSharpVisitor)analyser.Visitor;
                    cSharpVisitor.VisitCompilation_unit(context);
             

                    codeParser.AddErrorListener(new BaseErrorListener());
                    Dictionary<string, object?> keys = cSharpVisitor.Variables;
                    foreach (var item in keys)
                    {
                        Console.WriteLine(item.Key + "\t:\t:" + item.Value);
                    }
                }
                else
                {
                    analyser = new Cobol85Analyser(FileContents);
                    analyser.CommonTokenStream.Fill();
                    CSharpParser codeParser = (CSharpParser)analyser.Parser;
                    CSharpParser.Compilation_unitContext context = codeParser.compilation_unit();
                    CSharpVisitor cSharpVisitor = (CSharpVisitor)analyser.Visitor;
                    if (codeParser.BuildParseTree)
                    {
                    }
                    Console.WriteLine(context.ToStringTree().ToLowerInvariant());
                    cSharpVisitor.VisitCompilation_unit(context);
                    codeParser.AddErrorListener(new BaseErrorListener());
                    Dictionary<string, object?> keys = cSharpVisitor.Variables;
                    foreach (var item in keys)
                    {

                    }
                }
            }
            catch (Exception ex){
                Console.WriteLine("Error: " + ex);
            }
        }

   
  
    }
}