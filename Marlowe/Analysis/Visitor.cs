using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;

namespace Marlowe.Analysis
{
    public class Visitor : CSharpParserBaseVisitor<Node>
    {
        public Dictionary<string, Node> Variables { get; } = new Dictionary<string, Node>();

        /**
         *  By analysing the compilation context returned  by the parser, this 
         *  function creates tokens for the Symbol Tree, Synthiser & Error Handler.
         *
         *  @param Node : a generic Node obejct for to Create ASTs
         */


        public override Node Visit(IParseTree tree)
        {
            Console.WriteLine();
            return base.Visit(tree);
        }

        /* Entry point into source.
            References:
                BYTE_ORDER_MARK? extern_alias_directives? using_directives?
                global_attribute_section* namespace_member_declarations? EOF
                                                                                    */
        public override Node VisitCompilation_unit([NotNull] global::CSharpParser.Compilation_unitContext context){
            //Console.WriteLine("Inside VisitCompilation_unit");
            if (context.extern_alias_directives() != null){
                Variables[context.GetType().Name] = VisitExtern_alias_directives(context.extern_alias_directives());
            }
            if(context.using_directives() != null){
                Variables[context.GetType().Name] = VisitUsing_directives(context.using_directives());
            }

            global::CSharpParser.Global_attribute_sectionContext[] globalContext = context.global_attribute_section();
            if (context.global_attribute_section().Length > 0){
                Variables[context.GetType().Name] = VisitGlobal_attribute_section(context.global_attribute_section()[0]);
            }
            if(context.namespace_member_declarations() != null){
                Variables[context.namespace_member_declarations().GetType().Name] = VisitNamespace_member_declarations(context.namespace_member_declarations());
            }
            return null;
        }
        
     //   namespace_member_declarations
	    //:       namespace_member_declaration+
	    //;                           
        public override Node VisitNamespace_member_declarations([NotNull] global::CSharpParser.Namespace_member_declarationsContext context){
            foreach (var NamespaceContext in context.namespace_member_declaration()){
                if(NamespaceContext != null){
                    Variables[NamespaceContext.GetType().Name] = VisitNamespace_member_declaration(NamespaceContext);
                }
            }

            return null;
        }

        public override Node VisitNamespace_member_declaration([NotNull] global::CSharpParser.Namespace_member_declarationContext context)
        {
            if (context.type_declaration() != null){
                Variables[context.GetType().Name] = VisitType_declaration(context.type_declaration());
            }
            if(context.namespace_declaration() != null)
            {
                Variables[context.GetType().Name] = VisitNamespace_declaration(context.namespace_declaration());
            }
            return null;
        }

        public override Node VisitType_declaration([NotNull] global::CSharpParser.Type_declarationContext context)
        {
            if (context.attributes() != null){
                for (int i = 0; i < context.ChildCount; i++){
                    var child = context.GetChild(i);
                    switch (child.GetType())
                    {
                        //case typeof(global::CSharpParser.AttributeContext) :
                        default:
                            break;
                    }
                }
            }

            if (context.all_member_modifiers() != null){
                Variables[context.all_member_modifiers().GetType().Name] = VisitAll_member_modifiers(context.all_member_modifiers());
            }
            return null;
        }
        public override Node VisitAll_member_modifiers([NotNull] CSharpParser.All_member_modifiersContext context)
        {
            foreach (var NamespaceContext in context.all_member_modifier()
            {


                return null;
        }
    }


   
}