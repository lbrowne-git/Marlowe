using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using Marlowe.Utilities;

namespace Marlowe.CSharp
{
    public class CSharpVisitor : CSharpParserBaseVisitor<object?>
    {
        public Dictionary<string, object?> Variables { get; } = new Dictionary<string, object?>();

        /**
         *  By analysing the compilation context returned  by the parser, this 
         *  function creates tokens for the Symbol Tree, Synthiser & Error Handler.
         *
         *  @param Node : a generic Node obejct for to Create ASTs
         */
        public override object? Visit(IParseTree tree)
        {
            Console.WriteLine();
            return base.Visit(tree);
        }

        /* Entry point into source.
            References:
                BYTE_ORDER_MARK? extern_alias_directives? using_directives?
                global_attribute_section* namespace_member_declarations? EOF
                                                                                    */
        public override object VisitCompilation_unit([NotNull] CSharpParser.Compilation_unitContext context){
     
            if(context.BYTE_ORDER_MARK() != null)
            {
                Variables[context.BYTE_ORDER_MARK().GetText()] = context.BYTE_ORDER_MARK();
            }
            if(context.using_directives() != null){
                VisitUsing_directives(context.using_directives());
            }

            if (context.global_attribute_section().Length > 0){
                foreach (var globalContext in context.global_attribute_section())
                {
                    VisitGlobal_attribute_section(globalContext);
                }
            }
            if(context.namespace_member_declarations() != null){
                VisitNamespace_member_declarations(context.namespace_member_declarations());
            }
            return null;
        }
        
    //   namespace_member_declarations
	    //:       namespace_member_declaration+
	    //;                           
        public override object VisitNamespace_member_declarations([NotNull] CSharpParser.Namespace_member_declarationsContext context){
            foreach (var NamespaceContext in context.namespace_member_declaration()){
                if(NamespaceContext != null){
                    VisitNamespace_member_declaration(NamespaceContext);
                }
            }

            return null;
        }

        public override object VisitNamespace_member_declaration([NotNull] CSharpParser.Namespace_member_declarationContext context)
        {
         
            if(context.namespace_declaration() != null){
                 VisitNamespace_declaration(context.namespace_declaration());
            }
            else if (context.type_declaration() != null)
            {
                VisitType_declaration(context.type_declaration());
            }
            return null;
        }

        public override object VisitType_declaration([NotNull] CSharpParser.Type_declarationContext context)
        {
            if (context.attributes() != null){
                Visit(context.attributes());
            }

            if (context.all_member_modifiers() != null){
                VisitAll_member_modifiers(context.all_member_modifiers());
            }
            else { 
            }
            return null;
        }

        public override object VisitNamespace_declaration([NotNull] CSharpParser.Namespace_declarationContext context)
        {
            if (!context.IsEmpty)
            {
                if(context.NAMESPACE() != null)
                {
                    if(context.namespace_body() != null)
                    {
                        if(context.SEMICOLON() != null)
                        {
                            Variables[context.SEMICOLON().GetText()] = context.namespace_body();
                        }
                    }
                }
            }
            return null;
        }

        public override object VisitNamespace_body([NotNull] CSharpParser.Namespace_bodyContext context)
        {
            if (context.OPEN_BRACE() != null) {
                Variables[context.OPEN_BRACE().GetText()] = context.OPEN_BRACE();
            }
            else if (context.using_directives() != null) {
                VisitUsing_directives(context.using_directives());
            }
            else if(context.namespace_member_declarations() != null){
                VisitNamespace_member_declarations(context.namespace_member_declarations());
            }
            return null;
        }

        public override object VisitUsing_directives([NotNull] CSharpParser.Using_directivesContext context)
        {
            foreach(CSharpParser.Using_directiveContext usingContext in context.using_directive())
            {
                
            }
            return null;
        }



        public override object VisitAll_member_modifiers([NotNull] CSharpParser.All_member_modifiersContext context)
        {
            foreach (var MemberContext in context.all_member_modifier())
            {
                if (MemberContext != null)
                {
                    VisitAll_member_modifier(MemberContext);
                }
            }
                return null;
        }

        public override object VisitAll_member_modifier([NotNull] CSharpParser.All_member_modifierContext context){
            if (!context.IsEmpty)
            {
                Variables[context.Start.Text] = context.Start;
            }
            return null;
        }
    }
   
}