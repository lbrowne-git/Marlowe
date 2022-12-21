using Antlr4.Runtime.Misc;

namespace Marlowe.Visitors
{
    public interface IMethodVisitor<Result> : IGlobalVisitor<Result>
    {
        public Result VisitArgument([NotNull] CSharpParser.ArgumentContext context);
        public Result VisitArgument_list([NotNull] CSharpParser.Argument_listContext context);
        public Result VisitArg_declaration([NotNull] CSharpParser.Arg_declarationContext context);
        public Result VisitExpressionStatement([NotNull] CSharpParser.ExpressionStatementContext context);
        public Result VisitFixed_parameter([NotNull] CSharpParser.Fixed_parameterContext context);
        public Result VisitFixed_parameters([NotNull] CSharpParser.Fixed_parametersContext context);
        public Result VisitFormal_parameter_list([NotNull] CSharpParser.Formal_parameter_listContext context);
        public Result VisitLabeled_Statement([NotNull] CSharpParser.Labeled_StatementContext context);
        public Result VisitMethod_body([NotNull] CSharpParser.Method_bodyContext context);
        public Result VisitMethod_declaration([NotNull] CSharpParser.Method_declarationContext context);
        public Result VisitMethod_invocation([NotNull] CSharpParser.Method_invocationContext context);
        public Result VisitMethod_member_name([NotNull] CSharpParser.Method_member_nameContext context);
        public Result VisitReturnStatement([NotNull] CSharpParser.ReturnStatementContext context);
        public Result VisitSimple_embedded_statement([NotNull] CSharpParser.Simple_embedded_statementContext context);
        public Result VisitStatement([NotNull] CSharpParser.StatementContext context);
        public Result VisitStatement_list([NotNull] CSharpParser.Statement_listContext context);
    }
}
