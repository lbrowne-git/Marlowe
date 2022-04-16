using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitor
{
    internal interface ICSharpVisitor : ICSharpParserVisitor<ISymbolNode>, ISymbolTable
    {
    }
}
