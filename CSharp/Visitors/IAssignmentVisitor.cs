using Antlr4.Runtime.Misc;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitors
{
    public interface IAssignmentVisitor<Result>
    {
        Result VisitAdditive_expression([NotNull] CSharpParser.Additive_expressionContext context);
        Result VisitAnd_expression([NotNull] CSharpParser.And_expressionContext context);
        Result VisitAssignment([NotNull] CSharpParser.AssignmentContext context);
        Result VisitConditional_and_expression([NotNull] CSharpParser.Conditional_and_expressionContext context);
        Result VisitConditional_expression([NotNull] CSharpParser.Conditional_expressionContext context);
        Result VisitConditional_or_expression([NotNull] CSharpParser.Conditional_or_expressionContext context);
        Result VisitEquality_expression([NotNull] CSharpParser.Equality_expressionContext context);
        Result VisitExclusive_or_expression([NotNull] CSharpParser.Exclusive_or_expressionContext context);
        Result VisitInclusive_or_expression([NotNull] CSharpParser.Inclusive_or_expressionContext context);
        Result VisitLiteral([NotNull] CSharpParser.LiteralContext context);
        Result VisitLiteralExpression([NotNull] CSharpParser.LiteralExpressionContext context);
        Result VisitMultiplicative_expression([NotNull] CSharpParser.Multiplicative_expressionContext context);
        Result VisitNull_coalescing_expression([NotNull] CSharpParser.Null_coalescing_expressionContext context);
        Result VisitPrimary_expression([NotNull] CSharpParser.Primary_expressionContext context);
        Result VisitRange_expression([NotNull] CSharpParser.Range_expressionContext context);
        Result VisitRelational_expression([NotNull] CSharpParser.Relational_expressionContext context);
        Result VisitShift_expression([NotNull] CSharpParser.Shift_expressionContext context);
        Result VisitString_literal([NotNull] CSharpParser.String_literalContext context);
        Result VisitUnary_expression([NotNull] CSharpParser.Unary_expressionContext context);
    }
}
