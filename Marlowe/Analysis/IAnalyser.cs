using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace Marlowe.Analysis
{
    /*      *      *      *      *      *      *      *      *      *      *       *  
     *      Name:   Lewis Browne                                                   *
     *      Date:   26/01/2022                                                     * 
     *      Desc:   An interface allowing for instaction of lexer and parser       *
     *              between multiple classes                                       *
     *                                                                             *
     *     *      *      *      *      *      *      *      *      *      *        */ 
    interface IAnalyser
    {
        ICharStream Stream { get; set; }
        ITokenSource Lexer { get; }
        ITokenStream Tokens { get; }
        Parser Parser { get; set; }
        Dictionary<string, object> Variables { get;  }
        Visitor Visitor { get; set; }
        

    }
}
