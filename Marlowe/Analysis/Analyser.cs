using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Analysis
{
    /*      *      *      *      *      *      *      *      *      *      *       *  
     *      Name:   Lewis Browne                                                   *
     *      Date:   26/01/2022                                                     * 
     *      Desc:   A class which will be used as a intermediary level             *
     *              between the input source code and the ANTLR lexer and parser   *
     *                                                                             *
     *     *      *      *      *      *      *      *      *      *      *        */
    internal class Analyser : IAnalyser
    {
        #region Attribs
        private AntlrInputStream stream;
        private CSharpLexer lexer;
        private CodeParser parser;
        private CommonTokenStream commonTokenStream;
        private Visitor visitor;
        #endregion
        
        private void Setup(string text){
            stream = new AntlrInputStream(text);
            lexer = new CSharpLexer(stream);
            commonTokenStream = new CommonTokenStream(lexer);
            parser = new CodeParser(commonTokenStream);
        }

        public Analyser(string text){
            Setup(text);
        }

        #region Getter & Setters
        public CSharpLexer Lexer { get => lexer; }
        public CodeParser Parser { get => parser; }
        public Visitor Visitor { get => visitor; }
        public CommonTokenStream CommonTokenStream { get => commonTokenStream; }
        #endregion

    }
}
 