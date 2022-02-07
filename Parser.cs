using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace Marlowe
{
    internal class Parser : CSharpParser
    {
        ITokenStream tokenStream { get; set; }
        public Parser(ITokenStream input) : base(input)
        {
            tokenStream = input;
        }

        public Parser(ITokenStream input, TextWriter output, TextWriter errorOutput) : base(input, output, errorOutput)
        {
        }

        public void Root(){
            //IToken token = tokenStream.Get(0);
            //Console.WriteLine(token.Text);
            //Console.WriteLine(token.TokenIndex);
        }
    }
}
