using System;
using System.Collections.Generic;

namespace Marlowe.Utilities
{
    public interface ISymbolFunctionNode : ISymbolNode
    {
        IDictionary<string, ISymbolNode> Paramaters { get; set; }
    }
}
