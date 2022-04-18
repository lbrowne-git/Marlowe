using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Marlowe.Utilities;
using Marlowe.Visitor;

namespace Marlowe.CSharp
{
    /**
     * Summary:
     *      The CSharp implementation of the IAnalyser interface, which acts as a
     *      contoller for the CSharp Lexer and Parser with the input source code.
     * 
     */
    public class CSharpAnalyser : IAnalyser
    {
        #region Attribs
        private AntlrInputStream stream;
        private Lexer lexer;
        private Parser parser;
        private CommonTokenStream commonTokenStream;
        private CSharpSemanticAnalyser visitor;
        #endregion
        
        private void Setup(string text){
            stream = new AntlrInputStream(text);
            lexer = new CSharpLexer(stream);
            commonTokenStream = new CommonTokenStream(lexer);
            parser = new CSharpParser(commonTokenStream);
            visitor = new CSharpSemanticAnalyser();
        }
        public CSharpAnalyser(string text){
            Setup(text);
        }

        #region Getter & Setters
        public Lexer Lexer { get => lexer; }
        public Parser Parser { get => parser; }
        public IParseTreeVisitor<object?> Visitor { get => visitor; }
        public CommonTokenStream CommonTokenStream { get => commonTokenStream; }
        #endregion

    }
}
 