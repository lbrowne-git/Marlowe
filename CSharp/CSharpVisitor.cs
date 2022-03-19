using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using CSharp;
using System;
using System.Collections.Generic;

namespace Marlowe.Visitor
{
    public class CSharpVisitor : NamespaceVisitor
    {
        public VisitorTree visitorTree = new VisitorTree();
        public Dictionary<string, object> Variables = new Dictionary<string, object>();
        public Dictionary<string, object> Functions =   new Dictionary<string, object>();
        public Dictionary<string, object> Namespace =   new Dictionary<string, object>();
        private Type type;
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
        public override object? VisitCompilation_unit([NotNull] CSharpParser.Compilation_unitContext context)
        {

            if (context.BYTE_ORDER_MARK() != null)
            {
                Variables[context.BYTE_ORDER_MARK().GetText()] = context.BYTE_ORDER_MARK();
            }
            else if (context.using_directives() != null)
            {
                VisitUsing_directives(context.using_directives());
            }

            else if (context.global_attribute_section().Length > 0)
            {
                foreach (var globalContext in context.global_attribute_section())
                {
                    VisitGlobal_attribute_section(globalContext);
                }
            }
            else if (context.namespace_member_declarations() != null)
            {
                VisitNamespace_member_declarations(context.namespace_member_declarations());
            }
            else
            {
                throw new Exception($"No namepsace declared in file");
            }
            return null;
        }
        #region Class
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
        //class_body
	        //: OPEN_BRACE class_member_declarations? CLOSE_BRACE
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
        //class_member_declaration
	        //: attributes? all_member_modifiers? (common_member_declaration | destructor_definition)
        public override object VisitClass_member_declaration([NotNull] CSharpParser.Class_member_declarationContext context){
            if (context.attributes() != null){
                VisitAttributes(context.attributes());
            }
            if (context.common_member_declaration() != null){
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
            if (context.typed_member_declaration() != null){
                VisitTyped_member_declaration(context.typed_member_declaration());
            }
            if (context.class_definition() != null) { 
                VisitClass_definition(context.class_definition());
            }

            return base.VisitCommon_member_declaration(context);
        }

        //       common_member_declaration
        //: constant_declaration
        //| typed_member_declaration
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
        #endregion

        #region Varaiable
        public override object VisitTyped_member_declaration([NotNull] CSharpParser.Typed_member_declarationContext context)
        {
            if(context.type_() != null){
                VisitType_(context.type_());
                if (context.namespace_or_type_name() != null)
                {
                    // Missing '.' indexer_declaration
                    // Used 
                    VisitNamespace_or_type_name(context.namespace_or_type_name());
                }
                else if(context.field_declaration() != null)
                {
                    VisitField_declaration(context.field_declaration());
                }
            }
            return base.VisitTyped_member_declaration(context);
        }

        public override object VisitField_declaration([NotNull] CSharpParser.Field_declarationContext context)
        {
            if(context != null)
            {
                if(context.Stop != null)
                {
                    VisitVariable_declarators(context.variable_declarators());
                }
                else
                {
                    throw new Exception($"Missing Semi Colon");
                }
            }

            return base.VisitField_declaration(context);
        }

        public override object VisitVariable_declarators([NotNull] CSharpParser.Variable_declaratorsContext context){
            foreach (var variableContext in context.variable_declarator()){
                
                VisitVariable_declarator(variableContext);
                // ',' value declaration NEEDS to be implemented
            }
            return base.VisitVariable_declarators(context);
        }

         //       variable_declarator
	    //: identifier('=' variable_initializer)?
	    //;
        public override object VisitVariable_declarator([NotNull] CSharpParser.Variable_declaratorContext context)
        {
            if(context.identifier() != null)
            {
                if(context.variable_initializer() == null)
                {
                    VisitIdentifier(context.identifier());
                }
                else
                {
                    if(context.ASSIGNMENT() != null){
                        Variables[VisitIdentifier(context.identifier()).ToString()] = VisitVariable_initializer(context.variable_initializer());
                    }
                }
            }
            return base.VisitVariable_declarator(context);
        }


         //       variable_initializer
	        //: expression
	        //| array_initializer
	        //;
        public override object VisitVariable_initializer([NotNull] CSharpParser.Variable_initializerContext context){
            if(context.expression() != null){
                return VisitExpression(context.expression());
            }

            // Will Handle Arrays Another Time
            return base.VisitVariable_initializer(context);
        }

        #endregion

        #region Expression & Assignment

        //expression
        //: assignment
        //| non_assignment_expression
        //| REF non_assignment_expression
        //   ;
        public override object VisitExpression([NotNull] CSharpParser.ExpressionContext context){
            if(context.assignment() != null){
                return VisitAssignment(context.assignment());
            }
            if (context.non_assignment_expression() != null)
            {
                return VisitNon_assignment_expression(context.non_assignment_expression());
            }
            return base.VisitExpression(context);
        }

        public override object VisitNon_assignment_expression([NotNull] CSharpParser.Non_assignment_expressionContext context){
            if (context.lambda_expression() != null){
                VisitLambda_expression(context.lambda_expression());
            }
            else if(context.query_expression() != null)
            {
                VisitQuery_expression(context.query_expression());
            }
            else if(context.conditional_expression() != null)
            {
                return VisitConditional_expression(context.conditional_expression());
            }
            return base.VisitNon_assignment_expression(context);
        }

        public override object VisitConditional_expression([NotNull] CSharpParser.Conditional_expressionContext context)
        {
            
            if(context.null_coalescing_expression() != null)
            {
                return VisitNull_coalescing_expression(context.null_coalescing_expression());
            }
            return base.VisitConditional_expression(context);
        }

        public override object VisitNull_coalescing_expression([NotNull] CSharpParser.Null_coalescing_expressionContext context)
        {
            if(context.conditional_or_expression() != null)
            {
                return VisitConditional_or_expression(context.conditional_or_expression());
            }
            return base.VisitNull_coalescing_expression(context);
        }

        public override object VisitConditional_or_expression([NotNull] CSharpParser.Conditional_or_expressionContext context)
        {
            if(context.conditional_and_expression().Length > 1)
            {
                if(context.OP_OR() != null)
                {
                    foreach (var item in context.conditional_and_expression())
                    {
                        VisitConditional_and_expression(item);
                    }
                }
                else
                {
                    return VisitConditional_and_expression(context.conditional_and_expression()[0]);
                }
            }
            else
            {
                return VisitConditional_and_expression(context.conditional_and_expression()[0]);
            }
            return base.VisitConditional_or_expression(context);
        }


        public override object VisitConditional_and_expression([NotNull] CSharpParser.Conditional_and_expressionContext context)
        {
            if (context.inclusive_or_expression().Length > 1)
            {
                if (context.OP_AND() != null)
                {
                    foreach (var item in context.inclusive_or_expression())
                    {
                        VisitInclusive_or_expression(item);
                    }
                }
                else
                {
                    return VisitInclusive_or_expression(context.inclusive_or_expression()[0]);
                }
            }
            else
            {
                return VisitInclusive_or_expression(context.inclusive_or_expression()[0]);
            }
            return base.VisitConditional_and_expression(context);
        }

        public override object VisitInclusive_or_expression([NotNull] CSharpParser.Inclusive_or_expressionContext context){
            if (context.exclusive_or_expression().Length > 1)
            {
                if (context.BITWISE_OR() != null)
                {
                    foreach (var item in context.exclusive_or_expression())
                    {
                        VisitExclusive_or_expression(item);
                    }
                }
                else{
                    return VisitExclusive_or_expression(context.exclusive_or_expression()[0]);
                }
            }
            else{
                return VisitExclusive_or_expression(context.exclusive_or_expression()[0]);
            }
            return base.VisitInclusive_or_expression(context);
        }

        public override object VisitExclusive_or_expression([NotNull] CSharpParser.Exclusive_or_expressionContext context)
        {
            if (context.and_expression().Length > 1)
            {
                if (context.CARET() != null)
                {
                    foreach (var item in context.and_expression())
                    {
                        VisitAnd_expression(item);
                    }
                }
                else{
                    return VisitAnd_expression(context.and_expression()[0]);
                }
            }
            else
            {
                return VisitAnd_expression(context.and_expression()[0]);
            }
            return base.VisitExclusive_or_expression(context);
        }

        public override object VisitAnd_expression([NotNull] CSharpParser.And_expressionContext context){
            
            if (context.equality_expression().Length > 1)
            {
                if (context.AMP() != null)
                {
                    foreach (var item in context.equality_expression())
                    {
                        VisitEquality_expression(item);
                    }
                }
                else
                {
                    return VisitEquality_expression(context.equality_expression()[0]);
                }
            }
            else
            {
                return VisitEquality_expression(context.equality_expression()[0]);
            }
            return base.VisitAnd_expression(context);
        }

        public override object VisitEquality_expression([NotNull] CSharpParser.Equality_expressionContext context)
        {
            if (context.relational_expression().Length > 1)
            {
                if (context.OP_EQ() != null || context.OP_NE() != null)
                {
                    foreach (var item in context.relational_expression())
                    {
                        VisitRelational_expression(item);
                    }
                }
                else
                {
                    return VisitRelational_expression(context.relational_expression()[0]);
                }
            }
            else
            {
                return VisitRelational_expression(context.relational_expression()[0]);
            }
            return base.VisitEquality_expression(context);
        }

        public override object VisitRelational_expression([NotNull] CSharpParser.Relational_expressionContext context){
            if(context.shift_expression().Length > 1){
                if(context.OP_GE() != null || context.OP_LE() != null|| context.LT() != null || context.GT() != null){
                    foreach (var item in context.shift_expression()){
                        VisitShift_expression(item);
                    }
                }
                else{
                    return VisitShift_expression(context.shift_expression()[0]);
                }
            }
            else{
                return VisitShift_expression(context.shift_expression()[0]);

            }
            return base.VisitRelational_expression(context);
        }

        public override object VisitShift_expression([NotNull] CSharpParser.Shift_expressionContext context){
            if (context.additive_expression().Length > 1){
                if (context.OP_LEFT_SHIFT() != null || context.right_shift() != null){
                    foreach (var item in context.additive_expression()){
                        VisitAdditive_expression(item);
                    }
                }
                else{
                    return VisitAdditive_expression(context.additive_expression()[0]);
                }
            }
            else{
                return VisitAdditive_expression(context.additive_expression()[0]);
            }
            return base.VisitShift_expression(context);
        }

        public override object VisitAdditive_expression([NotNull] CSharpParser.Additive_expressionContext context)
        {
            if (context.multiplicative_expression().Length > 1)
            {
                if (context.MINUS() != null || context.PLUS() != null)
                {
                    if (context.PLUS().Length > 0)
                    {
                        return (int)VisitMultiplicative_expression(context.multiplicative_expression()[0]) + (int)VisitMultiplicative_expression(context.multiplicative_expression()[1]);

                    }
                    else if (context.MINUS().Length > 0)
                    {
                        return (int)VisitMultiplicative_expression(context.multiplicative_expression()[0]) - (int)VisitMultiplicative_expression(context.multiplicative_expression()[1]);
                    }
                }
                else
                {
                    return VisitMultiplicative_expression(context.multiplicative_expression()[0]);
                }
            }
            else
            {
                return VisitMultiplicative_expression(context.multiplicative_expression()[0]);
            }
            return base.VisitAdditive_expression(context);
        }

        public override object VisitMultiplicative_expression([NotNull] CSharpParser.Multiplicative_expressionContext context)
        {
            if (context.switch_expression().Length > 1)
            {
                if (context.STAR() != null || context.PERCENT() != null || context.DIV() != null)
                {
                    if (context.STAR().Length > 0)
                    {
                        return (int)VisitSwitch_expression(context.switch_expression()[0]) * (int)VisitSwitch_expression(context.switch_expression()[1]);
                    }
                    else if (context.DIV().Length > 0)
                    {
                        return (int)VisitSwitch_expression(context.switch_expression()[0]) / (int)VisitSwitch_expression(context.switch_expression()[1]);

                    }
                }
                else
                {
                    return VisitSwitch_expression(context.switch_expression()[0]);
                }
            }
            else
            {
                return VisitSwitch_expression(context.switch_expression()[0]);
            }

            return base.VisitMultiplicative_expression(context);
        }

        public override object VisitSwitch_expression([NotNull] CSharpParser.Switch_expressionContext context)
        {
            if (context.range_expression() != null){
                if(context.SWITCH() != null){

                }
                else{
                    return VisitRange_expression(context.range_expression());
                }
            }
            return base.VisitSwitch_expression(context);
        }

        public override object VisitRange_expression([NotNull] CSharpParser.Range_expressionContext context)
        {
            if(context.unary_expression().Length > 1)
            {

            }
            else{
                return VisitUnary_expression(context.unary_expression()[0]);
            }
            return base.VisitRange_expression(context);
        }

        //       assignment
        //: unary_expression assignment_operator? expression
        //| unary_expression '??=' throwable_expression
        //;
        public override object VisitAssignment([NotNull] CSharpParser.AssignmentContext context){
            if(context.unary_expression() != null)
            {
                return VisitUnary_expression(context.unary_expression());
            }
            return base.VisitAssignment(context);
        }



        //       unary_expression
	    //: primary_expression
	    //| '+' unary_expression
	    //| '-' unary_expression
	    //| BANG unary_expression
	    //| '~' unary_expression
	    //| '++' unary_expression
	    //| '--' unary_expression
	    //| OPEN_PARENS type_ CLOSE_PARENS unary_expression
	    //| AWAIT unary_expression // C# 5
	    //| '&' unary_expression
	    //| '*' unary_expression
	    //| '^' unary_expression // C# 8 ranges
	    //;
        public override object VisitUnary_expression([NotNull] CSharpParser.Unary_expressionContext context)
        {
            if(context.primary_expression() != null)
            {
                return VisitPrimary_expression(context.primary_expression());
            }


            return base.VisitUnary_expression(context);
        }

         //       primary_expression  
	        //: pe=primary_expression_start
        public override object VisitPrimary_expression([NotNull] CSharpParser.Primary_expressionContext context)
        {
            if(context.primary_expression_start() != null)
            {
                return VisitPrimary_expression_start(context.primary_expression_start());
            }
            return base.VisitPrimary_expression(context);
        }

        public object VisitPrimary_expression_start([NotNull] CSharpParser.Primary_expression_startContext context) {

            string value = context.Start.Text;
            if (int.TryParse(value, out int intValue))
            {
                if (intValue != 0)
                {
                    return intValue;
                }
            }
            else if (double.TryParse(value, out double doubleValue))
            {
                if (doubleValue != 0)
                {
                    return doubleValue;
                }
            }
            else if (float.TryParse(value, out float floatValue))
            {
                if (floatValue != 0)
                {
                    return floatValue;
                }
            }
            else 
            {
                if (value[0] == '"' && value[value.Length - 1] == '"')
                {
                    return value.Substring(1, (value.Length-2));

                }
                else
                {
                    try
                    {
                        return Variables[value];
                    }
                    catch
                    {
                        throw new Exception($"value is valid");
                    }
                }
            }
            
            return null;
        }

        #endregion

        #region Type

        //type_
        //: base_type('?' | rank_specifier | '*')*
        //;

        public override object VisitType_([NotNull] CSharpParser.Type_Context context)
        {
            if (context.base_type() != null) { 
                VisitBase_type(context.base_type());
            }
            return base.VisitType_(context);
        }

         //       base_type
	        //: simple_type
	        //| class_type  // represents types: enum, class, interface, delegate, type_parameter
	        //| VOID '*'
	        //| tuple_type
	        //;

        public override object VisitBase_type([NotNull] CSharpParser.Base_typeContext context)
        {
            if (context.simple_type() != null) 
            {
                VisitSimple_type(context.simple_type());
            }
            if (context.class_type() != null)
            {
                VisitClass_type(context.class_type());
            }
            if (context.VOID() != null)
            {
                if (context.STAR() != null)
                {
                }
            }
            return base.VisitBase_type(context);
        }

        public override object VisitClass_type([NotNull] CSharpParser.Class_typeContext context)
        {
            if(context.namespace_or_type_name() != null)
            {
                VisitNamespace_or_type_name(context.namespace_or_type_name());
            }
            else if(context.OBJECT() != null || context.DYNAMIC() != null || context.STRING() != null)
            {
            }

            return base.VisitClass_type(context);
        }



        public override object VisitSimple_type([NotNull] CSharpParser.Simple_typeContext context)
        {
            if (context.numeric_type() != null)
            {
                VisitNumeric_type(context.numeric_type());
            }
            else if(context.BOOL() != null)
            {
            }
            return base.VisitSimple_type(context);
        }

        public override object VisitNumeric_type([NotNull] CSharpParser.Numeric_typeContext context)
        {
            if(context.integral_type() != null)
            {
                VisitIntegral_type(context.integral_type());
            }
            else if(context.floating_point_type() != null)
            {
                VisitFloating_point_type(context.floating_point_type());
            }
            else if(context.DECIMAL() != null)
            {
            }
            return base.VisitNumeric_type(context);
        }

        public override object VisitIntegral_type([NotNull] CSharpParser.Integral_typeContext context)
        {
            if(context != null)
            {
                if(context.INT() != null)
                {
                    type = typeof(int);
                }
            }
            return base.VisitIntegral_type(context);
        }



        //type_declaration
        // : attributes? all_member_modifiers?
        //  (class_definition | struct_definition | interface_definition | enum_definition | delegate_definition)
        public override object? VisitType_declaration([NotNull] CSharpParser.Type_declarationContext context)
        {
            if (context.attributes() != null)
            {
                VisitAttributes(context.attributes());
            }

            if (context.all_member_modifiers() != null)
            {
                VisitAll_member_modifiers(context.all_member_modifiers());
            }

            #region Sub classes
            if (context.class_definition() != null)
            {
                VisitClass_definition(context.class_definition());
            }
            if (context.struct_definition() != null)
            {
                VisitStruct_definition(context.struct_definition());
            }
            if (context.interface_definition() != null)
            {
                VisitInterface_definition(context.interface_definition());
            }
            if (context.enum_definition() != null)
            {
                VisitEnum_definition(context.enum_definition());
            }
            if (context.delegate_definition() != null)
            {
                VisitDelegate_definition(context.delegate_definition());
            }


            else
            {
            }
            return null;
            #endregion
        }
        #endregion

        #region Attributes
        public override object? VisitAttributes([NotNull] CSharpParser.AttributesContext context){
            foreach (var attribute in context.attribute_section()){
                VisitAttribute_section(attribute);
            }
            return base.VisitAttributes(context);
        }
        public override object VisitAttribute_section([NotNull] CSharpParser.Attribute_sectionContext context){
            if (context.OPEN_BRACKET().GetText() != null){
                if (context.attribute_target() != null){
                    if (context.COLON().GetText() != null){
                        VisitAttribute_target(context.attribute_target());
                    }
                    else
                    {
                        throw new Exception($"Missing Colon?");
                    }
                }
                if (context.attribute_list() != null){

                }
                else
                {
                    throw new Exception($"no variable declaration present");
                }
            }
            
            
            return base.VisitAttribute_section(context);
        }
        #endregion

        #region All Members
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
        #endregion




        public override object? VisitIdentifier(CSharpParser.IdentifierContext context)
        {
            if (context.Start.Text != null)
            {
                Variables[context.Start.Text] = context.Start.Type;

                return context.Start.Text;
            }
            return base.VisitIdentifier(context);
        }

        public override object? VisitUsing_directives([NotNull] CSharpParser.Using_directivesContext context)
        {
            foreach (CSharpParser.Using_directiveContext usingContext in context.using_directive())
            {

            }
            return null;
        }

    }
   
}