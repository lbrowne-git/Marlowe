using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Marlowe.Utilities;

namespace Marlowe.CSharp
{

    /// <summary>
    /// The CSharp implementation of the <see langword="abstract"/> <see cref="Analyser"/>, which acts as a
    /// contoller for the <see cref="CSharpLexer"/> and <see cref="CSharpParser"/> passing it an input stream.
    /// </summary>
    public class CSharpAnalyser : Analyser
    {

        private void Setup(string text){
            
            Stream = new AntlrInputStream(text);
            Lexer = new CSharpLexer(Stream);
            CommonTokenStream = new CommonTokenStream(Lexer);
            Parser = new CSharpParser(CommonTokenStream);
            Visitor = new CSharpVisitor();
        }
        public CSharpAnalyser(string text){
            Setup(text);
        }
    }
}
 