using Antlr4.Runtime.Misc;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitors
{
    public interface IVaraibleVisitor<Result>
    {
        Result VisitBoolean_literal([NotNull] CSharpParser.Boolean_literalContext context);
        Result VisitField_declaration([NotNull] CSharpParser.Field_declarationContext context);
        Result VisitLiteral([NotNull] CSharpParser.LiteralContext context);
        Result VisitLocal_variable_declaration([NotNull] CSharpParser.Local_variable_declarationContext context);
        Result VisitLocal_variable_declarator([NotNull] CSharpParser.Local_variable_declaratorContext context);
        Result VisitLocal_variable_initializer([NotNull] CSharpParser.Local_variable_initializerContext context);
        Result VisitLocal_variable_type([NotNull] CSharpParser.Local_variable_typeContext context);
        Result VisitParenthesisExpressions([NotNull] CSharpParser.ParenthesisExpressionsContext context);
        Result VisitSwitch_expression([NotNull] CSharpParser.Switch_expressionContext context);
        Result VisitTyped_member_declaration([NotNull] CSharpParser.Typed_member_declarationContext context);
        Result VisitVariable_declarator([NotNull] CSharpParser.Variable_declaratorContext context);
        Result VisitVariable_declarators([NotNull] CSharpParser.Variable_declaratorsContext context);
        Result VisitVariable_initializer([NotNull] CSharpParser.Variable_initializerContext context);
    }
}
