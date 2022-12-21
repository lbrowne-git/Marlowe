using Antlr4.Runtime.Misc;

namespace Marlowe.Visitors
{
    public interface ILogicalOperationsVisitor<Result> : IGlobalVisitor<Result>
    {
        public Result VisitIfStatement([NotNull] CSharpParser.IfStatementContext context);
        public Result VisitIf_body([NotNull] CSharpParser.If_bodyContext context);
        public Result VisitWhileStatement([NotNull] CSharpParser.WhileStatementContext whileContext);
    }
}
