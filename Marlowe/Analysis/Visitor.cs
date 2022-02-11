using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Analysis
{
    public class Visitor : CSharpParserBaseVisitor<ITerminalNode>
    {
        public Dictionary<string, object> Variables { get; } = new Dictionary<string, object>();

        /**
         *  By analysing the compilation context returned  by the parser, this 
         *  function creates tokens for the Symbol Tree, Synthiser & Error Handler.
         *
         *  @param ITerminalNode : a generic Node obejct for to Create ASTs
         */


        public override ITerminalNode Visit(IParseTree tree)
        {
            Console.WriteLine();
            return base.Visit(tree);
        }

        /* Entry point into source.
            References:
                BYTE_ORDER_MARK? extern_alias_directives? using_directives?
                global_attribute_section* namespace_member_declarations? EOF
                                                                                    */
        public override ITerminalNode VisitCompilation_unit([NotNull] CSharpParser.Compilation_unitContext context){
            Console.WriteLine("Inside VisitCompilation_unit");
            return Visit(context);
        }

        public override ITerminalNode VisitExtern_alias_directives([NotNull] CSharpParser.Extern_alias_directivesContext context)
        {
            Console.WriteLine("Inside VisitExtern_alias_directives");
            return Visit(context);
        }

        public override ITerminalNode VisitExtern_alias_directive([NotNull] CSharpParser.Extern_alias_directiveContext context)
        {
            Console.WriteLine("Inside VisitExtern_alias_directive");
            return Visit(context);
        }

        #region CS.2.1 - Basic concepts
        public override ITerminalNode VisitType_argument_list([NotNull] CSharpParser.Type_argument_listContext context)
        {
            return base.VisitType_argument_list(context);
        }

        public override ITerminalNode VisitNamespace_or_type_name([NotNull] CSharpParser.Namespace_or_type_nameContext context)
        {
            return base.VisitNamespace_or_type_name(context);
        }
        #endregion

        #region CS.2.2 - Types
        public override ITerminalNode VisitType_([NotNull] CSharpParser.Type_Context context)
        {
            return base.VisitType_(context);
        }
        public override ITerminalNode VisitBase_type([NotNull] CSharpParser.Base_typeContext context)
        {
            return base.VisitBase_type(context);
        }

        public override ITerminalNode VisitTuple_element([NotNull] CSharpParser.Tuple_elementContext context)
        {
            return base.VisitTuple_element(context);
        }

        public override ITerminalNode VisitSimple_type([NotNull] CSharpParser.Simple_typeContext context)
        {
            return base.VisitSimple_type(context);
        }

        public override ITerminalNode VisitNumeric_type([NotNull] CSharpParser.Numeric_typeContext context)
        {
            return base.VisitNumeric_type(context);
        }

        // Tuple Element Missing



        #endregion
        public override ITerminalNode VisitUsing_directives([NotNull] CSharpParser.Using_directivesContext context)
        {
            Console.WriteLine("Inside VisitUsing_directives");

            return base.VisitUsing_directives(context);
        }
        public override ITerminalNode VisitGlobal_attribute_section([NotNull] CSharpParser.Global_attribute_sectionContext context)
        {
            Console.WriteLine("Inside VisitGlobal_attribute_section");
            return Visit(context);
        }
        public override ITerminalNode VisitNamespace_member_declarations([NotNull] CSharpParser.Namespace_member_declarationsContext context)
        {
            Console.WriteLine("Inside VisitNameSpace_Member_Declarion");
            return Visit(context);
        }
    }
}