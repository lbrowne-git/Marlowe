using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using CSharp;
using System;
using System.Collections.Generic;

namespace Marlowe.CSharp
{
    public class CSharpVisitor : VisitorNamespace_Member_Declarations
    {
        public VisitorTree visitorTree = new VisitorTree();
        public Dictionary<string, object> Variables = new Dictionary<string, object>();
        public Dictionary<string, object> Functions =   new Dictionary<string, object>();
        public Dictionary<string, object> Namespace =   new Dictionary<string, object>();
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
        public override object? VisitCompilation_unit([NotNull] CSharpParser.Compilation_unitContext context){

            if(context.BYTE_ORDER_MARK() != null)
            {
                Variables[context.BYTE_ORDER_MARK().GetText()] = context.BYTE_ORDER_MARK();
            }
            else if(context.using_directives() != null){
                VisitUsing_directives(context.using_directives());
            }

            else if (context.global_attribute_section().Length > 0){
                foreach (var globalContext in context.global_attribute_section())
                {
                    VisitGlobal_attribute_section(globalContext);
                }
            }
            else if(context.namespace_member_declarations() != null){
                VisitNamespace_member_declarations(context.namespace_member_declarations());
            }
            else
            {
                throw new Exception($"No namepsace declared in file");
            }
            return null;
        }
        //   namespace_member_declarations
        //:       namespace_member_declaration                      
        public override object? VisitNamespace_member_declarations([NotNull] CSharpParser.Namespace_member_declarationsContext context)
        {

            foreach (var NamespaceContext in context.namespace_member_declaration())
            {
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
        public override object? VisitNamespace_member_declaration([NotNull] CSharpParser.Namespace_member_declarationContext context)
        {

            if (context.namespace_declaration() != null)
            {
                VisitNamespace_declaration(context.namespace_declaration());
            }
            else if (context.type_declaration() != null)
            {
                VisitType_declaration(context.type_declaration());
            }
            return null;
        }


        //namespace_declaration
	    //: NAMESPACE qi = qualified_identifier namespace_body ';'?
        public override object? VisitNamespace_declaration([NotNull] CSharpParser.Namespace_declarationContext context)
        {
             if (context.NAMESPACE() != null){
                if (context.namespace_body() != null){
                    Variables[context.namespace_body().GetText()] = context.namespace_body();
                }
                else{
                    throw new Exception($"No Namespace Body Present");
                }
            }
            else
            {
                throw new Exception($"No Namespace Present");
            }
            return null;
        }

        // namespace_body
         // OPEN_BRACE extern_alias_directives? using_directives? namespace_member_declarations? CLOSE_BRACE
        public override object? VisitNamespace_body([NotNull] CSharpParser.Namespace_bodyContext context)
        {
            if (context.OPEN_BRACE() != null){
                if (context.CLOSE_BRACE() != null){
                    if (context.extern_alias_directives() != null){
                        VisitExtern_alias_directives(context.extern_alias_directives());
                    }
                    if (context.using_directives() != null){
                        VisitUsing_directives(context.using_directives());
                    }
                    if (context.namespace_member_declarations() != null){
                        VisitNamespace_member_declarations(context.namespace_member_declarations());
                    }
                }
                else{
                    throw new System.Exception($"Namespace Body does not contain a closing bracket");
                }
            }
            else{
                throw new System.Exception($"Namespace Body does not contain an openning bracket");
            }
            return null;
        }




        //type_declaration
        // : attributes? all_member_modifiers?
        //  (class_definition | struct_definition | interface_definition | enum_definition | delegate_definition)
        public override object? VisitType_declaration([NotNull] CSharpParser.Type_declarationContext context)
        {
            if (context.attributes() != null){
                VisitAttributes(context.attributes());
            }

            if (context.all_member_modifiers() != null){
                VisitAll_member_modifiers(context.all_member_modifiers());
            }

        #region Sub classes
            if (context.class_definition() != null){
                VisitClass_definition(context.class_definition());
            }
            if (context.struct_definition() != null)
            {
                VisitStruct_definition(context.struct_definition());
            }
            if(context.interface_definition() != null)
            {
                VisitInterface_definition(context.interface_definition());
            }
            if (context.enum_definition() != null)
            {
                VisitEnum_definition(context.enum_definition());
            }
            if (context.delegate_definition() != null) { 
                VisitDelegate_definition(context.delegate_definition());
            }


            else
            {
            }
            return null;
            #endregion
        }

        //class_definition
	        //: CLASS identifier type_parameter_list? class_base? type_parameter_constraints_clauses?
            //class_body ';'?
        public override object VisitClass_definition([NotNull] CSharpParser.Class_definitionContext context)
        {
            if(context.CLASS() != null){
                Namespace[context.CLASS().GetText()] = context.GetText();
            }
            if(context.identifier() != null){
                VisitIdentifier(context.identifier());
            }
            if(context.type_parameter_list() != null){
                VisitType_parameter_list(context.type_parameter_list());
            }
            if (context.class_base() != null){
                VisitClass_base(context.class_base());
            }
            if (context.class_body() != null){
                VisitClass_body(context.class_body());
            }
            else{
                throw new Exception($"No Class Body");
            }
            return null;
        }

        public override object VisitClass_body([NotNull] CSharpParser.Class_bodyContext context){

            if (context.OPEN_BRACE() != null){
                if (context.CLOSE_BRACE() != null){
                    if(context.class_member_declarations() != null){
                        VisitClass_member_declarations(context.class_member_declarations());
                    }
                }
            }
            return base.VisitClass_body(context);
        }
        public override object VisitClass_member_declarations([NotNull] CSharpParser.Class_member_declarationsContext context)
        {
            foreach (var member_DeclarationContext in context.class_member_declaration()){
                VisitClass_member_declaration(member_DeclarationContext);
            }
            return base.VisitClass_member_declarations(context);
        }

        public override object VisitClass_member_declaration([NotNull] CSharpParser.Class_member_declarationContext context){
            if (context.common_member_declaration() != null){
                VisitCommon_member_declaration(context.common_member_declaration());
            }

            return null;
        }


        public override object? VisitIdentifier(CSharpParser.IdentifierContext context){
            if(context.Start.Text != null){
                Variables[context.Start.Text] = context.Start.Type;
            }
            return base.VisitIdentifier(context);
        }

        public override object? VisitAttributes([NotNull] CSharpParser.AttributesContext context){
            foreach (var attribute in context.attribute_section()){
                VisitAttribute_section(attribute);
            }
            return base.VisitAttributes(context);
        }
        public override object VisitAttribute_section([NotNull] CSharpParser.Attribute_sectionContext context){
            return base.VisitAttribute_section(context);
        }


        public override object? VisitUsing_directives([NotNull] CSharpParser.Using_directivesContext context)
        {
            foreach(CSharpParser.Using_directiveContext usingContext in context.using_directive()){
                
            }
            return null;
        }



        public override object? VisitAll_member_modifiers([NotNull] CSharpParser.All_member_modifiersContext context)
        {
            foreach (var MemberContext in context.all_member_modifier())
            {
                if (MemberContext != null){
                    VisitAll_member_modifier(MemberContext);
                }
            }
                return null;
        }

        public override object? VisitAll_member_modifier([NotNull] CSharpParser.All_member_modifierContext context){
            if (!context.IsEmpty){
                Namespace[context.Start.Text] = context.Start;
            }
            return null;
        }

    }
   
}