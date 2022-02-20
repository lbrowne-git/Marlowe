using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.IO;

namespace Marlowe.Analysis
{
    class Program
    {
        static void Main(string[] args){
            string fileName = "dummy.ss";
            //string FileContents = File.ReadAllText(fileName);
            string FileContents = "public class dummy{\n\rint x = 2 + 4;";
            Analyser analyser = new Analyser(FileContents);
            try{
                analyser.CommonTokenStream.Fill();
                CSharpParser codeParser= analyser.Parser;
                global::CSharpParser.Compilation_unitContext context = codeParser.compilation_unit();
                analyser.Visitor.VisitCompilation_unit(context);
                codeParser.AddErrorListener(new BaseErrorListener());
                Dictionary<string, Node> keys = analyser.Visitor.Variables;
                IList<IToken> tokens = analyser.CommonTokenStream.GetTokens();
                foreach (IToken token in tokens){
                    ITokenSource source = token.TokenSource;
                    Console.WriteLine("Channel: "+ token.Channel);
                    Console.WriteLine("Text:\t" + token.Text);
                    Console.WriteLine("Line:\t" + token.Line);
                    Console.WriteLine("Column:\t" + token.Column);
                }

              //  CSharpParser.Compilation_unitContext context = analyser.Parser.compilation_unit();
              //  ITerminalNode[] contextTokens = context.GetTokens(87);
            }
            catch (Exception ex){
                Console.WriteLine("Error: " + ex);
            }
        }
  
    }
}