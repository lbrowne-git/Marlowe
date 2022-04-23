using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using Marlowe.Utilities;
using System.Reflection;
using System.Linq;
using Antlr4.Runtime;
using System.Collections.Generic;

namespace Marlowe.CSharp
{

    ///<summary>
    ///     The CSharpVisitor provides a way of accessing the data analysed by the CSharpParser. 
    ///     This is done by analysing the context generated from thhe parser to perform sythnaxical
    ///     analysis on these contexts.This allows for the creation of a symbol tree from the source code.
    /// </summary>
    public class CSharpVisitor : SymbolTable, ICSharpVisitor<SymbolNode>
    { 

        private Type VarType = default(Type);
        public string ClassName;
        public string Namespace;
        private string Accessbility;
        private string VarName = "";
        public EntryPointCriteria criteria = new EntryPointCriteria();
        private SymbolNode VisitorSymbolNode;
        private bool FunctionCall = false;
        private Dictionary<string, SymbolNode> ParamaterSymbolNodes;

        public int OverFlowCounter { get; private set; }

        public SymbolNode Visit(IParseTree tree){return null;}


        //Entry point into parser generated context.
         //   References:
         //       BYTE_ORDER_MARK? extern_alias_directives? using_directives?
         //       global_attribute_section* namespace_member_declarations? EOF
        public SymbolNode VisitCompilation_unit([NotNull] CSharpParser.Compilation_unitContext context)
        {
            if (context.BYTE_ORDER_MARK() != null)
            {
                Variables[context.BYTE_ORDER_MARK().GetText()] = new SymbolVariableNode() { Variable = context.BYTE_ORDER_MARK() };
            }

            if (context.global_attribute_section().Length > 0)
            {
                foreach (var globalContext in context.global_attribute_section())
                {
                    VisitGlobal_attribute_section(globalContext);
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
        public SymbolNode VisitNamespace_member_declarations([NotNull] CSharpParser.Namespace_member_declarationsContext context)
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
        public SymbolNode VisitNamespace_member_declaration([NotNull] CSharpParser.Namespace_member_declarationContext context)
        {

            if (context.namespace_declaration() != null){
                VisitNamespace_declaration(context.namespace_declaration());
            }
            else if (context.type_declaration() != null){
                VisitType_declaration(context.type_declaration());
            }
            return null;        
        }

        public SymbolNode VisitNamespace_declaration([NotNull] CSharpParser.Namespace_declarationContext context)
        {
            if (context.NAMESPACE() != null)
            {
                if(context.qualified_identifier().identifier() != null)
                {
                    VisitQualified_identifier(context.qualified_identifier());
                }
                if (context.namespace_body() != null)
                {
                    VisitNamespace_body(context.namespace_body());
                }
            }
            return default;
        }

        public SymbolNode VisitQualified_identifier([NotNull] CSharpParser.Qualified_identifierContext context)
        {
            if(context.identifier().Length == 1){
                Namespace = (string)VisitIdentifier(context.identifier()[0]);
            }
            else if(context.identifier().Length > 1)
            {
                Namespace =  (string)VisitIdentifier(context.identifier()[0]);
                for (int i = 1; i < context.identifier().Length; i++){
                    Namespace += "." + VisitIdentifier(context.identifier()[i]);
                }
            }
            return null;
        }

        public SymbolNode VisitNamespace_body([NotNull] CSharpParser.Namespace_bodyContext context)
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
        public SymbolNode VisitClass_definition([NotNull] CSharpParser.Class_definitionContext context)
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
            ClassName = " "; // End of Class

            return default;
        }
        //class_body
	        //: OPEN_BRACE class_member_declarations? CLOSE_BRACE
        public SymbolNode VisitClass_body([NotNull] CSharpParser.Class_bodyContext context){

            if (context.OPEN_BRACE() != null){
                if (context.CLOSE_BRACE() != null)
                {

                    if (context.class_member_declarations() != null)
                    {
                        VisitClass_member_declarations(context.class_member_declarations());
                    }
                }
                else
                {
                    throw new Exception($"No closing brace for class {ClassName}");

                }
            }
            else
            {
                throw new Exception($"No opening brace for class {ClassName}");

            }
            return null;       
        }

        public SymbolNode VisitClass_member_declarations([NotNull] CSharpParser.Class_member_declarationsContext context)
        {
            foreach (var member_DeclarationContext in context.class_member_declaration()){
                VisitClass_member_declaration(member_DeclarationContext);
            }
            return null;      
        }
        //class_member_declaration
	        //: attributes? all_member_modifiers? (common_member_declaration | destructor_definition)
        public SymbolNode VisitClass_member_declaration([NotNull] CSharpParser.Class_member_declarationContext context){
            if (context.attributes() != null){
                VisitAttributes(context.attributes());
            }
            if(context.all_member_modifiers() != null)
            {
                VisitAll_member_modifiers(context.all_member_modifiers());
            }
            if (context.common_member_declaration() is { } cmd){
                return VisitCommon_member_declaration(cmd);
            }
            else if (context.destructor_definition() != null)
            {
                return VisitDestructor_definition(context.destructor_definition());
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
        public SymbolNode VisitCommon_member_declaration([NotNull] CSharpParser.Common_member_declarationContext context)
        {
            if (context.typed_member_declaration() != null) {
                VisitTyped_member_declaration(context.typed_member_declaration());
            }
            else if (context.class_definition() != null) { 
                VisitClass_definition(context.class_definition());
            }
            else if(context.method_declaration() != null)
            {
                VisitMethod_declaration(context.method_declaration());
            }
            else
            {
                if(context.GetText() != "")
                {
                    // Grammar Missing implementation for already existing 
                    if (Variables.ContainsKey(context.GetText())){
                    }
                    else
                    {
                        throw new Exception($"Error with delcaring {context.GetText()}, missing value");
                    }
                }
                
                
            }

            return null;
        }

        #endregion

        #region Variable

        // typed_member_declaration
	        // : (REF | READONLY REF | REF READONLY)? type_
            //   (namespace_or_type_name '.' indexer_declaration
	        //   | method_declaration
	        //   | property_declaration
	        //   | indexer_declaration
	        //   | operator_declaration
	        //   | field_declaration)
            //             
        public SymbolNode VisitTyped_member_declaration([NotNull] CSharpParser.Typed_member_declarationContext context)
        {
            if (context.type_() != null)
            {
                VisitType_(context.type_());
                if (context.namespace_or_type_name() != null)
                {
                    if (context.DOT() != null)
                    {
                        VisitNamespace_or_type_name(context.namespace_or_type_name());
                        if (context.indexer_declaration() != null)
                        {
                            VisitIndexer_declaration(context.indexer_declaration());
                        }
                        else
                        {
                            throw new Exception($"Mising sub namespace for ${Namespace}");
                        }
                    }
                }
                else if (context.method_declaration() != null)
                {
                    return VisitMethod_declaration(context.method_declaration());
                }
                else if (context.field_declaration() != null)
                {
                    return VisitField_declaration(context.field_declaration());
                }
            }
            return null;      
        }
       public SymbolNode VisitField_declaration([NotNull] CSharpParser.Field_declarationContext context)
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

        public SymbolNode VisitVariable_declarators([NotNull] CSharpParser.Variable_declaratorsContext context){
            foreach (var variableContext in context.variable_declarator()){
                
                VisitVariable_declarator(variableContext);
                // ',' value declaration NEEDS to be implemented
            }
            return null;  
        }

         //       variable_declarator
	    //: identifier('=' variable_initializer)?
	    //;
        public SymbolNode VisitVariable_declarator([NotNull] CSharpParser.Variable_declaratorContext context)
        {
            if(context.identifier() != null)
            {
                if(context.variable_initializer() == null){
                    VisitIdentifier(context.identifier());
                    Variables[VisitIdentifier(context.identifier()).ToString()] = new SymbolVariableNode()
                    {// Blank Symbol Value for no variable assignment
                        ClassName = ClassName,
                        Namespace = Namespace,
                        Type = VarType,
                        RuleContext = context.variable_initializer()
                    }; 
                }
                else
                {
                    if(context.ASSIGNMENT() != null){
                        Variables[VisitIdentifier(context.identifier()).ToString()] = VisitVariable_initializer(context.variable_initializer());
                    }
                    else
                    {
                        throw new Exception($"error handling assignment:\t {context.Start.Line},{context.Start.Column}");
                    }
                }
            }
            return null;  
        }


         //       variable_initializer
	        //: expression
	        //| array_initializer
	        //;
        public SymbolNode VisitVariable_initializer([NotNull] CSharpParser.Variable_initializerContext context){
            if(context.expression() != null){
                return VisitExpression(context.expression());
            }

            // Will Handle Arrays Another Time
            return null;   
        }

        #endregion

        #region Methods

        //   method_declaration
        //: method_member_name type_parameter_list? OPEN_PARENS formal_parameter_list? CLOSE_PARENS
        //       type_parameter_constraints_clauses? (method_body | right_arrow throwable_expression ';')
        //;
        public SymbolNode VisitMethod_declaration([NotNull] CSharpParser.Method_declarationContext context)
        {
            if (context.OPEN_PARENS() != null)
            {
                if (context.CLOSE_PARENS() != null)
                {
                    if (context.method_member_name() != null)
                    {
                        //  Call to System Member Functions Needs to be handled here
                        if (context.method_body() != null)
                        {
                            if (criteria.EntryPointFound())
                            {
                                VisitMethod_body(context.method_body());
                            }
                            SymbolFunctionNode functionNode = null;
                            if (context.formal_parameter_list() != null)
                            {
                                functionNode = (SymbolFunctionNode)VisitFormal_parameter_list(context.formal_parameter_list());
                            }
                            else
                            {
                                functionNode = new SymbolFunctionNode()
                                {
                                    ClassName = ClassName,
                                    Variable = null,
                                    Namespace = Namespace,
                                    Type = VarType
                                };             
                            }
                            functionNode.RuleContext = context.method_body();
                            Functions[(string)VisitIdentifier(context.method_member_name().identifier()[0])] = functionNode;
                        }
                        else
                        {
                            throw new Exception($"No body for function");
                        }
                    }
                }
            }
            else
            {
                throw new Exception($"method is missing openning paranethesis");
            }
            return null;
        }

        public SymbolNode VisitFormal_parameter_list([NotNull] CSharpParser.Formal_parameter_listContext context)
        {
            if(context.parameter_array() != null)
            {
                VisitParameter_array(context.parameter_array());
            }
            else if(context.fixed_parameters() != null)
            {
                if(context.COMMA() != null)
                {
                    // paramatars of arrays
                    return null;
                }
                else
                {
                    return VisitFixed_parameters(context.fixed_parameters());
                }
            }
            return null;

        }

        /// <summary>
        ///     As a method can have multiple paramaters the <see cref="SymbolFunctionNode"/> must be created
        ///     on this level, as to ensure that it store the collection of paramaters.
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public SymbolNode VisitFixed_parameters([NotNull] CSharpParser.Fixed_parametersContext context)
        {
            if(context.fixed_parameter().Length != 0)
            {
                SymbolFunctionNode functionNode = new SymbolFunctionNode()
                {
                    ClassName = ClassName,
                    Namespace = Namespace,
                    Type = VarType,
                    Variable = null,
                };
                if(context.fixed_parameter().Length == 1)
                {
                    SymbolNode fixedparamNode = VisitFixed_parameter(context.fixed_parameter()[0]);
                    functionNode.Paramaters[VarName] = fixedparamNode;
                }
                else
                {
                    foreach(var obj in context.fixed_parameter())
                    {
                        SymbolNode fixedparamNode = VisitFixed_parameter(obj);
                        functionNode.Paramaters[VarName] = fixedparamNode;
                    }
                }
                return functionNode;
            }
            return null;
        }
        public SymbolNode VisitFixed_parameter([NotNull] CSharpParser.Fixed_parameterContext context)
        {
            if(context.ARGLIST() != null)
            {
                // return something related to the arglist
                return null;
            }
            else if(context.arg_declaration() != null){
                if(context.parameter_modifier() != null)
                { //handling for REF & This
                    Accessbility =(string)VisitParameter_modifier(context.parameter_modifier()).Variable;
                    return VisitArg_declaration(context.arg_declaration());
                }
                else if(context.attributes() != null)
                {
                    //VisitorSymbolNode = VisitAttributes(context.attributes());
                    // or
                    return VisitArg_declaration(context.arg_declaration());
                }
                else
                {
                    return VisitArg_declaration(context.arg_declaration());
                }
            }
            return null;
        }
        public SymbolNode VisitArg_declaration([NotNull] CSharpParser.Arg_declarationContext context)
        {
            SymbolNode paramaterSymbol;
            if(context.type_() != null)
            {
                if(context.identifier() != null)
                {
                    VarName = (string)VisitIdentifier(context.identifier());
                    VisitType_(context.type_());
                    if(context.expression() != null && context.ASSIGNMENT() != null)
                    {
                        paramaterSymbol = VisitExpression(context.expression());
                    }
                    else
                    {
                        paramaterSymbol = new SymbolVariableNode()
                        {
                            ClassName = ClassName,
                            Namespace = Namespace,
                            Type = VarType,
                        };
                    }
                    return paramaterSymbol;
                    
                }
                else
                {
                    throw new Exception($"function paramater missing for:{context.Start.Line}, {context.Start.Column}" );
                }
            }
            else
            {
                throw new Exception($"no type specified for paramater at line:{context.Start.Line}, {context.Start.Column}");
            }
        }

        public SymbolNode VisitMethod_body([NotNull] CSharpParser.Method_bodyContext context)
        {
            if (context.block() != null)
            {
                return VisitBlock(context.block());
            }
            else if (context.SEMICOLON() != null)
            {
                return null;
            }
            else
            {
                return null;
            }
        }

        public SymbolNode VisitBlock([NotNull] CSharpParser.BlockContext context)
        {
            if (context.OPEN_BRACE() != null)
            {
                if (context.CLOSE_BRACE() != null)
                {
                    if (context.statement_list() != null)
                    {
                        return VisitStatement_list(context.statement_list());
                    }
                    else
                    {
                        return null;
                    }
                }
                else
                {
                    throw new Exception($"Missing closing brace for ");
                }
            }
            else
            {
                throw new Exception($"Missing closing brace to function");
            }
        }

        public SymbolNode VisitStatement_list([NotNull] CSharpParser.Statement_listContext context)
        {
            if (context.statement().Length >= 1)
            {
                foreach (var statement_context in context.statement())
                {
                    if (FunctionCall){ 
                        //This is required for function calls to return a SymbolNode.
                        return VisitStatement(statement_context);
                    }
                    VisitStatement(statement_context);

                }
            }
            return null;
        }
        //   statement
        //: labeled_Statement
        //| declarationStatement
        //| embedded_statement
        //;
        public SymbolNode VisitStatement([NotNull] CSharpParser.StatementContext context)
        {
            if (context.labeled_Statement() != null)
            {
                return VisitLabeled_Statement(context.labeled_Statement());
            }
            if (context.declarationStatement() != null)
            {
                return VisitDeclarationStatement(context.declarationStatement());
            }
            else if (context.embedded_statement() != null)
            {
                return VisitEmbedded_statement(context.embedded_statement());
            }
            else
            {
                return null;
            }
        }

        public SymbolNode VisitEmbedded_statement([NotNull] CSharpParser.Embedded_statementContext context)
        {
            if (context.block() != null)
            {
                return VisitBlock(context.block());
            }
            else if (context.simple_embedded_statement() != null)
            {
                return VisitSimple_embedded_statement(context.simple_embedded_statement());
            }
            else
            {
                return null;
            }
        }

        private SymbolNode VisitSimple_embedded_statement([NotNull] CSharpParser.Simple_embedded_statementContext context)
        {   // Contexts of Simple Embedded Statement extend this class and must be dynamcically cast. 
            switch (context)
            {
                case CSharpParser.TheEmptyStatementContext emptyStatemet:
                    return VisitTheEmptyStatement(emptyStatemet);
                case CSharpParser.ExpressionStatementContext statementContext:
                    return VisitExpressionStatement(statementContext);
                case CSharpParser.IfStatementContext ifContext:
                    return VisitIfStatement(ifContext);
                case CSharpParser.WhileStatementContext whileContext:
                    return VisitWhileStatement(whileContext);
                case CSharpParser.ReturnStatementContext returnContext:
                    return VisitReturnStatement(returnContext);
                default:
                    return null;
            }
        }

        #region Method Related Logical Operators

        public SymbolNode VisitExpressionStatement([NotNull] CSharpParser.ExpressionStatementContext context)
        {
            if (context.SEMICOLON() != null)
            {
                if (context.expression() != null)
                {
                    return VisitExpression(context.expression());
                }
                else
                {
                    throw new Exception($"no expression on line:{context.Start.Line},{context.Start.Column}");
                }
            }
            else
            {
                throw new Exception($"missing semicolon on line:{context.Start.Line},{context.Start.Column}");
            }
        }


        public SymbolNode VisitReturnStatement([NotNull] CSharpParser.ReturnStatementContext context)
        {
            if (context.RETURN() != null)
            {
                if (context.SEMICOLON() != null)
                {
                    return VisitExpression(context.expression());
                }
                
            }
            return null;
        }
        public SymbolNode VisitIfStatement([NotNull] CSharpParser.IfStatementContext context)
        {
            if(context.IF() != null)
            {
                if(context.OPEN_PARENS() != null)
                {
                    if(context.CLOSE_PARENS() != null)
                    {
                        if(context.expression() != null)
                        {
                            object ifOperation = VisitExpression(context.expression()).Variable;
                            if (ifOperation.Equals(true))
                            {
                                return VisitIf_body(context.if_body(0));
                            }
                            else if (!ifOperation.Equals(true))
                            {
                                if (context.ELSE() != null)
                                {
                                    return VisitIf_body(context.if_body(1));
                                }
                                else
                                {
                                    return null;
                                }
                            }
                            else
                            {
                                throw new Exception($"If operation cannot be used to perform logical validation.");
                            }
                        }
                        else
                        {
                            throw new Exception($"If statment missing logical operation");
                        }

                    }
                    else
                    {
                        throw new Exception($"Missing closing parentheses");
                    }
                }
                else
                {
                    throw new Exception($"Missing opening parentheses");
                }
            }
            else
            {
                throw new Exception($"Missing Keyword IF");
            }
        }

        public SymbolNode VisitIf_body([NotNull] CSharpParser.If_bodyContext context)
        {
            if(context.block() != null)
            {
                return VisitBlock(context.block());
            }
            else if(context.simple_embedded_statement() != null)
            {
                return VisitSimple_embedded_statement(context.simple_embedded_statement());
            }
            else
            {
                throw new Exception($"error handling if statement");
            }
        }



        #endregion
        public SymbolNode VisitLabeled_Statement([NotNull] CSharpParser.Labeled_StatementContext context)
        {
            if (context.identifier() != null)
            {
                object value = context.identifier().GetText();
                return VisitorSymbolNode = new SymbolFunctionNode()
                {
                    ClassName = ClassName,
                    Namespace = Namespace,
                    Type = VarType,
                    Variable = value,
                };

            }
            else
            {
                return null;
            }
        }
        public SymbolNode VisitMethod_member_name([NotNull] CSharpParser.Method_member_nameContext context)
        {
            if (context.identifier().Length > 1)
            {
                return null;
            }
            else if (context.identifier().Length == 1)
            {
                try
                {
                    VisitorSymbolNode.Variable = VisitIdentifier(context.identifier()[0]);

                }
                catch
                {
                }
                return null;
            }
            else
            {
                return null;
            }
        }


        #region declaration
        //declarationStatement
        // : local_variable_declaration ';'
        // | local_constant_declaration ';'
        // | local_function_declaration
        // ;
        public SymbolNode VisitDeclarationStatement([NotNull] CSharpParser.DeclarationStatementContext context)
        {
            if (context.SEMICOLON() != null)
            {
                if (context.local_variable_declaration() != null)
                {
                    return VisitLocal_variable_declaration(context.local_variable_declaration());
                }
                else if (context.local_constant_declaration() != null)
                {
                    return VisitLocal_constant_declaration(context.local_constant_declaration());
                }
            }
            else if (context.local_function_declaration() != null)
            {
                return VisitLocal_function_declaration(context.local_function_declaration());
            }
            else
            {
                throw new Exception($"missing semicolon");
            }
            return null;
        }

        //local_variable_declaration
        // (USING | REF | REF READONLY)? local_variable_type local_variable_declarator( ','  local_variable_declarator { this.IsLocalVariableDeclaration() }? )*
        // | FIXED pointer_type fixed_pointer_declarators
        // ;
        public SymbolNode VisitLocal_variable_declaration([NotNull] CSharpParser.Local_variable_declarationContext context)
        {
            if (context.USING() != null || context.REF() != null || (context.READONLY() != null && context.REF() != null))
            {
                // Beyond scope of interpeter
            }
            if (context.local_variable_type() != null)
            {
                
                // Sets the type of assignment
                VisitLocal_variable_type(context.local_variable_type());
                if (context.local_variable_declarator() != null)
                {
                    foreach (var variable in context.local_variable_declarator())
                    {   //allows for the creation of multipe variables if comma is present
                        VisitLocal_variable_declarator(variable);
                    }
                    return null;
                }
                else
                {
                    throw new Exception($"variable declarator missing");
                }
            }
            else
            {
                throw new Exception($"variable type missing");
            }
        }

        //local_variable_declarator
        // : identifier('=' REF? local_variable_initializer)?
        // ;
        public SymbolNode VisitLocal_variable_declarator([NotNull] CSharpParser.Local_variable_declaratorContext context)
        {
            if (context.identifier() != null)
            {
                if (context.ASSIGNMENT() != null)
                {
                    if (context.local_variable_initializer() != null)
                    {
                        Variables[(string)VisitIdentifier(context.identifier())] = VisitLocal_variable_initializer(context.local_variable_initializer());
                        //return VisitLocal_variable_initializer(context.local_variable_initializer()); 
                    }
                    else
                    {

                    }
                }
            }
            else
            {
            }
            return null;

        }

        //   local_variable_initializer
        //: expression
        //| array_initializer
        //| stackalloc_initializer
        //;
        public SymbolNode VisitLocal_variable_initializer([NotNull] CSharpParser.Local_variable_initializerContext context)
        {
            if (context.expression() != null)
            {
                return VisitExpression(context.expression());
            }
            else if (context.array_initializer() != null)
            {
                return VisitArray_initializer(context.array_initializer());
            }
            else if (context.stackalloc_initializer() != null)
            {
                return VisitStackalloc_initializer(context.stackalloc_initializer());
            }
            else
            {
                return null;
            }
        }
        #endregion

        #endregion

        #region Expression & Assignment

        //expression
        //: assignment
        //| non_assignment_expression
        //| REF non_assignment_expression
        //   ;
        public SymbolNode VisitExpression([NotNull] CSharpParser.ExpressionContext context){
            if(context.assignment() != null){

        



                VisitorSymbolNode = VisitAssignment(context.assignment());
                if (FunctionCall)
                {
                    if (ParamaterSymbolNodes.Count > 0) {
                        var firstParam = ParamaterSymbolNodes.First();
                        Variables.Add(firstParam.Key, firstParam.Value);
                        ParamaterSymbolNodes.Remove(firstParam.Key);
                        Variables[firstParam.Key].Variable = context.Start.Text;
                    }
                    Console.WriteLine(VisitorSymbolNode);
                }
                // Function Calls are stored for execution when entrypoint is found.
                if (VisitorSymbolNode is SymbolFunctionNode && criteria.EntryPointFound())
                {
                    VisitorSymbolNode.Variable = HandleFunctionCall((SymbolFunctionNode)VisitorSymbolNode);
                    // This must be cast back to a variable node to handled by the logger
                }

                VisitorSymbolNode.ClassName = ClassName;
                VisitorSymbolNode.Type = VarType;
                VisitorSymbolNode.Namespace = Namespace;
                return VisitorSymbolNode;
            }
            if (context.non_assignment_expression() != null){

                // The paramaters in the function call are stored in the context



                VisitorSymbolNode = VisitNon_assignment_expression(context.non_assignment_expression());
                if (VisitorSymbolNode is SymbolFunctionNode && criteria.EntryPointFound())
                {



                    //      This catches infinte method calling that may occur when
                    //          a variable and a function share the same name.
                    if (FunctionCall)
                    {
                        if (OverFlowCounter >= 100)
                        {
                            OverFlowCounter = 0;
                            return VisitorSymbolNode;
                        }
                        else
                        {
                            OverFlowCounter++;
                        }
                    }

                    VisitorSymbolNode.Variable = HandleFunctionCall((SymbolFunctionNode)VisitorSymbolNode);
                }
                else if (FunctionCall && criteria.EntryPointFound())
                {
                    if (ParamaterSymbolNodes != null)
                    {
                        var firstParam = ParamaterSymbolNodes.First();
                        Variables.Add(firstParam.Key, firstParam.Value);
                        ParamaterSymbolNodes.Remove(firstParam.Key);
                        Variables[firstParam.Key] = VisitNon_assignment_expression(context.non_assignment_expression());
                    }
                    Console.WriteLine(VisitorSymbolNode);

                }

                return VisitorSymbolNode;
            }
            return null;    
        }

        private object HandleFunctionCallWithParamaters(SymbolFunctionNode functionNode, ParserRuleContext currentContext)
        {

            return null;
        }
 
        private object HandleFunctionCall(SymbolFunctionNode methodCall)
        {
            FunctionCall = true;
            ParamaterSymbolNodes = new Dictionary<string, SymbolNode>();
            foreach (var item in methodCall.Paramaters)
            {
                ParamaterSymbolNodes[item.Key] = item.Value;
            }
            VisitorSymbolNode = VisitMethod_body((CSharpParser.Method_bodyContext)methodCall.RuleContext);
            FunctionCall = false;
            foreach (var item in methodCall.Paramaters)
            {
                Variables.Remove(item.Key);
            }
            return VisitorSymbolNode.Variable;
        }

        public SymbolNode VisitNon_assignment_expression([NotNull] CSharpParser.Non_assignment_expressionContext context){
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
            return null;
        }

        public SymbolNode VisitConditional_expression([NotNull] CSharpParser.Conditional_expressionContext context)
        {
            
            if(context.null_coalescing_expression() != null)
            {
                return VisitNull_coalescing_expression(context.null_coalescing_expression());
            }
            return null;
        }

        public SymbolNode VisitNull_coalescing_expression([NotNull] CSharpParser.Null_coalescing_expressionContext context)
        {
            if(context.conditional_or_expression() != null)
            {
                return VisitConditional_or_expression(context.conditional_or_expression());
            }
            return null;
        }

        public SymbolNode VisitConditional_or_expression([NotNull] CSharpParser.Conditional_or_expressionContext context)
        {
            if(context.conditional_and_expression().Length > 1)
            {
                if(context.OP_OR() != null)
                {
                    SymbolNode LNode = VisitConditional_and_expression(context.conditional_and_expression()[0]);
                    bool RNode = (bool)VisitConditional_and_expression(context.conditional_and_expression()[1]).Variable;
                    if(RNode || (bool)LNode.Variable)
                    {
                        LNode.Variable = true;
                        return LNode;
                    }
                    else
                    {
                        LNode.Variable = false;
                        return LNode;
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
            return null;
        }


        public SymbolNode VisitConditional_and_expression([NotNull] CSharpParser.Conditional_and_expressionContext context)
        {
            if (context.inclusive_or_expression().Length > 1)
            {
                if (context.OP_AND() != null)
                {
                    SymbolNode LNode = VisitInclusive_or_expression(context.inclusive_or_expression()[0]);
                    SymbolNode RNode = VisitInclusive_or_expression(context.inclusive_or_expression()[1]);
                    return SemanticAnalyser.LogicalOperationExpression(LNode, RNode, SemanticAnalyser.Logical.AND);
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
            return null;
        }

        public SymbolNode VisitInclusive_or_expression([NotNull] CSharpParser.Inclusive_or_expressionContext context){
            if (context.exclusive_or_expression().Length > 1)
            {
                if (context.BITWISE_OR() != null)
                {
                    bool LNode = (bool)VisitExclusive_or_expression(context.exclusive_or_expression()[0]).Variable;
                    bool RNode = (bool)VisitExclusive_or_expression(context.exclusive_or_expression()[1]).Variable;
                    if (LNode || RNode){
                        return VisitExclusive_or_expression(context.exclusive_or_expression()[0]);
                    }
                }
                else{
                    return VisitExclusive_or_expression(context.exclusive_or_expression()[0]);
                }
            }
            else{
                return VisitExclusive_or_expression(context.exclusive_or_expression()[0]);
            }
            return null;
        }

        public SymbolNode VisitExclusive_or_expression([NotNull] CSharpParser.Exclusive_or_expressionContext context)
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
            return null;
        }

        public SymbolNode VisitAnd_expression([NotNull] CSharpParser.And_expressionContext context){
            
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
            return null;
        }

        public SymbolNode VisitEquality_expression([NotNull] CSharpParser.Equality_expressionContext context)
        {
            if (context.relational_expression().Length > 1)
            {
                if (context.OP_EQ() != null || context.OP_NE() != null)
                {
                    SymbolNode LNode = VisitRelational_expression(context.relational_expression()[0]);
                    SymbolNode RNode = VisitRelational_expression(context.relational_expression()[1]);
                    return SemanticAnalyser.LogicalOperationExpression(LNode, RNode, SemanticAnalyser.Logical.EQ);
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
            return null;
        }

        public SymbolNode VisitRelational_expression([NotNull] CSharpParser.Relational_expressionContext context){
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
            return null;
        }

        public SymbolNode VisitShift_expression([NotNull] CSharpParser.Shift_expressionContext context){
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
            return null;
        }

        public SymbolNode VisitAdditive_expression([NotNull] CSharpParser.Additive_expressionContext context)
        {
            if (context.multiplicative_expression().Length > 1)
            {
                if (context.MINUS() != null || context.PLUS() != null)
                {
                    SymbolNode LNode = VisitMultiplicative_expression(context.multiplicative_expression()[0]);
                    if(LNode is SymbolFunctionNode)
                    {
                        LNode.Variable = HandleFunctionCall((SymbolFunctionNode)LNode);
                    }
                    SymbolNode RNode = VisitMultiplicative_expression(context.multiplicative_expression()[1]);
                    if(RNode is SymbolFunctionNode)
                    {
                        RNode.Variable = HandleFunctionCall((SymbolFunctionNode)RNode);
                    }
                    if (context.PLUS().Length > 0){

                        VisitorSymbolNode = SemanticAnalyser.OperationExpression(LNode, RNode, SemanticAnalyser.Operators.PLUS);
                        VisitorSymbolNode.Type = VarType;
                    }
                    else if (context.MINUS().Length > 0){
                        
                        VisitorSymbolNode = SemanticAnalyser.OperationExpression(LNode, RNode, SemanticAnalyser.Operators.MINUS);
                        VisitorSymbolNode.Type = VarType;
                    }
                    else
                    {
                        VisitorSymbolNode = null;
                    }

                    if (SemanticAnalyser.IsCorrectVariableType(VisitorSymbolNode))
                    {
                        return VisitorSymbolNode;
                    }
                    else
                    {
                        return null;
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
        }

        public SymbolNode VisitMultiplicative_expression([NotNull] CSharpParser.Multiplicative_expressionContext context)
        {
            if (context.switch_expression().Length > 1)
            {
                if (context.STAR() != null || context.PERCENT() != null || context.DIV() != null)
                {
                    SymbolNode LNode = VisitSwitch_expression(context.switch_expression()[0]);
                    if (LNode is SymbolFunctionNode)
                    {
                        LNode.Variable = HandleFunctionCall((SymbolFunctionNode)LNode);
                    }
                    SymbolNode RNode = VisitSwitch_expression(context.switch_expression()[1]);
                    if (RNode is SymbolFunctionNode)
                    {
                        RNode.Variable = HandleFunctionCall((SymbolFunctionNode)RNode);
                    }
                    if (context.STAR().Length > 0)
                    {
                        VisitorSymbolNode = SemanticAnalyser.OperationExpression(LNode, RNode, SemanticAnalyser.Operators.MULT);
                        VisitorSymbolNode.Type = VarType;
                    }
                    else if (context.DIV().Length > 0)
                    {
                        VisitorSymbolNode = SemanticAnalyser.OperationExpression(LNode, RNode, SemanticAnalyser.Operators.DIV);
                        VisitorSymbolNode.Type = VarType;
                    }
                    else if(context.PERCENT().Length > 0)
                    {
                        VisitorSymbolNode = SemanticAnalyser.OperationExpression(LNode, RNode, SemanticAnalyser.Operators.MOD);
                        VisitorSymbolNode.Type = VarType;
                    }
                    else
                    {// clears visitor node
                        VisitorSymbolNode = null;
                    }

                    if (SemanticAnalyser.IsCorrectVariableType(VisitorSymbolNode))
                    {
                        return VisitorSymbolNode;
                    }
                    else
                    {
                        return null;
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
            return null;
        }
        public SymbolNode VisitSwitch_expression([NotNull] CSharpParser.Switch_expressionContext context)
        {
            if (context.range_expression() != null){
                if(context.SWITCH() != null){

                }
                else{
                    return VisitRange_expression(context.range_expression());
                }
            }
            else{
                return null;
            }
            return null;
        }

        public SymbolNode VisitRange_expression([NotNull] CSharpParser.Range_expressionContext context)
        {
            if(context.unary_expression().Length > 1)
            {

            }
            else{
                return VisitUnary_expression(context.unary_expression()[0]);
            }
            return null;
        }

        //       assignment
        //: unary_expression assignment_operator? expression
        //| unary_expression '??=' throwable_expression
        //;
        public SymbolNode VisitAssignment([NotNull] CSharpParser.AssignmentContext context){
            if (context.unary_expression() != null)
            {
                if(context.unary_expression() != null)
                {
                    if(context.assignment_operator() != null)
                    {
                        if(context.expression() != null)
                        {
                            // Ensures that the returned assignment exists within the same classs
                            VisitorSymbolNode = SearchSymbolTable(context.Start.Text,ClassName);
                            if(VisitorSymbolNode is null){
                                VisitorSymbolNode = VisitUnary_expression(context.unary_expression());
                            }
                            
                            if (VisitorSymbolNode is /*still*/ null)
                            {
                                throw new Exception($"Variable {context.Start.Text}({context.Start.Line},{context.Start.Column}) is not defined");   
                            }
                            VisitorSymbolNode.Variable = VisitExpression(context.expression());
                            return VisitorSymbolNode;
                        }
                        else
                        {
                            throw new Exception($"No expression after assignment operator:{context.Start.Line},{context.Start.Column}");
                        }
                    }
                    else
                    {
                        throw new Exception($"Missing assignment operator:{context.Start.Line},{context.Start.Column}");
                    }
                }
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
        public SymbolNode VisitUnary_expression([NotNull] CSharpParser.Unary_expressionContext context)
        {
            if(context.primary_expression() != null)
            {
                return VisitPrimary_expression(context.primary_expression());
            }


            return null;
        }

         //       primary_expression  
	        //: pe=primary_expression_start
        public SymbolNode VisitPrimary_expression([NotNull] CSharpParser.Primary_expressionContext context)
        {
            if(context.primary_expression_start() != null)
            {
                if(context.Start.Text != context.Stop.Text)
                {//Entering the primary expression context shaves the property being called by a class so checks must done here

                    bool memberAccess = false;
                    foreach (var child in context.children)
                    {
                        if(child is CSharpParser.Member_accessContext)
                        {
                            memberAccess = true;
                            break;
                        }
                    }

                    if (memberAccess)
                    {
                        string funcClass = context.children[0].GetText();
                        string classFunc = context.children[1].GetText().TrimStart('.');
                        VisitorSymbolNode =  SearchSymbolTable(classFunc, funcClass);
                        if(VisitorSymbolNode == null)
                        {
                            // VERY rudamentary implemention should be replaced with a far more verbose system.
                            if(funcClass == "Console" 
                               && (classFunc == "WriteLine"|| funcClass == "Write"))
                            {
                                Console.WriteLine(VisitMethod_invocation((CSharpParser.Method_invocationContext)context.children[2]).Variable);
                            }
                        }
                    }
                    else
                    {
                        return VisitPrimary_expression_start(context.primary_expression_start());
                    }
                }
                else
                {
                    return VisitPrimary_expression_start(context.primary_expression_start());
                }

            }
            return null;     
        }


        private bool AttemptExecutionOfDirectiveFunction(ParserRuleContext context)
        {
            foreach (var directive in Directives)
            {
                try
                {
                    Type MethodType = Type.GetType("System.Console");
                    Type[] typelist = GetTypesInNamespace(Assembly.GetAssembly(MethodType), "System");
                    MethodInfo method = MethodType.GetMethod("WriteLine", new Type[] { typeof(string) });
                    method.Invoke(this, new string[] { "argument value" });
                }
                catch{ 
                }
            }

            return false;

        }



        public SymbolNode VisitMethod_invocation([NotNull] CSharpParser.Method_invocationContext context)
        {
            if(context.argument_list() != null)
            {
                return VisitArgument_list(context.argument_list());
            }
            return null;
        }

        public SymbolNode VisitArgument_list([NotNull] CSharpParser.Argument_listContext context)
        {
            if(context.argument().Length > 1)
            {

            }
            else
            {
                return VisitArgument(context.argument()[0]);
            }
            return null;
        }

        public SymbolNode VisitArgument([NotNull] CSharpParser.ArgumentContext context)
        {
            if(context.identifier() != null)
            {
                if(context.COLON() != null)
                {
                    VisitExpression(context.expression());
                }
            }
            else if(context.expression() != null)
            {
                return VisitExpression(context.expression());
            }
            return null;
        }



        ///primary_expression_start
        /// : literal                                   #literalExpression
        /// | identifier type_argument_list?            #simpleNameExpression
        /// | OPEN_PARENS expression CLOSE_PARENS       #parenthesisExpressions
        /// | predefined_type                           #memberAccessExpression
        /// | qualified_alias_member                    #memberAccessExpression
        /// | LITERAL_ACCESS                            #literalAccessExpression
        /// | THIS                                      #thisReferenceExpression
        /// | BASE('.' identifier type_argument_list? | '[' expression_list ']') #baseAccessExpression
        /// | NEW(type_ (object_creation_expression
        ///              | object_or_collection_initializer
        ///              | '[' expression_list ']' rank_specifier* array_initializer?
        ///              | rank_specifier+ array_initializer)
        ///       | anonymous_object_initializer
        ///       | rank_specifier array_initializer)                       #objectCreationExpression
        /// | OPEN_PARENS argument( ',' argument )+ CLOSE_PARENS           #tupleExpression
        /// ;
        public SymbolNode VisitPrimary_expression_start([NotNull] CSharpParser.Primary_expression_startContext context) {
            string value = context.Start.Text;


            switch (context)
            {
                case CSharpParser.LiteralExpressionContext literalContext:
                    return VisitLiteralExpression(literalContext);

                case CSharpParser.SimpleNameExpressionContext simpleNameContext:
                    return VisitSimpleNameExpression(simpleNameContext);

                case CSharpParser.ParenthesisExpressionsContext paranthesisContext:
                    return VisitParenthesisExpressions(paranthesisContext);

                default:
                    if (Variables.ContainsKey(value))
                    {
                        VisitorSymbolNode = Variables[value];
                        return VisitorSymbolNode;
                    }
                    else
                    {

                        //if (value[0] == '"' && value[value.Length - 1] == '"'){ // String Handler
                        //    value = value.Substring(1, (value.Length - 2));
                        //}
                        VisitorSymbolNode = new SymbolVariableNode()
                        {
                            ClassName = ClassName,
                            Namespace = Namespace,
                            Type = VarType,
                            Variable = value
                        };
                        if (SemanticAnalyser.IsCorrectVariableType(VisitorSymbolNode)) // Casts the varaible to the type it was declared as
                        {

                            return VisitorSymbolNode;
                        }
                        else
                        {
                            throw new Exception($"error handling line{context.Start.Line},{context.Start.Column}");
                        }
                    }
            }
        }

        public SymbolNode VisitParenthesisExpressions([NotNull] CSharpParser.ParenthesisExpressionsContext context)
        {
            if(context.expression() != null)
            {
                VisitExpression(context.expression());
            }
            return null;
        }
        public SymbolNode VisitSimpleNameExpression([NotNull] CSharpParser.SimpleNameExpressionContext context)
        {
            if (context.identifier()!= null)
            {
                string existingObjectCall = (string)VisitIdentifier(context.identifier());
                VisitorSymbolNode =SearchSymbolTable(existingObjectCall,ClassName);


                if (criteria.EntryPointFound())
                {       //sample namespace direcetive code, will be used to call methods within methods.

                }
                return VisitorSymbolNode;
            }

            return null;
        }
        private Type[] GetTypesInNamespace(Assembly assembly, string nameSpace)
        {
            return assembly.GetTypes();
              //assembly.GetTypes()
              //        .Where(t => String.Equals(t.Namespace, nameSpace, StringComparison.Ordinal))
              //        .ToArray();
        }




        public SymbolNode VisitLiteralExpression([NotNull] CSharpParser.LiteralExpressionContext context)
        {
            if(context != null)
            {
                return VisitLiteral(context.literal());
            }
            else
            {
                return null;
            }

        }
        public SymbolNode VisitLiteral([NotNull] CSharpParser.LiteralContext context)
        {
            if(context.boolean_literal() != null)
            {
                return VisitBoolean_literal(context.boolean_literal());
            }
            else if(context.string_literal() != null)
            {
                return VisitString_literal(context.string_literal());
            }
            else if(context.INTEGER_LITERAL() != null)
            {
                VisitorSymbolNode = new SymbolVariableNode()
                { 
                    ClassName = ClassName,
                    Namespace = Namespace, 
                    Type = typeof(double),
                    Variable = context.Start.Text
                };
                if (SemanticAnalyser.IsCorrectVariableType(VisitorSymbolNode))
                {
                    return VisitorSymbolNode;
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }

        }


        public SymbolNode VisitBoolean_literal([NotNull] CSharpParser.Boolean_literalContext context)
        {
            bool boolLiteral = false;
            if(context.TRUE() != null)
            {
                boolLiteral = true;
                VarType = typeof(bool);
            }
            else if(context.FALSE() != null)
            {

            }
            else
            {
                throw new Exception($"Variable is not a valid boolean value {context.Start.Line},{context.Start.Column}");
            }
            return new SymbolVariableNode()
            {
                ClassName = ClassName,
                Namespace = Namespace,
                Type = VarType,
                Variable = boolLiteral
            };
        }

        public SymbolNode VisitString_literal([NotNull] CSharpParser.String_literalContext context)
        {
            if (context.interpolated_regular_string() != null)
            {
                return VisitInterpolated_regular_string(context.interpolated_regular_string());
            }
            else if (context.interpolated_verbatium_string() != null)
            {
                return VisitInterpolated_verbatium_string(context.interpolated_verbatium_string());
            }
            else
            {
                if (context.REGULAR_STRING() != null)
                {
                    if (SemanticAnalyser.isStringLiteral(context.Start.Text))
                    {//Validates input is string
                        VarType = typeof(string);
                        return new SymbolVariableNode()
                        {
                            ClassName = ClassName,
                            Namespace = Namespace,
                            Type = VarType,
                            Variable = context.Start.Text
                        };
                    }
                    else
                    {
                        throw new Exception($"Input {context.Start.Text}({context.Start.Line},{context.Start.Column} is not a valid string");
                    }
                }
                else if (context.VERBATIUM_STRING() != null)
                {
                    return null;
                }
                else
                {
                    return null;
                }
            }
        }




        #endregion

        #region Type

        //type_
        //: base_type('?' | rank_specifier | '*')*
        //;

        public SymbolNode VisitType_([NotNull] CSharpParser.Type_Context context)
        {
            if (context.base_type() != null) { 
                VisitBase_type(context.base_type());
            }
            return null;
        }

        // base_type
	        //: simple_type
	        //| class_type  // represents types: enum, class, interface, delegate, type_parameter
	        //| VOID '*'
	        //| tuple_type
	        //;
        public SymbolNode VisitBase_type([NotNull] CSharpParser.Base_typeContext context)
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

        public SymbolNode VisitClass_type([NotNull] CSharpParser.Class_typeContext context)
        {
            if(context.namespace_or_type_name() != null)
            {
                VisitNamespace_or_type_name(context.namespace_or_type_name());
            }
            else{
                switch (context.Start.Text)
                {
                    case "object":
                        VarType = typeof(object);
                        break;
                    case "string":
                        VarType = typeof(string);
                        break;
                    default:
                        VarType = default;
                        break;
                }
            }

            return null;
        }



        public SymbolNode VisitSimple_type([NotNull] CSharpParser.Simple_typeContext context)
        {
            if (context.numeric_type() != null)
            {
                VisitNumeric_type(context.numeric_type());
            }
            else if(context.BOOL() != null)
            {
                VarType = typeof(bool);
            }
            return null; 
        }

        public SymbolNode VisitNumeric_type([NotNull] CSharpParser.Numeric_typeContext context)
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
                VarType = typeof(decimal);
            }
            return null;
        }

        public SymbolNode VisitIntegral_type([NotNull] CSharpParser.Integral_typeContext context)
        {
            switch (context.Start.Text)
            {
                case "int":
                    VarType = typeof(int);
                    break;
                case "long":
                    VarType = typeof(long);
                    break;
                case "char":
                    VarType = typeof(char);
                    break;
                case "short":
                    VarType = typeof(short);
                    break;
                default:
                    break;
            }
            return null;
        }


        public SymbolNode VisitFloating_point_type([NotNull] CSharpParser.Floating_point_typeContext context)
        {
            if (context.DOUBLE() != null)
            {
                VarType = typeof(double);
            }
            else if(context.FLOAT() != null)
            {
                VarType = typeof(float);
            }
            return null;
        }




        //type_declaration
        // : attributes? all_member_modifiers?
        //  (class_definition | struct_definition | interface_definition | enum_definition | delegate_definition)
        public SymbolNode VisitType_declaration([NotNull] CSharpParser.Type_declarationContext context)
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
            else if (Variables.ContainsKey(context.Start.Text)){
                return Variables[context.Start.Text];
            }
            return default;
        }
        #endregion

        #region Attributes
        public SymbolNode VisitAttributes([NotNull] CSharpParser.AttributesContext context){
            foreach (var attribute in context.attribute_section()){
                VisitAttribute_section(attribute);
            }
            return null;      
        }
        public SymbolNode VisitAttribute_section([NotNull] CSharpParser.Attribute_sectionContext context){
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
        public SymbolNode VisitAttribute_target([NotNull] CSharpParser.Attribute_targetContext context)
        {
            if(context.keyword() != null)
            {
                VisitKeyword(context.keyword());
            }
            else if (Variables.ContainsKey(context.identifier().IDENTIFIER().GetText()))
            {
                return new SymbolVariableNode { ClassName = ClassName, Variable = context.identifier().IDENTIFIER().GetText(), Namespace = Namespace, Type = VarType };
            }
            else
            {
                throw new Exception("no data type specified");
            }
            return null;
        }
        public SymbolNode VisitKeyword([NotNull] CSharpParser.KeywordContext context)
        {
            if(context.Start.Text != null)
            {
                switch (context.Start.Text.ToLower())
                {
                    case "void":
                        VarType = typeof(void);
                        break;
                    case "class":
                        break;
                    case "string":
                        VarType = typeof(string);
                        break;
                    case "int":
                        VarType = typeof(int);
                        break;
                    case "public":
                    case "private":
                    case "protected":
                    case "readonly":
                    case "abstract":
                        Accessbility = context.Start.Text;
                        break;

                }
            }
            return null;
        }

        #endregion

        #region All Members
        public SymbolNode VisitAll_member_modifiers([NotNull] CSharpParser.All_member_modifiersContext context)
        {
            foreach (var MemberContext in context.all_member_modifier())
            {
                if (MemberContext != null){
                    VisitAll_member_modifier(MemberContext);
                }
            }
                return default;
        }

        public SymbolNode VisitAll_member_modifier([NotNull] CSharpParser.All_member_modifierContext context){

            if (!context.IsEmpty)
            {
                switch (context.Start.Text.ToLower())
                {
                    case "public":
                    case "private":
                    case "protected":
                    case "internal":
                        Accessbility = context.Start.Text;
                        break;
                    case "static":
                    case "abstract":
                    case "virtual":
                    case "override":

                    case "unsafe":
                    case "readonly":
                    case "volatile":
                        break;

                    default:
                        Accessbility = null;
                        break;
                }
            }
            return null;
        }
        #endregion

        #region Using Directives
        public SymbolNode VisitUsing_directives([NotNull] CSharpParser.Using_directivesContext context)
        {
            foreach (CSharpParser.Using_directiveContext usingContext in context.using_directive())
            {
                VisitUsingNamespaceDirective((CSharpParser.UsingNamespaceDirectiveContext)usingContext);
            }
            return default;
        }

        public SymbolNode VisitUsingNamespaceDirective([NotNull] CSharpParser.UsingNamespaceDirectiveContext context)
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
        public SymbolNode VisitNamespace_or_type_name([NotNull] CSharpParser.Namespace_or_type_nameContext context)
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
                    Directives[context.identifier(0).GetText()] = new SymbolVariableNode()
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
   


        public SymbolNode VisitTuple_type([NotNull] CSharpParser.Tuple_typeContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitTuple_element([NotNull] CSharpParser.Tuple_elementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitType_argument_list([NotNull] CSharpParser.Type_argument_listContext context)
        {
            throw new NotImplementedException();
        }



        public SymbolNode VisitAssignment_operator([NotNull] CSharpParser.Assignment_operatorContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSwitch_expression_arms([NotNull] CSharpParser.Switch_expression_armsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSwitch_expression_arm([NotNull] CSharpParser.Switch_expression_armContext context)
        {
            throw new NotImplementedException();
        }



        public SymbolNode VisitMemberAccessExpression([NotNull] CSharpParser.MemberAccessExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitLiteralAccessExpression([NotNull] CSharpParser.LiteralAccessExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitThisReferenceExpression([NotNull] CSharpParser.ThisReferenceExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitBaseAccessExpression([NotNull] CSharpParser.BaseAccessExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitObjectCreationExpression([NotNull] CSharpParser.ObjectCreationExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitTupleExpression([NotNull] CSharpParser.TupleExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitTypeofExpression([NotNull] CSharpParser.TypeofExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitCheckedExpression([NotNull] CSharpParser.CheckedExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitUncheckedExpression([NotNull] CSharpParser.UncheckedExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitDefaultValueExpression([NotNull] CSharpParser.DefaultValueExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAnonymousMethodExpression([NotNull] CSharpParser.AnonymousMethodExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSizeofExpression([NotNull] CSharpParser.SizeofExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitNameofExpression([NotNull] CSharpParser.NameofExpressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitThrowable_expression([NotNull] CSharpParser.Throwable_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitThrow_expression([NotNull] CSharpParser.Throw_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitMember_access([NotNull] CSharpParser.Member_accessContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitBracket_expression([NotNull] CSharpParser.Bracket_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitIndexer_argument([NotNull] CSharpParser.Indexer_argumentContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitPredefined_type([NotNull] CSharpParser.Predefined_typeContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitExpression_list([NotNull] CSharpParser.Expression_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitObject_or_collection_initializer([NotNull] CSharpParser.Object_or_collection_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitObject_initializer([NotNull] CSharpParser.Object_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitMember_initializer_list([NotNull] CSharpParser.Member_initializer_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitMember_initializer([NotNull] CSharpParser.Member_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInitializer_value([NotNull] CSharpParser.Initializer_valueContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitCollection_initializer([NotNull] CSharpParser.Collection_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitElement_initializer([NotNull] CSharpParser.Element_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAnonymous_object_initializer([NotNull] CSharpParser.Anonymous_object_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitMember_declarator_list([NotNull] CSharpParser.Member_declarator_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitMember_declarator([NotNull] CSharpParser.Member_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitUnbound_type_name([NotNull] CSharpParser.Unbound_type_nameContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitGeneric_dimension_specifier([NotNull] CSharpParser.Generic_dimension_specifierContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitIsType([NotNull] CSharpParser.IsTypeContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitIsTypePatternArms([NotNull] CSharpParser.IsTypePatternArmsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitIsTypePatternArm([NotNull] CSharpParser.IsTypePatternArmContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitLambda_expression([NotNull] CSharpParser.Lambda_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAnonymous_function_signature([NotNull] CSharpParser.Anonymous_function_signatureContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitExplicit_anonymous_function_parameter_list([NotNull] CSharpParser.Explicit_anonymous_function_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitExplicit_anonymous_function_parameter([NotNull] CSharpParser.Explicit_anonymous_function_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitImplicit_anonymous_function_parameter_list([NotNull] CSharpParser.Implicit_anonymous_function_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAnonymous_function_body([NotNull] CSharpParser.Anonymous_function_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitQuery_expression([NotNull] CSharpParser.Query_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitFrom_clause([NotNull] CSharpParser.From_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitQuery_body([NotNull] CSharpParser.Query_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitQuery_body_clause([NotNull] CSharpParser.Query_body_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitLet_clause([NotNull] CSharpParser.Let_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitWhere_clause([NotNull] CSharpParser.Where_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitCombined_join_clause([NotNull] CSharpParser.Combined_join_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitOrderby_clause([NotNull] CSharpParser.Orderby_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitOrdering([NotNull] CSharpParser.OrderingContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSelect_or_group_clause([NotNull] CSharpParser.Select_or_group_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitQuery_continuation([NotNull] CSharpParser.Query_continuationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitLocal_function_declaration([NotNull] CSharpParser.Local_function_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitLocal_function_header([NotNull] CSharpParser.Local_function_headerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitLocal_function_modifiers([NotNull] CSharpParser.Local_function_modifiersContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitLocal_function_body([NotNull] CSharpParser.Local_function_bodyContext context)
        {
            throw new NotImplementedException();
        }
        public SymbolNode VisitTheEmptyStatement([NotNull] CSharpParser.TheEmptyStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSwitchStatement([NotNull] CSharpParser.SwitchStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitWhileStatement([NotNull] CSharpParser.WhileStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitDoStatement([NotNull] CSharpParser.DoStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitForStatement([NotNull] CSharpParser.ForStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitForeachStatement([NotNull] CSharpParser.ForeachStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitBreakStatement([NotNull] CSharpParser.BreakStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitContinueStatement([NotNull] CSharpParser.ContinueStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitGotoStatement([NotNull] CSharpParser.GotoStatementContext context)
        {
            throw new NotImplementedException();
        }

 

        public SymbolNode VisitThrowStatement([NotNull] CSharpParser.ThrowStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitTryStatement([NotNull] CSharpParser.TryStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitCheckedStatement([NotNull] CSharpParser.CheckedStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitUncheckedStatement([NotNull] CSharpParser.UncheckedStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitLockStatement([NotNull] CSharpParser.LockStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitUsingStatement([NotNull] CSharpParser.UsingStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitYieldStatement([NotNull] CSharpParser.YieldStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitUnsafeStatement([NotNull] CSharpParser.UnsafeStatementContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitFixedStatement([NotNull] CSharpParser.FixedStatementContext context)
        {
            throw new NotImplementedException();
        }


        public SymbolNode VisitLocal_variable_type([NotNull] CSharpParser.Local_variable_typeContext context)
        {
            if(context.VAR() != null)
            {
                VarType = typeof(object);
            }
            else if(context.type_() != null)
            {
                VisitType_(context.type_());
            }
            return null;
        }



        public SymbolNode VisitLocal_constant_declaration([NotNull] CSharpParser.Local_constant_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSwitch_section([NotNull] CSharpParser.Switch_sectionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSwitch_label([NotNull] CSharpParser.Switch_labelContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitCase_guard([NotNull] CSharpParser.Case_guardContext context)
        {
            throw new NotImplementedException();
        }


        public SymbolNode VisitFor_initializer([NotNull] CSharpParser.For_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitFor_iterator([NotNull] CSharpParser.For_iteratorContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitCatch_clauses([NotNull] CSharpParser.Catch_clausesContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSpecific_catch_clause([NotNull] CSharpParser.Specific_catch_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitGeneral_catch_clause([NotNull] CSharpParser.General_catch_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitException_filter([NotNull] CSharpParser.Exception_filterContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitFinally_clause([NotNull] CSharpParser.Finally_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitResource_acquisition([NotNull] CSharpParser.Resource_acquisitionContext context)
        {
            throw new NotImplementedException();
        }
        public SymbolNode VisitExtern_alias_directives([NotNull] CSharpParser.Extern_alias_directivesContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitExtern_alias_directive([NotNull] CSharpParser.Extern_alias_directiveContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitUsingAliasDirective([NotNull] CSharpParser.UsingAliasDirectiveContext context)
        {
            throw new NotImplementedException();
        }

   

        public SymbolNode VisitUsingStaticDirective([NotNull] CSharpParser.UsingStaticDirectiveContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitQualified_alias_member([NotNull] CSharpParser.Qualified_alias_memberContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitType_parameter_list([NotNull] CSharpParser.Type_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitType_parameter([NotNull] CSharpParser.Type_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitClass_base([NotNull] CSharpParser.Class_baseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterface_type_list([NotNull] CSharpParser.Interface_type_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitType_parameter_constraints_clauses([NotNull] CSharpParser.Type_parameter_constraints_clausesContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitType_parameter_constraints_clause([NotNull] CSharpParser.Type_parameter_constraints_clauseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitType_parameter_constraints([NotNull] CSharpParser.Type_parameter_constraintsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitPrimary_constraint([NotNull] CSharpParser.Primary_constraintContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSecondary_constraints([NotNull] CSharpParser.Secondary_constraintsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitConstructor_constraint([NotNull] CSharpParser.Constructor_constraintContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitConstant_declarators([NotNull] CSharpParser.Constant_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitConstant_declarator([NotNull] CSharpParser.Constant_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitReturn_type([NotNull] CSharpParser.Return_typeContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitMember_name([NotNull] CSharpParser.Member_nameContext context)
        {
            throw new NotImplementedException();
        }


        public SymbolNode VisitParameter_modifier([NotNull] CSharpParser.Parameter_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitParameter_array([NotNull] CSharpParser.Parameter_arrayContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAccessor_declarations([NotNull] CSharpParser.Accessor_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitGet_accessor_declaration([NotNull] CSharpParser.Get_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitSet_accessor_declaration([NotNull] CSharpParser.Set_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAccessor_modifier([NotNull] CSharpParser.Accessor_modifierContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAccessor_body([NotNull] CSharpParser.Accessor_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitEvent_accessor_declarations([NotNull] CSharpParser.Event_accessor_declarationsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAdd_accessor_declaration([NotNull] CSharpParser.Add_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitRemove_accessor_declaration([NotNull] CSharpParser.Remove_accessor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitOverloadable_operator([NotNull] CSharpParser.Overloadable_operatorContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitConversion_operator_declarator([NotNull] CSharpParser.Conversion_operator_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitConstructor_initializer([NotNull] CSharpParser.Constructor_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitBody([NotNull] CSharpParser.BodyContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitStruct_interfaces([NotNull] CSharpParser.Struct_interfacesContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitStruct_body([NotNull] CSharpParser.Struct_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitStruct_member_declaration([NotNull] CSharpParser.Struct_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitArray_type([NotNull] CSharpParser.Array_typeContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitRank_specifier([NotNull] CSharpParser.Rank_specifierContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitArray_initializer([NotNull] CSharpParser.Array_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitVariant_type_parameter_list([NotNull] CSharpParser.Variant_type_parameter_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitVariant_type_parameter([NotNull] CSharpParser.Variant_type_parameterContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitVariance_annotation([NotNull] CSharpParser.Variance_annotationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterface_base([NotNull] CSharpParser.Interface_baseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterface_body([NotNull] CSharpParser.Interface_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterface_member_declaration([NotNull] CSharpParser.Interface_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterface_accessors([NotNull] CSharpParser.Interface_accessorsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitEnum_base([NotNull] CSharpParser.Enum_baseContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitEnum_body([NotNull] CSharpParser.Enum_bodyContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitEnum_member_declaration([NotNull] CSharpParser.Enum_member_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitGlobal_attribute_section([NotNull] CSharpParser.Global_attribute_sectionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitGlobal_attribute_target([NotNull] CSharpParser.Global_attribute_targetContext context)
        {
            throw new NotImplementedException();
        }

  

        public SymbolNode VisitAttribute_list([NotNull] CSharpParser.Attribute_listContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAttribute([NotNull] CSharpParser.AttributeContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitAttribute_argument([NotNull] CSharpParser.Attribute_argumentContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitPointer_type([NotNull] CSharpParser.Pointer_typeContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitFixed_pointer_declarators([NotNull] CSharpParser.Fixed_pointer_declaratorsContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitFixed_pointer_declarator([NotNull] CSharpParser.Fixed_pointer_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitFixed_pointer_initializer([NotNull] CSharpParser.Fixed_pointer_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitFixed_size_buffer_declarator([NotNull] CSharpParser.Fixed_size_buffer_declaratorContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitStackalloc_initializer([NotNull] CSharpParser.Stackalloc_initializerContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitRight_arrow([NotNull] CSharpParser.Right_arrowContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitRight_shift([NotNull] CSharpParser.Right_shiftContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitRight_shift_assignment([NotNull] CSharpParser.Right_shift_assignmentContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterpolated_regular_string([NotNull] CSharpParser.Interpolated_regular_stringContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterpolated_verbatium_string([NotNull] CSharpParser.Interpolated_verbatium_stringContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterpolated_regular_string_part([NotNull] CSharpParser.Interpolated_regular_string_partContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterpolated_verbatium_string_part([NotNull] CSharpParser.Interpolated_verbatium_string_partContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterpolated_string_expression([NotNull] CSharpParser.Interpolated_string_expressionContext context)
        {
            throw new NotImplementedException();
        }


        public SymbolNode VisitStruct_definition([NotNull] CSharpParser.Struct_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitInterface_definition([NotNull] CSharpParser.Interface_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitEnum_definition([NotNull] CSharpParser.Enum_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitDelegate_definition([NotNull] CSharpParser.Delegate_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitEvent_declaration([NotNull] CSharpParser.Event_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitProperty_declaration([NotNull] CSharpParser.Property_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitConstant_declaration([NotNull] CSharpParser.Constant_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitIndexer_declaration([NotNull] CSharpParser.Indexer_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitDestructor_definition([NotNull] CSharpParser.Destructor_definitionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitConstructor_declaration([NotNull] CSharpParser.Constructor_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitOperator_declaration([NotNull] CSharpParser.Operator_declarationContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitObject_creation_expression([NotNull] CSharpParser.Object_creation_expressionContext context)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitChildren(IRuleNode node)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitTerminal(ITerminalNode node)
        {
            throw new NotImplementedException();
        }

        public SymbolNode VisitErrorNode(IErrorNode node)
        {
            throw new NotImplementedException();
        }
    }
    #endregion

}