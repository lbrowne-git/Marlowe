using System.Diagnostics.CodeAnalysis;

namespace Marlowe.Visitors
{
    public interface IClassVisitor<Result> : IGlobalVisitor<Result>
    {
        //class_definition
        //: CLASS identifier type_parameter_list? class_base? type_parameter_constraints_clauses?
        //class_body ';'?
        public Result VisitClass_definition([NotNull] CSharpParser.Class_definitionContext context);
        public Result VisitClass_body([NotNull] CSharpParser.Class_bodyContext context);
        public Result VisitClass_member_declarations([NotNull] CSharpParser.Class_member_declarationsContext context);
        //class_member_declaration
        //: attributes? all_member_modifiers? (common_member_declaration | destructor_definition)
        public Result VisitClass_member_declaration([NotNull] CSharpParser.Class_member_declarationContext context);
        public Result VisitCommon_member_declaration([NotNull] CSharpParser.Common_member_declarationContext context);
    }
}
