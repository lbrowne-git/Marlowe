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
        ICharStream stream;
        ITokenSource lexer;
        ITokenStream tokens;
        Visitor visitor;
        Parser parser;
        #endregion




        #region Getter & Setters
        public ICharStream Stream { get => stream; set => stream = value; }
        public ITokenSource Lexer { get => lexer; }
        public Parser Parser { get => parser; set => parser = value; }
        public ITokenStream Tokens { get => tokens; }
        public Visitor Visitor { get => visitor; set => visitor = value; }
        public Dictionary<string, object> Variables { get; private set; }

        #endregion
    }
}
 