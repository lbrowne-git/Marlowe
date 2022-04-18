using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Marlowe.Utilities;
using Marlowe.Visitor;

namespace Marlowe.CSharp
{
    /**
     * Summary:
     *      The CSharp implementation of the abstract Analyser, which acts as a
     *      contoller for the CSharp Lexer and Parser with the input source code.
     * 
     */
    public class CSharpAnalyser : Analyser
    {
        private CSharpSemanticAnalyser visitor;

        private void Setup(string text){
            
            Stream = new AntlrInputStream(text);
            Lexer = new CSharpLexer(Stream);
            CommonTokenStream = new CommonTokenStream(Lexer);
            Parser = new CSharpParser(CommonTokenStream);
            Visitor = new CSharpSemanticAnalyser();
        }
        public CSharpAnalyser(string text){
            Setup(text);
        }
    }
}
 