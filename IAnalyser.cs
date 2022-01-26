using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace Marlowe
{
    interface IAnalyser
    {
        ICharStream Stream { get; set; }
        ITokenSource Lexer { get; set; }
        ITokenStream Tokens { get; set; }
        CSharpParser Parser { get; set; }
    }
}
