using Antlr4.Runtime.Misc;

namespace Marlowe.Visitors
{
    public interface IVaraibleVisitor<Result> : IGlobalVisitor<Result>
    {
        public Result VisitBoolean_literal([NotNull] CSharpParser.Boolean_literalContext context);
        public Result VisitField_declaration([NotNull] CSharpParser.Field_declarationContext context);
        public Result VisitLiteral([NotNull] CSharpParser.LiteralContext context);
        public Result VisitLocal_variable_declaration([NotNull] CSharpParser.Local_variable_declarationContext context);
        public Result VisitLocal_variable_declarator([NotNull] CSharpParser.Local_variable_declaratorContext context);
        public Result VisitLocal_variable_initializer([NotNull] CSharpParser.Local_variable_initializerContext context);
        public Result VisitLocal_variable_type([NotNull] CSharpParser.Local_variable_typeContext context);
        public Result VisitParenthesisExpressions([NotNull] CSharpParser.ParenthesisExpressionsContext context);
        public Result VisitSwitch_expression([NotNull] CSharpParser.Switch_expressionContext context);
        public Result VisitTyped_member_declaration([NotNull] CSharpParser.Typed_member_declarationContext context);
        public Result VisitVariable_declarator([NotNull] CSharpParser.Variable_declaratorContext context);
        public Result VisitVariable_declarators([NotNull] CSharpParser.Variable_declaratorsContext context);
        public Result VisitVariable_initializer([NotNull] CSharpParser.Variable_initializerContext context);
    }
}
