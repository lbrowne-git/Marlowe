using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Text;

namespace CSharp.Visitors
{
    public class ClassVisitor : CSharpParserBaseVisitor<object>{
        //class_definition
        //: CLASS identifier type_parameter_list? class_base? type_parameter_constraints_clauses?
        //class_body ';'?
        public override object VisitClass_definition([NotNull] CSharpParser.Class_definitionContext context)
        {
            if (context.CLASS() != null)
            {
                //Namespace[context.CLASS().GetText()] = context.GetText();
            }
            if (context.identifier() != null)
            {
                VisitIdentifier(context.identifier());
            }
            if (context.type_parameter_list() != null)
            {
                VisitType_parameter_list(context.type_parameter_list());
            }
            if (context.class_base() != null)
            {
                VisitClass_base(context.class_base());
            }
            if (context.class_body() != null)
            {
                VisitClass_body(context.class_body());
            }
            else
            {
                throw new Exception($"No Class Body");
            }
            return null;
        }
        //class_body
        //: OPEN_BRACE class_member_declarations? CLOSE_BRACE
        public override object VisitClass_body([NotNull] CSharpParser.Class_bodyContext context)
        {

            if (context.OPEN_BRACE() != null)
            {
                if (context.CLOSE_BRACE() != null)
                {
                    if (context.class_member_declarations() != null)
                    {
                        VisitClass_member_declarations(context.class_member_declarations());
                    }
                }
            }
            return base.VisitClass_body(context);
        }
        public override object VisitClass_member_declarations([NotNull] CSharpParser.Class_member_declarationsContext context)
        {
            foreach (var member_DeclarationContext in context.class_member_declaration())
            {
                VisitClass_member_declaration(member_DeclarationContext);
            }
            return base.VisitClass_member_declarations(context);
        }
        //class_member_declaration
        //: attributes? all_member_modifiers? (common_member_declaration | destructor_definition)
        public override object VisitClass_member_declaration([NotNull] CSharpParser.Class_member_declarationContext context)
        {
            if (context.attributes() != null)
            {
                VisitAttributes(context.attributes());
            }
            if (context.common_member_declaration() != null)
            {
                VisitCommon_member_declaration(context.common_member_declaration());
            }

            return null;
        }
        //common_member_declaration
        //: constant_declaration
        //| typed_member_declaration            <-- Sole implemented feature as it is all that is required
        //| event_declaration
        //| conversion_operator_declarator(body | right_arrow throwable_expression ';') // C# 6
        //| constructor_declaration
        //| VOID method_declaration
        //| class_definition
        //| struct_definition
        //| interface_definition
        //| enum_definition
        //| delegate_definition
        //;
        public override object VisitCommon_member_declaration([NotNull] CSharpParser.Common_member_declarationContext context)
        {
            if (context.typed_member_declaration() != null)
            {
                VisitTyped_member_declaration(context.typed_member_declaration());
            }
            if (context.class_definition() != null)
            {
                VisitClass_definition(context.class_definition());
            }

            return base.VisitCommon_member_declaration(context);
        }
    }
}
