using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Utilities
{
    public class SymbolNodeFactory
    {

        public ISymbolNode GetSymbolNode()
        {
            return new SymbolVariableNode();
        }
    }
}
