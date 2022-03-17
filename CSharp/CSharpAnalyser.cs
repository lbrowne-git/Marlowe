using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Marlowe.Utilities;

namespace Marlowe.CSharp
{
    /*      *      *      *      *      *      *      *      *      *      *       *  
     *      Name:   Lewis Browne                                                   *
     *      Date:   26/01/2022                                                     * 
     *      Desc:   A class which will be used as a intermediary level             *
     *              between the input source code and the ANTLR lexer and parser   *
     *                                                                             *
     *     *      *      *      *      *      *      *      *      *      *        */
    public class CSharpAnalyser : IAnalyser
    {
        #region Attribs
        private AntlrInputStream stream;
        private Lexer lexer;
        private Parser parser;
        private CommonTokenStream commonTokenStream;
        private CSharpVisitor visitor;
        #endregion
        
        private void Setup(string text){
            stream = new AntlrInputStream(text);
            lexer = new CSharpLexer(stream);
            commonTokenStream = new CommonTokenStream(lexer);
            parser = new CSharpParser(commonTokenStream);
            visitor = new CSharpVisitor();
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
 