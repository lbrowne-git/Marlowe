using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitor
{
    /**
     * summary:
     *      This interface acts a layer of abstraction for the CSharpVistor.
     *      which allows for the seamless conversion of generic types between
     *      the generated antlr visitor and the Marlowe's implementation.
     */
    public interface ICSharpVisitor : ICSharpParserVisitor<ISymbolNode>
    {
    }
}
