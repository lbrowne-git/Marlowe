using Antlr4.Runtime;
using Marlowe.Visitor;

namespace Marlowe.Tests
{
    internal abstract class TestAnalyser
    {
        #region Attribs
        private AntlrInputStream stream;
        private CSharpLexer lexer;
        private CSharpParser parser;
        private CSharpSemanticAnalyser visitor;
        private CommonTokenStream commonTokenStream;
        #endregion

        public void Setup(string text)
        {
            stream = new AntlrInputStream(text);
            lexer = new CSharpLexer(stream);
            commonTokenStream = new CommonTokenStream(lexer);
            parser = new CSharpParser(commonTokenStream);
            visitor = new CSharpSemanticAnalyser();
        }


        #region Getter & Setters
        public CSharpLexer Lexer { get => lexer; }
        public CSharpParser Parser { get => parser; }
        public CSharpSemanticAnalyser Visitor { get => visitor; }
        public CommonTokenStream CommonTokenStream { get => commonTokenStream; }
        #endregion
    }
}
