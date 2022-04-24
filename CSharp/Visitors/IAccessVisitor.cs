using Antlr4.Runtime.Misc;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Visitors
{
    public interface IAccessVisitor<Result>
    {
        Result VisitAll_member_modifier([NotNull] CSharpParser.All_member_modifierContext context);
        Result VisitAll_member_modifiers([NotNull] CSharpParser.All_member_modifiersContext context);
    }
}
