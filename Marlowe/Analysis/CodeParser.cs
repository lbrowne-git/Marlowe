using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace Marlowe.Analysis
{
    public class CodeParser : CSharpParser
    {
        ITokenStream tokenStream { get; set; }
        public CodeParser(ITokenStream input) : base(input)
        {
            tokenStream = input;
        }
    }

}
