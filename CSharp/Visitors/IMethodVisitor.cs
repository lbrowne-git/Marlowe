using Antlr4.Runtime.Misc;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitors
{
    public interface IMethodVisitor<Result>
    {
        Result VisitArgument([NotNull] CSharpParser.ArgumentContext context);
        Result VisitArgument_list([NotNull] CSharpParser.Argument_listContext context);
        Result VisitArg_declaration([NotNull] CSharpParser.Arg_declarationContext context);
        Result VisitExpressionStatement([NotNull] CSharpParser.ExpressionStatementContext context);
        Result VisitFixed_parameter([NotNull] CSharpParser.Fixed_parameterContext context);
        Result VisitFixed_parameters([NotNull] CSharpParser.Fixed_parametersContext context);
        Result VisitFormal_parameter_list([NotNull] CSharpParser.Formal_parameter_listContext context);
        Result VisitLabeled_Statement([NotNull] CSharpParser.Labeled_StatementContext context);
        Result VisitMethod_body([NotNull] CSharpParser.Method_bodyContext context);
        Result VisitMethod_declaration([NotNull] CSharpParser.Method_declarationContext context);
        Result VisitMethod_invocation([NotNull] CSharpParser.Method_invocationContext context);
        Result VisitMethod_member_name([NotNull] CSharpParser.Method_member_nameContext context);
        Result VisitReturnStatement([NotNull] CSharpParser.ReturnStatementContext context);
        Result VisitSimple_embedded_statement([NotNull] CSharpParser.Simple_embedded_statementContext context);
        Result VisitStatement([NotNull] CSharpParser.StatementContext context);
        Result VisitStatement_list([NotNull] CSharpParser.Statement_listContext context);
    }
}
