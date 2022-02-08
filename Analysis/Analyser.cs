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

        public Dictionary<string,object> Variables { get; private set; }

        public Analyser(string input){
            stream = new AntlrInputStream(input);
            try
            {
                while(stream != null){
                    stream.Mark();
                    lexer = new CSharpLexer(stream);
                    tokens = new CommonTokenStream(lexer);
                    tokens = new BufferedTokenStream(lexer);
                    parser = new Parser(tokens);
                    visitor = new Visitor();
                    visitor.VisitAccessor_body(parser.accessor_body());
                }
            }
            catch (Exception ex){
                Console.WriteLine(ex);
            }
        }

        public void GatherVisitorToken()
        {
            Variables = visitor.getTokens();
        }

        internal void OutputVisitorToken()
        {
            foreach (var variable in Variables)
            {
                Console.WriteLine(variable.Key + "\t: \t" + variable.Value);
            }
        }

        #region Getter & Setters
        public ICharStream Stream { get => stream; set => stream = value; }
            public ITokenSource Lexer { get => lexer; set => lexer = value; }
            public Parser Parser { get => parser; set => parser = value; }
        public ITokenStream Tokens { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
        #endregion
    }
}
 