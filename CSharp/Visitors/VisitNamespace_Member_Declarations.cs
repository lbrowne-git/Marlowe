using Antlr4.Runtime.Misc;
using System.Collections.Generic;

namespace CSharp
{
    /** Details
      *  The Compilation Process is divided into the following:
      *  BYTE_ORDER_MARK? extern_alias_directives? using_directives?
      *  global_attribute_section* namespace_member_declarations? EOF;
      *  
      *  This class represents the namespace_member_declarations Context and its Tree
      */
    public abstract class VisitorNamespace_Member_Declarations : CSharpParserBaseVisitor<object?>
    {
        //   namespace_member_declarations
        //:       namespace_member_declaration                      
        public override object? VisitNamespace_member_declarations([NotNull] CSharpParser.Namespace_member_declarationsContext context){

            foreach (var NamespaceContext in context.namespace_member_declaration()){
                if (NamespaceContext != null)
                {
                    VisitNamespace_member_declaration(NamespaceContext);
                }
            }

            return null;
        }

        //namespace_member_declaration
        //: namespace_declaration
        //| type_declaration
        //;
        public override object? VisitNamespace_member_declaration([NotNull] CSharpParser.Namespace_member_declarationContext context){

            if (context.namespace_declaration() != null){
                VisitNamespace_declaration(context.namespace_declaration());
            }
            else if (context.type_declaration() != null){
                VisitType_declaration(context.type_declaration());
            }
            return null;
        }


        public override object? VisitNamespace_declaration([NotNull] CSharpParser.Namespace_declarationContext context)
        {
            if (!context.IsEmpty)
            {
                if (context.NAMESPACE() != null)
                {
                    if (context.namespace_body() != null){
                        return new Dictionary<string, object?> { { context.SEMICOLON().GetText(), context.namespace_body() } };

                    }
                }
            }
            return null;
        }

        public override object? VisitNamespace_body([NotNull] CSharpParser.Namespace_bodyContext context)
        {
            if (context.OPEN_BRACE() != null)
            {
                if(context.CLOSE_BRACE() != null){
                    if (context.extern_alias_directives() != null){
                        VisitExtern_alias_directives(context.extern_alias_directives());
                    }
                    if (context.using_directives() != null) { 
                        VisitUsing_directives(context.using_directives());
                    }
                    if (context.namespace_member_declarations() != null){
                        VisitNamespace_member_declarations(context.namespace_member_declarations());
                    }
                }
                else
                {
                    throw new System.Exception($"Namespace Body does not contain a closing bracket");
                }
            }
            else{
                throw new System.Exception($"Namespace Body does not contain an openning bracket");
            }
            return null;
        }




    }
}