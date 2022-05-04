using System.Diagnostics.CodeAnalysis;

namespace Marlowe.Visitors
{
    public interface IGlobalVisitor<Result>
    {
        Result HandleFunctionCall(Result methodCall);
        Result VisitBlock([NotNull] CSharpParser.BlockContext context);
        Result VisitDeclarationStatement([NotNull] CSharpParser.DeclarationStatementContext context);
        Result VisitExpression([NotNull] CSharpParser.ExpressionContext context);
        Result VisitNamespace_or_type_name([NotNull] CSharpParser.Namespace_or_type_nameContext context);
        Result VisitPrimary_expression_start([NotNull] CSharpParser.Primary_expression_startContext context);
        object VisitIdentifier(CSharpParser.IdentifierContext context);

    }
}
