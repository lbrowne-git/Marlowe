using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;

namespace Marlowe.Utilities
{
    /// <summary>
    ///     Allows for the storing of a function paramaters as well as extending the <see langword="abstract"/> <see cref="SymbolVariableNode"/>.
    /// </summary>
    public class SymbolFunctionNode : SymbolNode
    {
        public IDictionary<string, SymbolNode> Paramaters = new Dictionary<string, SymbolNode>();

        public override string ToString()
        {
            string buffer = "Paramaters:(";
            buffer = buffer.TrimEnd(',');
            buffer += ")\n"+base.ToString()+"\n";
            return buffer;
        }
    }
}
