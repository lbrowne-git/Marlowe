using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace Marlowe.Analysis
{
    public class Parser : CSharpParser
    {
        ITokenStream tokenStream { get; set; }
        public Parser(ITokenStream input) : base(input)
        {
            tokenStream = input;
        }
    }

}
