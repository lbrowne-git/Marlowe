using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Marlowe.Utilities;

namespace Marlowe.Visitors
{

    ///
    /// <summary>
    ///     Acts an intermediary point for all the decoupled visitors.
    /// </summary>
    public interface ICSharpVisitor<Result> : ILogicalOperationsVisitor<Result>, ITypeVisitor<Result>, IVaraibleVisitor<Result>,
                                              IAssignmentVisitor<Result>, IMethodVisitor<Result>,
                                              IAccessVisitor<Result>, INamespaceVisitor<Result>, 
                                              IParseTreeVisitor<Result>
    {
        SymbolNode HandleFunctionCall(SymbolFunctionNode methodCall);
        SymbolNode VisitBlock([NotNull] CSharpParser.BlockContext context);
        SymbolNode VisitDeclarationStatement([NotNull] CSharpParser.DeclarationStatementContext context);
        SymbolNode VisitExpression([NotNull] CSharpParser.ExpressionContext context);
        object VisitIdentifier(CSharpParser.IdentifierContext context);
        SymbolNode VisitNamespace_or_type_name([NotNull] CSharpParser.Namespace_or_type_nameContext context);
        SymbolNode VisitPrimary_expression_start([NotNull] CSharpParser.Primary_expression_startContext context);
    }
}
