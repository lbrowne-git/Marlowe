using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using Marlowe.Utilities;
using System.Reflection;
using System.Linq;
using Antlr4.Runtime;
using System.Collections.Generic;
using Marlowe.Logger;
using Marlowe.Visitors;

namespace Marlowe.CSharp
{

    ///<summary>
    ///     The CSharpVisitor provides a way of accessing the data analysed by the CSharpParser. 
    ///     This is done by analysing the context generated from thhe parser to perform sythnaxical
    ///     analysis on these contexts.This allows for the creation of a symbol tree from the source code.
    /// </summary>
    public class CSharpVisitor : SymbolTable, ICSharpVisitor<SymbolNode>
    {
        #region Attributes
        private Type VarType = default(Type);
        public string ClassName;
        public string Namespace;
        private string Accessbility;
        private string VarName = "";
        private ILogger Logger;
        public EntryPointCriteria criteria = new EntryPointCriteria();
        private SymbolNode VisitorSymbolNode;
        private bool FunctionCall = false;
        private Dictionary<string, SymbolNode> ParamaterSymbolNodes;
        public int OverFlowCounter { get; private set; }

#endregion

        public CSharpVisitor(ILogger.Levels level){
            Logger = new ErrorLogger(level);
        }

        public CSharpVisitor()
        {
            Logger = new ErrorLogger(ILogger.Levels.Error);
        }

        public object VisitIdentifier(CSharpParser.IdentifierContext context)
        {
            if (context.IDENTIFIER().GetText() != null)
            {
                return context.IDENTIFIER().GetText();
            }
            return null;
            CSharpParserBaseVisitor<SymbolNode> visitor;

        }

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
                    //VisitGlobal_attribute_section(globalContext);
                }
            }

            if (context.namespace_member_declarations() != null)
            {
                VisitNamespace_member_declarations(context.namespace_member_declarations());
            }
            else
            {
                Logger.WriteContent($"No namepsace declared in file");
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
                        Logger.WriteContent($"No Class Body");
                    }
                }
                else
                {
                    Logger.WriteContent($"No Class");
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
                    Logger.WriteContent($"No closing brace for class {ClassName}");

                }
            }
            else
            {
                Logger.WriteContent($"No opening brace for class {ClassName}");

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
               // return VisitDestructor_definition(context.destructor_definition());
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
                        Logger.WriteContent($"Error with delcaring {context.GetText()}, missing value");
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
                            //VisitIndexer_declaration(context.indexer_declaration());
                        }
                        else
                        {
                            Logger.WriteContent($"Mising sub namespace for ${Namespace}");
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
                    Logger.WriteContent($"Missing Semi Colon");
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
                        Logger.WriteContent($"error handling assignment:\t {context.Start.Line},{context.Start.Column}");
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
                            Logger.WriteContent($"No body for function");
                        }
                    }
                }
            }
            else
            {
                Logger.WriteContent($"method is missing openning paranethesis");
            }
            return null;
        }

        public SymbolNode VisitFormal_parameter_list([NotNull] CSharpParser.Formal_parameter_listContext context)
        {
            if(context.parameter_array() != null)
            {
               // VisitParameter_array(context.parameter_array());
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
                   // Accessbility =(string)VisitParameter_modifier(context.parameter_modifier()).Variable;
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
                    Logger.WriteContent($"function paramater missing for:{context.Start.Line}, {context.Start.Column}" );
                }
            }
            else
            {
                Logger.WriteContent($"no type specified for paramater at line:{context.Start.Line}, {context.Start.Column}");
            }
            return null;
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
                    Logger.WriteContent($"Missing closing brace for ");
                }
            }
            else
            {
                Logger.WriteContent($"Missing closing brace to function");
            }
            return null;
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

        public SymbolNode VisitSimple_embedded_statement([NotNull] CSharpParser.Simple_embedded_statementContext context)
        {   // Contexts of Simple Embedded Statement extend this class and must be dynamcically cast. 
            switch (context)
            {
                case CSharpParser.TheEmptyStatementContext emptyStatemet:
                    // return VisitTheEmptyStatement(emptyStatemet);
                    return null;
                case CSharpParser.ExpressionStatementContext statementContext:
                    return VisitExpressionStatement(statementContext);
                case CSharpParser.IfStatementContext ifContext:
                    return VisitIfStatement(ifContext);
                case CSharpParser.WhileStatementContext whileContext:
                    //  return VisitWhileStatement(whileContext);
                    return null;
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
                    Logger.WriteContent($"no expression on line:{context.Start.Line},{context.Start.Column}");
                }
            }
            else
            {
                Logger.WriteContent($"missing semicolon on line:{context.Start.Line},{context.Start.Column}");
            }
            return null;
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
                                Logger.WriteContent($"If operation cannot be used to perform logical validation.");
                            }
                        }
                        else
                        {
                            Logger.WriteContent($"If statment missing logical operation");
                        }

                    }
                    else
                    {
                        Logger.WriteContent($"Missing closing parentheses");
                    }
                }
                else
                {
                    Logger.WriteContent($"Missing opening parentheses");
                }
            }
            else
            {
                Logger.WriteContent($"Missing Keyword IF");
            }
            return null;
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
                Logger.WriteContent($"error handling if statement");
            }
            return null;
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
                    //return VisitLocal_constant_declaration(context.local_constant_declaration());
                }
            }
            else if (context.local_function_declaration() != null)
            {
                //return VisitLocal_function_declaration(context.local_function_declaration());
            }
            else
            {
                Logger.WriteContent($"missing semicolon");
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
                    Logger.WriteContent($"variable declarator missing");
                }
            }
            else
            {
                Logger.WriteContent($"variable type missing");
            }
            return null;
        }



        public SymbolNode VisitLocal_variable_type([NotNull] CSharpParser.Local_variable_typeContext context)
        {
            if (context.VAR() != null)
            {
                VarType = typeof(object);
            }
            else if (context.type_() != null)
            {
                VisitType_(context.type_());
            }
            return null;
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
                // return VisitArray_initializer(context.array_initializer());
                return null;
            }
            else if (context.stackalloc_initializer() != null)
            {
                return null;
                // return VisitStackalloc_initializer(context.stackalloc_initializer());
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
  
                    }
                }
                // Function Calls are stored for execution when entrypoint is found.
                if (VisitorSymbolNode is SymbolFunctionNode && criteria.EntryPointFound())
                {
                    VisitorSymbolNode = HandleFunctionCall((SymbolFunctionNode)VisitorSymbolNode);
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


                return VisitorSymbolNode;
            }
            return null;    
        }
        
        public SymbolNode HandleFunctionCall(SymbolFunctionNode methodCall)
        {
            FunctionCall = true;
            ParamaterSymbolNodes = new Dictionary<string, SymbolNode>();
            VisitorSymbolNode = VisitMethod_body((CSharpParser.Method_bodyContext)methodCall.RuleContext);
            FunctionCall = false;
            foreach (var item in methodCall.Paramaters)
            {   //this removes params after func has been invoked
                Variables.Remove(item.Key);
            }
            return VisitorSymbolNode;
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
                    Console.WriteLine();
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
                                Logger.WriteContent($"Variable {context.Start.Text}({context.Start.Line},{context.Start.Column}) is not defined");   
                            }
                            VisitorSymbolNode.Variable = VisitExpression(context.expression());
                            return VisitorSymbolNode;
                        }
                        else
                        {
                            Logger.WriteContent($"No expression after assignment operator:{context.Start.Line},{context.Start.Column}");
                        }
                    }
                    else
                    {
                        Logger.WriteContent($"Missing assignment operator:{context.Start.Line},{context.Start.Column}");
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
                        if (VisitorSymbolNode != null)
                        {
                            return VisitorSymbolNode;
                        }
                        else{ 
                            // VERY rudamentary implemention should be replaced with a far more verbose system.
                            if(funcClass == "Console" 
                               && (classFunc == "WriteLine"|| funcClass == "Write"))
                            {
                                try
                                {
                                    Console.WriteLine(VisitMethod_invocation((CSharpParser.Method_invocationContext)context.children[2]).Variable);
                                }
                                catch
                                {
                                    Logger.WriteContent($" Problem attempt to write to console {context.Start.Line},{context.Start.Column}, assuming error with logical operation");
                                }
                            }
                        }
                    }
                    else
                    {
                        VisitorSymbolNode =  VisitPrimary_expression_start(context.primary_expression_start());
                        if(VisitorSymbolNode is SymbolFunctionNode && context.method_invocation().Length >= 1)
                        {
                            return PopulateFuncParams((SymbolFunctionNode)VisitorSymbolNode, context.method_invocation()[0]);
                        }
                        else
                        {
                            return VisitorSymbolNode;
                        }
                    }
                }
                else
                {
                    return VisitPrimary_expression_start(context.primary_expression_start());
                }

            }
            return null;     
        }

        private SymbolNode PopulateFuncParams(SymbolFunctionNode funcNode, CSharpParser.Method_invocationContext context)
        {
            string[] funcParams = funcNode.Paramaters.Keys.ToArray();
            CSharpParser.ArgumentContext[] argumentList = context.argument_list().argument();
            for (int i = 0; i < argumentList.Length; i++)
            {
                funcNode.Paramaters[funcParams[i]] = VisitArgument(argumentList[i]);
            }
            return funcNode;

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
                            Logger.WriteContent($"error handling line{context.Start.Line},{context.Start.Column}");
                            break;
                        }
                    }
            }
            return null;
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

        public SymbolNode VisitLiteralExpression([NotNull] CSharpParser.LiteralExpressionContext context)
        {
            if (context != null)
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
            if (context.boolean_literal() != null)
            {
                return VisitBoolean_literal(context.boolean_literal());
            }
            else if (context.string_literal() != null)
            {
                return VisitString_literal(context.string_literal());
            }
            else if (context.INTEGER_LITERAL() != null)
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
            if (context.TRUE() != null)
            {
                boolLiteral = true;
                VarType = typeof(bool);
            }
            else if (context.FALSE() != null)
            {

            }
            else
            {
                Logger.WriteContent($"Variable is not a valid boolean value {context.Start.Line},{context.Start.Column}");
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
                //return VisitInterpolated_regular_string(context.interpolated_regular_string());
            }
            else if (context.interpolated_verbatium_string() != null)
            {
                //return VisitInterpolated_verbatium_string(context.interpolated_verbatium_string());
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
                        Logger.WriteContent($"Input {context.Start.Text}({context.Start.Line},{context.Start.Column} is not a valid string");
                        return null;
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
                        Logger.WriteContent($"Missing Colon?");
                    }
                }
                if (context.attribute_list() != null){

                }
                else
                {
                    Logger.WriteContent($"no variable declaration present");
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

        #region AbstractParserTree content
        //These functions are used so the CSharpVisitor can extend IParseTreeVisitor


        //
        // Summary:
        //     Gets the default value returned by visitor methods.
        //
        // Returns:
        //     The default value returned by visitor methods.
        //
        // Remarks:
        //     Gets the default value returned by visitor methods. This value is returned by
        //     the default implementations of visitTerminal , visitErrorNode . The default implementation
        //     of visitChildren initializes its aggregate result to this value. The base implementation
        //     returns null .
        protected internal virtual SymbolNode DefaultSymbolNode => default(SymbolNode);

        //
        // Summary:
        //     The default implementation calls Antlr4.Runtime.Tree.IParseTree.Accept``1(Antlr4.Runtime.Tree.IParseTreeVisitor{``0})
        //     on the specified tree.
        public virtual SymbolNode Visit(IParseTree tree)
        {
            return tree.Accept(this);
        }

        //
        // Summary:
        //     The default implementation initializes the aggregate result to defaultSymbolNode()
        //     . Before visiting each child, it calls shouldVisitNextChild ; if the result is
        //     false no more children are visited and the current aggregate result is returned.
        //     After visiting a child, the aggregate result is updated by calling aggregateSymbolNode
        //     with the previous aggregate result and the result of visiting the child. The
        //     default implementation is not safe for use in visitors that modify the tree structure.
        //     Visitors that modify the tree should override this method to behave properly
        //     in respect to the specific algorithm in use.
        public virtual SymbolNode VisitChildren(IRuleNode node)
        {
            SymbolNode val = DefaultSymbolNode;
            int childCount = node.ChildCount;
            for (int i = 0; i < childCount; i++)
            {
                if (!ShouldVisitNextChild(node, val))
                {
                    break;
                }

                SymbolNode nextSymbolNode = node.GetChild(i).Accept(this);
                val = AggregateSymbolNode(val, nextSymbolNode);
            }

            return val;
        }

        //
        // Summary:
        //     The default implementation returns the result of defaultSymbolNode .
        public virtual SymbolNode VisitTerminal(ITerminalNode node)
        {
            return DefaultSymbolNode;
        }

        //
        // Summary:
        //     The default implementation returns the result of defaultSymbolNode .
        public virtual SymbolNode VisitErrorNode(IErrorNode node)
        {
            return DefaultSymbolNode;
        }

        //
        // Summary:
        //     Aggregates the results of visiting multiple children of a node.
        //
        // Parameters:
        //   aggregate:
        //     The previous aggregate value. In the default implementation, the aggregate value
        //     is initialized to Antlr4.Runtime.Tree.AbstractParseTreeVisitor`1.DefaultSymbolNode
        //     , which is passed as the aggregate argument to this method after the first child
        //     node is visited.
        //
        //   nextSymbolNode:
        //     The result of the immediately preceeding call to visit a child node.
        //
        // Returns:
        //     The updated aggregate result.
        //
        // Remarks:
        //     Aggregates the results of visiting multiple children of a node. After either
        //     all children are visited or Antlr4.Runtime.Tree.AbstractParseTreeVisitor`1.ShouldVisitNextChild(Antlr4.Runtime.Tree.IRuleNode,`0)
        //     returns false , the aggregate value is returned as the result of Antlr4.Runtime.Tree.AbstractParseTreeVisitor`1.VisitChildren(Antlr4.Runtime.Tree.IRuleNode)
        //     . The default implementation returns nextSymbolNode , meaning Antlr4.Runtime.Tree.AbstractParseTreeVisitor`1.VisitChildren(Antlr4.Runtime.Tree.IRuleNode)
        //     will return the result of the last child visited (or return the initial value
        //     if the node has no children).
        protected internal virtual SymbolNode AggregateSymbolNode(SymbolNode aggregate, SymbolNode nextSymbolNode)
        {
            return nextSymbolNode;
        }

        //
        // Summary:
        //     This method is called after visiting each child in Antlr4.Runtime.Tree.AbstractParseTreeVisitor`1.VisitChildren(Antlr4.Runtime.Tree.IRuleNode)
        //     . This method is first called before the first child is visited; at that point
        //     currentSymbolNode will be the initial value (in the default implementation, the initial
        //     value is returned by a call to Antlr4.Runtime.Tree.AbstractParseTreeVisitor`1.DefaultSymbolNode
        //     . This method is not called after the last child is visited. The default implementation
        //     always returns true , indicating that visitChildren should only return after
        //     all children are visited. One reason to override this method is to provide a
        //     "short circuit" evaluation option for situations where the result of visiting
        //     a single child has the potential to determine the result of the visit operation
        //     as a whole.
        //
        // Parameters:
        //   node:
        //     The Antlr4.Runtime.Tree.IRuleNode whose children are currently being visited.
        //
        //   currentSymbolNode:
        //     The current aggregate result of the children visited to the current point.
        //
        // Returns:
        //     true to continue visiting children. Otherwise return false to stop visiting children
        //     and immediately return the current aggregate result from Antlr4.Runtime.Tree.AbstractParseTreeVisitor`1.VisitChildren(Antlr4.Runtime.Tree.IRuleNode)
        //     .
        protected internal virtual bool ShouldVisitNextChild(IRuleNode node, SymbolNode currentSymbolNode)
        {
            return true;
        }
        #endregion
    }

}