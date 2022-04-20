using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Utilities
{
    /// <summary>
    ///  Returns an <see langword="abstract"/> class containing collections of <see cref="ISymbolNode"/>s with different class properties.
    /// </summary>
    public abstract class SymbolTable
    {
        public  Dictionary<string, ISymbolNode> Variables = new Dictionary<string, ISymbolNode>();
        public  Dictionary<string, ISymbolNode> Functions = new Dictionary<string, ISymbolNode>();
        public  Dictionary<string, ISymbolNode> Directives = new Dictionary<string, ISymbolNode>();

    }
}
