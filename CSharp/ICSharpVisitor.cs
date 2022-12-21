using Antlr4.Runtime.Tree;

namespace Marlowe.Visitors
{

    ///
    /// <summary>
    ///     Acts an intermediary point for all the decoupled visitors.
    /// </summary>
    public interface ICSharpVisitor<Result> : ILogicalOperationsVisitor<Result>, ITypeVisitor<Result>,
                                              IVariableVisitor<Result>, IAssignmentVisitor<Result>,
                                              IAccessVisitor<Result>, INamespaceVisitor<Result>,
                                              IClassVisitor<Result>, IGlobalVisitor<Result>,
                                              IMethodVisitor<Result>, IParseTreeVisitor<Result>
    { }
}
