using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Marlowe.Utilities;

namespace Marlowe.Cobol
{
    /*      *      *      *      *      *      *      *      *      *      *       *  
     *      Name:   Lewis Browne                                                   *
     *      Date:   03/03/2022                                                     * 
     *      Desc:   A class which will be used as a intermediary level             *
     *              between the input source code and the ANTLR lexer and parser   *
     *                                                                             *
     *     *      *      *      *      *      *      *      *      *      *        */
    public class Cobol85Analyser : IAnalyser
    {
        #region Attribs
        private AntlrInputStream stream;
        private Lexer lexer;
        private Parser parser;
        private CommonTokenStream commonTokenStream;
        private Cobol85Visitor visitor;
        #endregion
        
        private void Setup(string text){
            stream = new AntlrInputStream(text);
            lexer = new Cobol85Lexer(stream);
            commonTokenStream = new CommonTokenStream(lexer);
            parser = new Cobol85Parser(commonTokenStream);
            visitor = new Cobol85Visitor();
        }
        public Cobol85Analyser(string text){
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
 