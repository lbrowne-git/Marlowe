using Antlr4.Runtime;
using Marlowe.CSharp;
using Marlowe.Utilities;
namespace Marlowe.Tests
{
    public class AnalyserStub : Analyser
    {
        public AnalyserStub()
        {
        }
        public AnalyserStub(string text)
        {
            Setup(text);
        }

        public virtual void Setup(string text)
        {
            Stream = new AntlrInputStream(text);
            Lexer = new CSharpLexer(Stream);
            CommonTokenStream = new CommonTokenStream(Lexer);
            Parser = new CSharpParser(CommonTokenStream);
            Visitor = new CSharpVisitor();
        }
    }
}
