using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitor
{
    public interface ICSharpVisitor : ICSharpParserVisitor<ISymbolNode>
    {
    }
}
