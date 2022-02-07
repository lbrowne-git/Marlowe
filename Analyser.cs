using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe
{
    /*      *      *      *      *      *      *      *      *      *      *       *  
     *      Name:   Lewis Browne                                                   *
     *      Date:   26/01/2022                                                     * 
     *      Desc:   A class which will be used as a intermediary level             *
     *              between the input source code and the ANTLR lexer and parser   *
     *                                                                             *
     *     *      *      *      *      *      *      *      *      *      *        */ 


    class Analyser : IAnalyser
    {
        #region Attribs
        ICharStream stream;
        ITokenSource lexer;
        ITokenStream tokens;
        Parser parser;
        #endregion
        public Analyser(String input)
        {
            stream = CharStreams.fromString(input);
            lexer = new CSharpLexer(stream);
            tokens = new CommonTokenStream(lexer);
            parser = new Parser(tokens);
            parser.RemoveErrorListeners();
            parser.AddErrorListener(new BaseErrorListener());
            parser.Root();
            ParserRuleContext obj = parser.Context;
            obj.Start = parser.Context.Start;
        }

        public void HandleRequest(){
            Logger logger = new Logger(false);
            logger.CreateLexerLog(lexer);
            logger.CreateTokenLog(tokens);
        }

        #region Getter & Setters
            public ICharStream Stream { get => stream; set => stream = value; }
            public ITokenSource Lexer { get => lexer; set => lexer = value; }
            public ITokenStream Tokens { get => tokens; set => tokens = value; }
            public Parser Parser { get => parser; set => parser = value; }
        #endregion
    }
}
