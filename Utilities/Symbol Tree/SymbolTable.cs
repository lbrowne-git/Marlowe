using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Utilities
{
    public abstract class SymbolTable
    {
        public  Dictionary<string, ISymbolNode> Variables = new Dictionary<string, ISymbolNode>();
        public  Dictionary<string, ISymbolNode> Functions = new Dictionary<string, ISymbolNode>();
        public  Dictionary<string, ISymbolNode> Directives = new Dictionary<string, ISymbolNode>();

    }
}
