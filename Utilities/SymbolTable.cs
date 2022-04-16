using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Utilities
{
    public interface ISymbolTable
    {
        public IDictionary<string, ISymbolNode> Variables => new Dictionary<string, ISymbolNode>();
        public IDictionary<string, ISymbolNode> Functions => new Dictionary<string, ISymbolNode>();
        public IDictionary<string, ISymbolNode> Directives => new Dictionary<string, ISymbolNode>();

    }
}
