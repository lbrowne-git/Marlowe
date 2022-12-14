using Antlr4.Runtime.Misc;

namespace Marlowe.Visitors
{
    public interface IAccessVisitor<Result> : IGlobalVisitor<Result>
    {
        public Result VisitAll_member_modifier([NotNull] CSharpParser.All_member_modifierContext context);
        public Result VisitAll_member_modifiers([NotNull] CSharpParser.All_member_modifiersContext context);
    }
}
