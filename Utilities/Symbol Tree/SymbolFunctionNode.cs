using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;

namespace Marlowe.Utilities
{
    public class SymbolFunctionNode : SymbolNode
    {
        public IDictionary<string, ISymbolNode> Paramaters = new Dictionary<string, ISymbolNode>();
    }
}
