using Antlr4.Runtime.Misc;

namespace Marlowe.Visitors
{
    public interface IAssignmentVisitor<Result> : IGlobalVisitor<Result>
    {
        public Result VisitAdditive_expression([NotNull] CSharpParser.Additive_expressionContext context);
        public Result VisitAnd_expression([NotNull] CSharpParser.And_expressionContext context);
        public Result VisitAssignment([NotNull] CSharpParser.AssignmentContext context);
        public Result VisitConditional_and_expression([NotNull] CSharpParser.Conditional_and_expressionContext context);
        public Result VisitConditional_expression([NotNull] CSharpParser.Conditional_expressionContext context);
        public Result VisitConditional_or_expression([NotNull] CSharpParser.Conditional_or_expressionContext context);
        public Result VisitEquality_expression([NotNull] CSharpParser.Equality_expressionContext context);
        public Result VisitExclusive_or_expression([NotNull] CSharpParser.Exclusive_or_expressionContext context);
        public Result VisitInclusive_or_expression([NotNull] CSharpParser.Inclusive_or_expressionContext context);
        public Result VisitLiteral([NotNull] CSharpParser.LiteralContext context);
        public Result VisitLiteralExpression([NotNull] CSharpParser.LiteralExpressionContext context);
        public Result VisitMultiplicative_expression([NotNull] CSharpParser.Multiplicative_expressionContext context);
        public Result VisitNull_coalescing_expression([NotNull] CSharpParser.Null_coalescing_expressionContext context);
        public Result VisitPrimary_expression([NotNull] CSharpParser.Primary_expressionContext context);
        public Result VisitRange_expression([NotNull] CSharpParser.Range_expressionContext context);
        public Result VisitRelational_expression([NotNull] CSharpParser.Relational_expressionContext context);
        public Result VisitShift_expression([NotNull] CSharpParser.Shift_expressionContext context);
        public Result VisitString_literal([NotNull] CSharpParser.String_literalContext context);
        public Result VisitUnary_expression([NotNull] CSharpParser.Unary_expressionContext context);
    }
}
