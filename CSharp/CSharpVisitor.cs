using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using CSharp;
using System;
using System.Collections.Generic;
using Marlowe.Utilities;

namespace Marlowe.Visitor
{
    public class CSharpVisitor : SymbolTable, ICSharpVisitor
    { 

        private Type Type = default(Type);
        private string ClassName;
        private string Namespace;

        public ISymbolNode Visit(IParseTree tree){return null;}


        /* Entry point into source.
            References:
                BYTE_ORDER_MARK? extern_alias_directives? using_directives?
                global_attribute_section* namespace_member_declarations? EOF
                                                                                    */
        public ISymbolNode VisitCompilation_unit([NotNull] CSharpParser.Compilation_unitContext context)
        {
            if (context.BYTE_ORDER_MARK() != null)
            {
                Variables[context.BYTE_ORDER_MARK().GetText()] = new SymbolNode() { Variable = context.BYTE_ORDER_MARK() };
            }

            if (context.global_attribute_section().Length > 0)
            {
                foreach (var globalContext in context.global_attribute_section())
                {
                    //VisitGlobal_attribute_section(globalContext);
                }
            }

            if (context.namespace_member_declarations() != null)
            {
                VisitNamespace_member_declarations(context.namespace_member_declarations());
            }
            else
            {
                throw new Exception($"No namepsace declared in file");
            }

            if (context.using_directives() != null)
            {
                VisitUsing_directives(context.using_directives());
            }

            return null;
        }


        #region Namespace
        //   namespace_member_declarations
        //:       namespace_member_declaration                      
        public ISymbolNode VisitNamespace_member_declarations([NotNull] CSharpParser.Namespace_member_declarationsContext context)
        {

            foreach (var NamespaceContext in context.namespace_member_declaration())
            {
                if (NamespaceContext != null)
                {
                    VisitNamespace_member_declaration(NamespaceContext);
                }
            }

            return default;
        }

        //namespace_member_declaration
        //: namespace_declaration
        //| type_declaration
        //;
        public ISymbolNode VisitNamespace_member_declaration([NotNull] CSharpParser.Namespace_member_declarationContext context)
        {

            if (context.namespace_declaration() != null){
                VisitNamespace_declaration(context.namespace_declaration());
            }
            else if (context.type_declaration() != null){
                VisitType_declaration(context.type_declaration());
            }
            return null;        
        }

        public ISymbolNode VisitNamespace_declaration([NotNull] CSharpParser.Namespace_declarationContext context)
        {
            if (context.NAMESPACE() != null)
            {
                Namespace = context.NAMESPACE().GetText();
                if (context.namespace_body() != null)
                {
                    VisitNamespace_body(context.namespace_body());
                }
            }
            return default;
        }

        public ISymbolNode VisitNamespace_body([NotNull] CSharpParser.Namespace_bodyContext context)
        {
            if (context.OPEN_BRACE() != null)
            {
                if (context.CLOSE_BRACE() != null)
                {
                    if (context.extern_alias_directives() != null)
                    {
                       // VisitExtern_alias_directives(context.extern_alias_directives());
                    }
                    if (context.using_directives() != null)
                    {
                        VisitUsing_directives(context.using_directives());
                    }
                    if (context.namespace_member_declarations() != null)
                    {
                        VisitNamespace_member_declarations(context.namespace_member_declarations());
                    }
                }
                else
                {
                    throw new System.Exception($"Namespace Body does not contain a closing bracket");
                }
            }
            else
            {
                throw new System.Exception($"Namespace Body does not contain an openning bracket");
            }
            return default;
        }



        #endregion

        #region Class
        //class_definition
        //: CLASS identifier type_parameter_list? class_base? type_parameter_constraints_clauses?
        //class_body ';'?
        public ISymbolNode VisitClass_definition([NotNull] CSharpParser.Class_definitionContext context)
        {
            if (context.CLASS() != null)
            {
                if (context.identifier() != null)
                {
                    ClassName = VisitIdentifier(context.identifier()).ToString();

                    if (context.type_parameter_list() != null)
                    {
                        //VisitType_parameter_list(context.type_parameter_list());
                    }
                    if (context.class_base() != null)
                    {
                        // VisitClass_base(context.class_base());
                    }
                    if (context.class_body() != null)
                    {
                        VisitClass_body(context.class_body());
                    }
                    else
                    {
                        throw new Exception($"No Class Body");
                    }
                }
                else
                {
                    throw new Exception($"No Class");
                }

            }

            return default;
        }
        //class_body
	        //: OPEN_BRACE class_member_declarations? CLOSE_BRACE
        public ISymbolNode VisitClass_body([NotNull] CSharpParser.Class_bodyContext context){

            if (context.OPEN_BRACE() != null){
                if (context.CLOSE_BRACE() != null){
                    if(context.class_member_declarations() != null){
                        VisitClass_member_declarations(context.class_member_declarations());
                    }
                }
            }
            return null;       
        }

        public ISymbolNode VisitClass_member_declarations([NotNull] CSharpParser.Class_member_declarationsContext context)
        {
            foreach (var member_DeclarationContext in context.class_member_declaration()){
                VisitClass_member_declaration(member_DeclarationContext);
            }
            return null;      
        }
        //class_member_declaration
	        //: attributes? all_member_modifiers? (common_member_declaration | destructor_definition)
        public ISymbolNode VisitClass_member_declaration([NotNull] CSharpParser.Class_member_declarationContext context){
            if (context.attributes() != null){
                VisitAttributes(context.attributes());
            }
            if (context.common_member_declaration() != null){
                VisitCommon_member_declaration(context.common_member_declaration());
            }

            return default;
        }
         //common_member_declaration
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
        public ISymbolNode VisitCommon_member_declaration([NotNull] CSharpParser.Common_member_declarationContext context)
        {
            if (context.typed_member_declaration() != null){
                VisitTyped_member_declaration(context.typed_member_declaration());
            }
            if (context.class_definition() != null) { 
                VisitClass_definition(context.class_definition());
            }

            return null;      
        }

        #endregion

        #region Variable

        /**
         * typed_member_declaration
	        : (REF | READONLY REF | REF READONLY)? type_
	          ( namespace_or_type_name '.' indexer_declaration
	          | method_declaration
	          | property_declaration
	          | indexer_declaration
	          | operator_declaration
	          | field_declaration
	          )
	        ;
         * 
         * 
         */
        public ISymbolNode VisitTyped_member_declaration([NotNull] CSharpParser.Typed_member_declarationContext context)
        {
            if(context.type_() != null){
                VisitType_(context.type_());
                if (context.namespace_or_type_name() != null)
                {
                   // Missing '.' indexer_declaration
                   // Used 
                   // VisitNamespace_or_type_name(context.namespace_or_type_name());
                }
                else if(context.field_declaration() != null)
                {
                    VisitField_declaration(context.field_declaration());
                }
            }
            return null;      
        }

        public ISymbolNode VisitField_declaration([NotNull] CSharpParser.Field_declarationContext context)
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

            return null;     
        }

        public ISymbolNode VisitVariable_declarators([NotNull] CSharpParser.Variable_declaratorsContext context){
            foreach (var variableContext in context.variable_declarator()){
                
                VisitVariable_declarator(variableContext);
                // ',' value declaration NEEDS to be implemented
            }
            return null;  
        }

         //       variable_declarator
	    //: identifier('=' variable_initializer)?
	    //;
        public ISymbolNode VisitVariable_declarator([NotNull] CSharpParser.Variable_declaratorContext context)
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
            return null;  
        }


         //       variable_initializer
	        //: expression
	        //| array_initializer
	        //;
        public ISymbolNode VisitVariable_initializer([NotNull] CSharpParser.Variable_initializerContext context){
            if(context.expression() != null){
                return VisitExpression(context.expression());
            }

            // Will Handle Arrays Another Time
            return null;   
        }

        #endregion

        #region Expression & Assignment

        //expression
        //: assignment
        //| non_assignment_expression
        //| REF non_assignment_expression
        //   ;
        public ISymbolNode VisitExpression([NotNull] CSharpParser.ExpressionContext context){
            if(context.assignment() != null){
                return VisitAssignment(context.assignment());
            }
            if (context.non_assignment_expression() != null)
            {
                return VisitNon_assignment_expression(context.non_assignment_expression());
            }
            return null;    
        }

        public ISymbolNode VisitNon_assignment_expression([NotNull] CSharpParser.Non_assignment_expressionContext context){
            if (context.lambda_expression() != null){
               // VisitLambda_expression(context.lambda_expression());
            }
            else if(context.query_expression() != null)
            {
                //VisitQuery_expression(context.query_expression());
            }
            else if(context.conditional_expression() != null)
            {
                return VisitConditional_expression(context.conditional_expression());
            }
            return null;        }

        public ISymbolNode VisitConditional_expression([NotNull] CSharpParser.Conditional_expressionContext context)
        {
            
            if(context.null_coalescing_expression() != null)
            {
                return VisitNull_coalescing_expression(context.null_coalescing_expression());
            }
            return null;        }

        public ISymbolNode VisitNull_coalescing_expression([NotNull] CSharpParser.Null_coalescing_expressionContext context)
        {
            if(context.conditional_or_expression() != null)
            {
                return VisitConditional_or_expression(context.conditional_or_expression());
            }
            return null;        }

        public ISymbolNode VisitConditional_or_expression([NotNull] CSharpParser.Conditional_or_expressionContext context)
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
            return null;        }


        public ISymbolNode VisitConditional_and_expression([NotNull] CSharpParser.Conditional_and_expressionContext context)
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
            return null;        }

        public ISymbolNode VisitInclusive_or_expression([NotNull] CSharpParser.Inclusive_or_expressionContext context){
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
            return null;        }

        public ISymbolNode VisitExclusive_or_expression([NotNull] CSharpParser.Exclusive_or_expressionContext context)
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
            return null;        }

        public ISymbolNode VisitAnd_expression([NotNull] CSharpParser.And_expressionContext context){
            
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
            return null;        }

        public ISymbolNode VisitEquality_expression([NotNull] CSharpParser.Equality_expressionContext context)
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
            return null;        }

        public ISymbolNode VisitRelational_expression([NotNull] CSharpParser.Relational_expressionContext context){
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
            return null;        }

        public ISymbolNode VisitShift_expression([NotNull] CSharpParser.Shift_expressionContext context){
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
            return null;        }

        public ISymbolNode VisitAdditive_expression([NotNull] CSharpParser.Additive_expressionContext context)
        {
            if (context.multiplicative_expression().Length > 1)
            {
                if (context.MINUS() != null || context.PLUS() != null)
                {
                    if (context.PLUS().Length > 0){
                        return SemanticAnalyser.OperationExpression(context.multiplicative_expression(), SemanticAnalyser.Operators.PLUS);
                        // return new SymbolNode() { Variable = VisitMultiplicative_expression(context.multiplicative_expression()[0]) + VisitMultiplicative_expression(context.multiplicative_expression()[1])};
                        return VisitMultiplicative_expression(context.multiplicative_expression()[0]);

                    }
                    else if (context.MINUS().Length > 0)
                    {
                        return VisitMultiplicative_expression(context.multiplicative_expression()[0]);

                        // return (int)VisitMultiplicative_expression(context.multiplicative_expression()[0]) - (int)VisitMultiplicative_expression(context.multiplicative_expression()[1]);
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
            return null;        }

        private Type DetectedContext(CSharpParser.Multiplicative_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMultiplicative_expression([NotNull] CSharpParser.Multiplicative_expressionContext context)
        {
            if (context.switch_expression().Length > 1)
            {
                if (context.STAR() != null || context.PERCENT() != null || context.DIV() != null)
                {
                    if (context.STAR().Length > 0)
                    {
                        return VisitSwitch_expression(context.switch_expression()[0]);
                       // return (int)VisitSwitch_expression(context.switch_expression()[0]) * (int)VisitSwitch_expression(context.switch_expression()[1]);
                    }
                    else if (context.DIV().Length > 0)
                    {
                        VisitSwitch_expression(context.switch_expression()[0]);
                        //return (int)VisitSwitch_expression(context.switch_expression()[0]) / (int)VisitSwitch_expression(context.switch_expression()[1]);

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

            return null;        }

        public ISymbolNode VisitSwitch_expression([NotNull] CSharpParser.Switch_expressionContext context)
        {
            if (context.range_expression() != null){
                if(context.SWITCH() != null){

                }
                else{
                    return VisitRange_expression(context.range_expression());
                }
            }
            return null;        }

        public ISymbolNode VisitRange_expression([NotNull] CSharpParser.Range_expressionContext context)
        {
            if(context.unary_expression().Length > 1)
            {

            }
            else{
                return VisitUnary_expression(context.unary_expression()[0]);
            }
            return null;        }

        //       assignment
        //: unary_expression assignment_operator? expression
        //| unary_expression '??=' throwable_expression
        //;
        public ISymbolNode VisitAssignment([NotNull] CSharpParser.AssignmentContext context){
            if(context.unary_expression() != null)
            {
                return VisitUnary_expression(context.unary_expression());
            }
            if(context.expression() != null)
            {
                return VisitExpression(context.expression());
            }
            return null;
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
        public ISymbolNode VisitUnary_expression([NotNull] CSharpParser.Unary_expressionContext context)
        {
            if(context.primary_expression() != null)
            {
                return VisitPrimary_expression(context.primary_expression());
            }


            return null;
        }

         //       primary_expression  
	        //: pe=primary_expression_start
        public ISymbolNode VisitPrimary_expression([NotNull] CSharpParser.Primary_expressionContext context)
        {
            if(context.primary_expression_start() != null)
            {
                return VisitPrimary_expression_start(context.primary_expression_start());
            }
            return null;     
        }

        public ISymbolNode VisitPrimary_expression_start([NotNull] CSharpParser.Primary_expression_startContext context) {
            string value = context.Start.Text;
            if (Variables.ContainsKey(value)){
                return Variables[value];
            }
            else
            {
                return new SymbolNode() { 
                    ClassName = ClassName,
                    Namespace = Namespace,
                    Type = Type,
                    Variable = value
                };
            }
        }

        #endregion

        #region Type

        //type_
        //: base_type('?' | rank_specifier | '*')*
        //;

        public ISymbolNode VisitType_([NotNull] CSharpParser.Type_Context context)
        {
            if (context.base_type() != null) { 
                VisitBase_type(context.base_type());
            }
            return null;        }

        // base_type
	        //: simple_type
	        //| class_type  // represents types: enum, class, interface, delegate, type_parameter
	        //| VOID '*'
	        //| tuple_type
	        //;

        public ISymbolNode VisitBase_type([NotNull] CSharpParser.Base_typeContext context)
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
            return null;
        }

        public ISymbolNode VisitClass_type([NotNull] CSharpParser.Class_typeContext context)
        {
            if(context.namespace_or_type_name() != null)
            {
                VisitNamespace_or_type_name(context.namespace_or_type_name());
            }
            else{
                switch (context.Start.Text)
                {
                    case "object":
                        Type = typeof(object);
                        break;
                    case "string":
                        Type = typeof(string);
                        break;
                    default:
                        Type = default;
                        break;
                }
            }

            return null;
        }



        public ISymbolNode VisitSimple_type([NotNull] CSharpParser.Simple_typeContext context)
        {
            if (context.numeric_type() != null)
            {
                VisitNumeric_type(context.numeric_type());
            }
            else if(context.BOOL() != null)
            {
                Type = typeof(bool);
            }
            return null; 
        }

        public ISymbolNode VisitNumeric_type([NotNull] CSharpParser.Numeric_typeContext context)
        {
            if(context.integral_type() != null)
            {
                return VisitIntegral_type(context.integral_type());
            }
            else if(context.floating_point_type() != null)
            {
                return VisitFloating_point_type(context.floating_point_type());
            }
            else if(context.DECIMAL() != null)
            {
                Type = typeof(decimal);
            }
            return null;
        }

        public ISymbolNode VisitIntegral_type([NotNull] CSharpParser.Integral_typeContext context)
        {
            switch (context.Start.Text)
            {
                case "int":
                    Type = typeof(int);
                    break;
                case "long":
                    Type = typeof(long);
                    break;
                case "char":
                    Type = typeof(char);
                    break;
                case "short":
                    Type = typeof(short);
                    break;
                default:
                    break;
            }
            return null;
        }


        public ISymbolNode VisitFloating_point_type([NotNull] CSharpParser.Floating_point_typeContext context)
        {
            if (context.DOUBLE() != null)
            {
                Type = typeof(double);
            }
            else if(context.FLOAT() != null)
            {
                Type = typeof(float);
            }
            return null;
        }




        //type_declaration
        // : attributes? all_member_modifiers?
        //  (class_definition | struct_definition | interface_definition | enum_definition | delegate_definition)
        public ISymbolNode VisitType_declaration([NotNull] CSharpParser.Type_declarationContext context)
        {

            if (context.attributes() != null)
            {
                VisitAttributes(context.attributes());
            }

            if (context.all_member_modifiers() != null)
            {
                VisitAll_member_modifiers(context.all_member_modifiers());
            }

            if (context.class_definition() != null)
            {
                VisitClass_definition(context.class_definition());
            }
            else if (context.struct_definition() != null)
            {
                //VisitStruct_definition(context.struct_definition());
            }
            else if (context.interface_definition() != null)
            {
               // VisitInterface_definition(context.interface_definition());
            }
            else if (context.enum_definition() != null)
            {
               // VisitEnum_definition(context.enum_definition());
            }
            else if (context.delegate_definition() != null)
            {
               // VisitDelegate_definition(context.delegate_definition());
            }
            else
            {
            }
            return default;
        }
        #endregion

        #region Attributes
        public ISymbolNode VisitAttributes([NotNull] CSharpParser.AttributesContext context){
            foreach (var attribute in context.attribute_section()){
                VisitAttribute_section(attribute);
            }
            return null;      
        }
        public ISymbolNode VisitAttribute_section([NotNull] CSharpParser.Attribute_sectionContext context){
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
            
            
            return null;  
        }
        public ISymbolNode VisitAttribute_target([NotNull] CSharpParser.Attribute_targetContext context)
        {
            if(context.keyword() != null)
            {
                VisitKeyword(context.keyword());
            }
            else if (Variables.ContainsKey(context.identifier().IDENTIFIER().GetText()))
            {
                return new SymbolNode { ClassName = ClassName, Variable = context.identifier().IDENTIFIER().GetText(), Namespace = Namespace, Type = Type };
            }
            else
            {
                throw new Exception("no data type specified");
            }
            return null;
        }
        public ISymbolNode VisitKeyword([NotNull] CSharpParser.KeywordContext context)
        {
            if(context.INT() != null)
            {
                Type = Type.GetType("int");
            }
            else { 
            }
            return null;
        }

        #endregion

        #region All Members
        public ISymbolNode VisitAll_member_modifiers([NotNull] CSharpParser.All_member_modifiersContext context)
        {
            foreach (var MemberContext in context.all_member_modifier())
            {
                if (MemberContext != null){
                    VisitAll_member_modifier(MemberContext);
                }
            }
                return default;
        }

        public ISymbolNode VisitAll_member_modifier([NotNull] CSharpParser.All_member_modifierContext context){
            if (!context.IsEmpty){
                Namespace  = context.Start.Text;
            }
            return default;
        }
        #endregion


        #region Using Directives
        public ISymbolNode VisitUsing_directives([NotNull] CSharpParser.Using_directivesContext context)
        {
            foreach (CSharpParser.Using_directiveContext usingContext in context.using_directive())
            {
                VisitUsingNamespaceDirective((CSharpParser.UsingNamespaceDirectiveContext)usingContext);
            }
            return default;
        }

        public ISymbolNode VisitUsingNamespaceDirective([NotNull] CSharpParser.UsingNamespaceDirectiveContext context)
        {
            if (context.USING() != null)
            {
                if (context.SEMICOLON() != null)
                {

                    if (context.namespace_or_type_name() != null)
                    {
                        return VisitNamespace_or_type_name(context.namespace_or_type_name());
                    }
                    else
                    {
                        throw new Exception("USING keyword without namespace or type present");
                    }
                }
                else
                {
                    throw new Exception("USING reference missing semicolon");
                }
            }
            else
            {
                return null;

            }
        }


        //	(identifier type_argument_list? | qualified_alias_member) ('.' identifier type_argument_list?)*
        public ISymbolNode VisitNamespace_or_type_name([NotNull] CSharpParser.Namespace_or_type_nameContext context)
        {
            if (context.identifier().Length == 1)
            {
                if (context.type_argument_list().Length > 0)
                {
                    /**Casting for using references should be handled here
                     *  however, is beyond the scope of this current implementation.
                     */
    }
                else
                {
                    Directives[context.identifier(0).GetText()] = new SymbolNode()
                    {
                        Namespace = Namespace,
                        ClassName = ClassName,
                        Variable = VisitIdentifier(context.identifier(0))
                    };

                }
            }
            else if (context.identifier().Length > 1)
            {

            }

            {
                /**Sub Namespaces should be handled here
                 *      i.e using System.Collections.Generic;
                 */
            }

            return null;
        }


        #endregion
        public object VisitIdentifier(CSharpParser.IdentifierContext context)
        {
            if (context.IDENTIFIER().GetText()!= null){
                return context.IDENTIFIER().GetText();
            }
            return null;
        }


        #region Not Implemented Context
   


        public ISymbolNode VisitTuple_type([NotNull] CSharpParser.Tuple_typeContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitTuple_element([NotNull] CSharpParser.Tuple_elementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitType_argument_list([NotNull] CSharpParser.Type_argument_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitArgument_list([NotNull] CSharpParser.Argument_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitArgument([NotNull] CSharpParser.ArgumentContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAssignment_operator([NotNull] CSharpParser.Assignment_operatorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSwitch_expression_arms([NotNull] CSharpParser.Switch_expression_armsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSwitch_expression_arm([NotNull] CSharpParser.Switch_expression_armContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLiteralExpression([NotNull] CSharpParser.LiteralExpressionContext context)
        {
            return null;
        }

        public ISymbolNode VisitSimpleNameExpression([NotNull] CSharpParser.SimpleNameExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitParenthesisExpressions([NotNull] CSharpParser.ParenthesisExpressionsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMemberAccessExpression([NotNull] CSharpParser.MemberAccessExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLiteralAccessExpression([NotNull] CSharpParser.LiteralAccessExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitThisReferenceExpression([NotNull] CSharpParser.ThisReferenceExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitBaseAccessExpression([NotNull] CSharpParser.BaseAccessExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitObjectCreationExpression([NotNull] CSharpParser.ObjectCreationExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitTupleExpression([NotNull] CSharpParser.TupleExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitTypeofExpression([NotNull] CSharpParser.TypeofExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitCheckedExpression([NotNull] CSharpParser.CheckedExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitUncheckedExpression([NotNull] CSharpParser.UncheckedExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitDefaultValueExpression([NotNull] CSharpParser.DefaultValueExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAnonymousMethodExpression([NotNull] CSharpParser.AnonymousMethodExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSizeofExpression([NotNull] CSharpParser.SizeofExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitNameofExpression([NotNull] CSharpParser.NameofExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitThrowable_expression([NotNull] CSharpParser.Throwable_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitThrow_expression([NotNull] CSharpParser.Throw_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMember_access([NotNull] CSharpParser.Member_accessContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitBracket_expression([NotNull] CSharpParser.Bracket_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitIndexer_argument([NotNull] CSharpParser.Indexer_argumentContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitPredefined_type([NotNull] CSharpParser.Predefined_typeContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitExpression_list([NotNull] CSharpParser.Expression_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitObject_or_collection_initializer([NotNull] CSharpParser.Object_or_collection_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitObject_initializer([NotNull] CSharpParser.Object_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMember_initializer_list([NotNull] CSharpParser.Member_initializer_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMember_initializer([NotNull] CSharpParser.Member_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInitializer_value([NotNull] CSharpParser.Initializer_valueContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitCollection_initializer([NotNull] CSharpParser.Collection_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitElement_initializer([NotNull] CSharpParser.Element_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAnonymous_object_initializer([NotNull] CSharpParser.Anonymous_object_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMember_declarator_list([NotNull] CSharpParser.Member_declarator_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMember_declarator([NotNull] CSharpParser.Member_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitUnbound_type_name([NotNull] CSharpParser.Unbound_type_nameContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitGeneric_dimension_specifier([NotNull] CSharpParser.Generic_dimension_specifierContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitIsType([NotNull] CSharpParser.IsTypeContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitIsTypePatternArms([NotNull] CSharpParser.IsTypePatternArmsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitIsTypePatternArm([NotNull] CSharpParser.IsTypePatternArmContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLambda_expression([NotNull] CSharpParser.Lambda_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAnonymous_function_signature([NotNull] CSharpParser.Anonymous_function_signatureContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitExplicit_anonymous_function_parameter_list([NotNull] CSharpParser.Explicit_anonymous_function_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitExplicit_anonymous_function_parameter([NotNull] CSharpParser.Explicit_anonymous_function_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitImplicit_anonymous_function_parameter_list([NotNull] CSharpParser.Implicit_anonymous_function_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAnonymous_function_body([NotNull] CSharpParser.Anonymous_function_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitQuery_expression([NotNull] CSharpParser.Query_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFrom_clause([NotNull] CSharpParser.From_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitQuery_body([NotNull] CSharpParser.Query_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitQuery_body_clause([NotNull] CSharpParser.Query_body_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLet_clause([NotNull] CSharpParser.Let_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitWhere_clause([NotNull] CSharpParser.Where_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitCombined_join_clause([NotNull] CSharpParser.Combined_join_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitOrderby_clause([NotNull] CSharpParser.Orderby_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitOrdering([NotNull] CSharpParser.OrderingContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSelect_or_group_clause([NotNull] CSharpParser.Select_or_group_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitQuery_continuation([NotNull] CSharpParser.Query_continuationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitStatement([NotNull] CSharpParser.StatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitDeclarationStatement([NotNull] CSharpParser.DeclarationStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_function_declaration([NotNull] CSharpParser.Local_function_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_function_header([NotNull] CSharpParser.Local_function_headerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_function_modifiers([NotNull] CSharpParser.Local_function_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_function_body([NotNull] CSharpParser.Local_function_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLabeled_Statement([NotNull] CSharpParser.Labeled_StatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitEmbedded_statement([NotNull] CSharpParser.Embedded_statementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitTheEmptyStatement([NotNull] CSharpParser.TheEmptyStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitExpressionStatement([NotNull] CSharpParser.ExpressionStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitIfStatement([NotNull] CSharpParser.IfStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSwitchStatement([NotNull] CSharpParser.SwitchStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitWhileStatement([NotNull] CSharpParser.WhileStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitDoStatement([NotNull] CSharpParser.DoStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitForStatement([NotNull] CSharpParser.ForStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitForeachStatement([NotNull] CSharpParser.ForeachStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitBreakStatement([NotNull] CSharpParser.BreakStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitContinueStatement([NotNull] CSharpParser.ContinueStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitGotoStatement([NotNull] CSharpParser.GotoStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitReturnStatement([NotNull] CSharpParser.ReturnStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitThrowStatement([NotNull] CSharpParser.ThrowStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitTryStatement([NotNull] CSharpParser.TryStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitCheckedStatement([NotNull] CSharpParser.CheckedStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitUncheckedStatement([NotNull] CSharpParser.UncheckedStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLockStatement([NotNull] CSharpParser.LockStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitUsingStatement([NotNull] CSharpParser.UsingStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitYieldStatement([NotNull] CSharpParser.YieldStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitUnsafeStatement([NotNull] CSharpParser.UnsafeStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFixedStatement([NotNull] CSharpParser.FixedStatementContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitBlock([NotNull] CSharpParser.BlockContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_variable_declaration([NotNull] CSharpParser.Local_variable_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_variable_type([NotNull] CSharpParser.Local_variable_typeContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_variable_declarator([NotNull] CSharpParser.Local_variable_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_variable_initializer([NotNull] CSharpParser.Local_variable_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLocal_constant_declaration([NotNull] CSharpParser.Local_constant_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitIf_body([NotNull] CSharpParser.If_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSwitch_section([NotNull] CSharpParser.Switch_sectionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSwitch_label([NotNull] CSharpParser.Switch_labelContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitCase_guard([NotNull] CSharpParser.Case_guardContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitStatement_list([NotNull] CSharpParser.Statement_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFor_initializer([NotNull] CSharpParser.For_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFor_iterator([NotNull] CSharpParser.For_iteratorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitCatch_clauses([NotNull] CSharpParser.Catch_clausesContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSpecific_catch_clause([NotNull] CSharpParser.Specific_catch_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitGeneral_catch_clause([NotNull] CSharpParser.General_catch_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitException_filter([NotNull] CSharpParser.Exception_filterContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFinally_clause([NotNull] CSharpParser.Finally_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitResource_acquisition([NotNull] CSharpParser.Resource_acquisitionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitQualified_identifier([NotNull] CSharpParser.Qualified_identifierContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitExtern_alias_directives([NotNull] CSharpParser.Extern_alias_directivesContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitExtern_alias_directive([NotNull] CSharpParser.Extern_alias_directiveContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitUsingAliasDirective([NotNull] CSharpParser.UsingAliasDirectiveContext context)
        {
            throw new NotImplementedException();
        }

   

        public ISymbolNode VisitUsingStaticDirective([NotNull] CSharpParser.UsingStaticDirectiveContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitQualified_alias_member([NotNull] CSharpParser.Qualified_alias_memberContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitType_parameter_list([NotNull] CSharpParser.Type_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitType_parameter([NotNull] CSharpParser.Type_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitClass_base([NotNull] CSharpParser.Class_baseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterface_type_list([NotNull] CSharpParser.Interface_type_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitType_parameter_constraints_clauses([NotNull] CSharpParser.Type_parameter_constraints_clausesContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitType_parameter_constraints_clause([NotNull] CSharpParser.Type_parameter_constraints_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitType_parameter_constraints([NotNull] CSharpParser.Type_parameter_constraintsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitPrimary_constraint([NotNull] CSharpParser.Primary_constraintContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSecondary_constraints([NotNull] CSharpParser.Secondary_constraintsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitConstructor_constraint([NotNull] CSharpParser.Constructor_constraintContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitConstant_declarators([NotNull] CSharpParser.Constant_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitConstant_declarator([NotNull] CSharpParser.Constant_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitReturn_type([NotNull] CSharpParser.Return_typeContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMember_name([NotNull] CSharpParser.Member_nameContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMethod_body([NotNull] CSharpParser.Method_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFormal_parameter_list([NotNull] CSharpParser.Formal_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFixed_parameters([NotNull] CSharpParser.Fixed_parametersContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFixed_parameter([NotNull] CSharpParser.Fixed_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitParameter_modifier([NotNull] CSharpParser.Parameter_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitParameter_array([NotNull] CSharpParser.Parameter_arrayContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAccessor_declarations([NotNull] CSharpParser.Accessor_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitGet_accessor_declaration([NotNull] CSharpParser.Get_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitSet_accessor_declaration([NotNull] CSharpParser.Set_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAccessor_modifier([NotNull] CSharpParser.Accessor_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAccessor_body([NotNull] CSharpParser.Accessor_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitEvent_accessor_declarations([NotNull] CSharpParser.Event_accessor_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAdd_accessor_declaration([NotNull] CSharpParser.Add_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitRemove_accessor_declaration([NotNull] CSharpParser.Remove_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitOverloadable_operator([NotNull] CSharpParser.Overloadable_operatorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitConversion_operator_declarator([NotNull] CSharpParser.Conversion_operator_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitConstructor_initializer([NotNull] CSharpParser.Constructor_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitBody([NotNull] CSharpParser.BodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitStruct_interfaces([NotNull] CSharpParser.Struct_interfacesContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitStruct_body([NotNull] CSharpParser.Struct_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitStruct_member_declaration([NotNull] CSharpParser.Struct_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitArray_type([NotNull] CSharpParser.Array_typeContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitRank_specifier([NotNull] CSharpParser.Rank_specifierContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitArray_initializer([NotNull] CSharpParser.Array_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitVariant_type_parameter_list([NotNull] CSharpParser.Variant_type_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitVariant_type_parameter([NotNull] CSharpParser.Variant_type_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitVariance_annotation([NotNull] CSharpParser.Variance_annotationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterface_base([NotNull] CSharpParser.Interface_baseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterface_body([NotNull] CSharpParser.Interface_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterface_member_declaration([NotNull] CSharpParser.Interface_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterface_accessors([NotNull] CSharpParser.Interface_accessorsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitEnum_base([NotNull] CSharpParser.Enum_baseContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitEnum_body([NotNull] CSharpParser.Enum_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitEnum_member_declaration([NotNull] CSharpParser.Enum_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitGlobal_attribute_section([NotNull] CSharpParser.Global_attribute_sectionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitGlobal_attribute_target([NotNull] CSharpParser.Global_attribute_targetContext context)
        {
            throw new NotImplementedException();
        }

  

        public ISymbolNode VisitAttribute_list([NotNull] CSharpParser.Attribute_listContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAttribute([NotNull] CSharpParser.AttributeContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitAttribute_argument([NotNull] CSharpParser.Attribute_argumentContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitPointer_type([NotNull] CSharpParser.Pointer_typeContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFixed_pointer_declarators([NotNull] CSharpParser.Fixed_pointer_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFixed_pointer_declarator([NotNull] CSharpParser.Fixed_pointer_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFixed_pointer_initializer([NotNull] CSharpParser.Fixed_pointer_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitFixed_size_buffer_declarator([NotNull] CSharpParser.Fixed_size_buffer_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitStackalloc_initializer([NotNull] CSharpParser.Stackalloc_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitRight_arrow([NotNull] CSharpParser.Right_arrowContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitRight_shift([NotNull] CSharpParser.Right_shiftContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitRight_shift_assignment([NotNull] CSharpParser.Right_shift_assignmentContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitLiteral([NotNull] CSharpParser.LiteralContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitBoolean_literal([NotNull] CSharpParser.Boolean_literalContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitString_literal([NotNull] CSharpParser.String_literalContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterpolated_regular_string([NotNull] CSharpParser.Interpolated_regular_stringContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterpolated_verbatium_string([NotNull] CSharpParser.Interpolated_verbatium_stringContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterpolated_regular_string_part([NotNull] CSharpParser.Interpolated_regular_string_partContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterpolated_verbatium_string_part([NotNull] CSharpParser.Interpolated_verbatium_string_partContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterpolated_string_expression([NotNull] CSharpParser.Interpolated_string_expressionContext context)
        {
            throw new NotImplementedException();
        }


        public ISymbolNode VisitStruct_definition([NotNull] CSharpParser.Struct_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitInterface_definition([NotNull] CSharpParser.Interface_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitEnum_definition([NotNull] CSharpParser.Enum_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitDelegate_definition([NotNull] CSharpParser.Delegate_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitEvent_declaration([NotNull] CSharpParser.Event_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitProperty_declaration([NotNull] CSharpParser.Property_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitConstant_declaration([NotNull] CSharpParser.Constant_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitIndexer_declaration([NotNull] CSharpParser.Indexer_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitDestructor_definition([NotNull] CSharpParser.Destructor_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitConstructor_declaration([NotNull] CSharpParser.Constructor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMethod_declaration([NotNull] CSharpParser.Method_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMethod_member_name([NotNull] CSharpParser.Method_member_nameContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitOperator_declaration([NotNull] CSharpParser.Operator_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitArg_declaration([NotNull] CSharpParser.Arg_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitMethod_invocation([NotNull] CSharpParser.Method_invocationContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitObject_creation_expression([NotNull] CSharpParser.Object_creation_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitChildren(IRuleNode node)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitTerminal(ITerminalNode node)
        {
            throw new NotImplementedException();
        }

        public ISymbolNode VisitErrorNode(IErrorNode node)
        {
            throw new NotImplementedException();
        }
    }
    #endregion

}