using Antlr4.Runtime.Misc;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitors
{
    public interface ILogicalOperationsVisitor<Result>
    {
        Result VisitIfStatement([NotNull] CSharpParser.IfStatementContext context);
        Result VisitIf_body([NotNull] CSharpParser.If_bodyContext context);
    }
}
