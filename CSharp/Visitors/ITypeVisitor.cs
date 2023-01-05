using Antlr4.Runtime.Misc;

namespace Marlowe.Visitors
{
    public interface ITypeVisitor<Result> : IGlobalVisitor<Result>
    {
        public Result VisitBase_type([NotNull] CSharpParser.Base_typeContext context);
        public Result VisitClass_type([NotNull] CSharpParser.Class_typeContext context);
        public Result VisitFloating_point_type([NotNull] CSharpParser.Floating_point_typeContext context);
        public Result VisitIntegral_type([NotNull] CSharpParser.Integral_typeContext context);
        public Result VisitLiteralExpression([NotNull] CSharpParser.LiteralExpressionContext context);
        public Result VisitNumeric_type([NotNull] CSharpParser.Numeric_typeContext context);
        public Result VisitSimple_type([NotNull] CSharpParser.Simple_typeContext context);
        public Result VisitType_([NotNull] CSharpParser.Type_Context context);
        public Result VisitType_declaration([NotNull] CSharpParser.Type_declarationContext context);
    }
}
