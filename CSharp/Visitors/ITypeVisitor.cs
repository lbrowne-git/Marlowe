using Antlr4.Runtime.Misc;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitors
{
    public interface ITypeVisitor<Result>
    {
        Result VisitBase_type([NotNull] CSharpParser.Base_typeContext context);
        Result VisitClass_type([NotNull] CSharpParser.Class_typeContext context);
        Result VisitFloating_point_type([NotNull] CSharpParser.Floating_point_typeContext context);
        Result VisitIntegral_type([NotNull] CSharpParser.Integral_typeContext context);
        Result VisitLiteralExpression([NotNull] CSharpParser.LiteralExpressionContext context);
        Result VisitNumeric_type([NotNull] CSharpParser.Numeric_typeContext context);
        Result VisitSimple_type([NotNull] CSharpParser.Simple_typeContext context);
        Result VisitType_([NotNull] CSharpParser.Type_Context context);
        Result VisitType_declaration([NotNull] CSharpParser.Type_declarationContext context);
    }
}
