// Generated from f:\Libraries\Libraries\College\FYP\Marlowe\grammar\CSharpParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSharpParser extends CSharpParserBase {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, SINGLE_LINE_DOC_COMMENT=2, EMPTY_DELIMITED_DOC_COMMENT=3, 
		DELIMITED_DOC_COMMENT=4, SINGLE_LINE_COMMENT=5, DELIMITED_COMMENT=6, WHITESPACES=7, 
		SHARP=8, ABSTRACT=9, ADD=10, ALIAS=11, ARGLIST=12, AS=13, ASCENDING=14, 
		ASYNC=15, AWAIT=16, BASE=17, BOOL=18, BREAK=19, BY=20, BYTE=21, CASE=22, 
		CATCH=23, CHAR=24, CHECKED=25, CLASS=26, CONST=27, CONTINUE=28, DECIMAL=29, 
		DEFAULT=30, DELEGATE=31, DESCENDING=32, DO=33, DOUBLE=34, DYNAMIC=35, 
		ELSE=36, ENUM=37, EQUALS=38, EVENT=39, EXPLICIT=40, EXTERN=41, FALSE=42, 
		FINALLY=43, FIXED=44, FLOAT=45, FOR=46, FOREACH=47, FROM=48, GET=49, GOTO=50, 
		GROUP=51, IF=52, IMPLICIT=53, IN=54, INT=55, INTERFACE=56, INTERNAL=57, 
		INTO=58, IS=59, JOIN=60, LET=61, LOCK=62, LONG=63, NAMEOF=64, NAMESPACE=65, 
		NEW=66, NULL_=67, OBJECT=68, ON=69, OPERATOR=70, ORDERBY=71, OUT=72, OVERRIDE=73, 
		PARAMS=74, PARTIAL=75, PRIVATE=76, PROTECTED=77, PUBLIC=78, READONLY=79, 
		REF=80, REMOVE=81, RETURN=82, SBYTE=83, SEALED=84, SELECT=85, SET=86, 
		SHORT=87, SIZEOF=88, STACKALLOC=89, STATIC=90, STRING=91, STRUCT=92, SWITCH=93, 
		THIS=94, THROW=95, TRUE=96, TRY=97, TYPEOF=98, UINT=99, ULONG=100, UNCHECKED=101, 
		UNMANAGED=102, UNSAFE=103, USHORT=104, USING=105, VAR=106, VIRTUAL=107, 
		VOID=108, VOLATILE=109, WHEN=110, WHERE=111, WHILE=112, YIELD=113, IDENTIFIER=114, 
		LITERAL_ACCESS=115, INTEGER_LITERAL=116, HEX_INTEGER_LITERAL=117, BIN_INTEGER_LITERAL=118, 
		REAL_LITERAL=119, CHARACTER_LITERAL=120, REGULAR_STRING=121, VERBATIUM_STRING=122, 
		INTERPOLATED_REGULAR_STRING_START=123, INTERPOLATED_VERBATIUM_STRING_START=124, 
		OPEN_BRACE=125, CLOSE_BRACE=126, OPEN_BRACKET=127, CLOSE_BRACKET=128, 
		OPEN_PARENS=129, CLOSE_PARENS=130, DOT=131, COMMA=132, COLON=133, SEMICOLON=134, 
		PLUS=135, MINUS=136, STAR=137, DIV=138, PERCENT=139, AMP=140, BITWISE_OR=141, 
		CARET=142, BANG=143, TILDE=144, ASSIGNMENT=145, LT=146, GT=147, INTERR=148, 
		DOUBLE_COLON=149, OP_COALESCING=150, OP_INC=151, OP_DEC=152, OP_AND=153, 
		OP_OR=154, OP_PTR=155, OP_EQ=156, OP_NE=157, OP_LE=158, OP_GE=159, OP_ADD_ASSIGNMENT=160, 
		OP_SUB_ASSIGNMENT=161, OP_MULT_ASSIGNMENT=162, OP_DIV_ASSIGNMENT=163, 
		OP_MOD_ASSIGNMENT=164, OP_AND_ASSIGNMENT=165, OP_OR_ASSIGNMENT=166, OP_XOR_ASSIGNMENT=167, 
		OP_LEFT_SHIFT=168, OP_LEFT_SHIFT_ASSIGNMENT=169, OP_COALESCING_ASSIGNMENT=170, 
		OP_RANGE=171, DOUBLE_CURLY_INSIDE=172, OPEN_BRACE_INSIDE=173, REGULAR_CHAR_INSIDE=174, 
		VERBATIUM_DOUBLE_QUOTE_INSIDE=175, DOUBLE_QUOTE_INSIDE=176, REGULAR_STRING_INSIDE=177, 
		VERBATIUM_INSIDE_STRING=178, CLOSE_BRACE_INSIDE=179, FORMAT_STRING=180, 
		DIRECTIVE_WHITESPACES=181, DIGITS=182, DEFINE=183, UNDEF=184, ELIF=185, 
		ENDIF=186, LINE=187, ERROR=188, WARNING=189, REGION=190, ENDREGION=191, 
		PRAGMA=192, NULLABLE=193, DIRECTIVE_HIDDEN=194, CONDITIONAL_SYMBOL=195, 
		DIRECTIVE_NEW_LINE=196, TEXT=197, DOUBLE_CURLY_CLOSE_INSIDE=198;
	public static final int
		RULE_compilation_unit = 0, RULE_type_argument_list = 1, RULE_namespace_or_type_name = 2, 
		RULE_type_ = 3, RULE_base_type = 4, RULE_tuple_type = 5, RULE_tuple_element = 6, 
		RULE_simple_type = 7, RULE_numeric_type = 8, RULE_integral_type = 9, RULE_floating_point_type = 10, 
		RULE_class_type = 11, RULE_argument_list = 12, RULE_argument = 13, RULE_expression = 14, 
		RULE_non_assignment_expression = 15, RULE_assignment = 16, RULE_assignment_operator = 17, 
		RULE_conditional_expression = 18, RULE_null_coalescing_expression = 19, 
		RULE_conditional_or_expression = 20, RULE_conditional_and_expression = 21, 
		RULE_inclusive_or_expression = 22, RULE_exclusive_or_expression = 23, 
		RULE_and_expression = 24, RULE_equality_expression = 25, RULE_relational_expression = 26, 
		RULE_shift_expression = 27, RULE_additive_expression = 28, RULE_multiplicative_expression = 29, 
		RULE_switch_expression = 30, RULE_switch_expression_arms = 31, RULE_switch_expression_arm = 32, 
		RULE_range_expression = 33, RULE_unary_expression = 34, RULE_primary_expression = 35, 
		RULE_primary_expression_start = 36, RULE_throwable_expression = 37, RULE_throw_expression = 38, 
		RULE_member_access = 39, RULE_bracket_expression = 40, RULE_indexer_argument = 41, 
		RULE_predefined_type = 42, RULE_expression_list = 43, RULE_object_or_collection_initializer = 44, 
		RULE_object_initializer = 45, RULE_member_initializer_list = 46, RULE_member_initializer = 47, 
		RULE_initializer_value = 48, RULE_collection_initializer = 49, RULE_element_initializer = 50, 
		RULE_anonymous_object_initializer = 51, RULE_member_declarator_list = 52, 
		RULE_member_declarator = 53, RULE_unbound_type_name = 54, RULE_generic_dimension_specifier = 55, 
		RULE_isType = 56, RULE_isTypePatternArms = 57, RULE_isTypePatternArm = 58, 
		RULE_lambda_expression = 59, RULE_anonymous_function_signature = 60, RULE_explicit_anonymous_function_parameter_list = 61, 
		RULE_explicit_anonymous_function_parameter = 62, RULE_implicit_anonymous_function_parameter_list = 63, 
		RULE_anonymous_function_body = 64, RULE_query_expression = 65, RULE_from_clause = 66, 
		RULE_query_body = 67, RULE_query_body_clause = 68, RULE_let_clause = 69, 
		RULE_where_clause = 70, RULE_combined_join_clause = 71, RULE_orderby_clause = 72, 
		RULE_ordering = 73, RULE_select_or_group_clause = 74, RULE_query_continuation = 75, 
		RULE_statement = 76, RULE_declarationStatement = 77, RULE_local_function_declaration = 78, 
		RULE_local_function_header = 79, RULE_local_function_modifiers = 80, RULE_local_function_body = 81, 
		RULE_labeled_Statement = 82, RULE_embedded_statement = 83, RULE_simple_embedded_statement = 84, 
		RULE_block = 85, RULE_local_variable_declaration = 86, RULE_local_variable_type = 87, 
		RULE_local_variable_declarator = 88, RULE_local_variable_initializer = 89, 
		RULE_local_constant_declaration = 90, RULE_if_body = 91, RULE_switch_section = 92, 
		RULE_switch_label = 93, RULE_case_guard = 94, RULE_statement_list = 95, 
		RULE_for_initializer = 96, RULE_for_iterator = 97, RULE_catch_clauses = 98, 
		RULE_specific_catch_clause = 99, RULE_general_catch_clause = 100, RULE_exception_filter = 101, 
		RULE_finally_clause = 102, RULE_resource_acquisition = 103, RULE_namespace_declaration = 104, 
		RULE_namespace_body = 105, RULE_using_directives = 106, RULE_using_directive = 107, 
		RULE_namespace_member_declarations = 108, RULE_namespace_member_declaration = 109, 
		RULE_type_declaration = 110, RULE_qualified_alias_member = 111, RULE_type_parameter_list = 112, 
		RULE_type_parameter = 113, RULE_class_base = 114, RULE_interface_type_list = 115, 
		RULE_type_parameter_constraints_clauses = 116, RULE_type_parameter_constraints_clause = 117, 
		RULE_type_parameter_constraints = 118, RULE_primary_constraint = 119, 
		RULE_secondary_constraints = 120, RULE_constructor_constraint = 121, RULE_class_body = 122, 
		RULE_class_member_declarations = 123, RULE_class_member_declaration = 124, 
		RULE_all_member_modifiers = 125, RULE_all_member_modifier = 126, RULE_common_member_declaration = 127, 
		RULE_typed_member_declaration = 128, RULE_constant_declarators = 129, 
		RULE_constant_declarator = 130, RULE_variable_declarators = 131, RULE_variable_declarator = 132, 
		RULE_variable_initializer = 133, RULE_return_type = 134, RULE_member_name = 135, 
		RULE_method_body = 136, RULE_formal_parameter_list = 137, RULE_fixed_parameters = 138, 
		RULE_fixed_parameter = 139, RULE_parameter_modifier = 140, RULE_parameter_array = 141, 
		RULE_accessor_declarations = 142, RULE_get_accessor_declaration = 143, 
		RULE_set_accessor_declaration = 144, RULE_accessor_modifier = 145, RULE_accessor_body = 146, 
		RULE_event_accessor_declarations = 147, RULE_add_accessor_declaration = 148, 
		RULE_remove_accessor_declaration = 149, RULE_overloadable_operator = 150, 
		RULE_conversion_operator_declarator = 151, RULE_constructor_initializer = 152, 
		RULE_body = 153, RULE_struct_interfaces = 154, RULE_struct_body = 155, 
		RULE_struct_member_declaration = 156, RULE_array_type = 157, RULE_rank_specifier = 158, 
		RULE_array_initializer = 159, RULE_variant_type_parameter_list = 160, 
		RULE_variant_type_parameter = 161, RULE_variance_annotation = 162, RULE_interface_base = 163, 
		RULE_interface_body = 164, RULE_interface_member_declaration = 165, RULE_interface_accessors = 166, 
		RULE_enum_base = 167, RULE_enum_body = 168, RULE_enum_member_declaration = 169, 
		RULE_global_attribute_section = 170, RULE_global_attribute_target = 171, 
		RULE_attributes = 172, RULE_attribute_section = 173, RULE_attribute_target = 174, 
		RULE_attribute_list = 175, RULE_attribute = 176, RULE_attribute_argument = 177, 
		RULE_pointer_type = 178, RULE_fixed_pointer_declarators = 179, RULE_fixed_pointer_declarator = 180, 
		RULE_fixed_pointer_initializer = 181, RULE_fixed_size_buffer_declarator = 182, 
		RULE_stackalloc_initializer = 183, RULE_right_arrow = 184, RULE_right_shift = 185, 
		RULE_right_shift_assignment = 186, RULE_literal = 187, RULE_boolean_literal = 188, 
		RULE_string_literal = 189, RULE_interpolated_regular_string = 190, RULE_interpolated_verbatium_string = 191, 
		RULE_interpolated_regular_string_part = 192, RULE_interpolated_verbatium_string_part = 193, 
		RULE_interpolated_string_expression = 194, RULE_keyword = 195, RULE_class_definition = 196, 
		RULE_struct_definition = 197, RULE_interface_definition = 198, RULE_enum_definition = 199, 
		RULE_delegate_definition = 200, RULE_event_declaration = 201, RULE_field_declaration = 202, 
		RULE_property_declaration = 203, RULE_constant_declaration = 204, RULE_indexer_declaration = 205, 
		RULE_destructor_definition = 206, RULE_constructor_declaration = 207, 
		RULE_method_declaration = 208, RULE_method_member_name = 209, RULE_operator_declaration = 210, 
		RULE_arg_declaration = 211, RULE_method_invocation = 212, RULE_object_creation_expression = 213, 
		RULE_identifier = 214;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "type_argument_list", "namespace_or_type_name", "type_", 
			"base_type", "tuple_type", "tuple_element", "simple_type", "numeric_type", 
			"integral_type", "floating_point_type", "class_type", "argument_list", 
			"argument", "expression", "non_assignment_expression", "assignment", 
			"assignment_operator", "conditional_expression", "null_coalescing_expression", 
			"conditional_or_expression", "conditional_and_expression", "inclusive_or_expression", 
			"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
			"shift_expression", "additive_expression", "multiplicative_expression", 
			"switch_expression", "switch_expression_arms", "switch_expression_arm", 
			"range_expression", "unary_expression", "primary_expression", "primary_expression_start", 
			"throwable_expression", "throw_expression", "member_access", "bracket_expression", 
			"indexer_argument", "predefined_type", "expression_list", "object_or_collection_initializer", 
			"object_initializer", "member_initializer_list", "member_initializer", 
			"initializer_value", "collection_initializer", "element_initializer", 
			"anonymous_object_initializer", "member_declarator_list", "member_declarator", 
			"unbound_type_name", "generic_dimension_specifier", "isType", "isTypePatternArms", 
			"isTypePatternArm", "lambda_expression", "anonymous_function_signature", 
			"explicit_anonymous_function_parameter_list", "explicit_anonymous_function_parameter", 
			"implicit_anonymous_function_parameter_list", "anonymous_function_body", 
			"query_expression", "from_clause", "query_body", "query_body_clause", 
			"let_clause", "where_clause", "combined_join_clause", "orderby_clause", 
			"ordering", "select_or_group_clause", "query_continuation", "statement", 
			"declarationStatement", "local_function_declaration", "local_function_header", 
			"local_function_modifiers", "local_function_body", "labeled_Statement", 
			"embedded_statement", "simple_embedded_statement", "block", "local_variable_declaration", 
			"local_variable_type", "local_variable_declarator", "local_variable_initializer", 
			"local_constant_declaration", "if_body", "switch_section", "switch_label", 
			"case_guard", "statement_list", "for_initializer", "for_iterator", "catch_clauses", 
			"specific_catch_clause", "general_catch_clause", "exception_filter", 
			"finally_clause", "resource_acquisition", "namespace_declaration", "namespace_body", 
			"using_directives", "using_directive", "namespace_member_declarations", 
			"namespace_member_declaration", "type_declaration", "qualified_alias_member", 
			"type_parameter_list", "type_parameter", "class_base", "interface_type_list", 
			"type_parameter_constraints_clauses", "type_parameter_constraints_clause", 
			"type_parameter_constraints", "primary_constraint", "secondary_constraints", 
			"constructor_constraint", "class_body", "class_member_declarations", 
			"class_member_declaration", "all_member_modifiers", "all_member_modifier", 
			"common_member_declaration", "typed_member_declaration", "constant_declarators", 
			"constant_declarator", "variable_declarators", "variable_declarator", 
			"variable_initializer", "return_type", "member_name", "method_body", 
			"formal_parameter_list", "fixed_parameters", "fixed_parameter", "parameter_modifier", 
			"parameter_array", "accessor_declarations", "get_accessor_declaration", 
			"set_accessor_declaration", "accessor_modifier", "accessor_body", "event_accessor_declarations", 
			"add_accessor_declaration", "remove_accessor_declaration", "overloadable_operator", 
			"conversion_operator_declarator", "constructor_initializer", "body", 
			"struct_interfaces", "struct_body", "struct_member_declaration", "array_type", 
			"rank_specifier", "array_initializer", "variant_type_parameter_list", 
			"variant_type_parameter", "variance_annotation", "interface_base", "interface_body", 
			"interface_member_declaration", "interface_accessors", "enum_base", "enum_body", 
			"enum_member_declaration", "global_attribute_section", "global_attribute_target", 
			"attributes", "attribute_section", "attribute_target", "attribute_list", 
			"attribute", "attribute_argument", "pointer_type", "fixed_pointer_declarators", 
			"fixed_pointer_declarator", "fixed_pointer_initializer", "fixed_size_buffer_declarator", 
			"stackalloc_initializer", "right_arrow", "right_shift", "right_shift_assignment", 
			"literal", "boolean_literal", "string_literal", "interpolated_regular_string", 
			"interpolated_verbatium_string", "interpolated_regular_string_part", 
			"interpolated_verbatium_string_part", "interpolated_string_expression", 
			"keyword", "class_definition", "struct_definition", "interface_definition", 
			"enum_definition", "delegate_definition", "event_declaration", "field_declaration", 
			"property_declaration", "constant_declaration", "indexer_declaration", 
			"destructor_definition", "constructor_declaration", "method_declaration", 
			"method_member_name", "operator_declaration", "arg_declaration", "method_invocation", 
			"object_creation_expression", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u00EF\u00BB\u00BF'", null, "'/***/'", null, null, null, null, 
			"'#'", "'abstract'", "'add'", "'alias'", "'__arglist'", "'as'", "'ascending'", 
			"'async'", "'await'", "'base'", "'bool'", "'break'", "'by'", "'byte'", 
			"'case'", "'catch'", "'char'", "'checked'", "'class'", "'const'", "'continue'", 
			"'decimal'", "'default'", "'delegate'", "'descending'", "'do'", "'double'", 
			"'dynamic'", "'else'", "'enum'", "'equals'", "'event'", "'explicit'", 
			"'extern'", "'false'", "'finally'", "'fixed'", "'float'", "'for'", "'foreach'", 
			"'from'", "'get'", "'goto'", "'group'", "'if'", "'implicit'", "'in'", 
			"'int'", "'interface'", "'internal'", "'into'", "'is'", "'join'", "'let'", 
			"'lock'", "'long'", "'nameof'", "'namespace'", "'new'", "'null'", "'object'", 
			"'on'", "'operator'", "'orderby'", "'out'", "'override'", "'params'", 
			"'partial'", "'private'", "'protected'", "'public'", "'readonly'", "'ref'", 
			"'remove'", "'return'", "'sbyte'", "'sealed'", "'select'", "'set'", "'short'", 
			"'sizeof'", "'stackalloc'", "'static'", "'string'", "'struct'", "'switch'", 
			"'this'", "'throw'", "'true'", "'try'", "'typeof'", "'uint'", "'ulong'", 
			"'unchecked'", "'unmanaged'", "'unsafe'", "'ushort'", "'using'", "'var'", 
			"'virtual'", "'void'", "'volatile'", "'when'", "'where'", "'while'", 
			"'yield'", null, null, null, null, null, null, null, null, null, null, 
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", 
			"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", 
			"'~'", "'='", "'<'", "'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", 
			"'||'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'|='", "'^='", "'<<'", "'<<='", "'??='", "'..'", 
			"'{{'", null, null, null, null, null, null, null, null, null, null, "'define'", 
			"'undef'", "'elif'", "'endif'", "'line'", null, null, null, null, null, 
			null, "'hidden'", null, null, null, "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "EMPTY_DELIMITED_DOC_COMMENT", 
			"DELIMITED_DOC_COMMENT", "SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", 
			"WHITESPACES", "SHARP", "ABSTRACT", "ADD", "ALIAS", "ARGLIST", "AS", 
			"ASCENDING", "ASYNC", "AWAIT", "BASE", "BOOL", "BREAK", "BY", "BYTE", 
			"CASE", "CATCH", "CHAR", "CHECKED", "CLASS", "CONST", "CONTINUE", "DECIMAL", 
			"DEFAULT", "DELEGATE", "DESCENDING", "DO", "DOUBLE", "DYNAMIC", "ELSE", 
			"ENUM", "EQUALS", "EVENT", "EXPLICIT", "EXTERN", "FALSE", "FINALLY", 
			"FIXED", "FLOAT", "FOR", "FOREACH", "FROM", "GET", "GOTO", "GROUP", "IF", 
			"IMPLICIT", "IN", "INT", "INTERFACE", "INTERNAL", "INTO", "IS", "JOIN", 
			"LET", "LOCK", "LONG", "NAMEOF", "NAMESPACE", "NEW", "NULL_", "OBJECT", 
			"ON", "OPERATOR", "ORDERBY", "OUT", "OVERRIDE", "PARAMS", "PARTIAL", 
			"PRIVATE", "PROTECTED", "PUBLIC", "READONLY", "REF", "REMOVE", "RETURN", 
			"SBYTE", "SEALED", "SELECT", "SET", "SHORT", "SIZEOF", "STACKALLOC", 
			"STATIC", "STRING", "STRUCT", "SWITCH", "THIS", "THROW", "TRUE", "TRY", 
			"TYPEOF", "UINT", "ULONG", "UNCHECKED", "UNMANAGED", "UNSAFE", "USHORT", 
			"USING", "VAR", "VIRTUAL", "VOID", "VOLATILE", "WHEN", "WHERE", "WHILE", 
			"YIELD", "IDENTIFIER", "LITERAL_ACCESS", "INTEGER_LITERAL", "HEX_INTEGER_LITERAL", 
			"BIN_INTEGER_LITERAL", "REAL_LITERAL", "CHARACTER_LITERAL", "REGULAR_STRING", 
			"VERBATIUM_STRING", "INTERPOLATED_REGULAR_STRING_START", "INTERPOLATED_VERBATIUM_STRING_START", 
			"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENS", 
			"CLOSE_PARENS", "DOT", "COMMA", "COLON", "SEMICOLON", "PLUS", "MINUS", 
			"STAR", "DIV", "PERCENT", "AMP", "BITWISE_OR", "CARET", "BANG", "TILDE", 
			"ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", "OP_COALESCING", 
			"OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", 
			"OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", 
			"OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", 
			"OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "OP_COALESCING_ASSIGNMENT", 
			"OP_RANGE", "DOUBLE_CURLY_INSIDE", "OPEN_BRACE_INSIDE", "REGULAR_CHAR_INSIDE", 
			"VERBATIUM_DOUBLE_QUOTE_INSIDE", "DOUBLE_QUOTE_INSIDE", "REGULAR_STRING_INSIDE", 
			"VERBATIUM_INSIDE_STRING", "CLOSE_BRACE_INSIDE", "FORMAT_STRING", "DIRECTIVE_WHITESPACES", 
			"DIGITS", "DEFINE", "UNDEF", "ELIF", "ENDIF", "LINE", "ERROR", "WARNING", 
			"REGION", "ENDREGION", "PRAGMA", "NULLABLE", "DIRECTIVE_HIDDEN", "CONDITIONAL_SYMBOL", 
			"DIRECTIVE_NEW_LINE", "TEXT", "DOUBLE_CURLY_CLOSE_INSIDE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSharpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSharpParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(CSharpParser.BYTE_ORDER_MARK, 0); }
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public List<Global_attribute_sectionContext> global_attribute_section() {
			return getRuleContexts(Global_attribute_sectionContext.class);
		}
		public Global_attribute_sectionContext global_attribute_section(int i) {
			return getRuleContext(Global_attribute_sectionContext.class,i);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(430);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(433);
				using_directives();
				}
			}

			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					global_attribute_section();
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NAMESPACE - 65)) | (1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REF - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (STRUCT - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0)) {
				{
				setState(442);
				namespace_member_declarations();
				}
			}

			setState(445);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_argument_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list; }
	}

	public final Type_argument_listContext type_argument_list() throws RecognitionException {
		Type_argument_listContext _localctx = new Type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LT);
			setState(448);
			type_();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(449);
				match(COMMA);
				setState(450);
				type_();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_or_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Namespace_or_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_or_type_name; }
	}

	public final Namespace_or_type_nameContext namespace_or_type_name() throws RecognitionException {
		Namespace_or_type_nameContext _localctx = new Namespace_or_type_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespace_or_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(458);
				identifier();
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(459);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(462);
				qualified_alias_member();
				}
				break;
			}
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(465);
					match(DOT);
					setState(466);
					identifier();
					setState(468);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(467);
						type_argument_list();
						}
						break;
					}
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<TerminalNode> INTERR() { return getTokens(CSharpParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(CSharpParser.INTERR, i);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			base_type();
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(479);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTERR:
						{
						setState(476);
						match(INTERR);
						}
						break;
					case OPEN_BRACKET:
						{
						setState(477);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(478);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TerminalNode STAR() { return getToken(CSharpParser.STAR, 0); }
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_base_type);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				simple_type();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				class_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(VOID);
				setState(487);
				match(STAR);
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				tuple_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(OPEN_PARENS);
			setState(492);
			tuple_element();
			setState(495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(493);
				match(COMMA);
				setState(494);
				tuple_element();
				}
				}
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(499);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_elementContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Tuple_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element; }
	}

	public final Tuple_elementContext tuple_element() throws RecognitionException {
		Tuple_elementContext _localctx = new Tuple_elementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tuple_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			type_();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(502);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_typeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_type);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				numeric_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_typeContext extends ParserRuleContext {
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numeric_type);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				integral_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				floating_point_type();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integral_typeContext extends ParserRuleContext {
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (SBYTE - 83)) | (1L << (SHORT - 83)) | (1L << (UINT - 83)) | (1L << (ULONG - 83)) | (1L << (USHORT - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_typeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_class_type);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				namespace_or_type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(OBJECT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(DYNAMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			argument();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(525);
				match(COMMA);
				setState(526);
				argument();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public Token refout;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(532);
				identifier();
				setState(533);
				match(COLON);
				}
				break;
			}
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(537);
				((ArgumentContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IN - 54)) | (1L << (OUT - 54)) | (1L << (REF - 54)))) != 0)) ) {
					((ArgumentContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(540);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(541);
				type_();
				}
				break;
			}
			setState(544);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				non_assignment_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				match(REF);
				setState(549);
				non_assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_assignment_expressionContext extends ParserRuleContext {
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Non_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_assignment_expression; }
	}

	public final Non_assignment_expressionContext non_assignment_expression() throws RecognitionException {
		Non_assignment_expressionContext _localctx = new Non_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_non_assignment_expression);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				lambda_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				query_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				conditional_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_COALESCING_ASSIGNMENT() { return getToken(CSharpParser.OP_COALESCING_ASSIGNMENT, 0); }
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				unary_expression();
				setState(558);
				assignment_operator();
				setState(559);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				unary_expression();
				setState(562);
				match(OP_COALESCING_ASSIGNMENT);
				setState(563);
				throwable_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public TerminalNode OP_ADD_ASSIGNMENT() { return getToken(CSharpParser.OP_ADD_ASSIGNMENT, 0); }
		public TerminalNode OP_SUB_ASSIGNMENT() { return getToken(CSharpParser.OP_SUB_ASSIGNMENT, 0); }
		public TerminalNode OP_MULT_ASSIGNMENT() { return getToken(CSharpParser.OP_MULT_ASSIGNMENT, 0); }
		public TerminalNode OP_DIV_ASSIGNMENT() { return getToken(CSharpParser.OP_DIV_ASSIGNMENT, 0); }
		public TerminalNode OP_MOD_ASSIGNMENT() { return getToken(CSharpParser.OP_MOD_ASSIGNMENT, 0); }
		public TerminalNode OP_AND_ASSIGNMENT() { return getToken(CSharpParser.OP_AND_ASSIGNMENT, 0); }
		public TerminalNode OP_OR_ASSIGNMENT() { return getToken(CSharpParser.OP_OR_ASSIGNMENT, 0); }
		public TerminalNode OP_XOR_ASSIGNMENT() { return getToken(CSharpParser.OP_XOR_ASSIGNMENT, 0); }
		public TerminalNode OP_LEFT_SHIFT_ASSIGNMENT() { return getToken(CSharpParser.OP_LEFT_SHIFT_ASSIGNMENT, 0); }
		public Right_shift_assignmentContext right_shift_assignment() {
			return getRuleContext(Right_shift_assignmentContext.class,0);
		}
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_operator);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(ASSIGNMENT);
				}
				break;
			case OP_ADD_ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(OP_ADD_ASSIGNMENT);
				}
				break;
			case OP_SUB_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				match(OP_SUB_ASSIGNMENT);
				}
				break;
			case OP_MULT_ASSIGNMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				match(OP_MULT_ASSIGNMENT);
				}
				break;
			case OP_DIV_ASSIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(571);
				match(OP_DIV_ASSIGNMENT);
				}
				break;
			case OP_MOD_ASSIGNMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(572);
				match(OP_MOD_ASSIGNMENT);
				}
				break;
			case OP_AND_ASSIGNMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(573);
				match(OP_AND_ASSIGNMENT);
				}
				break;
			case OP_OR_ASSIGNMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(574);
				match(OP_OR_ASSIGNMENT);
				}
				break;
			case OP_XOR_ASSIGNMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(575);
				match(OP_XOR_ASSIGNMENT);
				}
				break;
			case OP_LEFT_SHIFT_ASSIGNMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(576);
				match(OP_LEFT_SHIFT_ASSIGNMENT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 11);
				{
				setState(577);
				right_shift_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public List<Throwable_expressionContext> throwable_expression() {
			return getRuleContexts(Throwable_expressionContext.class);
		}
		public Throwable_expressionContext throwable_expression(int i) {
			return getRuleContext(Throwable_expressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			null_coalescing_expression();
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(581);
				match(INTERR);
				setState(582);
				throwable_expression();
				setState(583);
				match(COLON);
				setState(584);
				throwable_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Conditional_or_expressionContext conditional_or_expression() {
			return getRuleContext(Conditional_or_expressionContext.class,0);
		}
		public TerminalNode OP_COALESCING() { return getToken(CSharpParser.OP_COALESCING, 0); }
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Throw_expressionContext throw_expression() {
			return getRuleContext(Throw_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_coalescing_expression; }
	}

	public final Null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		Null_coalescing_expressionContext _localctx = new Null_coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_null_coalescing_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			conditional_or_expression();
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(589);
				match(OP_COALESCING);
				setState(592);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BASE:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case CHECKED:
				case DECIMAL:
				case DEFAULT:
				case DELEGATE:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FALSE:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case NEW:
				case NULL_:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case SIZEOF:
				case STRING:
				case THIS:
				case TRUE:
				case TYPEOF:
				case UINT:
				case ULONG:
				case UNCHECKED:
				case UNMANAGED:
				case USHORT:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case LITERAL_ACCESS:
				case INTEGER_LITERAL:
				case HEX_INTEGER_LITERAL:
				case BIN_INTEGER_LITERAL:
				case REAL_LITERAL:
				case CHARACTER_LITERAL:
				case REGULAR_STRING:
				case VERBATIUM_STRING:
				case INTERPOLATED_REGULAR_STRING_START:
				case INTERPOLATED_VERBATIUM_STRING_START:
				case OPEN_PARENS:
				case PLUS:
				case MINUS:
				case STAR:
				case AMP:
				case CARET:
				case BANG:
				case TILDE:
				case OP_INC:
				case OP_DEC:
				case OP_RANGE:
					{
					setState(590);
					null_coalescing_expression();
					}
					break;
				case THROW:
					{
					setState(591);
					throw_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_or_expressionContext extends ParserRuleContext {
		public List<Conditional_and_expressionContext> conditional_and_expression() {
			return getRuleContexts(Conditional_and_expressionContext.class);
		}
		public Conditional_and_expressionContext conditional_and_expression(int i) {
			return getRuleContext(Conditional_and_expressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(CSharpParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(CSharpParser.OP_OR, i);
		}
		public Conditional_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_or_expression; }
	}

	public final Conditional_or_expressionContext conditional_or_expression() throws RecognitionException {
		Conditional_or_expressionContext _localctx = new Conditional_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditional_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			conditional_and_expression();
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(597);
					match(OP_OR);
					setState(598);
					conditional_and_expression();
					}
					} 
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(CSharpParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(CSharpParser.OP_AND, i);
		}
		public Conditional_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_and_expression; }
	}

	public final Conditional_and_expressionContext conditional_and_expression() throws RecognitionException {
		Conditional_and_expressionContext _localctx = new Conditional_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditional_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			inclusive_or_expression();
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					match(OP_AND);
					setState(606);
					inclusive_or_expression();
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> BITWISE_OR() { return getTokens(CSharpParser.BITWISE_OR); }
		public TerminalNode BITWISE_OR(int i) {
			return getToken(CSharpParser.BITWISE_OR, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			exclusive_or_expression();
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					match(BITWISE_OR);
					setState(614);
					exclusive_or_expression();
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(CSharpParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(CSharpParser.CARET, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			and_expression();
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					match(CARET);
					setState(622);
					and_expression();
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(CSharpParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(CSharpParser.AMP, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			equality_expression();
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(629);
					match(AMP);
					setState(630);
					equality_expression();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(CSharpParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(CSharpParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(CSharpParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(CSharpParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equality_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			relational_expression();
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(637);
					_la = _input.LA(1);
					if ( !(_la==OP_EQ || _la==OP_NE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(638);
					relational_expression();
					}
					} 
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> IS() { return getTokens(CSharpParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(CSharpParser.IS, i);
		}
		public List<IsTypeContext> isType() {
			return getRuleContexts(IsTypeContext.class);
		}
		public IsTypeContext isType(int i) {
			return getRuleContext(IsTypeContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(CSharpParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(CSharpParser.AS, i);
		}
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(CSharpParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CSharpParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CSharpParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CSharpParser.GT, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(CSharpParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(CSharpParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(CSharpParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(CSharpParser.OP_GE, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relational_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			shift_expression();
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(651);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
					case GT:
					case OP_LE:
					case OP_GE:
						{
						setState(645);
						_la = _input.LA(1);
						if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (LT - 146)) | (1L << (GT - 146)) | (1L << (OP_LE - 146)) | (1L << (OP_GE - 146)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(646);
						shift_expression();
						}
						break;
					case IS:
						{
						setState(647);
						match(IS);
						setState(648);
						isType();
						}
						break;
					case AS:
						{
						setState(649);
						match(AS);
						setState(650);
						type_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> OP_LEFT_SHIFT() { return getTokens(CSharpParser.OP_LEFT_SHIFT); }
		public TerminalNode OP_LEFT_SHIFT(int i) {
			return getToken(CSharpParser.OP_LEFT_SHIFT, i);
		}
		public List<Right_shiftContext> right_shift() {
			return getRuleContexts(Right_shiftContext.class);
		}
		public Right_shiftContext right_shift(int i) {
			return getRuleContext(Right_shiftContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			additive_expression();
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(659);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OP_LEFT_SHIFT:
						{
						setState(657);
						match(OP_LEFT_SHIFT);
						}
						break;
					case GT:
						{
						setState(658);
						right_shift();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(661);
					additive_expression();
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CSharpParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CSharpParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CSharpParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CSharpParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			multiplicative_expression();
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(668);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(669);
					multiplicative_expression();
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Switch_expressionContext> switch_expression() {
			return getRuleContexts(Switch_expressionContext.class);
		}
		public Switch_expressionContext switch_expression(int i) {
			return getRuleContext(Switch_expressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CSharpParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CSharpParser.DIV, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CSharpParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(CSharpParser.PERCENT, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			switch_expression();
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(676);
					_la = _input.LA(1);
					if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (STAR - 137)) | (1L << (DIV - 137)) | (1L << (PERCENT - 137)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(677);
					switch_expression();
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_expressionContext extends ParserRuleContext {
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Switch_expression_armsContext switch_expression_arms() {
			return getRuleContext(Switch_expression_armsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Switch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression; }
	}

	public final Switch_expressionContext switch_expression() throws RecognitionException {
		Switch_expressionContext _localctx = new Switch_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switch_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			range_expression();
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(684);
				match(SWITCH);
				setState(685);
				match(OPEN_BRACE);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(686);
					switch_expression_arms();
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(687);
						match(COMMA);
						}
					}

					}
				}

				setState(692);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_expression_armsContext extends ParserRuleContext {
		public List<Switch_expression_armContext> switch_expression_arm() {
			return getRuleContexts(Switch_expression_armContext.class);
		}
		public Switch_expression_armContext switch_expression_arm(int i) {
			return getRuleContext(Switch_expression_armContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Switch_expression_armsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression_arms; }
	}

	public final Switch_expression_armsContext switch_expression_arms() throws RecognitionException {
		Switch_expression_armsContext _localctx = new Switch_expression_armsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switch_expression_arms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			switch_expression_arm();
			setState(700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(696);
					match(COMMA);
					setState(697);
					switch_expression_arm();
					}
					} 
				}
				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_expression_armContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public Case_guardContext case_guard() {
			return getRuleContext(Case_guardContext.class,0);
		}
		public Switch_expression_armContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression_arm; }
	}

	public final Switch_expression_armContext switch_expression_arm() throws RecognitionException {
		Switch_expression_armContext _localctx = new Switch_expression_armContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switch_expression_arm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			expression();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(704);
				case_guard();
				}
			}

			setState(707);
			right_arrow();
			setState(708);
			throwable_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public TerminalNode OP_RANGE() { return getToken(CSharpParser.OP_RANGE, 0); }
		public Range_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_expression; }
	}

	public final Range_expressionContext range_expression() throws RecognitionException {
		Range_expressionContext _localctx = new Range_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_range_expression);
		int _la;
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				unary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)))) != 0)) {
					{
					setState(711);
					unary_expression();
					}
				}

				setState(714);
				match(OP_RANGE);
				setState(716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(715);
					unary_expression();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CSharpParser.PLUS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CSharpParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(CSharpParser.TILDE, 0); }
		public TerminalNode OP_INC() { return getToken(CSharpParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(CSharpParser.OP_DEC, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public TerminalNode AMP() { return getToken(CSharpParser.AMP, 0); }
		public TerminalNode STAR() { return getToken(CSharpParser.STAR, 0); }
		public TerminalNode CARET() { return getToken(CSharpParser.CARET, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unary_expression);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(PLUS);
				setState(722);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				match(MINUS);
				setState(724);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				match(BANG);
				setState(726);
				unary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				match(TILDE);
				setState(728);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				match(OP_INC);
				setState(730);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(731);
				match(OP_DEC);
				setState(732);
				unary_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(733);
				match(OPEN_PARENS);
				setState(734);
				type_();
				setState(735);
				match(CLOSE_PARENS);
				setState(736);
				unary_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(738);
				match(AWAIT);
				setState(739);
				unary_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(740);
				match(AMP);
				setState(741);
				unary_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(742);
				match(STAR);
				setState(743);
				unary_expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(744);
				match(CARET);
				setState(745);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<TerminalNode> BANG() { return getTokens(CSharpParser.BANG); }
		public TerminalNode BANG(int i) {
			return getToken(CSharpParser.BANG, i);
		}
		public List<Bracket_expressionContext> bracket_expression() {
			return getRuleContexts(Bracket_expressionContext.class);
		}
		public Bracket_expressionContext bracket_expression(int i) {
			return getRuleContext(Bracket_expressionContext.class,i);
		}
		public List<Member_accessContext> member_access() {
			return getRuleContexts(Member_accessContext.class);
		}
		public Member_accessContext member_access(int i) {
			return getRuleContext(Member_accessContext.class,i);
		}
		public List<Method_invocationContext> method_invocation() {
			return getRuleContexts(Method_invocationContext.class);
		}
		public Method_invocationContext method_invocation(int i) {
			return getRuleContext(Method_invocationContext.class,i);
		}
		public List<TerminalNode> OP_INC() { return getTokens(CSharpParser.OP_INC); }
		public TerminalNode OP_INC(int i) {
			return getToken(CSharpParser.OP_INC, i);
		}
		public List<TerminalNode> OP_DEC() { return getTokens(CSharpParser.OP_DEC); }
		public TerminalNode OP_DEC(int i) {
			return getToken(CSharpParser.OP_DEC, i);
		}
		public List<TerminalNode> OP_PTR() { return getTokens(CSharpParser.OP_PTR); }
		public TerminalNode OP_PTR(int i) {
			return getToken(CSharpParser.OP_PTR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			((Primary_expressionContext)_localctx).pe = primary_expression_start();
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(749);
				match(BANG);
				}
				break;
			}
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(752);
					bracket_expression();
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(758);
				match(BANG);
				}
				break;
			}
			setState(783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(767);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
					case INTERR:
						{
						setState(761);
						member_access();
						}
						break;
					case OPEN_PARENS:
						{
						setState(762);
						method_invocation();
						}
						break;
					case OP_INC:
						{
						setState(763);
						match(OP_INC);
						}
						break;
					case OP_DEC:
						{
						setState(764);
						match(OP_DEC);
						}
						break;
					case OP_PTR:
						{
						setState(765);
						match(OP_PTR);
						setState(766);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(770);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(769);
						match(BANG);
						}
						break;
					}
					}
					setState(775);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(772);
							bracket_expression();
							}
							} 
						}
						setState(777);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					}
					setState(779);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(778);
						match(BANG);
						}
						break;
					}
					}
					} 
				}
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expression_startContext extends ParserRuleContext {
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
	 
		public Primary_expression_startContext() { }
		public void copyFrom(Primary_expression_startContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode LITERAL_ACCESS() { return getToken(CSharpParser.LITERAL_ACCESS, 0); }
		public LiteralAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class DefaultValueExpressionContext extends Primary_expression_startContext {
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public DefaultValueExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class BaseAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode DOT() { return getToken(CSharpParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public BaseAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class SizeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public SizeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisExpressionsContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public ParenthesisExpressionsContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class ThisReferenceExpressionContext extends Primary_expression_startContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public ThisReferenceExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class ObjectCreationExpressionContext extends Primary_expression_startContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Anonymous_object_initializerContext anonymous_object_initializer() {
			return getRuleContext(Anonymous_object_initializerContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Object_creation_expressionContext object_creation_expression() {
			return getRuleContext(Object_creation_expressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public ObjectCreationExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class AnonymousMethodExpressionContext extends Primary_expression_startContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public AnonymousMethodExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class TypeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Unbound_type_nameContext unbound_type_name() {
			return getRuleContext(Unbound_type_nameContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TypeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class TupleExpressionContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public TupleExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class UncheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public UncheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleNameExpressionContext extends Primary_expression_startContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public SimpleNameExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class MemberAccessExpressionContext extends Primary_expression_startContext {
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public MemberAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class CheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public CheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends Primary_expression_startContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}
	public static class NameofExpressionContext extends Primary_expression_startContext {
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public NameofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primary_expression_start);
		int _la;
		try {
			int _alt;
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				literal();
				}
				break;
			case 2:
				_localctx = new SimpleNameExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				identifier();
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(788);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ParenthesisExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				match(OPEN_PARENS);
				setState(792);
				expression();
				setState(793);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				predefined_type();
				}
				break;
			case 5:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(796);
				qualified_alias_member();
				}
				break;
			case 6:
				_localctx = new LiteralAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(797);
				match(LITERAL_ACCESS);
				}
				break;
			case 7:
				_localctx = new ThisReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(798);
				match(THIS);
				}
				break;
			case 8:
				_localctx = new BaseAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(799);
				match(BASE);
				setState(809);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(800);
					match(DOT);
					setState(801);
					identifier();
					setState(803);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(802);
						type_argument_list();
						}
						break;
					}
					}
					break;
				case OPEN_BRACKET:
					{
					setState(805);
					match(OPEN_BRACKET);
					setState(806);
					expression_list();
					setState(807);
					match(CLOSE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				_localctx = new ObjectCreationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(811);
				match(NEW);
				setState(840);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case UNMANAGED:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case OPEN_PARENS:
					{
					setState(812);
					type_();
					setState(834);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(813);
						object_creation_expression();
						}
						break;
					case 2:
						{
						setState(814);
						object_or_collection_initializer();
						}
						break;
					case 3:
						{
						setState(815);
						match(OPEN_BRACKET);
						setState(816);
						expression_list();
						setState(817);
						match(CLOSE_BRACKET);
						setState(821);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(818);
								rank_specifier();
								}
								} 
							}
							setState(823);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
						}
						setState(825);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
						case 1:
							{
							setState(824);
							array_initializer();
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(828); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(827);
							rank_specifier();
							}
							}
							setState(830); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==OPEN_BRACKET );
						setState(832);
						array_initializer();
						}
						break;
					}
					}
					break;
				case OPEN_BRACE:
					{
					setState(836);
					anonymous_object_initializer();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(837);
					rank_specifier();
					setState(838);
					array_initializer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				_localctx = new TupleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(842);
				match(OPEN_PARENS);
				setState(843);
				argument();
				setState(846); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(844);
					match(COMMA);
					setState(845);
					argument();
					}
					}
					setState(848); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(850);
				match(CLOSE_PARENS);
				}
				break;
			case 11:
				_localctx = new TypeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(852);
				match(TYPEOF);
				setState(853);
				match(OPEN_PARENS);
				setState(857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(854);
					unbound_type_name();
					}
					break;
				case 2:
					{
					setState(855);
					type_();
					}
					break;
				case 3:
					{
					setState(856);
					match(VOID);
					}
					break;
				}
				setState(859);
				match(CLOSE_PARENS);
				}
				break;
			case 12:
				_localctx = new CheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(860);
				match(CHECKED);
				setState(861);
				match(OPEN_PARENS);
				setState(862);
				expression();
				setState(863);
				match(CLOSE_PARENS);
				}
				break;
			case 13:
				_localctx = new UncheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(865);
				match(UNCHECKED);
				setState(866);
				match(OPEN_PARENS);
				setState(867);
				expression();
				setState(868);
				match(CLOSE_PARENS);
				}
				break;
			case 14:
				_localctx = new DefaultValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(870);
				match(DEFAULT);
				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(871);
					match(OPEN_PARENS);
					setState(872);
					type_();
					setState(873);
					match(CLOSE_PARENS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AnonymousMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(877);
					match(ASYNC);
					}
				}

				setState(880);
				match(DELEGATE);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENS) {
					{
					setState(881);
					match(OPEN_PARENS);
					setState(883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PARTIAL - 75)) | (1L << (REF - 75)) | (1L << (REMOVE - 75)) | (1L << (SBYTE - 75)) | (1L << (SELECT - 75)) | (1L << (SET - 75)) | (1L << (SHORT - 75)) | (1L << (STRING - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (UNMANAGED - 75)) | (1L << (USHORT - 75)) | (1L << (VAR - 75)) | (1L << (VOID - 75)) | (1L << (WHEN - 75)) | (1L << (WHERE - 75)) | (1L << (YIELD - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (OPEN_PARENS - 75)))) != 0)) {
						{
						setState(882);
						explicit_anonymous_function_parameter_list();
						}
					}

					setState(885);
					match(CLOSE_PARENS);
					}
				}

				setState(888);
				block();
				}
				break;
			case 16:
				_localctx = new SizeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(889);
				match(SIZEOF);
				setState(890);
				match(OPEN_PARENS);
				setState(891);
				type_();
				setState(892);
				match(CLOSE_PARENS);
				}
				break;
			case 17:
				_localctx = new NameofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(894);
				match(NAMEOF);
				setState(895);
				match(OPEN_PARENS);
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(896);
						identifier();
						setState(897);
						match(DOT);
						}
						} 
					}
					setState(903);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(904);
				identifier();
				setState(905);
				match(CLOSE_PARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throwable_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_expressionContext throw_expression() {
			return getRuleContext(Throw_expressionContext.class,0);
		}
		public Throwable_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwable_expression; }
	}

	public final Throwable_expressionContext throwable_expression() throws RecognitionException {
		Throwable_expressionContext _localctx = new Throwable_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_throwable_expression);
		try {
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				expression();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				throw_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throw_expressionContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_expression; }
	}

	public final Throw_expressionContext throw_expression() throws RecognitionException {
		Throw_expressionContext _localctx = new Throw_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_throw_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(THROW);
			setState(914);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_accessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CSharpParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_member_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(916);
				match(INTERR);
				}
			}

			setState(919);
			match(DOT);
			setState(920);
			identifier();
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(921);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bracket_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public List<Indexer_argumentContext> indexer_argument() {
			return getRuleContexts(Indexer_argumentContext.class);
		}
		public Indexer_argumentContext indexer_argument(int i) {
			return getRuleContext(Indexer_argumentContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Bracket_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expression; }
	}

	public final Bracket_expressionContext bracket_expression() throws RecognitionException {
		Bracket_expressionContext _localctx = new Bracket_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bracket_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(924);
				match(INTERR);
				}
			}

			setState(927);
			match(OPEN_BRACKET);
			setState(928);
			indexer_argument();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(929);
				match(COMMA);
				setState(930);
				indexer_argument();
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(936);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexer_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Indexer_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_argument; }
	}

	public final Indexer_argumentContext indexer_argument() throws RecognitionException {
		Indexer_argumentContext _localctx = new Indexer_argumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_indexer_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(938);
				identifier();
				setState(939);
				match(COLON);
				}
				break;
			}
			setState(943);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_predefined_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (OBJECT - 68)) | (1L << (SBYTE - 68)) | (1L << (SHORT - 68)) | (1L << (STRING - 68)) | (1L << (UINT - 68)) | (1L << (ULONG - 68)) | (1L << (USHORT - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			expression();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(948);
				match(COMMA);
				setState(949);
				expression();
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_or_collection_initializerContext extends ParserRuleContext {
		public Object_initializerContext object_initializer() {
			return getRuleContext(Object_initializerContext.class,0);
		}
		public Collection_initializerContext collection_initializer() {
			return getRuleContext(Collection_initializerContext.class,0);
		}
		public Object_or_collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_or_collection_initializer; }
	}

	public final Object_or_collection_initializerContext object_or_collection_initializer() throws RecognitionException {
		Object_or_collection_initializerContext _localctx = new Object_or_collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_object_or_collection_initializer);
		try {
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				object_initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				collection_initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_initializer_listContext member_initializer_list() {
			return getRuleContext(Member_initializer_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_initializer; }
	}

	public final Object_initializerContext object_initializer() throws RecognitionException {
		Object_initializerContext _localctx = new Object_initializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(OPEN_BRACE);
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(960);
				member_initializer_list();
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(961);
					match(COMMA);
					}
				}

				}
			}

			setState(966);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializer_listContext extends ParserRuleContext {
		public List<Member_initializerContext> member_initializer() {
			return getRuleContexts(Member_initializerContext.class);
		}
		public Member_initializerContext member_initializer(int i) {
			return getRuleContext(Member_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Member_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer_list; }
	}

	public final Member_initializer_listContext member_initializer_list() throws RecognitionException {
		Member_initializer_listContext _localctx = new Member_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_member_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			member_initializer();
			setState(973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(969);
					match(COMMA);
					setState(970);
					member_initializer();
					}
					} 
				}
				setState(975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializerContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Initializer_valueContext initializer_value() {
			return getRuleContext(Initializer_valueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Member_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer; }
	}

	public final Member_initializerContext member_initializer() throws RecognitionException {
		Member_initializerContext _localctx = new Member_initializerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(976);
				identifier();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(977);
				match(OPEN_BRACKET);
				setState(978);
				expression();
				setState(979);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(983);
			match(ASSIGNMENT);
			setState(984);
			initializer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_initializer_value);
		try {
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				object_or_collection_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public List<Element_initializerContext> element_initializer() {
			return getRuleContexts(Element_initializerContext.class);
		}
		public Element_initializerContext element_initializer(int i) {
			return getRuleContext(Element_initializerContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_initializer; }
	}

	public final Collection_initializerContext collection_initializer() throws RecognitionException {
		Collection_initializerContext _localctx = new Collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_collection_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(OPEN_BRACE);
			setState(991);
			element_initializer();
			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(992);
					match(COMMA);
					setState(993);
					element_initializer();
					}
					} 
				}
				setState(998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(999);
				match(COMMA);
				}
			}

			setState(1002);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_initializerContext extends ParserRuleContext {
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Element_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_initializer; }
	}

	public final Element_initializerContext element_initializer() throws RecognitionException {
		Element_initializerContext _localctx = new Element_initializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_element_initializer);
		try {
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				non_assignment_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(OPEN_BRACE);
				setState(1006);
				expression_list();
				setState(1007);
				match(CLOSE_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_declarator_listContext member_declarator_list() {
			return getRuleContext(Member_declarator_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Anonymous_object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_object_initializer; }
	}

	public final Anonymous_object_initializerContext anonymous_object_initializer() throws RecognitionException {
		Anonymous_object_initializerContext _localctx = new Anonymous_object_initializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_anonymous_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(OPEN_BRACE);
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BASE - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (CHECKED - 10)) | (1L << (DECIMAL - 10)) | (1L << (DEFAULT - 10)) | (1L << (DELEGATE - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FALSE - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (NEW - 10)) | (1L << (NULL_ - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PARTIAL - 75)) | (1L << (REMOVE - 75)) | (1L << (SBYTE - 75)) | (1L << (SELECT - 75)) | (1L << (SET - 75)) | (1L << (SHORT - 75)) | (1L << (SIZEOF - 75)) | (1L << (STRING - 75)) | (1L << (THIS - 75)) | (1L << (TRUE - 75)) | (1L << (TYPEOF - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (UNCHECKED - 75)) | (1L << (UNMANAGED - 75)) | (1L << (USHORT - 75)) | (1L << (VAR - 75)) | (1L << (WHEN - 75)) | (1L << (WHERE - 75)) | (1L << (YIELD - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (LITERAL_ACCESS - 75)) | (1L << (INTEGER_LITERAL - 75)) | (1L << (HEX_INTEGER_LITERAL - 75)) | (1L << (BIN_INTEGER_LITERAL - 75)) | (1L << (REAL_LITERAL - 75)) | (1L << (CHARACTER_LITERAL - 75)) | (1L << (REGULAR_STRING - 75)) | (1L << (VERBATIUM_STRING - 75)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 75)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 75)) | (1L << (OPEN_PARENS - 75)))) != 0)) {
				{
				setState(1012);
				member_declarator_list();
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1013);
					match(COMMA);
					}
				}

				}
			}

			setState(1018);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declarator_listContext extends ParserRuleContext {
		public List<Member_declaratorContext> member_declarator() {
			return getRuleContexts(Member_declaratorContext.class);
		}
		public Member_declaratorContext member_declarator(int i) {
			return getRuleContext(Member_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator_list; }
	}

	public final Member_declarator_listContext member_declarator_list() throws RecognitionException {
		Member_declarator_listContext _localctx = new Member_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_member_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			member_declarator();
			setState(1025);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1021);
					match(COMMA);
					setState(1022);
					member_declarator();
					}
					} 
				}
				setState(1027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declaratorContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_member_declarator);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				identifier();
				setState(1030);
				match(ASSIGNMENT);
				setState(1031);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unbound_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(CSharpParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public List<Generic_dimension_specifierContext> generic_dimension_specifier() {
			return getRuleContexts(Generic_dimension_specifierContext.class);
		}
		public Generic_dimension_specifierContext generic_dimension_specifier(int i) {
			return getRuleContext(Generic_dimension_specifierContext.class,i);
		}
		public Unbound_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbound_type_name; }
	}

	public final Unbound_type_nameContext unbound_type_name() throws RecognitionException {
		Unbound_type_nameContext _localctx = new Unbound_type_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unbound_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			identifier();
			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_PARENS:
			case DOT:
			case LT:
				{
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1036);
					generic_dimension_specifier();
					}
				}

				}
				break;
			case DOUBLE_COLON:
				{
				setState(1039);
				match(DOUBLE_COLON);
				setState(1040);
				identifier();
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1041);
					generic_dimension_specifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1046);
				match(DOT);
				setState(1047);
				identifier();
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1048);
					generic_dimension_specifier();
					}
				}

				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_dimension_specifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Generic_dimension_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_dimension_specifier; }
	}

	public final Generic_dimension_specifierContext generic_dimension_specifier() throws RecognitionException {
		Generic_dimension_specifierContext _localctx = new Generic_dimension_specifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_generic_dimension_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(LT);
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1057);
				match(COMMA);
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsTypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public IsTypePatternArmsContext isTypePatternArms() {
			return getRuleContext(IsTypePatternArmsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isType; }
	}

	public final IsTypeContext isType() throws RecognitionException {
		IsTypeContext _localctx = new IsTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_isType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			base_type();
			setState(1070);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1068);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(1066);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(1067);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1072);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1073);
				match(INTERR);
				}
				break;
			}
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1076);
				isTypePatternArms();
				}
				break;
			}
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1079);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsTypePatternArmsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public List<IsTypePatternArmContext> isTypePatternArm() {
			return getRuleContexts(IsTypePatternArmContext.class);
		}
		public IsTypePatternArmContext isTypePatternArm(int i) {
			return getRuleContext(IsTypePatternArmContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public IsTypePatternArmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isTypePatternArms; }
	}

	public final IsTypePatternArmsContext isTypePatternArms() throws RecognitionException {
		IsTypePatternArmsContext _localctx = new IsTypePatternArmsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_isTypePatternArms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(OPEN_BRACE);
			setState(1083);
			isTypePatternArm();
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1084);
				match(COMMA);
				setState(1085);
				isTypePatternArm();
				}
				}
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1091);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsTypePatternArmContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsTypePatternArmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isTypePatternArm; }
	}

	public final IsTypePatternArmContext isTypePatternArm() throws RecognitionException {
		IsTypePatternArmContext _localctx = new IsTypePatternArmContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_isTypePatternArm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			identifier();
			setState(1094);
			match(COLON);
			setState(1095);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_expressionContext extends ParserRuleContext {
		public Anonymous_function_signatureContext anonymous_function_signature() {
			return getRuleContext(Anonymous_function_signatureContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Anonymous_function_bodyContext anonymous_function_body() {
			return getRuleContext(Anonymous_function_bodyContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lambda_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1097);
				match(ASYNC);
				}
				break;
			}
			setState(1100);
			anonymous_function_signature();
			setState(1101);
			right_arrow();
			setState(1102);
			anonymous_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_function_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() {
			return getRuleContext(Implicit_anonymous_function_parameter_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Anonymous_function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_signature; }
	}

	public final Anonymous_function_signatureContext anonymous_function_signature() throws RecognitionException {
		Anonymous_function_signatureContext _localctx = new Anonymous_function_signatureContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_anonymous_function_signature);
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1104);
				match(OPEN_PARENS);
				setState(1105);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				match(OPEN_PARENS);
				setState(1107);
				explicit_anonymous_function_parameter_list();
				setState(1108);
				match(CLOSE_PARENS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				match(OPEN_PARENS);
				setState(1111);
				implicit_anonymous_function_parameter_list();
				setState(1112);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1114);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<Explicit_anonymous_function_parameterContext> explicit_anonymous_function_parameter() {
			return getRuleContexts(Explicit_anonymous_function_parameterContext.class);
		}
		public Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter(int i) {
			return getRuleContext(Explicit_anonymous_function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Explicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter_list; }
	}

	public final Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() throws RecognitionException {
		Explicit_anonymous_function_parameter_listContext _localctx = new Explicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_explicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			explicit_anonymous_function_parameter();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1118);
				match(COMMA);
				setState(1119);
				explicit_anonymous_function_parameter();
				}
				}
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_anonymous_function_parameterContext extends ParserRuleContext {
		public Token refout;
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public Explicit_anonymous_function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter; }
	}

	public final Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter() throws RecognitionException {
		Explicit_anonymous_function_parameterContext _localctx = new Explicit_anonymous_function_parameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_explicit_anonymous_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IN - 54)) | (1L << (OUT - 54)) | (1L << (REF - 54)))) != 0)) {
				{
				setState(1125);
				((Explicit_anonymous_function_parameterContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IN - 54)) | (1L << (OUT - 54)) | (1L << (REF - 54)))) != 0)) ) {
					((Explicit_anonymous_function_parameterContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1128);
			type_();
			setState(1129);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Implicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_anonymous_function_parameter_list; }
	}

	public final Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() throws RecognitionException {
		Implicit_anonymous_function_parameter_listContext _localctx = new Implicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_implicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			identifier();
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1132);
				match(COMMA);
				setState(1133);
				identifier();
				}
				}
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_function_bodyContext extends ParserRuleContext {
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Anonymous_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_body; }
	}

	public final Anonymous_function_bodyContext anonymous_function_body() throws RecognitionException {
		Anonymous_function_bodyContext _localctx = new Anonymous_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_anonymous_function_body);
		try {
			setState(1141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case THROW:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				throwable_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			from_clause();
			setState(1144);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(FROM);
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1147);
				type_();
				}
				break;
			}
			setState(1150);
			identifier();
			setState(1151);
			match(IN);
			setState(1152);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_bodyContext extends ParserRuleContext {
		public Select_or_group_clauseContext select_or_group_clause() {
			return getRuleContext(Select_or_group_clauseContext.class,0);
		}
		public List<Query_body_clauseContext> query_body_clause() {
			return getRuleContexts(Query_body_clauseContext.class);
		}
		public Query_body_clauseContext query_body_clause(int i) {
			return getRuleContext(Query_body_clauseContext.class,i);
		}
		public Query_continuationContext query_continuation() {
			return getRuleContext(Query_continuationContext.class,0);
		}
		public Query_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body; }
	}

	public final Query_bodyContext query_body() throws RecognitionException {
		Query_bodyContext _localctx = new Query_bodyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_query_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (FROM - 48)) | (1L << (JOIN - 48)) | (1L << (LET - 48)) | (1L << (ORDERBY - 48)) | (1L << (WHERE - 48)))) != 0)) {
				{
				{
				setState(1154);
				query_body_clause();
				}
				}
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1160);
			select_or_group_clause();
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1161);
				query_continuation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_body_clauseContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Let_clauseContext let_clause() {
			return getRuleContext(Let_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Combined_join_clauseContext combined_join_clause() {
			return getRuleContext(Combined_join_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Query_body_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body_clause; }
	}

	public final Query_body_clauseContext query_body_clause() throws RecognitionException {
		Query_body_clauseContext _localctx = new Query_body_clauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_query_body_clause);
		try {
			setState(1169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				from_clause();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				let_clause();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
				where_clause();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1167);
				combined_join_clause();
				}
				break;
			case ORDERBY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1168);
				orderby_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_clauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_clause; }
	}

	public final Let_clauseContext let_clause() throws RecognitionException {
		Let_clauseContext _localctx = new Let_clauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_let_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(LET);
			setState(1172);
			identifier();
			setState(1173);
			match(ASSIGNMENT);
			setState(1174);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(WHERE);
			setState(1177);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combined_join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public Combined_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_join_clause; }
	}

	public final Combined_join_clauseContext combined_join_clause() throws RecognitionException {
		Combined_join_clauseContext _localctx = new Combined_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_combined_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(JOIN);
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1180);
				type_();
				}
				break;
			}
			setState(1183);
			identifier();
			setState(1184);
			match(IN);
			setState(1185);
			expression();
			setState(1186);
			match(ON);
			setState(1187);
			expression();
			setState(1188);
			match(EQUALS);
			setState(1189);
			expression();
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1190);
				match(INTO);
				setState(1191);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public List<OrderingContext> ordering() {
			return getRuleContexts(OrderingContext.class);
		}
		public OrderingContext ordering(int i) {
			return getRuleContext(OrderingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(ORDERBY);
			setState(1195);
			ordering();
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1196);
				match(COMMA);
				setState(1197);
				ordering();
				}
				}
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderingContext extends ParserRuleContext {
		public Token dir;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public OrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering; }
	}

	public final OrderingContext ordering() throws RecognitionException {
		OrderingContext _localctx = new OrderingContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			expression();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASCENDING || _la==DESCENDING) {
				{
				setState(1204);
				((OrderingContext)_localctx).dir = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASCENDING || _la==DESCENDING) ) {
					((OrderingContext)_localctx).dir = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_group_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public Select_or_group_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_group_clause; }
	}

	public final Select_or_group_clauseContext select_or_group_clause() throws RecognitionException {
		Select_or_group_clauseContext _localctx = new Select_or_group_clauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_select_or_group_clause);
		try {
			setState(1214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1207);
				match(SELECT);
				setState(1208);
				expression();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				match(GROUP);
				setState(1210);
				expression();
				setState(1211);
				match(BY);
				setState(1212);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_continuationContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_continuation; }
	}

	public final Query_continuationContext query_continuation() throws RecognitionException {
		Query_continuationContext _localctx = new Query_continuationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_query_continuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(INTO);
			setState(1217);
			identifier();
			setState(1218);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Labeled_StatementContext labeled_Statement() {
			return getRuleContext(Labeled_StatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_statement);
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220);
				labeled_Statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				declarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Local_constant_declarationContext local_constant_declaration() {
			return getRuleContext(Local_constant_declarationContext.class,0);
		}
		public Local_function_declarationContext local_function_declaration() {
			return getRuleContext(Local_function_declarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_declarationStatement);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				local_variable_declaration();
				setState(1226);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				local_constant_declaration();
				setState(1229);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1231);
				local_function_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_function_declarationContext extends ParserRuleContext {
		public Local_function_headerContext local_function_header() {
			return getRuleContext(Local_function_headerContext.class,0);
		}
		public Local_function_bodyContext local_function_body() {
			return getRuleContext(Local_function_bodyContext.class,0);
		}
		public Local_function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_declaration; }
	}

	public final Local_function_declarationContext local_function_declaration() throws RecognitionException {
		Local_function_declarationContext _localctx = new Local_function_declarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_local_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			local_function_header();
			setState(1235);
			local_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_function_headerContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Local_function_modifiersContext local_function_modifiers() {
			return getRuleContext(Local_function_modifiersContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Local_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_header; }
	}

	public final Local_function_headerContext local_function_header() throws RecognitionException {
		Local_function_headerContext _localctx = new Local_function_headerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_local_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1237);
				local_function_modifiers();
				}
				break;
			}
			setState(1240);
			return_type();
			setState(1241);
			identifier();
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1242);
				type_parameter_list();
				}
			}

			setState(1245);
			match(OPEN_PARENS);
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
				{
				setState(1246);
				formal_parameter_list();
				}
			}

			setState(1249);
			match(CLOSE_PARENS);
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1250);
				type_parameter_constraints_clauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_function_modifiersContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public Local_function_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_modifiers; }
	}

	public final Local_function_modifiersContext local_function_modifiers() throws RecognitionException {
		Local_function_modifiersContext _localctx = new Local_function_modifiersContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_local_function_modifiers);
		int _la;
		try {
			setState(1259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASYNC:
			case UNSAFE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==UNSAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(1254);
					match(STATIC);
					}
				}

				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				match(STATIC);
				setState(1258);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==UNSAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_function_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Local_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_body; }
	}

	public final Local_function_bodyContext local_function_body() throws RecognitionException {
		Local_function_bodyContext _localctx = new Local_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_local_function_body);
		try {
			setState(1266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				block();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				right_arrow();
				setState(1263);
				throwable_expression();
				setState(1264);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_Statement; }
	}

	public final Labeled_StatementContext labeled_Statement() throws RecognitionException {
		Labeled_StatementContext _localctx = new Labeled_StatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_labeled_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			identifier();
			setState(1269);
			match(COLON);
			setState(1270);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Embedded_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public Embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_statement; }
	}

	public final Embedded_statementContext embedded_statement() throws RecognitionException {
		Embedded_statementContext _localctx = new Embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_embedded_statement);
		try {
			setState(1274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_embedded_statementContext extends ParserRuleContext {
		public Simple_embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_embedded_statement; }
	 
		public Simple_embedded_statementContext() { }
		public void copyFrom(Simple_embedded_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TryStatementContext extends Simple_embedded_statementContext {
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class CheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ThrowStatementContext extends Simple_embedded_statementContext {
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class TheEmptyStatementContext extends Simple_embedded_statementContext {
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TheEmptyStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UnsafeStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnsafeStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ForStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CSharpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSharpParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_iteratorContext for_iterator() {
			return getRuleContext(For_iteratorContext.class,0);
		}
		public ForStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakStatementContext extends Simple_embedded_statementContext {
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public BreakStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class IfStatementContext extends Simple_embedded_statementContext {
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public IfStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatementContext extends Simple_embedded_statementContext {
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class GotoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public GotoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class SwitchStatementContext extends Simple_embedded_statementContext {
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public SwitchStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class FixedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public FixedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStatementContext extends Simple_embedded_statementContext {
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public WhileStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class DoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public DoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ForeachStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public ForeachStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UncheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionStatementContext extends Simple_embedded_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ContinueStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class UsingStatementContext extends Simple_embedded_statementContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Resource_acquisitionContext resource_acquisition() {
			return getRuleContext(Resource_acquisitionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public UsingStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class LockStatementContext extends Simple_embedded_statementContext {
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public LockStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}
	public static class YieldStatementContext extends Simple_embedded_statementContext {
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public YieldStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
	}

	public final Simple_embedded_statementContext simple_embedded_statement() throws RecognitionException {
		Simple_embedded_statementContext _localctx = new Simple_embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_simple_embedded_statement);
		int _la;
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new TheEmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1276);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				expression();
				setState(1278);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1280);
				match(IF);
				setState(1281);
				match(OPEN_PARENS);
				setState(1282);
				expression();
				setState(1283);
				match(CLOSE_PARENS);
				setState(1284);
				if_body();
				setState(1287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1285);
					match(ELSE);
					setState(1286);
					if_body();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1289);
				match(SWITCH);
				setState(1290);
				match(OPEN_PARENS);
				setState(1291);
				expression();
				setState(1292);
				match(CLOSE_PARENS);
				setState(1293);
				match(OPEN_BRACE);
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1294);
					switch_section();
					}
					}
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1300);
				match(CLOSE_BRACE);
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1302);
				match(WHILE);
				setState(1303);
				match(OPEN_PARENS);
				setState(1304);
				expression();
				setState(1305);
				match(CLOSE_PARENS);
				setState(1306);
				embedded_statement();
				}
				break;
			case 6:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1308);
				match(DO);
				setState(1309);
				embedded_statement();
				setState(1310);
				match(WHILE);
				setState(1311);
				match(OPEN_PARENS);
				setState(1312);
				expression();
				setState(1313);
				match(CLOSE_PARENS);
				setState(1314);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1316);
				match(FOR);
				setState(1317);
				match(OPEN_PARENS);
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FIXED) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (USING - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(1318);
					for_initializer();
					}
				}

				setState(1321);
				match(SEMICOLON);
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(1322);
					expression();
					}
				}

				setState(1325);
				match(SEMICOLON);
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(1326);
					for_iterator();
					}
				}

				setState(1329);
				match(CLOSE_PARENS);
				setState(1330);
				embedded_statement();
				}
				break;
			case 8:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AWAIT) {
					{
					setState(1331);
					match(AWAIT);
					}
				}

				setState(1334);
				match(FOREACH);
				setState(1335);
				match(OPEN_PARENS);
				setState(1336);
				local_variable_type();
				setState(1337);
				identifier();
				setState(1338);
				match(IN);
				setState(1339);
				expression();
				setState(1340);
				match(CLOSE_PARENS);
				setState(1341);
				embedded_statement();
				}
				break;
			case 9:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1343);
				match(BREAK);
				setState(1344);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1345);
				match(CONTINUE);
				setState(1346);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1347);
				match(GOTO);
				setState(1352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case UNMANAGED:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(1348);
					identifier();
					}
					break;
				case CASE:
					{
					setState(1349);
					match(CASE);
					setState(1350);
					expression();
					}
					break;
				case DEFAULT:
					{
					setState(1351);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1354);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1355);
				match(RETURN);
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(1356);
					expression();
					}
				}

				setState(1359);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1360);
				match(THROW);
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(1361);
					expression();
					}
				}

				setState(1364);
				match(SEMICOLON);
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1365);
				match(TRY);
				setState(1366);
				block();
				setState(1372);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1367);
					catch_clauses();
					setState(1369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1368);
						finally_clause();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1371);
					finally_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new CheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1374);
				match(CHECKED);
				setState(1375);
				block();
				}
				break;
			case 16:
				_localctx = new UncheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1376);
				match(UNCHECKED);
				setState(1377);
				block();
				}
				break;
			case 17:
				_localctx = new LockStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1378);
				match(LOCK);
				setState(1379);
				match(OPEN_PARENS);
				setState(1380);
				expression();
				setState(1381);
				match(CLOSE_PARENS);
				setState(1382);
				embedded_statement();
				}
				break;
			case 18:
				_localctx = new UsingStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1384);
				match(USING);
				setState(1385);
				match(OPEN_PARENS);
				setState(1386);
				resource_acquisition();
				setState(1387);
				match(CLOSE_PARENS);
				setState(1388);
				embedded_statement();
				}
				break;
			case 19:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1390);
				match(YIELD);
				setState(1394);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(1391);
					match(RETURN);
					setState(1392);
					expression();
					}
					break;
				case BREAK:
					{
					setState(1393);
					match(BREAK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1396);
				match(SEMICOLON);
				}
				break;
			case 20:
				_localctx = new UnsafeStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1397);
				match(UNSAFE);
				setState(1398);
				block();
				}
				break;
			case 21:
				_localctx = new FixedStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1399);
				match(FIXED);
				setState(1400);
				match(OPEN_PARENS);
				setState(1401);
				pointer_type();
				setState(1402);
				fixed_pointer_declarators();
				setState(1403);
				match(CLOSE_PARENS);
				setState(1404);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(OPEN_BRACE);
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DO) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << FROM) | (1L << GET) | (1L << GOTO) | (1L << GROUP) | (1L << IF) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LOCK) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (RETURN - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (THROW - 64)) | (1L << (TRUE - 64)) | (1L << (TRY - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (USING - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (WHILE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)) | (1L << (OPEN_BRACE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (SEMICOLON - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(1409);
				statement_list();
				}
			}

			setState(1412);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declarationContext extends ParserRuleContext {
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public List<Local_variable_declaratorContext> local_variable_declarator() {
			return getRuleContexts(Local_variable_declaratorContext.class);
		}
		public Local_variable_declaratorContext local_variable_declarator(int i) {
			return getRuleContext(Local_variable_declaratorContext.class,i);
		}
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_local_variable_declaration);
		int _la;
		try {
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case USING:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1414);
					match(USING);
					}
					break;
				case 2:
					{
					setState(1415);
					match(REF);
					}
					break;
				case 3:
					{
					setState(1416);
					match(REF);
					setState(1417);
					match(READONLY);
					}
					break;
				}
				setState(1420);
				local_variable_type();
				setState(1421);
				local_variable_declarator();
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1422);
					match(COMMA);
					setState(1423);
					local_variable_declarator();
					setState(1424);
					if (!( this.IsLocalVariableDeclaration() )) throw new FailedPredicateException(this, " this.IsLocalVariableDeclaration() ");
					}
					}
					setState(1430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FIXED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				match(FIXED);
				setState(1432);
				pointer_type();
				setState(1433);
				fixed_pointer_declarators();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_typeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Local_variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_type; }
	}

	public final Local_variable_typeContext local_variable_type() throws RecognitionException {
		Local_variable_typeContext _localctx = new Local_variable_typeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_local_variable_type);
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				type_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Local_variable_initializerContext local_variable_initializer() {
			return getRuleContext(Local_variable_initializerContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public Local_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declarator; }
	}

	public final Local_variable_declaratorContext local_variable_declarator() throws RecognitionException {
		Local_variable_declaratorContext _localctx = new Local_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_local_variable_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			identifier();
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1442);
				match(ASSIGNMENT);
				setState(1444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1443);
					match(REF);
					}
					break;
				}
				setState(1446);
				local_variable_initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Stackalloc_initializerContext stackalloc_initializer() {
			return getRuleContext(Stackalloc_initializerContext.class,0);
		}
		public Local_variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer; }
	}

	public final Local_variable_initializerContext local_variable_initializer() throws RecognitionException {
		Local_variable_initializerContext _localctx = new Local_variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_local_variable_initializer);
		try {
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1449);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				array_initializer();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1451);
				stackalloc_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Local_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_constant_declaration; }
	}

	public final Local_constant_declarationContext local_constant_declaration() throws RecognitionException {
		Local_constant_declarationContext _localctx = new Local_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_local_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(CONST);
			setState(1455);
			type_();
			setState(1456);
			constant_declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_if_body);
		try {
			setState(1460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_sectionContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_switch_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1463); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1462);
					switch_label();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1465); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1467);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Case_guardContext case_guard() {
			return getRuleContext(Case_guardContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_switch_label);
		int _la;
		try {
			setState(1478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				match(CASE);
				setState(1470);
				expression();
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(1471);
					case_guard();
					}
				}

				setState(1474);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476);
				match(DEFAULT);
				setState(1477);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_guardContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_guardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_guard; }
	}

	public final Case_guardContext case_guard() throws RecognitionException {
		Case_guardContext _localctx = new Case_guardContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_case_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(WHEN);
			setState(1481);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1484); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1483);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1486); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initializerContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_for_initializer);
		int _la;
		try {
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				expression();
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1490);
					match(COMMA);
					setState(1491);
					expression();
					}
					}
					setState(1496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_iteratorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public For_iteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iterator; }
	}

	public final For_iteratorContext for_iterator() throws RecognitionException {
		For_iteratorContext _localctx = new For_iteratorContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_for_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			expression();
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1500);
				match(COMMA);
				setState(1501);
				expression();
				}
				}
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clausesContext extends ParserRuleContext {
		public List<Specific_catch_clauseContext> specific_catch_clause() {
			return getRuleContexts(Specific_catch_clauseContext.class);
		}
		public Specific_catch_clauseContext specific_catch_clause(int i) {
			return getRuleContext(Specific_catch_clauseContext.class,i);
		}
		public General_catch_clauseContext general_catch_clause() {
			return getRuleContext(General_catch_clauseContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_catch_clauses);
		int _la;
		try {
			int _alt;
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				specific_catch_clause();
				setState(1511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1508);
						specific_catch_clause();
						}
						} 
					}
					setState(1513);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1514);
					general_catch_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				general_catch_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specific_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public Specific_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_catch_clause; }
	}

	public final Specific_catch_clauseContext specific_catch_clause() throws RecognitionException {
		Specific_catch_clauseContext _localctx = new Specific_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_specific_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			match(CATCH);
			setState(1521);
			match(OPEN_PARENS);
			setState(1522);
			class_type();
			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1523);
				identifier();
				}
			}

			setState(1526);
			match(CLOSE_PARENS);
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1527);
				exception_filter();
				}
			}

			setState(1530);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public General_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_catch_clause; }
	}

	public final General_catch_clauseContext general_catch_clause() throws RecognitionException {
		General_catch_clauseContext _localctx = new General_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_general_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			match(CATCH);
			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1533);
				exception_filter();
				}
			}

			setState(1536);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_filterContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Exception_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_filter; }
	}

	public final Exception_filterContext exception_filter() throws RecognitionException {
		Exception_filterContext _localctx = new Exception_filterContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_exception_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(WHEN);
			setState(1539);
			match(OPEN_PARENS);
			setState(1540);
			expression();
			setState(1541);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(FINALLY);
			setState(1544);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_acquisitionContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Resource_acquisitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_acquisition; }
	}

	public final Resource_acquisitionContext resource_acquisition() throws RecognitionException {
		Resource_acquisitionContext _localctx = new Resource_acquisitionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_resource_acquisition);
		try {
			setState(1548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1546);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1547);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_declarationContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			match(NAMESPACE);
			setState(1551);
			namespace_body();
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1552);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Namespace_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_body; }
	}

	public final Namespace_bodyContext namespace_body() throws RecognitionException {
		Namespace_bodyContext _localctx = new Namespace_bodyContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_namespace_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(OPEN_BRACE);
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1556);
				using_directives();
				}
			}

			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NAMESPACE - 65)) | (1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REF - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (STRUCT - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0)) {
				{
				setState(1559);
				namespace_member_declarations();
				}
			}

			setState(1562);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directivesContext extends ParserRuleContext {
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public Using_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directives; }
	}

	public final Using_directivesContext using_directives() throws RecognitionException {
		Using_directivesContext _localctx = new Using_directivesContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_using_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1564);
				using_directive();
				}
				}
				setState(1567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directiveContext extends ParserRuleContext {
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
	 
		public Using_directiveContext() { }
		public void copyFrom(Using_directiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingNamespaceDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public UsingNamespaceDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}
	public static class UsingStaticDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public UsingStaticDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_using_directive);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				_localctx = new UsingNamespaceDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				match(USING);
				setState(1570);
				namespace_or_type_name();
				setState(1571);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new UsingStaticDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				match(USING);
				setState(1574);
				match(STATIC);
				setState(1575);
				namespace_or_type_name();
				setState(1576);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationsContext extends ParserRuleContext {
		public List<Namespace_member_declarationContext> namespace_member_declaration() {
			return getRuleContexts(Namespace_member_declarationContext.class);
		}
		public Namespace_member_declarationContext namespace_member_declaration(int i) {
			return getRuleContext(Namespace_member_declarationContext.class,i);
		}
		public Namespace_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declarations; }
	}

	public final Namespace_member_declarationsContext namespace_member_declarations() throws RecognitionException {
		Namespace_member_declarationsContext _localctx = new Namespace_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_namespace_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1580);
				namespace_member_declaration();
				}
				}
				setState(1583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NAMESPACE - 65)) | (1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REF - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (STRUCT - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationContext extends ParserRuleContext {
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Namespace_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declaration; }
	}

	public final Namespace_member_declarationContext namespace_member_declaration() throws RecognitionException {
		Namespace_member_declarationContext _localctx = new Namespace_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_namespace_member_declaration);
		try {
			setState(1587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				namespace_declaration();
				}
				break;
			case ABSTRACT:
			case ASYNC:
			case CLASS:
			case DELEGATE:
			case ENUM:
			case EXTERN:
			case INTERFACE:
			case INTERNAL:
			case NEW:
			case OVERRIDE:
			case PARTIAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case REF:
			case SEALED:
			case STATIC:
			case STRUCT:
			case UNSAFE:
			case VIRTUAL:
			case VOLATILE:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				type_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declarationContext extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1589);
				attributes();
				}
			}

			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1592);
				all_member_modifiers();
				}
				break;
			}
			setState(1600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1595);
				class_definition();
				}
				break;
			case READONLY:
			case REF:
			case STRUCT:
				{
				setState(1596);
				struct_definition();
				}
				break;
			case INTERFACE:
				{
				setState(1597);
				interface_definition();
				}
				break;
			case ENUM:
				{
				setState(1598);
				enum_definition();
				}
				break;
			case DELEGATE:
				{
				setState(1599);
				delegate_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_alias_memberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(CSharpParser.DOUBLE_COLON, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Qualified_alias_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_alias_member; }
	}

	public final Qualified_alias_memberContext qualified_alias_member() throws RecognitionException {
		Qualified_alias_memberContext _localctx = new Qualified_alias_memberContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_qualified_alias_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			identifier();
			setState(1603);
			match(DOUBLE_COLON);
			setState(1604);
			identifier();
			setState(1606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1605);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_list; }
	}

	public final Type_parameter_listContext type_parameter_list() throws RecognitionException {
		Type_parameter_listContext _localctx = new Type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(LT);
			setState(1609);
			type_parameter();
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1610);
				match(COMMA);
				setState(1611);
				type_parameter();
				}
				}
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1617);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1619);
				attributes();
				}
			}

			setState(1622);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Class_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_base; }
	}

	public final Class_baseContext class_base() throws RecognitionException {
		Class_baseContext _localctx = new Class_baseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_class_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			match(COLON);
			setState(1625);
			class_type();
			setState(1630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1626);
				match(COMMA);
				setState(1627);
				namespace_or_type_name();
				}
				}
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_type_listContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Interface_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type_list; }
	}

	public final Interface_type_listContext interface_type_list() throws RecognitionException {
		Interface_type_listContext _localctx = new Interface_type_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_interface_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			namespace_or_type_name();
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1634);
				match(COMMA);
				setState(1635);
				namespace_or_type_name();
				}
				}
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraints_clausesContext extends ParserRuleContext {
		public List<Type_parameter_constraints_clauseContext> type_parameter_constraints_clause() {
			return getRuleContexts(Type_parameter_constraints_clauseContext.class);
		}
		public Type_parameter_constraints_clauseContext type_parameter_constraints_clause(int i) {
			return getRuleContext(Type_parameter_constraints_clauseContext.class,i);
		}
		public Type_parameter_constraints_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clauses; }
	}

	public final Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() throws RecognitionException {
		Type_parameter_constraints_clausesContext _localctx = new Type_parameter_constraints_clausesContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_type_parameter_constraints_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1641);
				type_parameter_constraints_clause();
				}
				}
				setState(1644); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHERE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraints_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Type_parameter_constraintsContext type_parameter_constraints() {
			return getRuleContext(Type_parameter_constraintsContext.class,0);
		}
		public Type_parameter_constraints_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clause; }
	}

	public final Type_parameter_constraints_clauseContext type_parameter_constraints_clause() throws RecognitionException {
		Type_parameter_constraints_clauseContext _localctx = new Type_parameter_constraints_clauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_type_parameter_constraints_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			match(WHERE);
			setState(1647);
			identifier();
			setState(1648);
			match(COLON);
			setState(1649);
			type_parameter_constraints();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraintsContext extends ParserRuleContext {
		public Constructor_constraintContext constructor_constraint() {
			return getRuleContext(Constructor_constraintContext.class,0);
		}
		public Primary_constraintContext primary_constraint() {
			return getRuleContext(Primary_constraintContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Secondary_constraintsContext secondary_constraints() {
			return getRuleContext(Secondary_constraintsContext.class,0);
		}
		public Type_parameter_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints; }
	}

	public final Type_parameter_constraintsContext type_parameter_constraints() throws RecognitionException {
		Type_parameter_constraintsContext _localctx = new Type_parameter_constraintsContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_type_parameter_constraints);
		int _la;
		try {
			setState(1661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1651);
				constructor_constraint();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case CLASS:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case STRUCT:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				primary_constraint();
				setState(1655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1653);
					match(COMMA);
					setState(1654);
					secondary_constraints();
					}
					break;
				}
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1657);
					match(COMMA);
					setState(1658);
					constructor_constraint();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_constraintContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public TerminalNode UNMANAGED() { return getToken(CSharpParser.UNMANAGED, 0); }
		public Primary_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_constraint; }
	}

	public final Primary_constraintContext primary_constraint() throws RecognitionException {
		Primary_constraintContext _localctx = new Primary_constraintContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_primary_constraint);
		int _la;
		try {
			setState(1670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				class_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
				match(CLASS);
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERR) {
					{
					setState(1665);
					match(INTERR);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				match(STRUCT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1669);
				match(UNMANAGED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secondary_constraintsContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Secondary_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_constraints; }
	}

	public final Secondary_constraintsContext secondary_constraints() throws RecognitionException {
		Secondary_constraintsContext _localctx = new Secondary_constraintsContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_secondary_constraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			namespace_or_type_name();
			setState(1677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1673);
					match(COMMA);
					setState(1674);
					namespace_or_type_name();
					}
					} 
				}
				setState(1679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_constraintContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Constructor_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_constraint; }
	}

	public final Constructor_constraintContext constructor_constraint() throws RecognitionException {
		Constructor_constraintContext _localctx = new Constructor_constraintContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_constructor_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			match(NEW);
			setState(1681);
			match(OPEN_PARENS);
			setState(1682);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Class_member_declarationsContext class_member_declarations() {
			return getRuleContext(Class_member_declarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			match(OPEN_BRACE);
			setState(1686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCT - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNMANAGED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) || _la==OPEN_PARENS || _la==TILDE) {
				{
				setState(1685);
				class_member_declarations();
				}
			}

			setState(1688);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationsContext extends ParserRuleContext {
		public List<Class_member_declarationContext> class_member_declaration() {
			return getRuleContexts(Class_member_declarationContext.class);
		}
		public Class_member_declarationContext class_member_declaration(int i) {
			return getRuleContext(Class_member_declarationContext.class,i);
		}
		public Class_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declarations; }
	}

	public final Class_member_declarationsContext class_member_declarations() throws RecognitionException {
		Class_member_declarationsContext _localctx = new Class_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_class_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1690);
				class_member_declaration();
				}
				}
				setState(1693); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCT - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNMANAGED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) || _la==OPEN_PARENS || _la==TILDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public Destructor_definitionContext destructor_definition() {
			return getRuleContext(Destructor_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Class_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declaration; }
	}

	public final Class_member_declarationContext class_member_declaration() throws RecognitionException {
		Class_member_declarationContext _localctx = new Class_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_class_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1695);
				attributes();
				}
			}

			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1698);
				all_member_modifiers();
				}
				break;
			}
			setState(1703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case READONLY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(1701);
				common_member_declaration();
				}
				break;
			case TILDE:
				{
				setState(1702);
				destructor_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifiersContext extends ParserRuleContext {
		public List<All_member_modifierContext> all_member_modifier() {
			return getRuleContexts(All_member_modifierContext.class);
		}
		public All_member_modifierContext all_member_modifier(int i) {
			return getRuleContext(All_member_modifierContext.class,i);
		}
		public All_member_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifiers; }
	}

	public final All_member_modifiersContext all_member_modifiers() throws RecognitionException {
		All_member_modifiersContext _localctx = new All_member_modifiersContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_all_member_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1706); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1705);
					all_member_modifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1708); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifierContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public All_member_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifier; }
	}

	public final All_member_modifierContext all_member_modifier() throws RecognitionException {
		All_member_modifierContext _localctx = new All_member_modifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_all_member_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << EXTERN) | (1L << INTERNAL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEW - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PARTIAL - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (PUBLIC - 66)) | (1L << (READONLY - 66)) | (1L << (SEALED - 66)) | (1L << (STATIC - 66)) | (1L << (UNSAFE - 66)) | (1L << (VIRTUAL - 66)) | (1L << (VOLATILE - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_member_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Typed_member_declarationContext typed_member_declaration() {
			return getRuleContext(Typed_member_declarationContext.class,0);
		}
		public Event_declarationContext event_declaration() {
			return getRuleContext(Event_declarationContext.class,0);
		}
		public Conversion_operator_declaratorContext conversion_operator_declarator() {
			return getRuleContext(Conversion_operator_declaratorContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public Common_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_member_declaration; }
	}

	public final Common_member_declarationContext common_member_declaration() throws RecognitionException {
		Common_member_declarationContext _localctx = new Common_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_common_member_declaration);
		try {
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1712);
				constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
				typed_member_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1714);
				event_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1715);
				conversion_operator_declarator();
				setState(1721);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
				case SEMICOLON:
					{
					setState(1716);
					body();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1717);
					right_arrow();
					setState(1718);
					throwable_expression();
					setState(1719);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1723);
				constructor_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1724);
				match(VOID);
				setState(1725);
				method_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1726);
				class_definition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1727);
				struct_definition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1728);
				interface_definition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1729);
				enum_definition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1730);
				delegate_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_member_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CSharpParser.DOT, 0); }
		public Indexer_declarationContext indexer_declaration() {
			return getRuleContext(Indexer_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public Typed_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_member_declaration; }
	}

	public final Typed_member_declarationContext typed_member_declaration() throws RecognitionException {
		Typed_member_declarationContext _localctx = new Typed_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_typed_member_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1733);
				match(REF);
				}
				break;
			case 2:
				{
				setState(1734);
				match(READONLY);
				setState(1735);
				match(REF);
				}
				break;
			case 3:
				{
				setState(1736);
				match(REF);
				setState(1737);
				match(READONLY);
				}
				break;
			}
			setState(1740);
			type_();
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1741);
				namespace_or_type_name();
				setState(1742);
				match(DOT);
				setState(1743);
				indexer_declaration();
				}
				break;
			case 2:
				{
				setState(1745);
				method_declaration();
				}
				break;
			case 3:
				{
				setState(1746);
				property_declaration();
				}
				break;
			case 4:
				{
				setState(1747);
				indexer_declaration();
				}
				break;
			case 5:
				{
				setState(1748);
				operator_declaration();
				}
				break;
			case 6:
				{
				setState(1749);
				field_declaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaratorsContext extends ParserRuleContext {
		public List<Constant_declaratorContext> constant_declarator() {
			return getRuleContexts(Constant_declaratorContext.class);
		}
		public Constant_declaratorContext constant_declarator(int i) {
			return getRuleContext(Constant_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Constant_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarators; }
	}

	public final Constant_declaratorsContext constant_declarators() throws RecognitionException {
		Constant_declaratorsContext _localctx = new Constant_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_constant_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			constant_declarator();
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1753);
				match(COMMA);
				setState(1754);
				constant_declarator();
				}
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarator; }
	}

	public final Constant_declaratorContext constant_declarator() throws RecognitionException {
		Constant_declaratorContext _localctx = new Constant_declaratorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_constant_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			identifier();
			setState(1761);
			match(ASSIGNMENT);
			setState(1762);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			variable_declarator();
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1765);
				match(COMMA);
				setState(1766);
				variable_declarator();
				}
				}
				setState(1771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			identifier();
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1773);
				match(ASSIGNMENT);
				setState(1774);
				variable_initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer; }
	}

	public final Variable_initializerContext variable_initializer() throws RecognitionException {
		Variable_initializerContext _localctx = new Variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_variable_initializer);
		try {
			setState(1779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1777);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				array_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_return_type);
		try {
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				type_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_nameContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			namespace_or_type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_method_body);
		try {
			setState(1789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1787);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1788);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Parameter_arrayContext parameter_array() {
			return getRuleContext(Parameter_arrayContext.class,0);
		}
		public Fixed_parametersContext fixed_parameters() {
			return getRuleContext(Fixed_parametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_formal_parameter_list);
		int _la;
		try {
			setState(1797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791);
				parameter_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1792);
				fixed_parameters();
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1793);
					match(COMMA);
					setState(1794);
					parameter_array();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parametersContext extends ParserRuleContext {
		public List<Fixed_parameterContext> fixed_parameter() {
			return getRuleContexts(Fixed_parameterContext.class);
		}
		public Fixed_parameterContext fixed_parameter(int i) {
			return getRuleContext(Fixed_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Fixed_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameters; }
	}

	public final Fixed_parametersContext fixed_parameters() throws RecognitionException {
		Fixed_parametersContext _localctx = new Fixed_parametersContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_fixed_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			fixed_parameter();
			setState(1804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1800);
					match(COMMA);
					setState(1801);
					fixed_parameter();
					}
					} 
				}
				setState(1806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parameterContext extends ParserRuleContext {
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_modifierContext parameter_modifier() {
			return getRuleContext(Parameter_modifierContext.class,0);
		}
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public Fixed_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameter; }
	}

	public final Fixed_parameterContext fixed_parameter() throws RecognitionException {
		Fixed_parameterContext _localctx = new Fixed_parameterContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_fixed_parameter);
		int _la;
		try {
			setState(1815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1807);
					attributes();
					}
				}

				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IN - 54)) | (1L << (OUT - 54)) | (1L << (REF - 54)) | (1L << (THIS - 54)))) != 0)) {
					{
					setState(1810);
					parameter_modifier();
					}
				}

				setState(1813);
				arg_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1814);
				match(ARGLIST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_modifierContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Parameter_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_modifier; }
	}

	public final Parameter_modifierContext parameter_modifier() throws RecognitionException {
		Parameter_modifierContext _localctx = new Parameter_modifierContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_parameter_modifier);
		try {
			setState(1825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				match(REF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				match(OUT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1819);
				match(IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1820);
				match(REF);
				setState(1821);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1822);
				match(IN);
				setState(1823);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1824);
				match(THIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_arrayContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_array; }
	}

	public final Parameter_arrayContext parameter_array() throws RecognitionException {
		Parameter_arrayContext _localctx = new Parameter_arrayContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_parameter_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1827);
				attributes();
				}
			}

			setState(1830);
			match(PARAMS);
			setState(1831);
			array_type();
			setState(1832);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_declarationsContext extends ParserRuleContext {
		public AttributesContext attrs;
		public Accessor_modifierContext mods;
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext set_accessor_declaration() {
			return getRuleContext(Set_accessor_declarationContext.class,0);
		}
		public Get_accessor_declarationContext get_accessor_declaration() {
			return getRuleContext(Get_accessor_declarationContext.class,0);
		}
		public Accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_declarations; }
	}

	public final Accessor_declarationsContext accessor_declarations() throws RecognitionException {
		Accessor_declarationsContext _localctx = new Accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1834);
				((Accessor_declarationsContext)_localctx).attrs = attributes();
				}
			}

			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTERNAL - 57)) | (1L << (PRIVATE - 57)) | (1L << (PROTECTED - 57)))) != 0)) {
				{
				setState(1837);
				((Accessor_declarationsContext)_localctx).mods = accessor_modifier();
				}
			}

			setState(1850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1840);
				match(GET);
				setState(1841);
				accessor_body();
				setState(1843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERNAL || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PRIVATE - 76)) | (1L << (PROTECTED - 76)) | (1L << (SET - 76)) | (1L << (OPEN_BRACKET - 76)))) != 0)) {
					{
					setState(1842);
					set_accessor_declaration();
					}
				}

				}
				break;
			case SET:
				{
				setState(1845);
				match(SET);
				setState(1846);
				accessor_body();
				setState(1848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==INTERNAL || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PRIVATE - 76)) | (1L << (PROTECTED - 76)) | (1L << (OPEN_BRACKET - 76)))) != 0)) {
					{
					setState(1847);
					get_accessor_declaration();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Get_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_accessor_declaration; }
	}

	public final Get_accessor_declarationContext get_accessor_declaration() throws RecognitionException {
		Get_accessor_declarationContext _localctx = new Get_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_get_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1852);
				attributes();
				}
			}

			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTERNAL - 57)) | (1L << (PRIVATE - 57)) | (1L << (PROTECTED - 57)))) != 0)) {
				{
				setState(1855);
				accessor_modifier();
				}
			}

			setState(1858);
			match(GET);
			setState(1859);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_accessor_declaration; }
	}

	public final Set_accessor_declarationContext set_accessor_declaration() throws RecognitionException {
		Set_accessor_declarationContext _localctx = new Set_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_set_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1861);
				attributes();
				}
			}

			setState(1865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTERNAL - 57)) | (1L << (PRIVATE - 57)) | (1L << (PROTECTED - 57)))) != 0)) {
				{
				setState(1864);
				accessor_modifier();
				}
			}

			setState(1867);
			match(SET);
			setState(1868);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_modifierContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public Accessor_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_modifier; }
	}

	public final Accessor_modifierContext accessor_modifier() throws RecognitionException {
		Accessor_modifierContext _localctx = new Accessor_modifierContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_accessor_modifier);
		try {
			setState(1877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1870);
				match(PROTECTED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1871);
				match(INTERNAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1872);
				match(PRIVATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1873);
				match(PROTECTED);
				setState(1874);
				match(INTERNAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1875);
				match(INTERNAL);
				setState(1876);
				match(PROTECTED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Accessor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_body; }
	}

	public final Accessor_bodyContext accessor_body() throws RecognitionException {
		Accessor_bodyContext _localctx = new Accessor_bodyContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_accessor_body);
		try {
			setState(1881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1879);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1880);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_accessor_declarationsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Remove_accessor_declarationContext remove_accessor_declaration() {
			return getRuleContext(Remove_accessor_declarationContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public Add_accessor_declarationContext add_accessor_declaration() {
			return getRuleContext(Add_accessor_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Event_accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_accessor_declarations; }
	}

	public final Event_accessor_declarationsContext event_accessor_declarations() throws RecognitionException {
		Event_accessor_declarationsContext _localctx = new Event_accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_event_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1883);
				attributes();
				}
			}

			setState(1894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(1886);
				match(ADD);
				setState(1887);
				block();
				setState(1888);
				remove_accessor_declaration();
				}
				break;
			case REMOVE:
				{
				setState(1890);
				match(REMOVE);
				setState(1891);
				block();
				setState(1892);
				add_accessor_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Add_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_accessor_declaration; }
	}

	public final Add_accessor_declarationContext add_accessor_declaration() throws RecognitionException {
		Add_accessor_declarationContext _localctx = new Add_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_add_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1896);
				attributes();
				}
			}

			setState(1899);
			match(ADD);
			setState(1900);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Remove_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Remove_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_accessor_declaration; }
	}

	public final Remove_accessor_declarationContext remove_accessor_declaration() throws RecognitionException {
		Remove_accessor_declarationContext _localctx = new Remove_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_remove_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1902);
				attributes();
				}
			}

			setState(1905);
			match(REMOVE);
			setState(1906);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Overloadable_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CSharpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CSharpParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(CSharpParser.TILDE, 0); }
		public TerminalNode OP_INC() { return getToken(CSharpParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(CSharpParser.OP_DEC, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public TerminalNode STAR() { return getToken(CSharpParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(CSharpParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(CSharpParser.PERCENT, 0); }
		public TerminalNode AMP() { return getToken(CSharpParser.AMP, 0); }
		public TerminalNode BITWISE_OR() { return getToken(CSharpParser.BITWISE_OR, 0); }
		public TerminalNode CARET() { return getToken(CSharpParser.CARET, 0); }
		public TerminalNode OP_LEFT_SHIFT() { return getToken(CSharpParser.OP_LEFT_SHIFT, 0); }
		public Right_shiftContext right_shift() {
			return getRuleContext(Right_shiftContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(CSharpParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(CSharpParser.OP_NE, 0); }
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public TerminalNode OP_GE() { return getToken(CSharpParser.OP_GE, 0); }
		public TerminalNode OP_LE() { return getToken(CSharpParser.OP_LE, 0); }
		public Overloadable_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloadable_operator; }
	}

	public final Overloadable_operatorContext overloadable_operator() throws RecognitionException {
		Overloadable_operatorContext _localctx = new Overloadable_operatorContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_overloadable_operator);
		try {
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1909);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1910);
				match(BANG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1911);
				match(TILDE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1912);
				match(OP_INC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1913);
				match(OP_DEC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1914);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1915);
				match(FALSE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1916);
				match(STAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1917);
				match(DIV);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1918);
				match(PERCENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1919);
				match(AMP);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1920);
				match(BITWISE_OR);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1921);
				match(CARET);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1922);
				match(OP_LEFT_SHIFT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1923);
				right_shift();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1924);
				match(OP_EQ);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1925);
				match(OP_NE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1926);
				match(GT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1927);
				match(LT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1928);
				match(OP_GE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1929);
				match(OP_LE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conversion_operator_declaratorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public Conversion_operator_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_operator_declarator; }
	}

	public final Conversion_operator_declaratorContext conversion_operator_declarator() throws RecognitionException {
		Conversion_operator_declaratorContext _localctx = new Conversion_operator_declaratorContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_conversion_operator_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			_la = _input.LA(1);
			if ( !(_la==EXPLICIT || _la==IMPLICIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1933);
			match(OPERATOR);
			setState(1934);
			type_();
			setState(1935);
			match(OPEN_PARENS);
			setState(1936);
			arg_declaration();
			setState(1937);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_initializerContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Constructor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_initializer; }
	}

	public final Constructor_initializerContext constructor_initializer() throws RecognitionException {
		Constructor_initializerContext _localctx = new Constructor_initializerContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_constructor_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			match(COLON);
			setState(1940);
			_la = _input.LA(1);
			if ( !(_la==BASE || _la==THIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1941);
			match(OPEN_PARENS);
			setState(1943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OUT - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(1942);
				argument_list();
				}
			}

			setState(1945);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_body);
		try {
			setState(1949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1947);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1948);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_interfacesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Struct_interfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_interfaces; }
	}

	public final Struct_interfacesContext struct_interfaces() throws RecognitionException {
		Struct_interfacesContext _localctx = new Struct_interfacesContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_struct_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			match(COLON);
			setState(1952);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Struct_member_declarationContext> struct_member_declaration() {
			return getRuleContexts(Struct_member_declarationContext.class);
		}
		public Struct_member_declarationContext struct_member_declaration(int i) {
			return getRuleContext(Struct_member_declarationContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			match(OPEN_BRACE);
			setState(1958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ABSTRACT - 9)) | (1L << (ADD - 9)) | (1L << (ALIAS - 9)) | (1L << (ARGLIST - 9)) | (1L << (ASCENDING - 9)) | (1L << (ASYNC - 9)) | (1L << (AWAIT - 9)) | (1L << (BOOL - 9)) | (1L << (BY - 9)) | (1L << (BYTE - 9)) | (1L << (CHAR - 9)) | (1L << (CLASS - 9)) | (1L << (CONST - 9)) | (1L << (DECIMAL - 9)) | (1L << (DELEGATE - 9)) | (1L << (DESCENDING - 9)) | (1L << (DOUBLE - 9)) | (1L << (DYNAMIC - 9)) | (1L << (ENUM - 9)) | (1L << (EQUALS - 9)) | (1L << (EVENT - 9)) | (1L << (EXPLICIT - 9)) | (1L << (EXTERN - 9)) | (1L << (FIXED - 9)) | (1L << (FLOAT - 9)) | (1L << (FROM - 9)) | (1L << (GET - 9)) | (1L << (GROUP - 9)) | (1L << (IMPLICIT - 9)) | (1L << (INT - 9)) | (1L << (INTERFACE - 9)) | (1L << (INTERNAL - 9)) | (1L << (INTO - 9)) | (1L << (JOIN - 9)) | (1L << (LET - 9)) | (1L << (LONG - 9)) | (1L << (NAMEOF - 9)) | (1L << (NEW - 9)) | (1L << (OBJECT - 9)) | (1L << (ON - 9)) | (1L << (ORDERBY - 9)))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (OVERRIDE - 73)) | (1L << (PARTIAL - 73)) | (1L << (PRIVATE - 73)) | (1L << (PROTECTED - 73)) | (1L << (PUBLIC - 73)) | (1L << (READONLY - 73)) | (1L << (REF - 73)) | (1L << (REMOVE - 73)) | (1L << (SBYTE - 73)) | (1L << (SEALED - 73)) | (1L << (SELECT - 73)) | (1L << (SET - 73)) | (1L << (SHORT - 73)) | (1L << (STATIC - 73)) | (1L << (STRING - 73)) | (1L << (STRUCT - 73)) | (1L << (UINT - 73)) | (1L << (ULONG - 73)) | (1L << (UNMANAGED - 73)) | (1L << (UNSAFE - 73)) | (1L << (USHORT - 73)) | (1L << (VAR - 73)) | (1L << (VIRTUAL - 73)) | (1L << (VOID - 73)) | (1L << (VOLATILE - 73)) | (1L << (WHEN - 73)) | (1L << (WHERE - 73)) | (1L << (YIELD - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (OPEN_BRACKET - 73)) | (1L << (OPEN_PARENS - 73)))) != 0)) {
				{
				{
				setState(1955);
				struct_member_declaration();
				}
				}
				setState(1960);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1961);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public List<Fixed_size_buffer_declaratorContext> fixed_size_buffer_declarator() {
			return getRuleContexts(Fixed_size_buffer_declaratorContext.class);
		}
		public Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator(int i) {
			return getRuleContext(Fixed_size_buffer_declaratorContext.class,i);
		}
		public Struct_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member_declaration; }
	}

	public final Struct_member_declarationContext struct_member_declaration() throws RecognitionException {
		Struct_member_declarationContext _localctx = new Struct_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_struct_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1963);
				attributes();
				}
			}

			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1966);
				all_member_modifiers();
				}
				break;
			}
			setState(1979);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case READONLY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(1969);
				common_member_declaration();
				}
				break;
			case FIXED:
				{
				setState(1970);
				match(FIXED);
				setState(1971);
				type_();
				setState(1973); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1972);
					fixed_size_buffer_declarator();
					}
					}
					setState(1975); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
				setState(1977);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_typeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public List<TerminalNode> INTERR() { return getTokens(CSharpParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(CSharpParser.INTERR, i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			base_type();
			setState(1989); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR || _la==INTERR) {
					{
					{
					setState(1982);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==INTERR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1988);
				rank_specifier();
				}
				}
				setState(1991); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (OPEN_BRACKET - 127)) | (1L << (STAR - 127)) | (1L << (INTERR - 127)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rank_specifierContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Rank_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifier; }
	}

	public final Rank_specifierContext rank_specifier() throws RecognitionException {
		Rank_specifierContext _localctx = new Rank_specifierContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(OPEN_BRACKET);
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1994);
				match(COMMA);
				}
				}
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2000);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Variable_initializerContext> variable_initializer() {
			return getRuleContexts(Variable_initializerContext.class);
		}
		public Variable_initializerContext variable_initializer(int i) {
			return getRuleContext(Variable_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_array_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(OPEN_BRACE);
			setState(2014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)) | (1L << (OPEN_BRACE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(2003);
				variable_initializer();
				setState(2008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2004);
						match(COMMA);
						setState(2005);
						variable_initializer();
						}
						} 
					}
					setState(2010);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
				}
				setState(2012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2011);
					match(COMMA);
					}
				}

				}
			}

			setState(2016);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameter_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public List<Variant_type_parameterContext> variant_type_parameter() {
			return getRuleContexts(Variant_type_parameterContext.class);
		}
		public Variant_type_parameterContext variant_type_parameter(int i) {
			return getRuleContext(Variant_type_parameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Variant_type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter_list; }
	}

	public final Variant_type_parameter_listContext variant_type_parameter_list() throws RecognitionException {
		Variant_type_parameter_listContext _localctx = new Variant_type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_variant_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			match(LT);
			setState(2019);
			variant_type_parameter();
			setState(2024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2020);
				match(COMMA);
				setState(2021);
				variant_type_parameter();
				}
				}
				setState(2026);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2027);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Variance_annotationContext variance_annotation() {
			return getRuleContext(Variance_annotationContext.class,0);
		}
		public Variant_type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter; }
	}

	public final Variant_type_parameterContext variant_type_parameter() throws RecognitionException {
		Variant_type_parameterContext _localctx = new Variant_type_parameterContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_variant_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2029);
				attributes();
				}
			}

			setState(2033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(2032);
				variance_annotation();
				}
			}

			setState(2035);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variance_annotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public Variance_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance_annotation; }
	}

	public final Variance_annotationContext variance_annotation() throws RecognitionException {
		Variance_annotationContext _localctx = new Variance_annotationContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_variance_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Interface_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_base; }
	}

	public final Interface_baseContext interface_base() throws RecognitionException {
		Interface_baseContext _localctx = new Interface_baseContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_interface_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			match(COLON);
			setState(2040);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Interface_member_declarationContext> interface_member_declaration() {
			return getRuleContexts(Interface_member_declarationContext.class);
		}
		public Interface_member_declarationContext interface_member_declaration(int i) {
			return getRuleContext(Interface_member_declarationContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			match(OPEN_BRACE);
			setState(2046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (EVENT - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (NEW - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PARTIAL - 75)) | (1L << (READONLY - 75)) | (1L << (REF - 75)) | (1L << (REMOVE - 75)) | (1L << (SBYTE - 75)) | (1L << (SELECT - 75)) | (1L << (SET - 75)) | (1L << (SHORT - 75)) | (1L << (STRING - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (UNMANAGED - 75)) | (1L << (UNSAFE - 75)) | (1L << (USHORT - 75)) | (1L << (VAR - 75)) | (1L << (VOID - 75)) | (1L << (WHEN - 75)) | (1L << (WHERE - 75)) | (1L << (YIELD - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (OPEN_BRACKET - 75)) | (1L << (OPEN_PARENS - 75)))) != 0)) {
				{
				{
				setState(2043);
				interface_member_declaration();
				}
				}
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2049);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_member_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Interface_accessorsContext interface_accessors() {
			return getRuleContext(Interface_accessorsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_member_declaration; }
	}

	public final Interface_member_declarationContext interface_member_declaration() throws RecognitionException {
		Interface_member_declarationContext _localctx = new Interface_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_interface_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2051);
				attributes();
				}
			}

			setState(2055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(2054);
				match(NEW);
				}
			}

			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(2057);
					match(UNSAFE);
					}
				}

				setState(2065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2060);
					match(REF);
					}
					break;
				case 2:
					{
					setState(2061);
					match(REF);
					setState(2062);
					match(READONLY);
					}
					break;
				case 3:
					{
					setState(2063);
					match(READONLY);
					setState(2064);
					match(REF);
					}
					break;
				}
				setState(2067);
				type_();
				setState(2095);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2068);
					identifier();
					setState(2070);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2069);
						type_parameter_list();
						}
					}

					setState(2072);
					match(OPEN_PARENS);
					setState(2074);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
						{
						setState(2073);
						formal_parameter_list();
						}
					}

					setState(2076);
					match(CLOSE_PARENS);
					setState(2078);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(2077);
						type_parameter_constraints_clauses();
						}
					}

					setState(2080);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(2082);
					identifier();
					setState(2083);
					match(OPEN_BRACE);
					setState(2084);
					interface_accessors();
					setState(2085);
					match(CLOSE_BRACE);
					}
					break;
				case 3:
					{
					setState(2087);
					match(THIS);
					setState(2088);
					match(OPEN_BRACKET);
					setState(2089);
					formal_parameter_list();
					setState(2090);
					match(CLOSE_BRACKET);
					setState(2091);
					match(OPEN_BRACE);
					setState(2092);
					interface_accessors();
					setState(2093);
					match(CLOSE_BRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(2097);
					match(UNSAFE);
					}
				}

				setState(2100);
				match(VOID);
				setState(2101);
				identifier();
				setState(2103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2102);
					type_parameter_list();
					}
				}

				setState(2105);
				match(OPEN_PARENS);
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
					{
					setState(2106);
					formal_parameter_list();
					}
				}

				setState(2109);
				match(CLOSE_PARENS);
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(2110);
					type_parameter_constraints_clauses();
					}
				}

				setState(2113);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(2115);
				match(EVENT);
				setState(2116);
				type_();
				setState(2117);
				identifier();
				setState(2118);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_accessorsContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CSharpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSharpParser.SEMICOLON, i);
		}
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public Interface_accessorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_accessors; }
	}

	public final Interface_accessorsContext interface_accessors() throws RecognitionException {
		Interface_accessorsContext _localctx = new Interface_accessorsContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_interface_accessors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2122);
				attributes();
				}
			}

			setState(2143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(2125);
				match(GET);
				setState(2126);
				match(SEMICOLON);
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET || _la==OPEN_BRACKET) {
					{
					setState(2128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(2127);
						attributes();
						}
					}

					setState(2130);
					match(SET);
					setState(2131);
					match(SEMICOLON);
					}
				}

				}
				break;
			case SET:
				{
				setState(2134);
				match(SET);
				setState(2135);
				match(SEMICOLON);
				setState(2141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==OPEN_BRACKET) {
					{
					setState(2137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(2136);
						attributes();
						}
					}

					setState(2139);
					match(GET);
					setState(2140);
					match(SEMICOLON);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Enum_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_base; }
	}

	public final Enum_baseContext enum_base() throws RecognitionException {
		Enum_baseContext _localctx = new Enum_baseContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_enum_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			match(COLON);
			setState(2146);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Enum_member_declarationContext> enum_member_declaration() {
			return getRuleContexts(Enum_member_declarationContext.class);
		}
		public Enum_member_declarationContext enum_member_declaration(int i) {
			return getRuleContext(Enum_member_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_enum_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			match(OPEN_BRACE);
			setState(2160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(2149);
				enum_member_declaration();
				setState(2154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2150);
						match(COMMA);
						setState(2151);
						enum_member_declaration();
						}
						} 
					}
					setState(2156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
				}
				setState(2158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2157);
					match(COMMA);
					}
				}

				}
			}

			setState(2162);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_member_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Enum_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_member_declaration; }
	}

	public final Enum_member_declarationContext enum_member_declaration() throws RecognitionException {
		Enum_member_declarationContext _localctx = new Enum_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_enum_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2164);
				attributes();
				}
			}

			setState(2167);
			identifier();
			setState(2170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2168);
				match(ASSIGNMENT);
				setState(2169);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_sectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Global_attribute_targetContext global_attribute_target() {
			return getRuleContext(Global_attribute_targetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Global_attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_section; }
	}

	public final Global_attribute_sectionContext global_attribute_section() throws RecognitionException {
		Global_attribute_sectionContext _localctx = new Global_attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_global_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2172);
			match(OPEN_BRACKET);
			setState(2173);
			global_attribute_target();
			setState(2174);
			match(COLON);
			setState(2175);
			attribute_list();
			setState(2177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2176);
				match(COMMA);
				}
			}

			setState(2179);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Global_attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_target; }
	}

	public final Global_attribute_targetContext global_attribute_target() throws RecognitionException {
		Global_attribute_targetContext _localctx = new Global_attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_global_attribute_target);
		try {
			setState(2183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2181);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2182);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<Attribute_sectionContext> attribute_section() {
			return getRuleContexts(Attribute_sectionContext.class);
		}
		public Attribute_sectionContext attribute_section(int i) {
			return getRuleContext(Attribute_sectionContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2185);
				attribute_section();
				}
				}
				setState(2188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_sectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Attribute_targetContext attribute_target() {
			return getRuleContext(Attribute_targetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_section; }
	}

	public final Attribute_sectionContext attribute_section() throws RecognitionException {
		Attribute_sectionContext _localctx = new Attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			match(OPEN_BRACKET);
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2191);
				attribute_target();
				setState(2192);
				match(COLON);
				}
				break;
			}
			setState(2196);
			attribute_list();
			setState(2198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2197);
				match(COMMA);
				}
			}

			setState(2200);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_target; }
	}

	public final Attribute_targetContext attribute_target() throws RecognitionException {
		Attribute_targetContext _localctx = new Attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_attribute_target);
		try {
			setState(2204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2202);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2203);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			attribute();
			setState(2211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2207);
					match(COMMA);
					setState(2208);
					attribute();
					}
					} 
				}
				setState(2213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<Attribute_argumentContext> attribute_argument() {
			return getRuleContexts(Attribute_argumentContext.class);
		}
		public Attribute_argumentContext attribute_argument(int i) {
			return getRuleContext(Attribute_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2214);
			namespace_or_type_name();
			setState(2227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(2215);
				match(OPEN_PARENS);
				setState(2224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(2216);
					attribute_argument();
					setState(2221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2217);
						match(COMMA);
						setState(2218);
						attribute_argument();
						}
						}
						setState(2223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2226);
				match(CLOSE_PARENS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Attribute_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument; }
	}

	public final Attribute_argumentContext attribute_argument() throws RecognitionException {
		Attribute_argumentContext _localctx = new Attribute_argumentContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_attribute_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2229);
				identifier();
				setState(2230);
				match(COLON);
				}
				break;
			}
			setState(2234);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_typeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CSharpParser.STAR, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> INTERR() { return getTokens(CSharpParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(CSharpParser.INTERR, i);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_type; }
	}

	public final Pointer_typeContext pointer_type() throws RecognitionException {
		Pointer_typeContext _localctx = new Pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_pointer_type);
		int _la;
		try {
			setState(2251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SBYTE:
				case SHORT:
				case UINT:
				case ULONG:
				case USHORT:
					{
					setState(2236);
					simple_type();
					}
					break;
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case STRING:
				case UNMANAGED:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(2237);
					class_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET || _la==INTERR) {
					{
					setState(2242);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(2240);
						rank_specifier();
						}
						break;
					case INTERR:
						{
						setState(2241);
						match(INTERR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2247);
				match(STAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2249);
				match(VOID);
				setState(2250);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_declaratorsContext extends ParserRuleContext {
		public List<Fixed_pointer_declaratorContext> fixed_pointer_declarator() {
			return getRuleContexts(Fixed_pointer_declaratorContext.class);
		}
		public Fixed_pointer_declaratorContext fixed_pointer_declarator(int i) {
			return getRuleContext(Fixed_pointer_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Fixed_pointer_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarators; }
	}

	public final Fixed_pointer_declaratorsContext fixed_pointer_declarators() throws RecognitionException {
		Fixed_pointer_declaratorsContext _localctx = new Fixed_pointer_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_fixed_pointer_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			fixed_pointer_declarator();
			setState(2258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2254);
				match(COMMA);
				setState(2255);
				fixed_pointer_declarator();
				}
				}
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Fixed_pointer_initializerContext fixed_pointer_initializer() {
			return getRuleContext(Fixed_pointer_initializerContext.class,0);
		}
		public Fixed_pointer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarator; }
	}

	public final Fixed_pointer_declaratorContext fixed_pointer_declarator() throws RecognitionException {
		Fixed_pointer_declaratorContext _localctx = new Fixed_pointer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_fixed_pointer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			identifier();
			setState(2262);
			match(ASSIGNMENT);
			setState(2263);
			fixed_pointer_initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AMP() { return getToken(CSharpParser.AMP, 0); }
		public Stackalloc_initializerContext stackalloc_initializer() {
			return getRuleContext(Stackalloc_initializerContext.class,0);
		}
		public Fixed_pointer_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_initializer; }
	}

	public final Fixed_pointer_initializerContext fixed_pointer_initializer() throws RecognitionException {
		Fixed_pointer_initializerContext _localctx = new Fixed_pointer_initializerContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_fixed_pointer_initializer);
		try {
			setState(2270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2265);
					match(AMP);
					}
					break;
				}
				setState(2268);
				expression();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2269);
				stackalloc_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_size_buffer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Fixed_size_buffer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_size_buffer_declarator; }
	}

	public final Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator() throws RecognitionException {
		Fixed_size_buffer_declaratorContext _localctx = new Fixed_size_buffer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_fixed_size_buffer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2272);
			identifier();
			setState(2273);
			match(OPEN_BRACKET);
			setState(2274);
			expression();
			setState(2275);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stackalloc_initializerContext extends ParserRuleContext {
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Stackalloc_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackalloc_initializer; }
	}

	public final Stackalloc_initializerContext stackalloc_initializer() throws RecognitionException {
		Stackalloc_initializerContext _localctx = new Stackalloc_initializerContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_stackalloc_initializer);
		int _la;
		try {
			int _alt;
			setState(2306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2277);
				match(STACKALLOC);
				setState(2278);
				type_();
				setState(2279);
				match(OPEN_BRACKET);
				setState(2280);
				expression();
				setState(2281);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2283);
				match(STACKALLOC);
				setState(2285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PARTIAL - 75)) | (1L << (REMOVE - 75)) | (1L << (SBYTE - 75)) | (1L << (SELECT - 75)) | (1L << (SET - 75)) | (1L << (SHORT - 75)) | (1L << (STRING - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (UNMANAGED - 75)) | (1L << (USHORT - 75)) | (1L << (VAR - 75)) | (1L << (VOID - 75)) | (1L << (WHEN - 75)) | (1L << (WHERE - 75)) | (1L << (YIELD - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (OPEN_PARENS - 75)))) != 0)) {
					{
					setState(2284);
					type_();
					}
				}

				setState(2287);
				match(OPEN_BRACKET);
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(2288);
					expression();
					}
				}

				setState(2291);
				match(CLOSE_BRACKET);
				setState(2292);
				match(OPEN_BRACE);
				setState(2293);
				expression();
				setState(2298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2294);
						match(COMMA);
						setState(2295);
						expression();
						}
						} 
					}
					setState(2300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
				}
				setState(2302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2301);
					match(COMMA);
					}
				}

				setState(2304);
				match(CLOSE_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_arrowContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public Right_arrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_arrow; }
	}

	public final Right_arrowContext right_arrow() throws RecognitionException {
		Right_arrowContext _localctx = new Right_arrowContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_right_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			((Right_arrowContext)_localctx).first = match(ASSIGNMENT);
			setState(2309);
			((Right_arrowContext)_localctx).second = match(GT);
			setState(2310);
			if (!((((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shiftContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public List<TerminalNode> GT() { return getTokens(CSharpParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CSharpParser.GT, i);
		}
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			((Right_shiftContext)_localctx).first = match(GT);
			setState(2313);
			((Right_shiftContext)_localctx).second = match(GT);
			setState(2314);
			if (!((((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shift_assignmentContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public TerminalNode OP_GE() { return getToken(CSharpParser.OP_GE, 0); }
		public Right_shift_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift_assignment; }
	}

	public final Right_shift_assignmentContext right_shift_assignment() throws RecognitionException {
		Right_shift_assignmentContext _localctx = new Right_shift_assignmentContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_right_shift_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			((Right_shift_assignmentContext)_localctx).first = match(GT);
			setState(2317);
			((Right_shift_assignmentContext)_localctx).second = match(OP_GE);
			setState(2318);
			if (!((((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(CSharpParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(CSharpParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode BIN_INTEGER_LITERAL() { return getToken(CSharpParser.BIN_INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(CSharpParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CSharpParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NULL_() { return getToken(CSharpParser.NULL_, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_literal);
		try {
			setState(2328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2320);
				boolean_literal();
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2321);
				string_literal();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2322);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2323);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case BIN_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2324);
				match(BIN_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2325);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(2326);
				match(CHARACTER_LITERAL);
				}
				break;
			case NULL_:
				enterOuterAlt(_localctx, 8);
				{
				setState(2327);
				match(NULL_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public Interpolated_regular_stringContext interpolated_regular_string() {
			return getRuleContext(Interpolated_regular_stringContext.class,0);
		}
		public Interpolated_verbatium_stringContext interpolated_verbatium_string() {
			return getRuleContext(Interpolated_verbatium_stringContext.class,0);
		}
		public TerminalNode REGULAR_STRING() { return getToken(CSharpParser.REGULAR_STRING, 0); }
		public TerminalNode VERBATIUM_STRING() { return getToken(CSharpParser.VERBATIUM_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_string_literal);
		try {
			setState(2336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(2332);
				interpolated_regular_string();
				}
				break;
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2333);
				interpolated_verbatium_string();
				}
				break;
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2334);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2335);
				match(VERBATIUM_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_regular_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_REGULAR_STRING_START() { return getToken(CSharpParser.INTERPOLATED_REGULAR_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_regular_string_partContext> interpolated_regular_string_part() {
			return getRuleContexts(Interpolated_regular_string_partContext.class);
		}
		public Interpolated_regular_string_partContext interpolated_regular_string_part(int i) {
			return getRuleContext(Interpolated_regular_string_partContext.class,i);
		}
		public Interpolated_regular_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string; }
	}

	public final Interpolated_regular_stringContext interpolated_regular_string() throws RecognitionException {
		Interpolated_regular_stringContext _localctx = new Interpolated_regular_stringContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(2342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)) | (1L << (DOUBLE_CURLY_INSIDE - 129)) | (1L << (REGULAR_CHAR_INSIDE - 129)) | (1L << (REGULAR_STRING_INSIDE - 129)))) != 0)) {
				{
				{
				setState(2339);
				interpolated_regular_string_part();
				}
				}
				setState(2344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2345);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_verbatium_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_VERBATIUM_STRING_START() { return getToken(CSharpParser.INTERPOLATED_VERBATIUM_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_verbatium_string_partContext> interpolated_verbatium_string_part() {
			return getRuleContexts(Interpolated_verbatium_string_partContext.class);
		}
		public Interpolated_verbatium_string_partContext interpolated_verbatium_string_part(int i) {
			return getRuleContext(Interpolated_verbatium_string_partContext.class,i);
		}
		public Interpolated_verbatium_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string; }
	}

	public final Interpolated_verbatium_stringContext interpolated_verbatium_string() throws RecognitionException {
		Interpolated_verbatium_stringContext _localctx = new Interpolated_verbatium_stringContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_interpolated_verbatium_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(INTERPOLATED_VERBATIUM_STRING_START);
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)) | (1L << (DOUBLE_CURLY_INSIDE - 129)) | (1L << (VERBATIUM_DOUBLE_QUOTE_INSIDE - 129)) | (1L << (VERBATIUM_INSIDE_STRING - 129)))) != 0)) {
				{
				{
				setState(2348);
				interpolated_verbatium_string_part();
				}
				}
				setState(2353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2354);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_regular_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode REGULAR_CHAR_INSIDE() { return getToken(CSharpParser.REGULAR_CHAR_INSIDE, 0); }
		public TerminalNode REGULAR_STRING_INSIDE() { return getToken(CSharpParser.REGULAR_STRING_INSIDE, 0); }
		public Interpolated_regular_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string_part; }
	}

	public final Interpolated_regular_string_partContext interpolated_regular_string_part() throws RecognitionException {
		Interpolated_regular_string_partContext _localctx = new Interpolated_regular_string_partContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_interpolated_regular_string_part);
		try {
			setState(2360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2356);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2357);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2358);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2359);
				match(REGULAR_STRING_INSIDE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_verbatium_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode VERBATIUM_DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.VERBATIUM_DOUBLE_QUOTE_INSIDE, 0); }
		public TerminalNode VERBATIUM_INSIDE_STRING() { return getToken(CSharpParser.VERBATIUM_INSIDE_STRING, 0); }
		public Interpolated_verbatium_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string_part; }
	}

	public final Interpolated_verbatium_string_partContext interpolated_verbatium_string_part() throws RecognitionException {
		Interpolated_verbatium_string_partContext _localctx = new Interpolated_verbatium_string_partContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_interpolated_verbatium_string_part);
		try {
			setState(2366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL_:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2362);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case VERBATIUM_DOUBLE_QUOTE_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2364);
				match(VERBATIUM_DOUBLE_QUOTE_INSIDE);
				}
				break;
			case VERBATIUM_INSIDE_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2365);
				match(VERBATIUM_INSIDE_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_string_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public List<TerminalNode> FORMAT_STRING() { return getTokens(CSharpParser.FORMAT_STRING); }
		public TerminalNode FORMAT_STRING(int i) {
			return getToken(CSharpParser.FORMAT_STRING, i);
		}
		public Interpolated_string_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_expression; }
	}

	public final Interpolated_string_expressionContext interpolated_string_expression() throws RecognitionException {
		Interpolated_string_expressionContext _localctx = new Interpolated_string_expressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2368);
			expression();
			setState(2373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2369);
				match(COMMA);
				setState(2370);
				expression();
				}
				}
				setState(2375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2376);
				match(COLON);
				setState(2378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2377);
					match(FORMAT_STRING);
					}
					}
					setState(2380); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FORMAT_STRING );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(CSharpParser.AS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode IS() { return getToken(CSharpParser.IS, 0); }
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode NULL_() { return getToken(CSharpParser.NULL_, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode UNMANAGED() { return getToken(CSharpParser.UNMANAGED, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << AS) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CASE) | (1L << CATCH) | (1L << CHAR) | (1L << CHECKED) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DO) | (1L << DOUBLE) | (1L << ELSE) | (1L << ENUM) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FALSE) | (1L << FINALLY) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << GOTO) | (1L << IF) | (1L << IMPLICIT) | (1L << IN) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IS) | (1L << LOCK) | (1L << LONG))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NAMESPACE - 65)) | (1L << (NEW - 65)) | (1L << (NULL_ - 65)) | (1L << (OBJECT - 65)) | (1L << (OPERATOR - 65)) | (1L << (OUT - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARAMS - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REF - 65)) | (1L << (RETURN - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STACKALLOC - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (SWITCH - 65)) | (1L << (THIS - 65)) | (1L << (THROW - 65)) | (1L << (TRUE - 65)) | (1L << (TRY - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (UNMANAGED - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (USING - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Class_baseContext class_base() {
			return getRuleContext(Class_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			match(CLASS);
			setState(2387);
			identifier();
			setState(2389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2388);
				type_parameter_list();
				}
			}

			setState(2392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2391);
				class_base();
				}
			}

			setState(2395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2394);
				type_parameter_constraints_clauses();
				}
			}

			setState(2397);
			class_body();
			setState(2399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2398);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_definitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Struct_interfacesContext struct_interfaces() {
			return getRuleContext(Struct_interfacesContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY || _la==REF) {
				{
				setState(2401);
				_la = _input.LA(1);
				if ( !(_la==READONLY || _la==REF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2404);
			match(STRUCT);
			setState(2405);
			identifier();
			setState(2407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2406);
				type_parameter_list();
				}
			}

			setState(2410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2409);
				struct_interfaces();
				}
			}

			setState(2413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2412);
				type_parameter_constraints_clauses();
				}
			}

			setState(2415);
			struct_body();
			setState(2417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2416);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_definitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Interface_baseContext interface_base() {
			return getRuleContext(Interface_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			match(INTERFACE);
			setState(2420);
			identifier();
			setState(2422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2421);
				variant_type_parameter_list();
				}
			}

			setState(2425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2424);
				interface_base();
				}
			}

			setState(2428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2427);
				type_parameter_constraints_clauses();
				}
			}

			setState(2430);
			class_body();
			setState(2432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2431);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_definitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
		}
		public Enum_baseContext enum_base() {
			return getRuleContext(Enum_baseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Enum_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_definition; }
	}

	public final Enum_definitionContext enum_definition() throws RecognitionException {
		Enum_definitionContext _localctx = new Enum_definitionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_enum_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			match(ENUM);
			setState(2435);
			identifier();
			setState(2437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2436);
				enum_base();
				}
			}

			setState(2439);
			enum_body();
			setState(2441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2440);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delegate_definitionContext extends ParserRuleContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Delegate_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegate_definition; }
	}

	public final Delegate_definitionContext delegate_definition() throws RecognitionException {
		Delegate_definitionContext _localctx = new Delegate_definitionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_delegate_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2443);
			match(DELEGATE);
			setState(2444);
			return_type();
			setState(2445);
			identifier();
			setState(2447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2446);
				variant_type_parameter_list();
				}
			}

			setState(2449);
			match(OPEN_PARENS);
			setState(2451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
				{
				setState(2450);
				formal_parameter_list();
				}
			}

			setState(2453);
			match(CLOSE_PARENS);
			setState(2455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2454);
				type_parameter_constraints_clauses();
				}
			}

			setState(2457);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_declarationContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Event_accessor_declarationsContext event_accessor_declarations() {
			return getRuleContext(Event_accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Event_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_declaration; }
	}

	public final Event_declarationContext event_declaration() throws RecognitionException {
		Event_declarationContext _localctx = new Event_declarationContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_event_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2459);
			match(EVENT);
			setState(2460);
			type_();
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2461);
				variable_declarators();
				setState(2462);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(2464);
				member_name();
				setState(2465);
				match(OPEN_BRACE);
				setState(2466);
				event_accessor_declarations();
				setState(2467);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declarationContext extends ParserRuleContext {
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			variable_declarators();
			setState(2472);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_declarationContext extends ParserRuleContext {
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			member_name();
			setState(2488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2475);
				match(OPEN_BRACE);
				setState(2476);
				accessor_declarations();
				setState(2477);
				match(CLOSE_BRACE);
				setState(2482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(2478);
					match(ASSIGNMENT);
					setState(2479);
					variable_initializer();
					setState(2480);
					match(SEMICOLON);
					}
				}

				}
				break;
			case ASSIGNMENT:
				{
				setState(2484);
				right_arrow();
				setState(2485);
				throwable_expression();
				setState(2486);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			match(CONST);
			setState(2491);
			type_();
			setState(2492);
			constant_declarators();
			setState(2493);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexer_declarationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Indexer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_declaration; }
	}

	public final Indexer_declarationContext indexer_declaration() throws RecognitionException {
		Indexer_declarationContext _localctx = new Indexer_declarationContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_indexer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			match(THIS);
			setState(2496);
			match(OPEN_BRACKET);
			setState(2497);
			formal_parameter_list();
			setState(2498);
			match(CLOSE_BRACKET);
			setState(2507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2499);
				match(OPEN_BRACE);
				setState(2500);
				accessor_declarations();
				setState(2501);
				match(CLOSE_BRACE);
				}
				break;
			case ASSIGNMENT:
				{
				setState(2503);
				right_arrow();
				setState(2504);
				throwable_expression();
				setState(2505);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Destructor_definitionContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(CSharpParser.TILDE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Destructor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor_definition; }
	}

	public final Destructor_definitionContext destructor_definition() throws RecognitionException {
		Destructor_definitionContext _localctx = new Destructor_definitionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_destructor_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			match(TILDE);
			setState(2510);
			identifier();
			setState(2511);
			match(OPEN_PARENS);
			setState(2512);
			match(CLOSE_PARENS);
			setState(2513);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Constructor_initializerContext constructor_initializer() {
			return getRuleContext(Constructor_initializerContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2515);
			identifier();
			setState(2516);
			match(OPEN_PARENS);
			setState(2518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
				{
				setState(2517);
				formal_parameter_list();
				}
			}

			setState(2520);
			match(CLOSE_PARENS);
			setState(2522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2521);
				constructor_initializer();
				}
			}

			setState(2524);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_member_nameContext method_member_name() {
			return getRuleContext(Method_member_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			method_member_name();
			setState(2528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2527);
				type_parameter_list();
				}
			}

			setState(2530);
			match(OPEN_PARENS);
			setState(2532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
				{
				setState(2531);
				formal_parameter_list();
				}
			}

			setState(2534);
			match(CLOSE_PARENS);
			setState(2536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2535);
				type_parameter_constraints_clauses();
				}
			}

			setState(2543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2538);
				method_body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2539);
				right_arrow();
				setState(2540);
				throwable_expression();
				setState(2541);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_member_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(CSharpParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Method_member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_member_name; }
	}

	public final Method_member_nameContext method_member_name() throws RecognitionException {
		Method_member_nameContext _localctx = new Method_member_nameContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_method_member_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2545);
				identifier();
				}
				break;
			case 2:
				{
				setState(2546);
				identifier();
				setState(2547);
				match(DOUBLE_COLON);
				setState(2548);
				identifier();
				}
				break;
			}
			setState(2559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2552);
						type_argument_list();
						}
					}

					setState(2555);
					match(DOT);
					setState(2556);
					identifier();
					}
					} 
				}
				setState(2561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_declarationContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public Overloadable_operatorContext overloadable_operator() {
			return getRuleContext(Overloadable_operatorContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<Arg_declarationContext> arg_declaration() {
			return getRuleContexts(Arg_declarationContext.class);
		}
		public Arg_declarationContext arg_declaration(int i) {
			return getRuleContext(Arg_declarationContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public List<TerminalNode> IN() { return getTokens(CSharpParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(CSharpParser.IN, i);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_operator_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			match(OPERATOR);
			setState(2563);
			overloadable_operator();
			setState(2564);
			match(OPEN_PARENS);
			setState(2566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(2565);
				match(IN);
				}
			}

			setState(2568);
			arg_declaration();
			setState(2574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2569);
				match(COMMA);
				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2570);
					match(IN);
					}
				}

				setState(2573);
				arg_declaration();
				}
			}

			setState(2576);
			match(CLOSE_PARENS);
			setState(2582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2577);
				body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2578);
				right_arrow();
				setState(2579);
				throwable_expression();
				setState(2580);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arg_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_declaration; }
	}

	public final Arg_declarationContext arg_declaration() throws RecognitionException {
		Arg_declarationContext _localctx = new Arg_declarationContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_arg_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			type_();
			setState(2585);
			identifier();
			setState(2588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2586);
				match(ASSIGNMENT);
				setState(2587);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_invocationContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			match(OPEN_PARENS);
			setState(2592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OUT - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(2591);
				argument_list();
				}
			}

			setState(2594);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_creation_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Object_creation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_creation_expression; }
	}

	public final Object_creation_expressionContext object_creation_expression() throws RecognitionException {
		Object_creation_expressionContext _localctx = new Object_creation_expressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_object_creation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2596);
			match(OPEN_PARENS);
			setState(2598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL_ - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OUT - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(2597);
				argument_list();
				}
			}

			setState(2600);
			match(CLOSE_PARENS);
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2601);
				object_or_collection_initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CSharpParser.IDENTIFIER, 0); }
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public TerminalNode UNMANAGED() { return getToken(CSharpParser.UNMANAGED, 0); }
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2604);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 86:
			return local_variable_declaration_sempred((Local_variable_declarationContext)_localctx, predIndex);
		case 184:
			return right_arrow_sempred((Right_arrowContext)_localctx, predIndex);
		case 185:
			return right_shift_sempred((Right_shiftContext)_localctx, predIndex);
		case 186:
			return right_shift_assignment_sempred((Right_shift_assignmentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean local_variable_declaration_sempred(Local_variable_declarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  this.IsLocalVariableDeclaration() ;
		}
		return true;
	}
	private boolean right_arrow_sempred(Right_arrowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return (((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_sempred(Right_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return (((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_assignment_sempred(Right_shift_assignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return (((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c8\u0a31\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\3\2\5\2\u01b2\n\2\3\2\5\2\u01b5"+
		"\n\2\3\2\7\2\u01b8\n\2\f\2\16\2\u01bb\13\2\3\2\5\2\u01be\n\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\7\3\u01c6\n\3\f\3\16\3\u01c9\13\3\3\3\3\3\3\4\3\4\5\4\u01cf"+
		"\n\4\3\4\5\4\u01d2\n\4\3\4\3\4\3\4\5\4\u01d7\n\4\7\4\u01d9\n\4\f\4\16"+
		"\4\u01dc\13\4\3\5\3\5\3\5\3\5\7\5\u01e2\n\5\f\5\16\5\u01e5\13\5\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u01ec\n\6\3\7\3\7\3\7\3\7\6\7\u01f2\n\7\r\7\16\7\u01f3"+
		"\3\7\3\7\3\b\3\b\5\b\u01fa\n\b\3\t\3\t\5\t\u01fe\n\t\3\n\3\n\3\n\5\n\u0203"+
		"\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u020d\n\r\3\16\3\16\3\16\7"+
		"\16\u0212\n\16\f\16\16\16\u0215\13\16\3\17\3\17\3\17\5\17\u021a\n\17\3"+
		"\17\5\17\u021d\n\17\3\17\3\17\5\17\u0221\n\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\5\20\u0229\n\20\3\21\3\21\3\21\5\21\u022e\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0238\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0245\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u024d\n\24\3\25\3\25\3\25\3\25\5\25\u0253\n\25\5\25\u0255\n\25\3"+
		"\26\3\26\3\26\7\26\u025a\n\26\f\26\16\26\u025d\13\26\3\27\3\27\3\27\7"+
		"\27\u0262\n\27\f\27\16\27\u0265\13\27\3\30\3\30\3\30\7\30\u026a\n\30\f"+
		"\30\16\30\u026d\13\30\3\31\3\31\3\31\7\31\u0272\n\31\f\31\16\31\u0275"+
		"\13\31\3\32\3\32\3\32\7\32\u027a\n\32\f\32\16\32\u027d\13\32\3\33\3\33"+
		"\3\33\7\33\u0282\n\33\f\33\16\33\u0285\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u028e\n\34\f\34\16\34\u0291\13\34\3\35\3\35\3\35\5\35"+
		"\u0296\n\35\3\35\7\35\u0299\n\35\f\35\16\35\u029c\13\35\3\36\3\36\3\36"+
		"\7\36\u02a1\n\36\f\36\16\36\u02a4\13\36\3\37\3\37\3\37\7\37\u02a9\n\37"+
		"\f\37\16\37\u02ac\13\37\3 \3 \3 \3 \3 \5 \u02b3\n \5 \u02b5\n \3 \5 \u02b8"+
		"\n \3!\3!\3!\7!\u02bd\n!\f!\16!\u02c0\13!\3\"\3\"\5\"\u02c4\n\"\3\"\3"+
		"\"\3\"\3#\3#\5#\u02cb\n#\3#\3#\5#\u02cf\n#\5#\u02d1\n#\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u02ed"+
		"\n$\3%\3%\5%\u02f1\n%\3%\7%\u02f4\n%\f%\16%\u02f7\13%\3%\5%\u02fa\n%\3"+
		"%\3%\3%\3%\3%\3%\5%\u0302\n%\3%\5%\u0305\n%\3%\7%\u0308\n%\f%\16%\u030b"+
		"\13%\3%\5%\u030e\n%\7%\u0310\n%\f%\16%\u0313\13%\3&\3&\3&\5&\u0318\n&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0326\n&\3&\3&\3&\3&\5&\u032c"+
		"\n&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0336\n&\f&\16&\u0339\13&\3&\5&\u033c\n"+
		"&\3&\6&\u033f\n&\r&\16&\u0340\3&\3&\5&\u0345\n&\3&\3&\3&\3&\5&\u034b\n"+
		"&\3&\3&\3&\3&\6&\u0351\n&\r&\16&\u0352\3&\3&\3&\3&\3&\3&\3&\5&\u035c\n"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u036e\n&\3&\5&\u0371"+
		"\n&\3&\3&\3&\5&\u0376\n&\3&\5&\u0379\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\7&\u0386\n&\f&\16&\u0389\13&\3&\3&\3&\5&\u038e\n&\3\'\3\'\5\'\u0392"+
		"\n\'\3(\3(\3(\3)\5)\u0398\n)\3)\3)\3)\5)\u039d\n)\3*\5*\u03a0\n*\3*\3"+
		"*\3*\3*\7*\u03a6\n*\f*\16*\u03a9\13*\3*\3*\3+\3+\3+\5+\u03b0\n+\3+\3+"+
		"\3,\3,\3-\3-\3-\7-\u03b9\n-\f-\16-\u03bc\13-\3.\3.\5.\u03c0\n.\3/\3/\3"+
		"/\5/\u03c5\n/\5/\u03c7\n/\3/\3/\3\60\3\60\3\60\7\60\u03ce\n\60\f\60\16"+
		"\60\u03d1\13\60\3\61\3\61\3\61\3\61\3\61\5\61\u03d8\n\61\3\61\3\61\3\61"+
		"\3\62\3\62\5\62\u03df\n\62\3\63\3\63\3\63\3\63\7\63\u03e5\n\63\f\63\16"+
		"\63\u03e8\13\63\3\63\5\63\u03eb\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u03f4\n\64\3\65\3\65\3\65\5\65\u03f9\n\65\5\65\u03fb\n\65\3\65\3"+
		"\65\3\66\3\66\3\66\7\66\u0402\n\66\f\66\16\66\u0405\13\66\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u040c\n\67\38\38\58\u0410\n8\38\38\38\58\u0415\n8\5"+
		"8\u0417\n8\38\38\38\58\u041c\n8\78\u041e\n8\f8\168\u0421\138\39\39\79"+
		"\u0425\n9\f9\169\u0428\139\39\39\3:\3:\3:\7:\u042f\n:\f:\16:\u0432\13"+
		":\3:\5:\u0435\n:\3:\5:\u0438\n:\3:\5:\u043b\n:\3;\3;\3;\3;\7;\u0441\n"+
		";\f;\16;\u0444\13;\3;\3;\3<\3<\3<\3<\3=\5=\u044d\n=\3=\3=\3=\3=\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u045e\n>\3?\3?\3?\7?\u0463\n?\f?\16?\u0466"+
		"\13?\3@\5@\u0469\n@\3@\3@\3@\3A\3A\3A\7A\u0471\nA\fA\16A\u0474\13A\3B"+
		"\3B\5B\u0478\nB\3C\3C\3C\3D\3D\5D\u047f\nD\3D\3D\3D\3D\3E\7E\u0486\nE"+
		"\fE\16E\u0489\13E\3E\3E\5E\u048d\nE\3F\3F\3F\3F\3F\5F\u0494\nF\3G\3G\3"+
		"G\3G\3G\3H\3H\3H\3I\3I\5I\u04a0\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u04ab"+
		"\nI\3J\3J\3J\3J\7J\u04b1\nJ\fJ\16J\u04b4\13J\3K\3K\5K\u04b8\nK\3L\3L\3"+
		"L\3L\3L\3L\3L\5L\u04c1\nL\3M\3M\3M\3M\3N\3N\3N\5N\u04ca\nN\3O\3O\3O\3"+
		"O\3O\3O\3O\5O\u04d3\nO\3P\3P\3P\3Q\5Q\u04d9\nQ\3Q\3Q\3Q\5Q\u04de\nQ\3"+
		"Q\3Q\5Q\u04e2\nQ\3Q\3Q\5Q\u04e6\nQ\3R\3R\5R\u04ea\nR\3R\3R\5R\u04ee\n"+
		"R\3S\3S\3S\3S\3S\5S\u04f5\nS\3T\3T\3T\3T\3U\3U\5U\u04fd\nU\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\5V\u050a\nV\3V\3V\3V\3V\3V\3V\7V\u0512\nV\fV\16"+
		"V\u0515\13V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5"+
		"V\u052a\nV\3V\3V\5V\u052e\nV\3V\3V\5V\u0532\nV\3V\3V\3V\5V\u0537\nV\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u054b\nV\3V\3"+
		"V\3V\5V\u0550\nV\3V\3V\3V\5V\u0555\nV\3V\3V\3V\3V\3V\5V\u055c\nV\3V\5"+
		"V\u055f\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\5V\u0575\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0581\nV\3W\3W\5W\u0585"+
		"\nW\3W\3W\3X\3X\3X\3X\5X\u058d\nX\3X\3X\3X\3X\3X\3X\7X\u0595\nX\fX\16"+
		"X\u0598\13X\3X\3X\3X\3X\5X\u059e\nX\3Y\3Y\5Y\u05a2\nY\3Z\3Z\3Z\5Z\u05a7"+
		"\nZ\3Z\5Z\u05aa\nZ\3[\3[\3[\5[\u05af\n[\3\\\3\\\3\\\3\\\3]\3]\5]\u05b7"+
		"\n]\3^\6^\u05ba\n^\r^\16^\u05bb\3^\3^\3_\3_\3_\5_\u05c3\n_\3_\3_\3_\3"+
		"_\5_\u05c9\n_\3`\3`\3`\3a\6a\u05cf\na\ra\16a\u05d0\3b\3b\3b\3b\7b\u05d7"+
		"\nb\fb\16b\u05da\13b\5b\u05dc\nb\3c\3c\3c\7c\u05e1\nc\fc\16c\u05e4\13"+
		"c\3d\3d\7d\u05e8\nd\fd\16d\u05eb\13d\3d\5d\u05ee\nd\3d\5d\u05f1\nd\3e"+
		"\3e\3e\3e\5e\u05f7\ne\3e\3e\5e\u05fb\ne\3e\3e\3f\3f\5f\u0601\nf\3f\3f"+
		"\3g\3g\3g\3g\3g\3h\3h\3h\3i\3i\5i\u060f\ni\3j\3j\3j\5j\u0614\nj\3k\3k"+
		"\5k\u0618\nk\3k\5k\u061b\nk\3k\3k\3l\6l\u0620\nl\rl\16l\u0621\3m\3m\3"+
		"m\3m\3m\3m\3m\3m\3m\5m\u062d\nm\3n\6n\u0630\nn\rn\16n\u0631\3o\3o\5o\u0636"+
		"\no\3p\5p\u0639\np\3p\5p\u063c\np\3p\3p\3p\3p\3p\5p\u0643\np\3q\3q\3q"+
		"\3q\5q\u0649\nq\3r\3r\3r\3r\7r\u064f\nr\fr\16r\u0652\13r\3r\3r\3s\5s\u0657"+
		"\ns\3s\3s\3t\3t\3t\3t\7t\u065f\nt\ft\16t\u0662\13t\3u\3u\3u\7u\u0667\n"+
		"u\fu\16u\u066a\13u\3v\6v\u066d\nv\rv\16v\u066e\3w\3w\3w\3w\3w\3x\3x\3"+
		"x\3x\5x\u067a\nx\3x\3x\5x\u067e\nx\5x\u0680\nx\3y\3y\3y\5y\u0685\ny\3"+
		"y\3y\5y\u0689\ny\3z\3z\3z\7z\u068e\nz\fz\16z\u0691\13z\3{\3{\3{\3{\3|"+
		"\3|\5|\u0699\n|\3|\3|\3}\6}\u069e\n}\r}\16}\u069f\3~\5~\u06a3\n~\3~\5"+
		"~\u06a6\n~\3~\3~\5~\u06aa\n~\3\177\6\177\u06ad\n\177\r\177\16\177\u06ae"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\5\u0081\u06bc\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u06c6\n\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u06cd\n\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u06d9"+
		"\n\u0082\3\u0083\3\u0083\3\u0083\7\u0083\u06de\n\u0083\f\u0083\16\u0083"+
		"\u06e1\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\7\u0085\u06ea\n\u0085\f\u0085\16\u0085\u06ed\13\u0085\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u06f2\n\u0086\3\u0087\3\u0087\5\u0087\u06f6\n\u0087\3"+
		"\u0088\3\u0088\5\u0088\u06fa\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\5"+
		"\u008a\u0700\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0706\n\u008b"+
		"\5\u008b\u0708\n\u008b\3\u008c\3\u008c\3\u008c\7\u008c\u070d\n\u008c\f"+
		"\u008c\16\u008c\u0710\13\u008c\3\u008d\5\u008d\u0713\n\u008d\3\u008d\5"+
		"\u008d\u0716\n\u008d\3\u008d\3\u008d\5\u008d\u071a\n\u008d\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0724\n\u008e"+
		"\3\u008f\5\u008f\u0727\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\5\u0090\u072e\n\u0090\3\u0090\5\u0090\u0731\n\u0090\3\u0090\3\u0090\3"+
		"\u0090\5\u0090\u0736\n\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u073b\n\u0090"+
		"\5\u0090\u073d\n\u0090\3\u0091\5\u0091\u0740\n\u0091\3\u0091\5\u0091\u0743"+
		"\n\u0091\3\u0091\3\u0091\3\u0091\3\u0092\5\u0092\u0749\n\u0092\3\u0092"+
		"\5\u0092\u074c\n\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0758\n\u0093\3\u0094\3\u0094"+
		"\5\u0094\u075c\n\u0094\3\u0095\5\u0095\u075f\n\u0095\3\u0095\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0769\n\u0095\3"+
		"\u0096\5\u0096\u076c\n\u0096\3\u0096\3\u0096\3\u0096\3\u0097\5\u0097\u0772"+
		"\n\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u078d\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u079a\n\u009a\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\5\u009b\u07a0\n\u009b\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\7\u009d\u07a7\n\u009d\f\u009d\16\u009d\u07aa\13\u009d\3\u009d"+
		"\3\u009d\3\u009e\5\u009e\u07af\n\u009e\3\u009e\5\u009e\u07b2\n\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\6\u009e\u07b8\n\u009e\r\u009e\16\u009e"+
		"\u07b9\3\u009e\3\u009e\5\u009e\u07be\n\u009e\3\u009f\3\u009f\7\u009f\u07c2"+
		"\n\u009f\f\u009f\16\u009f\u07c5\13\u009f\3\u009f\6\u009f\u07c8\n\u009f"+
		"\r\u009f\16\u009f\u07c9\3\u00a0\3\u00a0\7\u00a0\u07ce\n\u00a0\f\u00a0"+
		"\16\u00a0\u07d1\13\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\7\u00a1\u07d9\n\u00a1\f\u00a1\16\u00a1\u07dc\13\u00a1\3\u00a1\5\u00a1"+
		"\u07df\n\u00a1\5\u00a1\u07e1\n\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3"+
		"\u00a2\3\u00a2\7\u00a2\u07e9\n\u00a2\f\u00a2\16\u00a2\u07ec\13\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a3\5\u00a3\u07f1\n\u00a3\3\u00a3\5\u00a3\u07f4\n\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\7\u00a6\u07ff\n\u00a6\f\u00a6\16\u00a6\u0802\13\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a7\5\u00a7\u0807\n\u00a7\3\u00a7\5\u00a7\u080a\n\u00a7\3\u00a7\5"+
		"\u00a7\u080d\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0814"+
		"\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0819\n\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u081d\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u0821\n\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0832\n\u00a7\3\u00a7"+
		"\5\u00a7\u0835\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u083a\n\u00a7\3"+
		"\u00a7\3\u00a7\5\u00a7\u083e\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u0842\n\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u084b"+
		"\n\u00a7\3\u00a8\5\u00a8\u084e\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8"+
		"\u0853\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u0857\n\u00a8\3\u00a8\3\u00a8\3"+
		"\u00a8\5\u00a8\u085c\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u0860\n\u00a8\5\u00a8"+
		"\u0862\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\7\u00aa\u086b\n\u00aa\f\u00aa\16\u00aa\u086e\13\u00aa\3\u00aa\5\u00aa"+
		"\u0871\n\u00aa\5\u00aa\u0873\n\u00aa\3\u00aa\3\u00aa\3\u00ab\5\u00ab\u0878"+
		"\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u087d\n\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0884\n\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\5\u00ad\u088a\n\u00ad\3\u00ae\6\u00ae\u088d\n\u00ae\r\u00ae\16"+
		"\u00ae\u088e\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0895\n\u00af\3\u00af"+
		"\3\u00af\5\u00af\u0899\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\5\u00b0"+
		"\u089f\n\u00b0\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u08a4\n\u00b1\f\u00b1\16"+
		"\u00b1\u08a7\13\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2"+
		"\u08ae\n\u00b2\f\u00b2\16\u00b2\u08b1\13\u00b2\5\u00b2\u08b3\n\u00b2\3"+
		"\u00b2\5\u00b2\u08b6\n\u00b2\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u08bb\n\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\5\u00b4\u08c1\n\u00b4\3\u00b4\3\u00b4"+
		"\7\u00b4\u08c5\n\u00b4\f\u00b4\16\u00b4\u08c8\13\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\5\u00b4\u08ce\n\u00b4\3\u00b5\3\u00b5\3\u00b5\7\u00b5"+
		"\u08d3\n\u00b5\f\u00b5\16\u00b5\u08d6\13\u00b5\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b7\5\u00b7\u08dd\n\u00b7\3\u00b7\3\u00b7\5\u00b7\u08e1\n"+
		"\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u08f0\n\u00b9\3\u00b9"+
		"\3\u00b9\5\u00b9\u08f4\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\7\u00b9\u08fb\n\u00b9\f\u00b9\16\u00b9\u08fe\13\u00b9\3\u00b9\5\u00b9"+
		"\u0901\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u0905\n\u00b9\3\u00ba\3\u00ba\3"+
		"\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u091b\n\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\5\u00bf\u0923\n\u00bf\3\u00c0\3\u00c0\7\u00c0\u0927\n\u00c0\f\u00c0\16"+
		"\u00c0\u092a\13\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\7\u00c1\u0930\n"+
		"\u00c1\f\u00c1\16\u00c1\u0933\13\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\5\u00c2\u093b\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u0941\n\u00c3\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u0946\n\u00c4\f"+
		"\u00c4\16\u00c4\u0949\13\u00c4\3\u00c4\3\u00c4\6\u00c4\u094d\n\u00c4\r"+
		"\u00c4\16\u00c4\u094e\5\u00c4\u0951\n\u00c4\3\u00c5\3\u00c5\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u0958\n\u00c6\3\u00c6\5\u00c6\u095b\n\u00c6\3\u00c6"+
		"\5\u00c6\u095e\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u0962\n\u00c6\3\u00c7\5"+
		"\u00c7\u0965\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u096a\n\u00c7\3\u00c7"+
		"\5\u00c7\u096d\n\u00c7\3\u00c7\5\u00c7\u0970\n\u00c7\3\u00c7\3\u00c7\5"+
		"\u00c7\u0974\n\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0979\n\u00c8\3\u00c8"+
		"\5\u00c8\u097c\n\u00c8\3\u00c8\5\u00c8\u097f\n\u00c8\3\u00c8\3\u00c8\5"+
		"\u00c8\u0983\n\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0988\n\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u098c\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u0992\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u0996\n\u00ca\3\u00ca\3\u00ca\5"+
		"\u00ca\u099a\n\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09a8\n\u00cb\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u09b5\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u09bb\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\5\u00cf\u09ce\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09d9\n\u00d1\3\u00d1"+
		"\3\u00d1\5\u00d1\u09dd\n\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\5\u00d2"+
		"\u09e3\n\u00d2\3\u00d2\3\u00d2\5\u00d2\u09e7\n\u00d2\3\u00d2\3\u00d2\5"+
		"\u00d2\u09eb\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09f2"+
		"\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u09f9\n\u00d3"+
		"\3\u00d3\5\u00d3\u09fc\n\u00d3\3\u00d3\3\u00d3\7\u00d3\u0a00\n\u00d3\f"+
		"\u00d3\16\u00d3\u0a03\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4"+
		"\u0a09\n\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0a0e\n\u00d4\3\u00d4\5"+
		"\u00d4\u0a11\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5"+
		"\u00d4\u0a19\n\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a1f\n\u00d5"+
		"\3\u00d6\3\u00d6\5\u00d6\u0a23\n\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7"+
		"\5\u00d7\u0a29\n\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a2d\n\u00d7\3\u00d8\3"+
		"\u00d8\3\u00d8\2\2\u00d9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\2\25\n\2\27\27\32\3299AAUUYYefjj\4\2$$"+
		"//\5\288JJRR\3\2\u009e\u009f\4\2\u0094\u0095\u00a0\u00a1\3\2\u0089\u008a"+
		"\3\2\u008b\u008d\20\2\24\24\27\27\32\32\37\37$$//99AAFFUUYY]]efjj\4\2"+
		"\20\20\"\"\4\2\21\21ii\16\2\13\13\21\21++;;DDKKMQVV\\\\iimmoo\4\2**\67"+
		"\67\4\2\23\23``\4\2\u008b\u008b\u0096\u0096\4\288JJ\4\2,,bb\25\2\13\13"+
		"\17\17\23\25\27!#$&\')\61\64\64\66;==@ACFHHJLNRTVYkmorr\3\2QR\26\2\f\16"+
		"\20\22\26\26\"\"%%((\62\63\65\65<<>?BBGGIIMMSSWXhhllpqst\2\u0b3d\2\u01b1"+
		"\3\2\2\2\4\u01c1\3\2\2\2\6\u01d1\3\2\2\2\b\u01dd\3\2\2\2\n\u01eb\3\2\2"+
		"\2\f\u01ed\3\2\2\2\16\u01f7\3\2\2\2\20\u01fd\3\2\2\2\22\u0202\3\2\2\2"+
		"\24\u0204\3\2\2\2\26\u0206\3\2\2\2\30\u020c\3\2\2\2\32\u020e\3\2\2\2\34"+
		"\u0219\3\2\2\2\36\u0228\3\2\2\2 \u022d\3\2\2\2\"\u0237\3\2\2\2$\u0244"+
		"\3\2\2\2&\u0246\3\2\2\2(\u024e\3\2\2\2*\u0256\3\2\2\2,\u025e\3\2\2\2."+
		"\u0266\3\2\2\2\60\u026e\3\2\2\2\62\u0276\3\2\2\2\64\u027e\3\2\2\2\66\u0286"+
		"\3\2\2\28\u0292\3\2\2\2:\u029d\3\2\2\2<\u02a5\3\2\2\2>\u02ad\3\2\2\2@"+
		"\u02b9\3\2\2\2B\u02c1\3\2\2\2D\u02d0\3\2\2\2F\u02ec\3\2\2\2H\u02ee\3\2"+
		"\2\2J\u038d\3\2\2\2L\u0391\3\2\2\2N\u0393\3\2\2\2P\u0397\3\2\2\2R\u039f"+
		"\3\2\2\2T\u03af\3\2\2\2V\u03b3\3\2\2\2X\u03b5\3\2\2\2Z\u03bf\3\2\2\2\\"+
		"\u03c1\3\2\2\2^\u03ca\3\2\2\2`\u03d7\3\2\2\2b\u03de\3\2\2\2d\u03e0\3\2"+
		"\2\2f\u03f3\3\2\2\2h\u03f5\3\2\2\2j\u03fe\3\2\2\2l\u040b\3\2\2\2n\u040d"+
		"\3\2\2\2p\u0422\3\2\2\2r\u042b\3\2\2\2t\u043c\3\2\2\2v\u0447\3\2\2\2x"+
		"\u044c\3\2\2\2z\u045d\3\2\2\2|\u045f\3\2\2\2~\u0468\3\2\2\2\u0080\u046d"+
		"\3\2\2\2\u0082\u0477\3\2\2\2\u0084\u0479\3\2\2\2\u0086\u047c\3\2\2\2\u0088"+
		"\u0487\3\2\2\2\u008a\u0493\3\2\2\2\u008c\u0495\3\2\2\2\u008e\u049a\3\2"+
		"\2\2\u0090\u049d\3\2\2\2\u0092\u04ac\3\2\2\2\u0094\u04b5\3\2\2\2\u0096"+
		"\u04c0\3\2\2\2\u0098\u04c2\3\2\2\2\u009a\u04c9\3\2\2\2\u009c\u04d2\3\2"+
		"\2\2\u009e\u04d4\3\2\2\2\u00a0\u04d8\3\2\2\2\u00a2\u04ed\3\2\2\2\u00a4"+
		"\u04f4\3\2\2\2\u00a6\u04f6\3\2\2\2\u00a8\u04fc\3\2\2\2\u00aa\u0580\3\2"+
		"\2\2\u00ac\u0582\3\2\2\2\u00ae\u059d\3\2\2\2\u00b0\u05a1\3\2\2\2\u00b2"+
		"\u05a3\3\2\2\2\u00b4\u05ae\3\2\2\2\u00b6\u05b0\3\2\2\2\u00b8\u05b6\3\2"+
		"\2\2\u00ba\u05b9\3\2\2\2\u00bc\u05c8\3\2\2\2\u00be\u05ca\3\2\2\2\u00c0"+
		"\u05ce\3\2\2\2\u00c2\u05db\3\2\2\2\u00c4\u05dd\3\2\2\2\u00c6\u05f0\3\2"+
		"\2\2\u00c8\u05f2\3\2\2\2\u00ca\u05fe\3\2\2\2\u00cc\u0604\3\2\2\2\u00ce"+
		"\u0609\3\2\2\2\u00d0\u060e\3\2\2\2\u00d2\u0610\3\2\2\2\u00d4\u0615\3\2"+
		"\2\2\u00d6\u061f\3\2\2\2\u00d8\u062c\3\2\2\2\u00da\u062f\3\2\2\2\u00dc"+
		"\u0635\3\2\2\2\u00de\u0638\3\2\2\2\u00e0\u0644\3\2\2\2\u00e2\u064a\3\2"+
		"\2\2\u00e4\u0656\3\2\2\2\u00e6\u065a\3\2\2\2\u00e8\u0663\3\2\2\2\u00ea"+
		"\u066c\3\2\2\2\u00ec\u0670\3\2\2\2\u00ee\u067f\3\2\2\2\u00f0\u0688\3\2"+
		"\2\2\u00f2\u068a\3\2\2\2\u00f4\u0692\3\2\2\2\u00f6\u0696\3\2\2\2\u00f8"+
		"\u069d\3\2\2\2\u00fa\u06a2\3\2\2\2\u00fc\u06ac\3\2\2\2\u00fe\u06b0\3\2"+
		"\2\2\u0100\u06c5\3\2\2\2\u0102\u06cc\3\2\2\2\u0104\u06da\3\2\2\2\u0106"+
		"\u06e2\3\2\2\2\u0108\u06e6\3\2\2\2\u010a\u06ee\3\2\2\2\u010c\u06f5\3\2"+
		"\2\2\u010e\u06f9\3\2\2\2\u0110\u06fb\3\2\2\2\u0112\u06ff\3\2\2\2\u0114"+
		"\u0707\3\2\2\2\u0116\u0709\3\2\2\2\u0118\u0719\3\2\2\2\u011a\u0723\3\2"+
		"\2\2\u011c\u0726\3\2\2\2\u011e\u072d\3\2\2\2\u0120\u073f\3\2\2\2\u0122"+
		"\u0748\3\2\2\2\u0124\u0757\3\2\2\2\u0126\u075b\3\2\2\2\u0128\u075e\3\2"+
		"\2\2\u012a\u076b\3\2\2\2\u012c\u0771\3\2\2\2\u012e\u078c\3\2\2\2\u0130"+
		"\u078e\3\2\2\2\u0132\u0795\3\2\2\2\u0134\u079f\3\2\2\2\u0136\u07a1\3\2"+
		"\2\2\u0138\u07a4\3\2\2\2\u013a\u07ae\3\2\2\2\u013c\u07bf\3\2\2\2\u013e"+
		"\u07cb\3\2\2\2\u0140\u07d4\3\2\2\2\u0142\u07e4\3\2\2\2\u0144\u07f0\3\2"+
		"\2\2\u0146\u07f7\3\2\2\2\u0148\u07f9\3\2\2\2\u014a\u07fc\3\2\2\2\u014c"+
		"\u0806\3\2\2\2\u014e\u084d\3\2\2\2\u0150\u0863\3\2\2\2\u0152\u0866\3\2"+
		"\2\2\u0154\u0877\3\2\2\2\u0156\u087e\3\2\2\2\u0158\u0889\3\2\2\2\u015a"+
		"\u088c\3\2\2\2\u015c\u0890\3\2\2\2\u015e\u089e\3\2\2\2\u0160\u08a0\3\2"+
		"\2\2\u0162\u08a8\3\2\2\2\u0164\u08ba\3\2\2\2\u0166\u08cd\3\2\2\2\u0168"+
		"\u08cf\3\2\2\2\u016a\u08d7\3\2\2\2\u016c\u08e0\3\2\2\2\u016e\u08e2\3\2"+
		"\2\2\u0170\u0904\3\2\2\2\u0172\u0906\3\2\2\2\u0174\u090a\3\2\2\2\u0176"+
		"\u090e\3\2\2\2\u0178\u091a\3\2\2\2\u017a\u091c\3\2\2\2\u017c\u0922\3\2"+
		"\2\2\u017e\u0924\3\2\2\2\u0180\u092d\3\2\2\2\u0182\u093a\3\2\2\2\u0184"+
		"\u0940\3\2\2\2\u0186\u0942\3\2\2\2\u0188\u0952\3\2\2\2\u018a\u0954\3\2"+
		"\2\2\u018c\u0964\3\2\2\2\u018e\u0975\3\2\2\2\u0190\u0984\3\2\2\2\u0192"+
		"\u098d\3\2\2\2\u0194\u099d\3\2\2\2\u0196\u09a9\3\2\2\2\u0198\u09ac\3\2"+
		"\2\2\u019a\u09bc\3\2\2\2\u019c\u09c1\3\2\2\2\u019e\u09cf\3\2\2\2\u01a0"+
		"\u09d5\3\2\2\2\u01a2\u09e0\3\2\2\2\u01a4\u09f8\3\2\2\2\u01a6\u0a04\3\2"+
		"\2\2\u01a8\u0a1a\3\2\2\2\u01aa\u0a20\3\2\2\2\u01ac\u0a26\3\2\2\2\u01ae"+
		"\u0a2e\3\2\2\2\u01b0\u01b2\7\3\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5\u00d6l\2\u01b4\u01b3\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8\5\u0156\u00ac\2\u01b7\u01b6"+
		"\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\5\u00dan\2\u01bd\u01bc"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7\2\2\3\u01c0"+
		"\3\3\2\2\2\u01c1\u01c2\7\u0094\2\2\u01c2\u01c7\5\b\5\2\u01c3\u01c4\7\u0086"+
		"\2\2\u01c4\u01c6\5\b\5\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01cb\7\u0095\2\2\u01cb\5\3\2\2\2\u01cc\u01ce\5\u01ae\u00d8"+
		"\2\u01cd\u01cf\5\4\3\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2"+
		"\3\2\2\2\u01d0\u01d2\5\u00e0q\2\u01d1\u01cc\3\2\2\2\u01d1\u01d0\3\2\2"+
		"\2\u01d2\u01da\3\2\2\2\u01d3\u01d4\7\u0085\2\2\u01d4\u01d6\5\u01ae\u00d8"+
		"\2\u01d5\u01d7\5\4\3\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9"+
		"\3\2\2\2\u01d8\u01d3\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\7\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e3\5\n\6\2"+
		"\u01de\u01e2\7\u0096\2\2\u01df\u01e2\5\u013e\u00a0\2\u01e0\u01e2\7\u008b"+
		"\2\2\u01e1\u01de\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\t\3\2\2\2"+
		"\u01e5\u01e3\3\2\2\2\u01e6\u01ec\5\20\t\2\u01e7\u01ec\5\30\r\2\u01e8\u01e9"+
		"\7n\2\2\u01e9\u01ec\7\u008b\2\2\u01ea\u01ec\5\f\7\2\u01eb\u01e6\3\2\2"+
		"\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\13"+
		"\3\2\2\2\u01ed\u01ee\7\u0083\2\2\u01ee\u01f1\5\16\b\2\u01ef\u01f0\7\u0086"+
		"\2\2\u01f0\u01f2\5\16\b\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\u0084"+
		"\2\2\u01f6\r\3\2\2\2\u01f7\u01f9\5\b\5\2\u01f8\u01fa\5\u01ae\u00d8\2\u01f9"+
		"\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\17\3\2\2\2\u01fb\u01fe\5\22\n"+
		"\2\u01fc\u01fe\7\24\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"\21\3\2\2\2\u01ff\u0203\5\24\13\2\u0200\u0203\5\26\f\2\u0201\u0203\7\37"+
		"\2\2\u0202\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203"+
		"\23\3\2\2\2\u0204\u0205\t\2\2\2\u0205\25\3\2\2\2\u0206\u0207\t\3\2\2\u0207"+
		"\27\3\2\2\2\u0208\u020d\5\6\4\2\u0209\u020d\7F\2\2\u020a\u020d\7%\2\2"+
		"\u020b\u020d\7]\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020c\u020b\3\2\2\2\u020d\31\3\2\2\2\u020e\u0213\5\34\17\2\u020f"+
		"\u0210\7\u0086\2\2\u0210\u0212\5\34\17\2\u0211\u020f\3\2\2\2\u0212\u0215"+
		"\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\33\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0216\u0217\5\u01ae\u00d8\2\u0217\u0218\7\u0087\2\2\u0218"+
		"\u021a\3\2\2\2\u0219\u0216\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2"+
		"\2\2\u021b\u021d\t\4\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u0220\3\2\2\2\u021e\u0221\7l\2\2\u021f\u0221\5\b\5\2\u0220\u021e\3\2"+
		"\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0223\5\36\20\2\u0223\35\3\2\2\2\u0224\u0229\5\"\22\2\u0225\u0229\5 "+
		"\21\2\u0226\u0227\7R\2\2\u0227\u0229\5 \21\2\u0228\u0224\3\2\2\2\u0228"+
		"\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0229\37\3\2\2\2\u022a\u022e\5x=\2"+
		"\u022b\u022e\5\u0084C\2\u022c\u022e\5&\24\2\u022d\u022a\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022e!\3\2\2\2\u022f\u0230\5F$\2\u0230"+
		"\u0231\5$\23\2\u0231\u0232\5\36\20\2\u0232\u0238\3\2\2\2\u0233\u0234\5"+
		"F$\2\u0234\u0235\7\u00ac\2\2\u0235\u0236\5L\'\2\u0236\u0238\3\2\2\2\u0237"+
		"\u022f\3\2\2\2\u0237\u0233\3\2\2\2\u0238#\3\2\2\2\u0239\u0245\7\u0093"+
		"\2\2\u023a\u0245\7\u00a2\2\2\u023b\u0245\7\u00a3\2\2\u023c\u0245\7\u00a4"+
		"\2\2\u023d\u0245\7\u00a5\2\2\u023e\u0245\7\u00a6\2\2\u023f\u0245\7\u00a7"+
		"\2\2\u0240\u0245\7\u00a8\2\2\u0241\u0245\7\u00a9\2\2\u0242\u0245\7\u00ab"+
		"\2\2\u0243\u0245\5\u0176\u00bc\2\u0244\u0239\3\2\2\2\u0244\u023a\3\2\2"+
		"\2\u0244\u023b\3\2\2\2\u0244\u023c\3\2\2\2\u0244\u023d\3\2\2\2\u0244\u023e"+
		"\3\2\2\2\u0244\u023f\3\2\2\2\u0244\u0240\3\2\2\2\u0244\u0241\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245%\3\2\2\2\u0246\u024c\5(\25\2"+
		"\u0247\u0248\7\u0096\2\2\u0248\u0249\5L\'\2\u0249\u024a\7\u0087\2\2\u024a"+
		"\u024b\5L\'\2\u024b\u024d\3\2\2\2\u024c\u0247\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\'\3\2\2\2\u024e\u0254\5*\26\2\u024f\u0252\7\u0098\2\2\u0250"+
		"\u0253\5(\25\2\u0251\u0253\5N(\2\u0252\u0250\3\2\2\2\u0252\u0251\3\2\2"+
		"\2\u0253\u0255\3\2\2\2\u0254\u024f\3\2\2\2\u0254\u0255\3\2\2\2\u0255)"+
		"\3\2\2\2\u0256\u025b\5,\27\2\u0257\u0258\7\u009c\2\2\u0258\u025a\5,\27"+
		"\2\u0259\u0257\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c+\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0263\5.\30\2\u025f"+
		"\u0260\7\u009b\2\2\u0260\u0262\5.\30\2\u0261\u025f\3\2\2\2\u0262\u0265"+
		"\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264-\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0266\u026b\5\60\31\2\u0267\u0268\7\u008f\2\2\u0268\u026a"+
		"\5\60\31\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2"+
		"\u026b\u026c\3\2\2\2\u026c/\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0273\5"+
		"\62\32\2\u026f\u0270\7\u0090\2\2\u0270\u0272\5\62\32\2\u0271\u026f\3\2"+
		"\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\61\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u027b\5\64\33\2\u0277\u0278\7\u008e"+
		"\2\2\u0278\u027a\5\64\33\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\63\3\2\2\2\u027d\u027b\3\2\2"+
		"\2\u027e\u0283\5\66\34\2\u027f\u0280\t\5\2\2\u0280\u0282\5\66\34\2\u0281"+
		"\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\65\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u028f\58\35\2\u0287\u0288"+
		"\t\6\2\2\u0288\u028e\58\35\2\u0289\u028a\7=\2\2\u028a\u028e\5r:\2\u028b"+
		"\u028c\7\17\2\2\u028c\u028e\5\b\5\2\u028d\u0287\3\2\2\2\u028d\u0289\3"+
		"\2\2\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\67\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u029a\5:\36"+
		"\2\u0293\u0296\7\u00aa\2\2\u0294\u0296\5\u0174\u00bb\2\u0295\u0293\3\2"+
		"\2\2\u0295\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\5:\36\2\u0298"+
		"\u0295\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b9\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u02a2\5<\37\2\u029e\u029f"+
		"\t\7\2\2\u029f\u02a1\5<\37\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3;\3\2\2\2\u02a4\u02a2\3\2\2\2"+
		"\u02a5\u02aa\5> \2\u02a6\u02a7\t\b\2\2\u02a7\u02a9\5> \2\u02a8\u02a6\3"+
		"\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"=\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02b7\5D#\2\u02ae\u02af\7_\2\2\u02af"+
		"\u02b4\7\177\2\2\u02b0\u02b2\5@!\2\u02b1\u02b3\7\u0086\2\2\u02b2\u02b1"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b0\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\7\u0080\2\2\u02b7\u02ae"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8?\3\2\2\2\u02b9\u02be\5B\"\2\u02ba\u02bb"+
		"\7\u0086\2\2\u02bb\u02bd\5B\"\2\u02bc\u02ba\3\2\2\2\u02bd\u02c0\3\2\2"+
		"\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bfA\3\2\2\2\u02c0\u02be"+
		"\3\2\2\2\u02c1\u02c3\5\36\20\2\u02c2\u02c4\5\u00be`\2\u02c3\u02c2\3\2"+
		"\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\5\u0172\u00ba"+
		"\2\u02c6\u02c7\5L\'\2\u02c7C\3\2\2\2\u02c8\u02d1\5F$\2\u02c9\u02cb\5F"+
		"$\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02ce\7\u00ad\2\2\u02cd\u02cf\5F$\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3"+
		"\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02c8\3\2\2\2\u02d0\u02ca\3\2\2\2\u02d1"+
		"E\3\2\2\2\u02d2\u02ed\5H%\2\u02d3\u02d4\7\u0089\2\2\u02d4\u02ed\5F$\2"+
		"\u02d5\u02d6\7\u008a\2\2\u02d6\u02ed\5F$\2\u02d7\u02d8\7\u0091\2\2\u02d8"+
		"\u02ed\5F$\2\u02d9\u02da\7\u0092\2\2\u02da\u02ed\5F$\2\u02db\u02dc\7\u0099"+
		"\2\2\u02dc\u02ed\5F$\2\u02dd\u02de\7\u009a\2\2\u02de\u02ed\5F$\2\u02df"+
		"\u02e0\7\u0083\2\2\u02e0\u02e1\5\b\5\2\u02e1\u02e2\7\u0084\2\2\u02e2\u02e3"+
		"\5F$\2\u02e3\u02ed\3\2\2\2\u02e4\u02e5\7\22\2\2\u02e5\u02ed\5F$\2\u02e6"+
		"\u02e7\7\u008e\2\2\u02e7\u02ed\5F$\2\u02e8\u02e9\7\u008b\2\2\u02e9\u02ed"+
		"\5F$\2\u02ea\u02eb\7\u0090\2\2\u02eb\u02ed\5F$\2\u02ec\u02d2\3\2\2\2\u02ec"+
		"\u02d3\3\2\2\2\u02ec\u02d5\3\2\2\2\u02ec\u02d7\3\2\2\2\u02ec\u02d9\3\2"+
		"\2\2\u02ec\u02db\3\2\2\2\u02ec\u02dd\3\2\2\2\u02ec\u02df\3\2\2\2\u02ec"+
		"\u02e4\3\2\2\2\u02ec\u02e6\3\2\2\2\u02ec\u02e8\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02edG\3\2\2\2\u02ee\u02f0\5J&\2\u02ef\u02f1\7\u0091\2\2\u02f0\u02ef"+
		"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f5\3\2\2\2\u02f2\u02f4\5R*\2\u02f3"+
		"\u02f2\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2"+
		"\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02fa\7\u0091\2\2\u02f9"+
		"\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u0311\3\2\2\2\u02fb\u0302\5P"+
		")\2\u02fc\u0302\5\u01aa\u00d6\2\u02fd\u0302\7\u0099\2\2\u02fe\u0302\7"+
		"\u009a\2\2\u02ff\u0300\7\u009d\2\2\u0300\u0302\5\u01ae\u00d8\2\u0301\u02fb"+
		"\3\2\2\2\u0301\u02fc\3\2\2\2\u0301\u02fd\3\2\2\2\u0301\u02fe\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0304\3\2\2\2\u0303\u0305\7\u0091\2\2\u0304\u0303"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0309\3\2\2\2\u0306\u0308\5R*\2\u0307"+
		"\u0306\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030e\7\u0091\2\2\u030d"+
		"\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u0301\3\2"+
		"\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"I\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u038e\5\u0178\u00bd\2\u0315\u0317"+
		"\5\u01ae\u00d8\2\u0316\u0318\5\4\3\2\u0317\u0316\3\2\2\2\u0317\u0318\3"+
		"\2\2\2\u0318\u038e\3\2\2\2\u0319\u031a\7\u0083\2\2\u031a\u031b\5\36\20"+
		"\2\u031b\u031c\7\u0084\2\2\u031c\u038e\3\2\2\2\u031d\u038e\5V,\2\u031e"+
		"\u038e\5\u00e0q\2\u031f\u038e\7u\2\2\u0320\u038e\7`\2\2\u0321\u032b\7"+
		"\23\2\2\u0322\u0323\7\u0085\2\2\u0323\u0325\5\u01ae\u00d8\2\u0324\u0326"+
		"\5\4\3\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u032c\3\2\2\2\u0327"+
		"\u0328\7\u0081\2\2\u0328\u0329\5X-\2\u0329\u032a\7\u0082\2\2\u032a\u032c"+
		"\3\2\2\2\u032b\u0322\3\2\2\2\u032b\u0327\3\2\2\2\u032c\u038e\3\2\2\2\u032d"+
		"\u034a\7D\2\2\u032e\u0344\5\b\5\2\u032f\u0345\5\u01ac\u00d7\2\u0330\u0345"+
		"\5Z.\2\u0331\u0332\7\u0081\2\2\u0332\u0333\5X-\2\u0333\u0337\7\u0082\2"+
		"\2\u0334\u0336\5\u013e\u00a0\2\u0335\u0334\3\2\2\2\u0336\u0339\3\2\2\2"+
		"\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337"+
		"\3\2\2\2\u033a\u033c\5\u0140\u00a1\2\u033b\u033a\3\2\2\2\u033b\u033c\3"+
		"\2\2\2\u033c\u0345\3\2\2\2\u033d\u033f\5\u013e\u00a0\2\u033e\u033d\3\2"+
		"\2\2\u033f\u0340\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0343\5\u0140\u00a1\2\u0343\u0345\3\2\2\2\u0344\u032f"+
		"\3\2\2\2\u0344\u0330\3\2\2\2\u0344\u0331\3\2\2\2\u0344\u033e\3\2\2\2\u0345"+
		"\u034b\3\2\2\2\u0346\u034b\5h\65\2\u0347\u0348\5\u013e\u00a0\2\u0348\u0349"+
		"\5\u0140\u00a1\2\u0349\u034b\3\2\2\2\u034a\u032e\3\2\2\2\u034a\u0346\3"+
		"\2\2\2\u034a\u0347\3\2\2\2\u034b\u038e\3\2\2\2\u034c\u034d\7\u0083\2\2"+
		"\u034d\u0350\5\34\17\2\u034e\u034f\7\u0086\2\2\u034f\u0351\5\34\17\2\u0350"+
		"\u034e\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353\u0354\3\2\2\2\u0354\u0355\7\u0084\2\2\u0355\u038e\3\2\2\2\u0356"+
		"\u0357\7d\2\2\u0357\u035b\7\u0083\2\2\u0358\u035c\5n8\2\u0359\u035c\5"+
		"\b\5\2\u035a\u035c\7n\2\2\u035b\u0358\3\2\2\2\u035b\u0359\3\2\2\2\u035b"+
		"\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u038e\7\u0084\2\2\u035e\u035f"+
		"\7\33\2\2\u035f\u0360\7\u0083\2\2\u0360\u0361\5\36\20\2\u0361\u0362\7"+
		"\u0084\2\2\u0362\u038e\3\2\2\2\u0363\u0364\7g\2\2\u0364\u0365\7\u0083"+
		"\2\2\u0365\u0366\5\36\20\2\u0366\u0367\7\u0084\2\2\u0367\u038e\3\2\2\2"+
		"\u0368\u036d\7 \2\2\u0369\u036a\7\u0083\2\2\u036a\u036b\5\b\5\2\u036b"+
		"\u036c\7\u0084\2\2\u036c\u036e\3\2\2\2\u036d\u0369\3\2\2\2\u036d\u036e"+
		"\3\2\2\2\u036e\u038e\3\2\2\2\u036f\u0371\7\21\2\2\u0370\u036f\3\2\2\2"+
		"\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0378\7!\2\2\u0373\u0375"+
		"\7\u0083\2\2\u0374\u0376\5|?\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2"+
		"\u0376\u0377\3\2\2\2\u0377\u0379\7\u0084\2\2\u0378\u0373\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u038e\5\u00acW\2\u037b\u037c"+
		"\7Z\2\2\u037c\u037d\7\u0083\2\2\u037d\u037e\5\b\5\2\u037e\u037f\7\u0084"+
		"\2\2\u037f\u038e\3\2\2\2\u0380\u0381\7B\2\2\u0381\u0387\7\u0083\2\2\u0382"+
		"\u0383\5\u01ae\u00d8\2\u0383\u0384\7\u0085\2\2\u0384\u0386\3\2\2\2\u0385"+
		"\u0382\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2"+
		"\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b\5\u01ae\u00d8"+
		"\2\u038b\u038c\7\u0084\2\2\u038c\u038e\3\2\2\2\u038d\u0314\3\2\2\2\u038d"+
		"\u0315\3\2\2\2\u038d\u0319\3\2\2\2\u038d\u031d\3\2\2\2\u038d\u031e\3\2"+
		"\2\2\u038d\u031f\3\2\2\2\u038d\u0320\3\2\2\2\u038d\u0321\3\2\2\2\u038d"+
		"\u032d\3\2\2\2\u038d\u034c\3\2\2\2\u038d\u0356\3\2\2\2\u038d\u035e\3\2"+
		"\2\2\u038d\u0363\3\2\2\2\u038d\u0368\3\2\2\2\u038d\u0370\3\2\2\2\u038d"+
		"\u037b\3\2\2\2\u038d\u0380\3\2\2\2\u038eK\3\2\2\2\u038f\u0392\5\36\20"+
		"\2\u0390\u0392\5N(\2\u0391\u038f\3\2\2\2\u0391\u0390\3\2\2\2\u0392M\3"+
		"\2\2\2\u0393\u0394\7a\2\2\u0394\u0395\5\36\20\2\u0395O\3\2\2\2\u0396\u0398"+
		"\7\u0096\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2"+
		"\2\u0399\u039a\7\u0085\2\2\u039a\u039c\5\u01ae\u00d8\2\u039b\u039d\5\4"+
		"\3\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039dQ\3\2\2\2\u039e\u03a0"+
		"\7\u0096\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2"+
		"\2\u03a1\u03a2\7\u0081\2\2\u03a2\u03a7\5T+\2\u03a3\u03a4\7\u0086\2\2\u03a4"+
		"\u03a6\5T+\2\u03a5\u03a3\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2"+
		"\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab"+
		"\7\u0082\2\2\u03abS\3\2\2\2\u03ac\u03ad\5\u01ae\u00d8\2\u03ad\u03ae\7"+
		"\u0087\2\2\u03ae\u03b0\3\2\2\2\u03af\u03ac\3\2\2\2\u03af\u03b0\3\2\2\2"+
		"\u03b0\u03b1\3\2\2\2\u03b1\u03b2\5\36\20\2\u03b2U\3\2\2\2\u03b3\u03b4"+
		"\t\t\2\2\u03b4W\3\2\2\2\u03b5\u03ba\5\36\20\2\u03b6\u03b7\7\u0086\2\2"+
		"\u03b7\u03b9\5\36\20\2\u03b8\u03b6\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bbY\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd"+
		"\u03c0\5\\/\2\u03be\u03c0\5d\63\2\u03bf\u03bd\3\2\2\2\u03bf\u03be\3\2"+
		"\2\2\u03c0[\3\2\2\2\u03c1\u03c6\7\177\2\2\u03c2\u03c4\5^\60\2\u03c3\u03c5"+
		"\7\u0086\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2\2"+
		"\2\u03c6\u03c2\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9"+
		"\7\u0080\2\2\u03c9]\3\2\2\2\u03ca\u03cf\5`\61\2\u03cb\u03cc\7\u0086\2"+
		"\2\u03cc\u03ce\5`\61\2\u03cd\u03cb\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd"+
		"\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0_\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2"+
		"\u03d8\5\u01ae\u00d8\2\u03d3\u03d4\7\u0081\2\2\u03d4\u03d5\5\36\20\2\u03d5"+
		"\u03d6\7\u0082\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d2\3\2\2\2\u03d7\u03d3"+
		"\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\7\u0093\2\2\u03da\u03db\5b\62"+
		"\2\u03dba\3\2\2\2\u03dc\u03df\5\36\20\2\u03dd\u03df\5Z.\2\u03de\u03dc"+
		"\3\2\2\2\u03de\u03dd\3\2\2\2\u03dfc\3\2\2\2\u03e0\u03e1\7\177\2\2\u03e1"+
		"\u03e6\5f\64\2\u03e2\u03e3\7\u0086\2\2\u03e3\u03e5\5f\64\2\u03e4\u03e2"+
		"\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7"+
		"\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03eb\7\u0086\2\2\u03ea\u03e9"+
		"\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\7\u0080\2"+
		"\2\u03ede\3\2\2\2\u03ee\u03f4\5 \21\2\u03ef\u03f0\7\177\2\2\u03f0\u03f1"+
		"\5X-\2\u03f1\u03f2\7\u0080\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03ee\3\2\2\2"+
		"\u03f3\u03ef\3\2\2\2\u03f4g\3\2\2\2\u03f5\u03fa\7\177\2\2\u03f6\u03f8"+
		"\5j\66\2\u03f7\u03f9\7\u0086\2\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2"+
		"\2\u03f9\u03fb\3\2\2\2\u03fa\u03f6\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc"+
		"\3\2\2\2\u03fc\u03fd\7\u0080\2\2\u03fdi\3\2\2\2\u03fe\u0403\5l\67\2\u03ff"+
		"\u0400\7\u0086\2\2\u0400\u0402\5l\67\2\u0401\u03ff\3\2\2\2\u0402\u0405"+
		"\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404k\3\2\2\2\u0405"+
		"\u0403\3\2\2\2\u0406\u040c\5H%\2\u0407\u0408\5\u01ae\u00d8\2\u0408\u0409"+
		"\7\u0093\2\2\u0409\u040a\5\36\20\2\u040a\u040c\3\2\2\2\u040b\u0406\3\2"+
		"\2\2\u040b\u0407\3\2\2\2\u040cm\3\2\2\2\u040d\u0416\5\u01ae\u00d8\2\u040e"+
		"\u0410\5p9\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0417\3\2\2"+
		"\2\u0411\u0412\7\u0097\2\2\u0412\u0414\5\u01ae\u00d8\2\u0413\u0415\5p"+
		"9\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416"+
		"\u040f\3\2\2\2\u0416\u0411\3\2\2\2\u0417\u041f\3\2\2\2\u0418\u0419\7\u0085"+
		"\2\2\u0419\u041b\5\u01ae\u00d8\2\u041a\u041c\5p9\2\u041b\u041a\3\2\2\2"+
		"\u041b\u041c\3\2\2\2\u041c\u041e\3\2\2\2\u041d\u0418\3\2\2\2\u041e\u0421"+
		"\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420o\3\2\2\2\u0421"+
		"\u041f\3\2\2\2\u0422\u0426\7\u0094\2\2\u0423\u0425\7\u0086\2\2\u0424\u0423"+
		"\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042a\7\u0095\2\2\u042aq\3\2"+
		"\2\2\u042b\u0430\5\n\6\2\u042c\u042f\5\u013e\u00a0\2\u042d\u042f\7\u008b"+
		"\2\2\u042e\u042c\3\2\2\2\u042e\u042d\3\2\2\2\u042f\u0432\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2"+
		"\2\2\u0433\u0435\7\u0096\2\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0437\3\2\2\2\u0436\u0438\5t;\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2"+
		"\2\u0438\u043a\3\2\2\2\u0439\u043b\5\u01ae\u00d8\2\u043a\u0439\3\2\2\2"+
		"\u043a\u043b\3\2\2\2\u043bs\3\2\2\2\u043c\u043d\7\177\2\2\u043d\u0442"+
		"\5v<\2\u043e\u043f\7\u0086\2\2\u043f\u0441\5v<\2\u0440\u043e\3\2\2\2\u0441"+
		"\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2"+
		"\2\2\u0444\u0442\3\2\2\2\u0445\u0446\7\u0080\2\2\u0446u\3\2\2\2\u0447"+
		"\u0448\5\u01ae\u00d8\2\u0448\u0449\7\u0087\2\2\u0449\u044a\5\36\20\2\u044a"+
		"w\3\2\2\2\u044b\u044d\7\21\2\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2"+
		"\u044d\u044e\3\2\2\2\u044e\u044f\5z>\2\u044f\u0450\5\u0172\u00ba\2\u0450"+
		"\u0451\5\u0082B\2\u0451y\3\2\2\2\u0452\u0453\7\u0083\2\2\u0453\u045e\7"+
		"\u0084\2\2\u0454\u0455\7\u0083\2\2\u0455\u0456\5|?\2\u0456\u0457\7\u0084"+
		"\2\2\u0457\u045e\3\2\2\2\u0458\u0459\7\u0083\2\2\u0459\u045a\5\u0080A"+
		"\2\u045a\u045b\7\u0084\2\2\u045b\u045e\3\2\2\2\u045c\u045e\5\u01ae\u00d8"+
		"\2\u045d\u0452\3\2\2\2\u045d\u0454\3\2\2\2\u045d\u0458\3\2\2\2\u045d\u045c"+
		"\3\2\2\2\u045e{\3\2\2\2\u045f\u0464\5~@\2\u0460\u0461\7\u0086\2\2\u0461"+
		"\u0463\5~@\2\u0462\u0460\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2\2"+
		"\2\u0464\u0465\3\2\2\2\u0465}\3\2\2\2\u0466\u0464\3\2\2\2\u0467\u0469"+
		"\t\4\2\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u046b\5\b\5\2\u046b\u046c\5\u01ae\u00d8\2\u046c\177\3\2\2\2\u046d\u0472"+
		"\5\u01ae\u00d8\2\u046e\u046f\7\u0086\2\2\u046f\u0471\5\u01ae\u00d8\2\u0470"+
		"\u046e\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2"+
		"\2\2\u0473\u0081\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u0478\5L\'\2\u0476"+
		"\u0478\5\u00acW\2\u0477\u0475\3\2\2\2\u0477\u0476\3\2\2\2\u0478\u0083"+
		"\3\2\2\2\u0479\u047a\5\u0086D\2\u047a\u047b\5\u0088E\2\u047b\u0085\3\2"+
		"\2\2\u047c\u047e\7\62\2\2\u047d\u047f\5\b\5\2\u047e\u047d\3\2\2\2\u047e"+
		"\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\5\u01ae\u00d8\2\u0481\u0482"+
		"\78\2\2\u0482\u0483\5\36\20\2\u0483\u0087\3\2\2\2\u0484\u0486\5\u008a"+
		"F\2\u0485\u0484\3\2\2\2\u0486\u0489\3\2\2\2\u0487\u0485\3\2\2\2\u0487"+
		"\u0488\3\2\2\2\u0488\u048a\3\2\2\2\u0489\u0487\3\2\2\2\u048a\u048c\5\u0096"+
		"L\2\u048b\u048d\5\u0098M\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u0089\3\2\2\2\u048e\u0494\5\u0086D\2\u048f\u0494\5\u008cG\2\u0490\u0494"+
		"\5\u008eH\2\u0491\u0494\5\u0090I\2\u0492\u0494\5\u0092J\2\u0493\u048e"+
		"\3\2\2\2\u0493\u048f\3\2\2\2\u0493\u0490\3\2\2\2\u0493\u0491\3\2\2\2\u0493"+
		"\u0492\3\2\2\2\u0494\u008b\3\2\2\2\u0495\u0496\7?\2\2\u0496\u0497\5\u01ae"+
		"\u00d8\2\u0497\u0498\7\u0093\2\2\u0498\u0499\5\36\20\2\u0499\u008d\3\2"+
		"\2\2\u049a\u049b\7q\2\2\u049b\u049c\5\36\20\2\u049c\u008f\3\2\2\2\u049d"+
		"\u049f\7>\2\2\u049e\u04a0\5\b\5\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2"+
		"\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\5\u01ae\u00d8\2\u04a2\u04a3\78\2"+
		"\2\u04a3\u04a4\5\36\20\2\u04a4\u04a5\7G\2\2\u04a5\u04a6\5\36\20\2\u04a6"+
		"\u04a7\7(\2\2\u04a7\u04aa\5\36\20\2\u04a8\u04a9\7<\2\2\u04a9\u04ab\5\u01ae"+
		"\u00d8\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u0091\3\2\2\2\u04ac"+
		"\u04ad\7I\2\2\u04ad\u04b2\5\u0094K\2\u04ae\u04af\7\u0086\2\2\u04af\u04b1"+
		"\5\u0094K\2\u04b0\u04ae\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b0\3\2\2"+
		"\2\u04b2\u04b3\3\2\2\2\u04b3\u0093\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b5\u04b7"+
		"\5\36\20\2\u04b6\u04b8\t\n\2\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2"+
		"\u04b8\u0095\3\2\2\2\u04b9\u04ba\7W\2\2\u04ba\u04c1\5\36\20\2\u04bb\u04bc"+
		"\7\65\2\2\u04bc\u04bd\5\36\20\2\u04bd\u04be\7\26\2\2\u04be\u04bf\5\36"+
		"\20\2\u04bf\u04c1\3\2\2\2\u04c0\u04b9\3\2\2\2\u04c0\u04bb\3\2\2\2\u04c1"+
		"\u0097\3\2\2\2\u04c2\u04c3\7<\2\2\u04c3\u04c4\5\u01ae\u00d8\2\u04c4\u04c5"+
		"\5\u0088E\2\u04c5\u0099\3\2\2\2\u04c6\u04ca\5\u00a6T\2\u04c7\u04ca\5\u009c"+
		"O\2\u04c8\u04ca\5\u00a8U\2\u04c9\u04c6\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9"+
		"\u04c8\3\2\2\2\u04ca\u009b\3\2\2\2\u04cb\u04cc\5\u00aeX\2\u04cc\u04cd"+
		"\7\u0088\2\2\u04cd\u04d3\3\2\2\2\u04ce\u04cf\5\u00b6\\\2\u04cf\u04d0\7"+
		"\u0088\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04d3\5\u009eP\2\u04d2\u04cb\3\2"+
		"\2\2\u04d2\u04ce\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u009d\3\2\2\2\u04d4"+
		"\u04d5\5\u00a0Q\2\u04d5\u04d6\5\u00a4S\2\u04d6\u009f\3\2\2\2\u04d7\u04d9"+
		"\5\u00a2R\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\3\2\2"+
		"\2\u04da\u04db\5\u010e\u0088\2\u04db\u04dd\5\u01ae\u00d8\2\u04dc\u04de"+
		"\5\u00e2r\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2"+
		"\2\u04df\u04e1\7\u0083\2\2\u04e0\u04e2\5\u0114\u008b\2\u04e1\u04e0\3\2"+
		"\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\7\u0084\2\2\u04e4"+
		"\u04e6\5\u00eav\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u00a1"+
		"\3\2\2\2\u04e7\u04e9\t\13\2\2\u04e8\u04ea\7\\\2\2\u04e9\u04e8\3\2\2\2"+
		"\u04e9\u04ea\3\2\2\2\u04ea\u04ee\3\2\2\2\u04eb\u04ec\7\\\2\2\u04ec\u04ee"+
		"\t\13\2\2\u04ed\u04e7\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u00a3\3\2\2\2"+
		"\u04ef\u04f5\5\u00acW\2\u04f0\u04f1\5\u0172\u00ba\2\u04f1\u04f2\5L\'\2"+
		"\u04f2\u04f3\7\u0088\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04ef\3\2\2\2\u04f4"+
		"\u04f0\3\2\2\2\u04f5\u00a5\3\2\2\2\u04f6\u04f7\5\u01ae\u00d8\2\u04f7\u04f8"+
		"\7\u0087\2\2\u04f8\u04f9\5\u009aN\2\u04f9\u00a7\3\2\2\2\u04fa\u04fd\5"+
		"\u00acW\2\u04fb\u04fd\5\u00aaV\2\u04fc\u04fa\3\2\2\2\u04fc\u04fb\3\2\2"+
		"\2\u04fd\u00a9\3\2\2\2\u04fe\u0581\7\u0088\2\2\u04ff\u0500\5\36\20\2\u0500"+
		"\u0501\7\u0088\2\2\u0501\u0581\3\2\2\2\u0502\u0503\7\66\2\2\u0503\u0504"+
		"\7\u0083\2\2\u0504\u0505\5\36\20\2\u0505\u0506\7\u0084\2\2\u0506\u0509"+
		"\5\u00b8]\2\u0507\u0508\7&\2\2\u0508\u050a\5\u00b8]\2\u0509\u0507\3\2"+
		"\2\2\u0509\u050a\3\2\2\2\u050a\u0581\3\2\2\2\u050b\u050c\7_\2\2\u050c"+
		"\u050d\7\u0083\2\2\u050d\u050e\5\36\20\2\u050e\u050f\7\u0084\2\2\u050f"+
		"\u0513\7\177\2\2\u0510\u0512\5\u00ba^\2\u0511\u0510\3\2\2\2\u0512\u0515"+
		"\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\3\2\2\2\u0515"+
		"\u0513\3\2\2\2\u0516\u0517\7\u0080\2\2\u0517\u0581\3\2\2\2\u0518\u0519"+
		"\7r\2\2\u0519\u051a\7\u0083\2\2\u051a\u051b\5\36\20\2\u051b\u051c\7\u0084"+
		"\2\2\u051c\u051d\5\u00a8U\2\u051d\u0581\3\2\2\2\u051e\u051f\7#\2\2\u051f"+
		"\u0520\5\u00a8U\2\u0520\u0521\7r\2\2\u0521\u0522\7\u0083\2\2\u0522\u0523"+
		"\5\36\20\2\u0523\u0524\7\u0084\2\2\u0524\u0525\7\u0088\2\2\u0525\u0581"+
		"\3\2\2\2\u0526\u0527\7\60\2\2\u0527\u0529\7\u0083\2\2\u0528\u052a\5\u00c2"+
		"b\2\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u052d\7\u0088\2\2\u052c\u052e\5\36\20\2\u052d\u052c\3\2\2\2\u052d\u052e"+
		"\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0531\7\u0088\2\2\u0530\u0532\5\u00c4"+
		"c\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533"+
		"\u0534\7\u0084\2\2\u0534\u0581\5\u00a8U\2\u0535\u0537\7\22\2\2\u0536\u0535"+
		"\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\7\61\2\2"+
		"\u0539\u053a\7\u0083\2\2\u053a\u053b\5\u00b0Y\2\u053b\u053c\5\u01ae\u00d8"+
		"\2\u053c\u053d\78\2\2\u053d\u053e\5\36\20\2\u053e\u053f\7\u0084\2\2\u053f"+
		"\u0540\5\u00a8U\2\u0540\u0581\3\2\2\2\u0541\u0542\7\25\2\2\u0542\u0581"+
		"\7\u0088\2\2\u0543\u0544\7\36\2\2\u0544\u0581\7\u0088\2\2\u0545\u054a"+
		"\7\64\2\2\u0546\u054b\5\u01ae\u00d8\2\u0547\u0548\7\30\2\2\u0548\u054b"+
		"\5\36\20\2\u0549\u054b\7 \2\2\u054a\u0546\3\2\2\2\u054a\u0547\3\2\2\2"+
		"\u054a\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u0581\7\u0088\2\2\u054d"+
		"\u054f\7T\2\2\u054e\u0550\5\36\20\2\u054f\u054e\3\2\2\2\u054f\u0550\3"+
		"\2\2\2\u0550\u0551\3\2\2\2\u0551\u0581\7\u0088\2\2\u0552\u0554\7a\2\2"+
		"\u0553\u0555\5\36\20\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556"+
		"\3\2\2\2\u0556\u0581\7\u0088\2\2\u0557\u0558\7c\2\2\u0558\u055e\5\u00ac"+
		"W\2\u0559\u055b\5\u00c6d\2\u055a\u055c\5\u00ceh\2\u055b\u055a\3\2\2\2"+
		"\u055b\u055c\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055f\5\u00ceh\2\u055e"+
		"\u0559\3\2\2\2\u055e\u055d\3\2\2\2\u055f\u0581\3\2\2\2\u0560\u0561\7\33"+
		"\2\2\u0561\u0581\5\u00acW\2\u0562\u0563\7g\2\2\u0563\u0581\5\u00acW\2"+
		"\u0564\u0565\7@\2\2\u0565\u0566\7\u0083\2\2\u0566\u0567\5\36\20\2\u0567"+
		"\u0568\7\u0084\2\2\u0568\u0569\5\u00a8U\2\u0569\u0581\3\2\2\2\u056a\u056b"+
		"\7k\2\2\u056b\u056c\7\u0083\2\2\u056c\u056d\5\u00d0i\2\u056d\u056e\7\u0084"+
		"\2\2\u056e\u056f\5\u00a8U\2\u056f\u0581\3\2\2\2\u0570\u0574\7s\2\2\u0571"+
		"\u0572\7T\2\2\u0572\u0575\5\36\20\2\u0573\u0575\7\25\2\2\u0574\u0571\3"+
		"\2\2\2\u0574\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0581\7\u0088\2\2"+
		"\u0577\u0578\7i\2\2\u0578\u0581\5\u00acW\2\u0579\u057a\7.\2\2\u057a\u057b"+
		"\7\u0083\2\2\u057b\u057c\5\u0166\u00b4\2\u057c\u057d\5\u0168\u00b5\2\u057d"+
		"\u057e\7\u0084\2\2\u057e\u057f\5\u00a8U\2\u057f\u0581\3\2\2\2\u0580\u04fe"+
		"\3\2\2\2\u0580\u04ff\3\2\2\2\u0580\u0502\3\2\2\2\u0580\u050b\3\2\2\2\u0580"+
		"\u0518\3\2\2\2\u0580\u051e\3\2\2\2\u0580\u0526\3\2\2\2\u0580\u0536\3\2"+
		"\2\2\u0580\u0541\3\2\2\2\u0580\u0543\3\2\2\2\u0580\u0545\3\2\2\2\u0580"+
		"\u054d\3\2\2\2\u0580\u0552\3\2\2\2\u0580\u0557\3\2\2\2\u0580\u0560\3\2"+
		"\2\2\u0580\u0562\3\2\2\2\u0580\u0564\3\2\2\2\u0580\u056a\3\2\2\2\u0580"+
		"\u0570\3\2\2\2\u0580\u0577\3\2\2\2\u0580\u0579\3\2\2\2\u0581\u00ab\3\2"+
		"\2\2\u0582\u0584\7\177\2\2\u0583\u0585\5\u00c0a\2\u0584\u0583\3\2\2\2"+
		"\u0584\u0585\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\7\u0080\2\2\u0587"+
		"\u00ad\3\2\2\2\u0588\u058d\7k\2\2\u0589\u058d\7R\2\2\u058a\u058b\7R\2"+
		"\2\u058b\u058d\7Q\2\2\u058c\u0588\3\2\2\2\u058c\u0589\3\2\2\2\u058c\u058a"+
		"\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\5\u00b0Y"+
		"\2\u058f\u0596\5\u00b2Z\2\u0590\u0591\7\u0086\2\2\u0591\u0592\5\u00b2"+
		"Z\2\u0592\u0593\6X\2\2\u0593\u0595\3\2\2\2\u0594\u0590\3\2\2\2\u0595\u0598"+
		"\3\2\2\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u059e\3\2\2\2\u0598"+
		"\u0596\3\2\2\2\u0599\u059a\7.\2\2\u059a\u059b\5\u0166\u00b4\2\u059b\u059c"+
		"\5\u0168\u00b5\2\u059c\u059e\3\2\2\2\u059d\u058c\3\2\2\2\u059d\u0599\3"+
		"\2\2\2\u059e\u00af\3\2\2\2\u059f\u05a2\7l\2\2\u05a0\u05a2\5\b\5\2\u05a1"+
		"\u059f\3\2\2\2\u05a1\u05a0\3\2\2\2\u05a2\u00b1\3\2\2\2\u05a3\u05a9\5\u01ae"+
		"\u00d8\2\u05a4\u05a6\7\u0093\2\2\u05a5\u05a7\7R\2\2\u05a6\u05a5\3\2\2"+
		"\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\5\u00b4[\2\u05a9"+
		"\u05a4\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u00b3\3\2\2\2\u05ab\u05af\5\36"+
		"\20\2\u05ac\u05af\5\u0140\u00a1\2\u05ad\u05af\5\u0170\u00b9\2\u05ae\u05ab"+
		"\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05ad\3\2\2\2\u05af\u00b5\3\2\2\2\u05b0"+
		"\u05b1\7\35\2\2\u05b1\u05b2\5\b\5\2\u05b2\u05b3\5\u0104\u0083\2\u05b3"+
		"\u00b7\3\2\2\2\u05b4\u05b7\5\u00acW\2\u05b5\u05b7\5\u00aaV\2\u05b6\u05b4"+
		"\3\2\2\2\u05b6\u05b5\3\2\2\2\u05b7\u00b9\3\2\2\2\u05b8\u05ba\5\u00bc_"+
		"\2\u05b9\u05b8\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc"+
		"\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\5\u00c0a\2\u05be\u00bb\3\2\2"+
		"\2\u05bf\u05c0\7\30\2\2\u05c0\u05c2\5\36\20\2\u05c1\u05c3\5\u00be`\2\u05c2"+
		"\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\7\u0087"+
		"\2\2\u05c5\u05c9\3\2\2\2\u05c6\u05c7\7 \2\2\u05c7\u05c9\7\u0087\2\2\u05c8"+
		"\u05bf\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c9\u00bd\3\2\2\2\u05ca\u05cb\7p"+
		"\2\2\u05cb\u05cc\5\36\20\2\u05cc\u00bf\3\2\2\2\u05cd\u05cf\5\u009aN\2"+
		"\u05ce\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1"+
		"\3\2\2\2\u05d1\u00c1\3\2\2\2\u05d2\u05dc\5\u00aeX\2\u05d3\u05d8\5\36\20"+
		"\2\u05d4\u05d5\7\u0086\2\2\u05d5\u05d7\5\36\20\2\u05d6\u05d4\3\2\2\2\u05d7"+
		"\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05dc\3\2"+
		"\2\2\u05da\u05d8\3\2\2\2\u05db\u05d2\3\2\2\2\u05db\u05d3\3\2\2\2\u05dc"+
		"\u00c3\3\2\2\2\u05dd\u05e2\5\36\20\2\u05de\u05df\7\u0086\2\2\u05df\u05e1"+
		"\5\36\20\2\u05e0\u05de\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2"+
		"\u05e2\u05e3\3\2\2\2\u05e3\u00c5\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e5\u05e9"+
		"\5\u00c8e\2\u05e6\u05e8\5\u00c8e\2\u05e7\u05e6\3\2\2\2\u05e8\u05eb\3\2"+
		"\2\2\u05e9\u05e7\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ed\3\2\2\2\u05eb"+
		"\u05e9\3\2\2\2\u05ec\u05ee\5\u00caf\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee"+
		"\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05f1\5\u00caf\2\u05f0\u05e5\3\2\2"+
		"\2\u05f0\u05ef\3\2\2\2\u05f1\u00c7\3\2\2\2\u05f2\u05f3\7\31\2\2\u05f3"+
		"\u05f4\7\u0083\2\2\u05f4\u05f6\5\30\r\2\u05f5\u05f7\5\u01ae\u00d8\2\u05f6"+
		"\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\7\u0084"+
		"\2\2\u05f9\u05fb\5\u00ccg\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u05fd\5\u00acW\2\u05fd\u00c9\3\2\2\2\u05fe\u0600"+
		"\7\31\2\2\u05ff\u0601\5\u00ccg\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2"+
		"\2\u0601\u0602\3\2\2\2\u0602\u0603\5\u00acW\2\u0603\u00cb\3\2\2\2\u0604"+
		"\u0605\7p\2\2\u0605\u0606\7\u0083\2\2\u0606\u0607\5\36\20\2\u0607\u0608"+
		"\7\u0084\2\2\u0608\u00cd\3\2\2\2\u0609\u060a\7-\2\2\u060a\u060b\5\u00ac"+
		"W\2\u060b\u00cf\3\2\2\2\u060c\u060f\5\u00aeX\2\u060d\u060f\5\36\20\2\u060e"+
		"\u060c\3\2\2\2\u060e\u060d\3\2\2\2\u060f\u00d1\3\2\2\2\u0610\u0611\7C"+
		"\2\2\u0611\u0613\5\u00d4k\2\u0612\u0614\7\u0088\2\2\u0613\u0612\3\2\2"+
		"\2\u0613\u0614\3\2\2\2\u0614\u00d3\3\2\2\2\u0615\u0617\7\177\2\2\u0616"+
		"\u0618\5\u00d6l\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u061a"+
		"\3\2\2\2\u0619\u061b\5\u00dan\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2"+
		"\2\u061b\u061c\3\2\2\2\u061c\u061d\7\u0080\2\2\u061d\u00d5\3\2\2\2\u061e"+
		"\u0620\5\u00d8m\2\u061f\u061e\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u061f"+
		"\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u00d7\3\2\2\2\u0623\u0624\7k\2\2\u0624"+
		"\u0625\5\6\4\2\u0625\u0626\7\u0088\2\2\u0626\u062d\3\2\2\2\u0627\u0628"+
		"\7k\2\2\u0628\u0629\7\\\2\2\u0629\u062a\5\6\4\2\u062a\u062b\7\u0088\2"+
		"\2\u062b\u062d\3\2\2\2\u062c\u0623\3\2\2\2\u062c\u0627\3\2\2\2\u062d\u00d9"+
		"\3\2\2\2\u062e\u0630\5\u00dco\2\u062f\u062e\3\2\2\2\u0630\u0631\3\2\2"+
		"\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u00db\3\2\2\2\u0633\u0636"+
		"\5\u00d2j\2\u0634\u0636\5\u00dep\2\u0635\u0633\3\2\2\2\u0635\u0634\3\2"+
		"\2\2\u0636\u00dd\3\2\2\2\u0637\u0639\5\u015a\u00ae\2\u0638\u0637\3\2\2"+
		"\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a\u063c\5\u00fc\177\2\u063b"+
		"\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u0642\3\2\2\2\u063d\u0643\5\u018a"+
		"\u00c6\2\u063e\u0643\5\u018c\u00c7\2\u063f\u0643\5\u018e\u00c8\2\u0640"+
		"\u0643\5\u0190\u00c9\2\u0641\u0643\5\u0192\u00ca\2\u0642\u063d\3\2\2\2"+
		"\u0642\u063e\3\2\2\2\u0642\u063f\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0641"+
		"\3\2\2\2\u0643\u00df\3\2\2\2\u0644\u0645\5\u01ae\u00d8\2\u0645\u0646\7"+
		"\u0097\2\2\u0646\u0648\5\u01ae\u00d8\2\u0647\u0649\5\4\3\2\u0648\u0647"+
		"\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u00e1\3\2\2\2\u064a\u064b\7\u0094\2"+
		"\2\u064b\u0650\5\u00e4s\2\u064c\u064d\7\u0086\2\2\u064d\u064f\5\u00e4"+
		"s\2\u064e\u064c\3\2\2\2\u064f\u0652\3\2\2\2\u0650\u064e\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0650\3\2\2\2\u0653\u0654\7\u0095"+
		"\2\2\u0654\u00e3\3\2\2\2\u0655\u0657\5\u015a\u00ae\2\u0656\u0655\3\2\2"+
		"\2\u0656\u0657\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u0659\5\u01ae\u00d8\2"+
		"\u0659\u00e5\3\2\2\2\u065a\u065b\7\u0087\2\2\u065b\u0660\5\30\r\2\u065c"+
		"\u065d\7\u0086\2\2\u065d\u065f\5\6\4\2\u065e\u065c\3\2\2\2\u065f\u0662"+
		"\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u00e7\3\2\2\2\u0662"+
		"\u0660\3\2\2\2\u0663\u0668\5\6\4\2\u0664\u0665\7\u0086\2\2\u0665\u0667"+
		"\5\6\4\2\u0666\u0664\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0668"+
		"\u0669\3\2\2\2\u0669\u00e9\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u066d\5\u00ec"+
		"w\2\u066c\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066c\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u00eb\3\2\2\2\u0670\u0671\7q\2\2\u0671\u0672\5\u01ae"+
		"\u00d8\2\u0672\u0673\7\u0087\2\2\u0673\u0674\5\u00eex\2\u0674\u00ed\3"+
		"\2\2\2\u0675\u0680\5\u00f4{\2\u0676\u0679\5\u00f0y\2\u0677\u0678\7\u0086"+
		"\2\2\u0678\u067a\5\u00f2z\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a"+
		"\u067d\3\2\2\2\u067b\u067c\7\u0086\2\2\u067c\u067e\5\u00f4{\2\u067d\u067b"+
		"\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0675\3\2\2\2\u067f"+
		"\u0676\3\2\2\2\u0680\u00ef\3\2\2\2\u0681\u0689\5\30\r\2\u0682\u0684\7"+
		"\34\2\2\u0683\u0685\7\u0096\2\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2"+
		"\2\u0685\u0689\3\2\2\2\u0686\u0689\7^\2\2\u0687\u0689\7h\2\2\u0688\u0681"+
		"\3\2\2\2\u0688\u0682\3\2\2\2\u0688\u0686\3\2\2\2\u0688\u0687\3\2\2\2\u0689"+
		"\u00f1\3\2\2\2\u068a\u068f\5\6\4\2\u068b\u068c\7\u0086\2\2\u068c\u068e"+
		"\5\6\4\2\u068d\u068b\3\2\2\2\u068e\u0691\3\2\2\2\u068f\u068d\3\2\2\2\u068f"+
		"\u0690\3\2\2\2\u0690\u00f3\3\2\2\2\u0691\u068f\3\2\2\2\u0692\u0693\7D"+
		"\2\2\u0693\u0694\7\u0083\2\2\u0694\u0695\7\u0084\2\2\u0695\u00f5\3\2\2"+
		"\2\u0696\u0698\7\177\2\2\u0697\u0699\5\u00f8}\2\u0698\u0697\3\2\2\2\u0698"+
		"\u0699\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069b\7\u0080\2\2\u069b\u00f7"+
		"\3\2\2\2\u069c\u069e\5\u00fa~\2\u069d\u069c\3\2\2\2\u069e\u069f\3\2\2"+
		"\2\u069f\u069d\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u00f9\3\2\2\2\u06a1\u06a3"+
		"\5\u015a\u00ae\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3"+
		"\2\2\2\u06a4\u06a6\5\u00fc\177\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2"+
		"\2\u06a6\u06a9\3\2\2\2\u06a7\u06aa\5\u0100\u0081\2\u06a8\u06aa\5\u019e"+
		"\u00d0\2\u06a9\u06a7\3\2\2\2\u06a9\u06a8\3\2\2\2\u06aa\u00fb\3\2\2\2\u06ab"+
		"\u06ad\5\u00fe\u0080\2\u06ac\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06ac"+
		"\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u00fd\3\2\2\2\u06b0\u06b1\t\f\2\2\u06b1"+
		"\u00ff\3\2\2\2\u06b2\u06c6\5\u019a\u00ce\2\u06b3\u06c6\5\u0102\u0082\2"+
		"\u06b4\u06c6\5\u0194\u00cb\2\u06b5\u06bb\5\u0130\u0099\2\u06b6\u06bc\5"+
		"\u0134\u009b\2\u06b7\u06b8\5\u0172\u00ba\2\u06b8\u06b9\5L\'\2\u06b9\u06ba"+
		"\7\u0088\2\2\u06ba\u06bc\3\2\2\2\u06bb\u06b6\3\2\2\2\u06bb\u06b7\3\2\2"+
		"\2\u06bc\u06c6\3\2\2\2\u06bd\u06c6\5\u01a0\u00d1\2\u06be\u06bf\7n\2\2"+
		"\u06bf\u06c6\5\u01a2\u00d2\2\u06c0\u06c6\5\u018a\u00c6\2\u06c1\u06c6\5"+
		"\u018c\u00c7\2\u06c2\u06c6\5\u018e\u00c8\2\u06c3\u06c6\5\u0190\u00c9\2"+
		"\u06c4\u06c6\5\u0192\u00ca\2\u06c5\u06b2\3\2\2\2\u06c5\u06b3\3\2\2\2\u06c5"+
		"\u06b4\3\2\2\2\u06c5\u06b5\3\2\2\2\u06c5\u06bd\3\2\2\2\u06c5\u06be\3\2"+
		"\2\2\u06c5\u06c0\3\2\2\2\u06c5\u06c1\3\2\2\2\u06c5\u06c2\3\2\2\2\u06c5"+
		"\u06c3\3\2\2\2\u06c5\u06c4\3\2\2\2\u06c6\u0101\3\2\2\2\u06c7\u06cd\7R"+
		"\2\2\u06c8\u06c9\7Q\2\2\u06c9\u06cd\7R\2\2\u06ca\u06cb\7R\2\2\u06cb\u06cd"+
		"\7Q\2\2\u06cc\u06c7\3\2\2\2\u06cc\u06c8\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc"+
		"\u06cd\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d8\5\b\5\2\u06cf\u06d0\5\6"+
		"\4\2\u06d0\u06d1\7\u0085\2\2\u06d1\u06d2\5\u019c\u00cf\2\u06d2\u06d9\3"+
		"\2\2\2\u06d3\u06d9\5\u01a2\u00d2\2\u06d4\u06d9\5\u0198\u00cd\2\u06d5\u06d9"+
		"\5\u019c\u00cf\2\u06d6\u06d9\5\u01a6\u00d4\2\u06d7\u06d9\5\u0196\u00cc"+
		"\2\u06d8\u06cf\3\2\2\2\u06d8\u06d3\3\2\2\2\u06d8\u06d4\3\2\2\2\u06d8\u06d5"+
		"\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d7\3\2\2\2\u06d9\u0103\3\2\2\2\u06da"+
		"\u06df\5\u0106\u0084\2\u06db\u06dc\7\u0086\2\2\u06dc\u06de\5\u0106\u0084"+
		"\2\u06dd\u06db\3\2\2\2\u06de\u06e1\3\2\2\2\u06df\u06dd\3\2\2\2\u06df\u06e0"+
		"\3\2\2\2\u06e0\u0105\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2\u06e3\5\u01ae\u00d8"+
		"\2\u06e3\u06e4\7\u0093\2\2\u06e4\u06e5\5\36\20\2\u06e5\u0107\3\2\2\2\u06e6"+
		"\u06eb\5\u010a\u0086\2\u06e7\u06e8\7\u0086\2\2\u06e8\u06ea\5\u010a\u0086"+
		"\2\u06e9\u06e7\3\2\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec"+
		"\3\2\2\2\u06ec\u0109\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee\u06f1\5\u01ae\u00d8"+
		"\2\u06ef\u06f0\7\u0093\2\2\u06f0\u06f2\5\u010c\u0087\2\u06f1\u06ef\3\2"+
		"\2\2\u06f1\u06f2\3\2\2\2\u06f2\u010b\3\2\2\2\u06f3\u06f6\5\36\20\2\u06f4"+
		"\u06f6\5\u0140\u00a1\2\u06f5\u06f3\3\2\2\2\u06f5\u06f4\3\2\2\2\u06f6\u010d"+
		"\3\2\2\2\u06f7\u06fa\5\b\5\2\u06f8\u06fa\7n\2\2\u06f9\u06f7\3\2\2\2\u06f9"+
		"\u06f8\3\2\2\2\u06fa\u010f\3\2\2\2\u06fb\u06fc\5\6\4\2\u06fc\u0111\3\2"+
		"\2\2\u06fd\u0700\5\u00acW\2\u06fe\u0700\7\u0088\2\2\u06ff\u06fd\3\2\2"+
		"\2\u06ff\u06fe\3\2\2\2\u0700\u0113\3\2\2\2\u0701\u0708\5\u011c\u008f\2"+
		"\u0702\u0705\5\u0116\u008c\2\u0703\u0704\7\u0086\2\2\u0704\u0706\5\u011c"+
		"\u008f\2\u0705\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0708\3\2\2\2\u0707"+
		"\u0701\3\2\2\2\u0707\u0702\3\2\2\2\u0708\u0115\3\2\2\2\u0709\u070e\5\u0118"+
		"\u008d\2\u070a\u070b\7\u0086\2\2\u070b\u070d\5\u0118\u008d\2\u070c\u070a"+
		"\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c\3\2\2\2\u070e\u070f\3\2\2\2\u070f"+
		"\u0117\3\2\2\2\u0710\u070e\3\2\2\2\u0711\u0713\5\u015a\u00ae\2\u0712\u0711"+
		"\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0715\3\2\2\2\u0714\u0716\5\u011a\u008e"+
		"\2\u0715\u0714\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u071a"+
		"\5\u01a8\u00d5\2\u0718\u071a\7\16\2\2\u0719\u0712\3\2\2\2\u0719\u0718"+
		"\3\2\2\2\u071a\u0119\3\2\2\2\u071b\u0724\7R\2\2\u071c\u0724\7J\2\2\u071d"+
		"\u0724\78\2\2\u071e\u071f\7R\2\2\u071f\u0724\7`\2\2\u0720\u0721\78\2\2"+
		"\u0721\u0724\7`\2\2\u0722\u0724\7`\2\2\u0723\u071b\3\2\2\2\u0723\u071c"+
		"\3\2\2\2\u0723\u071d\3\2\2\2\u0723\u071e\3\2\2\2\u0723\u0720\3\2\2\2\u0723"+
		"\u0722\3\2\2\2\u0724\u011b\3\2\2\2\u0725\u0727\5\u015a\u00ae\2\u0726\u0725"+
		"\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u0729\7L\2\2\u0729"+
		"\u072a\5\u013c\u009f\2\u072a\u072b\5\u01ae\u00d8\2\u072b\u011d\3\2\2\2"+
		"\u072c\u072e\5\u015a\u00ae\2\u072d\u072c\3\2\2\2\u072d\u072e\3\2\2\2\u072e"+
		"\u0730\3\2\2\2\u072f\u0731\5\u0124\u0093\2\u0730\u072f\3\2\2\2\u0730\u0731"+
		"\3\2\2\2\u0731\u073c\3\2\2\2\u0732\u0733\7\63\2\2\u0733\u0735\5\u0126"+
		"\u0094\2\u0734\u0736\5\u0122\u0092\2\u0735\u0734\3\2\2\2\u0735\u0736\3"+
		"\2\2\2\u0736\u073d\3\2\2\2\u0737\u0738\7X\2\2\u0738\u073a\5\u0126\u0094"+
		"\2\u0739\u073b\5\u0120\u0091\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2\2"+
		"\u073b\u073d\3\2\2\2\u073c\u0732\3\2\2\2\u073c\u0737\3\2\2\2\u073d\u011f"+
		"\3\2\2\2\u073e\u0740\5\u015a\u00ae\2\u073f\u073e\3\2\2\2\u073f\u0740\3"+
		"\2\2\2\u0740\u0742\3\2\2\2\u0741\u0743\5\u0124\u0093\2\u0742\u0741\3\2"+
		"\2\2\u0742\u0743\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\7\63\2\2\u0745"+
		"\u0746\5\u0126\u0094\2\u0746\u0121\3\2\2\2\u0747\u0749\5\u015a\u00ae\2"+
		"\u0748\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074b\3\2\2\2\u074a\u074c"+
		"\5\u0124\u0093\2\u074b\u074a\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074d\3"+
		"\2\2\2\u074d\u074e\7X\2\2\u074e\u074f\5\u0126\u0094\2\u074f\u0123\3\2"+
		"\2\2\u0750\u0758\7O\2\2\u0751\u0758\7;\2\2\u0752\u0758\7N\2\2\u0753\u0754"+
		"\7O\2\2\u0754\u0758\7;\2\2\u0755\u0756\7;\2\2\u0756\u0758\7O\2\2\u0757"+
		"\u0750\3\2\2\2\u0757\u0751\3\2\2\2\u0757\u0752\3\2\2\2\u0757\u0753\3\2"+
		"\2\2\u0757\u0755\3\2\2\2\u0758\u0125\3\2\2\2\u0759\u075c\5\u00acW\2\u075a"+
		"\u075c\7\u0088\2\2\u075b\u0759\3\2\2\2\u075b\u075a\3\2\2\2\u075c\u0127"+
		"\3\2\2\2\u075d\u075f\5\u015a\u00ae\2\u075e\u075d\3\2\2\2\u075e\u075f\3"+
		"\2\2\2\u075f\u0768\3\2\2\2\u0760\u0761\7\f\2\2\u0761\u0762\5\u00acW\2"+
		"\u0762\u0763\5\u012c\u0097\2\u0763\u0769\3\2\2\2\u0764\u0765\7S\2\2\u0765"+
		"\u0766\5\u00acW\2\u0766\u0767\5\u012a\u0096\2\u0767\u0769\3\2\2\2\u0768"+
		"\u0760\3\2\2\2\u0768\u0764\3\2\2\2\u0769\u0129\3\2\2\2\u076a\u076c\5\u015a"+
		"\u00ae\2\u076b\u076a\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\3\2\2\2\u076d"+
		"\u076e\7\f\2\2\u076e\u076f\5\u00acW\2\u076f\u012b\3\2\2\2\u0770\u0772"+
		"\5\u015a\u00ae\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0773\3"+
		"\2\2\2\u0773\u0774\7S\2\2\u0774\u0775\5\u00acW\2\u0775\u012d\3\2\2\2\u0776"+
		"\u078d\7\u0089\2\2\u0777\u078d\7\u008a\2\2\u0778\u078d\7\u0091\2\2\u0779"+
		"\u078d\7\u0092\2\2\u077a\u078d\7\u0099\2\2\u077b\u078d\7\u009a\2\2\u077c"+
		"\u078d\7b\2\2\u077d\u078d\7,\2\2\u077e\u078d\7\u008b\2\2\u077f\u078d\7"+
		"\u008c\2\2\u0780\u078d\7\u008d\2\2\u0781\u078d\7\u008e\2\2\u0782\u078d"+
		"\7\u008f\2\2\u0783\u078d\7\u0090\2\2\u0784\u078d\7\u00aa\2\2\u0785\u078d"+
		"\5\u0174\u00bb\2\u0786\u078d\7\u009e\2\2\u0787\u078d\7\u009f\2\2\u0788"+
		"\u078d\7\u0095\2\2\u0789\u078d\7\u0094\2\2\u078a\u078d\7\u00a1\2\2\u078b"+
		"\u078d\7\u00a0\2\2\u078c\u0776\3\2\2\2\u078c\u0777\3\2\2\2\u078c\u0778"+
		"\3\2\2\2\u078c\u0779\3\2\2\2\u078c\u077a\3\2\2\2\u078c\u077b\3\2\2\2\u078c"+
		"\u077c\3\2\2\2\u078c\u077d\3\2\2\2\u078c\u077e\3\2\2\2\u078c\u077f\3\2"+
		"\2\2\u078c\u0780\3\2\2\2\u078c\u0781\3\2\2\2\u078c\u0782\3\2\2\2\u078c"+
		"\u0783\3\2\2\2\u078c\u0784\3\2\2\2\u078c\u0785\3\2\2\2\u078c\u0786\3\2"+
		"\2\2\u078c\u0787\3\2\2\2\u078c\u0788\3\2\2\2\u078c\u0789\3\2\2\2\u078c"+
		"\u078a\3\2\2\2\u078c\u078b\3\2\2\2\u078d\u012f\3\2\2\2\u078e\u078f\t\r"+
		"\2\2\u078f\u0790\7H\2\2\u0790\u0791\5\b\5\2\u0791\u0792\7\u0083\2\2\u0792"+
		"\u0793\5\u01a8\u00d5\2\u0793\u0794\7\u0084\2\2\u0794\u0131\3\2\2\2\u0795"+
		"\u0796\7\u0087\2\2\u0796\u0797\t\16\2\2\u0797\u0799\7\u0083\2\2\u0798"+
		"\u079a\5\32\16\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079b\3"+
		"\2\2\2\u079b\u079c\7\u0084\2\2\u079c\u0133\3\2\2\2\u079d\u07a0\5\u00ac"+
		"W\2\u079e\u07a0\7\u0088\2\2\u079f\u079d\3\2\2\2\u079f\u079e\3\2\2\2\u07a0"+
		"\u0135\3\2\2\2\u07a1\u07a2\7\u0087\2\2\u07a2\u07a3\5\u00e8u\2\u07a3\u0137"+
		"\3\2\2\2\u07a4\u07a8\7\177\2\2\u07a5\u07a7\5\u013a\u009e\2\u07a6\u07a5"+
		"\3\2\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9"+
		"\u07ab\3\2\2\2\u07aa\u07a8\3\2\2\2\u07ab\u07ac\7\u0080\2\2\u07ac\u0139"+
		"\3\2\2\2\u07ad\u07af\5\u015a\u00ae\2\u07ae\u07ad\3\2\2\2\u07ae\u07af\3"+
		"\2\2\2\u07af\u07b1\3\2\2\2\u07b0\u07b2\5\u00fc\177\2\u07b1\u07b0\3\2\2"+
		"\2\u07b1\u07b2\3\2\2\2\u07b2\u07bd\3\2\2\2\u07b3\u07be\5\u0100\u0081\2"+
		"\u07b4\u07b5\7.\2\2\u07b5\u07b7\5\b\5\2\u07b6\u07b8\5\u016e\u00b8\2\u07b7"+
		"\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2"+
		"\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bc\7\u0088\2\2\u07bc\u07be\3\2\2\2\u07bd"+
		"\u07b3\3\2\2\2\u07bd\u07b4\3\2\2\2\u07be\u013b\3\2\2\2\u07bf\u07c7\5\n"+
		"\6\2\u07c0\u07c2\t\17\2\2\u07c1\u07c0\3\2\2\2\u07c2\u07c5\3\2\2\2\u07c3"+
		"\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c3\3\2"+
		"\2\2\u07c6\u07c8\5\u013e\u00a0\2\u07c7\u07c3\3\2\2\2\u07c8\u07c9\3\2\2"+
		"\2\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u013d\3\2\2\2\u07cb\u07cf"+
		"\7\u0081\2\2\u07cc\u07ce\7\u0086\2\2\u07cd\u07cc\3\2\2\2\u07ce\u07d1\3"+
		"\2\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d2\3\2\2\2\u07d1"+
		"\u07cf\3\2\2\2\u07d2\u07d3\7\u0082\2\2\u07d3\u013f\3\2\2\2\u07d4\u07e0"+
		"\7\177\2\2\u07d5\u07da\5\u010c\u0087\2\u07d6\u07d7\7\u0086\2\2\u07d7\u07d9"+
		"\5\u010c\u0087\2\u07d8\u07d6\3\2\2\2\u07d9\u07dc\3\2\2\2\u07da\u07d8\3"+
		"\2\2\2\u07da\u07db\3\2\2\2\u07db\u07de\3\2\2\2\u07dc\u07da\3\2\2\2\u07dd"+
		"\u07df\7\u0086\2\2\u07de\u07dd\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e1"+
		"\3\2\2\2\u07e0\u07d5\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2"+
		"\u07e3\7\u0080\2\2\u07e3\u0141\3\2\2\2\u07e4\u07e5\7\u0094\2\2\u07e5\u07ea"+
		"\5\u0144\u00a3\2\u07e6\u07e7\7\u0086\2\2\u07e7\u07e9\5\u0144\u00a3\2\u07e8"+
		"\u07e6\3\2\2\2\u07e9\u07ec\3\2\2\2\u07ea\u07e8\3\2\2\2\u07ea\u07eb\3\2"+
		"\2\2\u07eb\u07ed\3\2\2\2\u07ec\u07ea\3\2\2\2\u07ed\u07ee\7\u0095\2\2\u07ee"+
		"\u0143\3\2\2\2\u07ef\u07f1\5\u015a\u00ae\2\u07f0\u07ef\3\2\2\2\u07f0\u07f1"+
		"\3\2\2\2\u07f1\u07f3\3\2\2\2\u07f2\u07f4\5\u0146\u00a4\2\u07f3\u07f2\3"+
		"\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6\5\u01ae\u00d8"+
		"\2\u07f6\u0145\3\2\2\2\u07f7\u07f8\t\20\2\2\u07f8\u0147\3\2\2\2\u07f9"+
		"\u07fa\7\u0087\2\2\u07fa\u07fb\5\u00e8u\2\u07fb\u0149\3\2\2\2\u07fc\u0800"+
		"\7\177\2\2\u07fd\u07ff\5\u014c\u00a7\2\u07fe\u07fd\3\2\2\2\u07ff\u0802"+
		"\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0803\3\2\2\2\u0802"+
		"\u0800\3\2\2\2\u0803\u0804\7\u0080\2\2\u0804\u014b\3\2\2\2\u0805\u0807"+
		"\5\u015a\u00ae\2\u0806\u0805\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0809\3"+
		"\2\2\2\u0808\u080a\7D\2\2\u0809\u0808\3\2\2\2\u0809\u080a\3\2\2\2\u080a"+
		"\u084a\3\2\2\2\u080b\u080d\7i\2\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2"+
		"\2\2\u080d\u0813\3\2\2\2\u080e\u0814\7R\2\2\u080f\u0810\7R\2\2\u0810\u0814"+
		"\7Q\2\2\u0811\u0812\7Q\2\2\u0812\u0814\7R\2\2\u0813\u080e\3\2\2\2\u0813"+
		"\u080f\3\2\2\2\u0813\u0811\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\3\2"+
		"\2\2\u0815\u0831\5\b\5\2\u0816\u0818\5\u01ae\u00d8\2\u0817\u0819\5\u00e2"+
		"r\2\u0818\u0817\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081a\3\2\2\2\u081a"+
		"\u081c\7\u0083\2\2\u081b\u081d\5\u0114\u008b\2\u081c\u081b\3\2\2\2\u081c"+
		"\u081d\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u0820\7\u0084\2\2\u081f\u0821"+
		"\5\u00eav\2\u0820\u081f\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0822\3\2\2"+
		"\2\u0822\u0823\7\u0088\2\2\u0823\u0832\3\2\2\2\u0824\u0825\5\u01ae\u00d8"+
		"\2\u0825\u0826\7\177\2\2\u0826\u0827\5\u014e\u00a8\2\u0827\u0828\7\u0080"+
		"\2\2\u0828\u0832\3\2\2\2\u0829\u082a\7`\2\2\u082a\u082b\7\u0081\2\2\u082b"+
		"\u082c\5\u0114\u008b\2\u082c\u082d\7\u0082\2\2\u082d\u082e\7\177\2\2\u082e"+
		"\u082f\5\u014e\u00a8\2\u082f\u0830\7\u0080\2\2\u0830\u0832\3\2\2\2\u0831"+
		"\u0816\3\2\2\2\u0831\u0824\3\2\2\2\u0831\u0829\3\2\2\2\u0832\u084b\3\2"+
		"\2\2\u0833\u0835\7i\2\2\u0834\u0833\3\2\2\2\u0834\u0835\3\2\2\2\u0835"+
		"\u0836\3\2\2\2\u0836\u0837\7n\2\2\u0837\u0839\5\u01ae\u00d8\2\u0838\u083a"+
		"\5\u00e2r\2\u0839\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083b\3\2\2"+
		"\2\u083b\u083d\7\u0083\2\2\u083c\u083e\5\u0114\u008b\2\u083d\u083c\3\2"+
		"\2\2\u083d\u083e\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0841\7\u0084\2\2\u0840"+
		"\u0842\5\u00eav\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0843"+
		"\3\2\2\2\u0843\u0844\7\u0088\2\2\u0844\u084b\3\2\2\2\u0845\u0846\7)\2"+
		"\2\u0846\u0847\5\b\5\2\u0847\u0848\5\u01ae\u00d8\2\u0848\u0849\7\u0088"+
		"\2\2\u0849\u084b\3\2\2\2\u084a\u080c\3\2\2\2\u084a\u0834\3\2\2\2\u084a"+
		"\u0845\3\2\2\2\u084b\u014d\3\2\2\2\u084c\u084e\5\u015a\u00ae\2\u084d\u084c"+
		"\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0861\3\2\2\2\u084f\u0850\7\63\2\2"+
		"\u0850\u0856\7\u0088\2\2\u0851\u0853\5\u015a\u00ae\2\u0852\u0851\3\2\2"+
		"\2\u0852\u0853\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0855\7X\2\2\u0855\u0857"+
		"\7\u0088\2\2\u0856\u0852\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0862\3\2\2"+
		"\2\u0858\u0859\7X\2\2\u0859\u085f\7\u0088\2\2\u085a\u085c\5\u015a\u00ae"+
		"\2\u085b\u085a\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085e"+
		"\7\63\2\2\u085e\u0860\7\u0088\2\2\u085f\u085b\3\2\2\2\u085f\u0860\3\2"+
		"\2\2\u0860\u0862\3\2\2\2\u0861\u084f\3\2\2\2\u0861\u0858\3\2\2\2\u0862"+
		"\u014f\3\2\2\2\u0863\u0864\7\u0087\2\2\u0864\u0865\5\b\5\2\u0865\u0151"+
		"\3\2\2\2\u0866\u0872\7\177\2\2\u0867\u086c\5\u0154\u00ab\2\u0868\u0869"+
		"\7\u0086\2\2\u0869\u086b\5\u0154\u00ab\2\u086a\u0868\3\2\2\2\u086b\u086e"+
		"\3\2\2\2\u086c\u086a\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u0870\3\2\2\2\u086e"+
		"\u086c\3\2\2\2\u086f\u0871\7\u0086\2\2\u0870\u086f\3\2\2\2\u0870\u0871"+
		"\3\2\2\2\u0871\u0873\3\2\2\2\u0872\u0867\3\2\2\2\u0872\u0873\3\2\2\2\u0873"+
		"\u0874\3\2\2\2\u0874\u0875\7\u0080\2\2\u0875\u0153\3\2\2\2\u0876\u0878"+
		"\5\u015a\u00ae\2\u0877\u0876\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u0879\3"+
		"\2\2\2\u0879\u087c\5\u01ae\u00d8\2\u087a\u087b\7\u0093\2\2\u087b\u087d"+
		"\5\36\20\2\u087c\u087a\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u0155\3\2\2\2"+
		"\u087e\u087f\7\u0081\2\2\u087f\u0880\5\u0158\u00ad\2\u0880\u0881\7\u0087"+
		"\2\2\u0881\u0883\5\u0160\u00b1\2\u0882\u0884\7\u0086\2\2\u0883\u0882\3"+
		"\2\2\2\u0883\u0884\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0886\7\u0082\2\2"+
		"\u0886\u0157\3\2\2\2\u0887\u088a\5\u0188\u00c5\2\u0888\u088a\5\u01ae\u00d8"+
		"\2\u0889\u0887\3\2\2\2\u0889\u0888\3\2\2\2\u088a\u0159\3\2\2\2\u088b\u088d"+
		"\5\u015c\u00af\2\u088c\u088b\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088c\3"+
		"\2\2\2\u088e\u088f\3\2\2\2\u088f\u015b\3\2\2\2\u0890\u0894\7\u0081\2\2"+
		"\u0891\u0892\5\u015e\u00b0\2\u0892\u0893\7\u0087\2\2\u0893\u0895\3\2\2"+
		"\2\u0894\u0891\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0898"+
		"\5\u0160\u00b1\2\u0897\u0899\7\u0086\2\2\u0898\u0897\3\2\2\2\u0898\u0899"+
		"\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089b\7\u0082\2\2\u089b\u015d\3\2\2"+
		"\2\u089c\u089f\5\u0188\u00c5\2\u089d\u089f\5\u01ae\u00d8\2\u089e\u089c"+
		"\3\2\2\2\u089e\u089d\3\2\2\2\u089f\u015f\3\2\2\2\u08a0\u08a5\5\u0162\u00b2"+
		"\2\u08a1\u08a2\7\u0086\2\2\u08a2\u08a4\5\u0162\u00b2\2\u08a3\u08a1\3\2"+
		"\2\2\u08a4\u08a7\3\2\2\2\u08a5\u08a3\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6"+
		"\u0161\3\2\2\2\u08a7\u08a5\3\2\2\2\u08a8\u08b5\5\6\4\2\u08a9\u08b2\7\u0083"+
		"\2\2\u08aa\u08af\5\u0164\u00b3\2\u08ab\u08ac\7\u0086\2\2\u08ac\u08ae\5"+
		"\u0164\u00b3\2\u08ad\u08ab\3\2\2\2\u08ae\u08b1\3\2\2\2\u08af\u08ad\3\2"+
		"\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b3\3\2\2\2\u08b1\u08af\3\2\2\2\u08b2"+
		"\u08aa\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b6\7\u0084"+
		"\2\2\u08b5\u08a9\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u0163\3\2\2\2\u08b7"+
		"\u08b8\5\u01ae\u00d8\2\u08b8\u08b9\7\u0087\2\2\u08b9\u08bb\3\2\2\2\u08ba"+
		"\u08b7\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd\5\36"+
		"\20\2\u08bd\u0165\3\2\2\2\u08be\u08c1\5\20\t\2\u08bf\u08c1\5\30\r\2\u08c0"+
		"\u08be\3\2\2\2\u08c0\u08bf\3\2\2\2\u08c1\u08c6\3\2\2\2\u08c2\u08c5\5\u013e"+
		"\u00a0\2\u08c3\u08c5\7\u0096\2\2\u08c4\u08c2\3\2\2\2\u08c4\u08c3\3\2\2"+
		"\2\u08c5\u08c8\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7\u08c9"+
		"\3\2\2\2\u08c8\u08c6\3\2\2\2\u08c9\u08ca\7\u008b\2\2\u08ca\u08ce\3\2\2"+
		"\2\u08cb\u08cc\7n\2\2\u08cc\u08ce\7\u008b\2\2\u08cd\u08c0\3\2\2\2\u08cd"+
		"\u08cb\3\2\2\2\u08ce\u0167\3\2\2\2\u08cf\u08d4\5\u016a\u00b6\2\u08d0\u08d1"+
		"\7\u0086\2\2\u08d1\u08d3\5\u016a\u00b6\2\u08d2\u08d0\3\2\2\2\u08d3\u08d6"+
		"\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u0169\3\2\2\2\u08d6"+
		"\u08d4\3\2\2\2\u08d7\u08d8\5\u01ae\u00d8\2\u08d8\u08d9\7\u0093\2\2\u08d9"+
		"\u08da\5\u016c\u00b7\2\u08da\u016b\3\2\2\2\u08db\u08dd\7\u008e\2\2\u08dc"+
		"\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08e1\5\36"+
		"\20\2\u08df\u08e1\5\u0170\u00b9\2\u08e0\u08dc\3\2\2\2\u08e0\u08df\3\2"+
		"\2\2\u08e1\u016d\3\2\2\2\u08e2\u08e3\5\u01ae\u00d8\2\u08e3\u08e4\7\u0081"+
		"\2\2\u08e4\u08e5\5\36\20\2\u08e5\u08e6\7\u0082\2\2\u08e6\u016f\3\2\2\2"+
		"\u08e7\u08e8\7[\2\2\u08e8\u08e9\5\b\5\2\u08e9\u08ea\7\u0081\2\2\u08ea"+
		"\u08eb\5\36\20\2\u08eb\u08ec\7\u0082\2\2\u08ec\u0905\3\2\2\2\u08ed\u08ef"+
		"\7[\2\2\u08ee\u08f0\5\b\5\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0"+
		"\u08f1\3\2\2\2\u08f1\u08f3\7\u0081\2\2\u08f2\u08f4\5\36\20\2\u08f3\u08f2"+
		"\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\7\u0082\2"+
		"\2\u08f6\u08f7\7\177\2\2\u08f7\u08fc\5\36\20\2\u08f8\u08f9\7\u0086\2\2"+
		"\u08f9\u08fb\5\36\20\2\u08fa\u08f8\3\2\2\2\u08fb\u08fe\3\2\2\2\u08fc\u08fa"+
		"\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u0900\3\2\2\2\u08fe\u08fc\3\2\2\2\u08ff"+
		"\u0901\7\u0086\2\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902"+
		"\3\2\2\2\u0902\u0903\7\u0080\2\2\u0903\u0905\3\2\2\2\u0904\u08e7\3\2\2"+
		"\2\u0904\u08ed\3\2\2\2\u0905\u0171\3\2\2\2\u0906\u0907\7\u0093\2\2\u0907"+
		"\u0908\7\u0095\2\2\u0908\u0909\6\u00ba\3\3\u0909\u0173\3\2\2\2\u090a\u090b"+
		"\7\u0095\2\2\u090b\u090c\7\u0095\2\2\u090c\u090d\6\u00bb\4\3\u090d\u0175"+
		"\3\2\2\2\u090e\u090f\7\u0095\2\2\u090f\u0910\7\u00a1\2\2\u0910\u0911\6"+
		"\u00bc\5\3\u0911\u0177\3\2\2\2\u0912\u091b\5\u017a\u00be\2\u0913\u091b"+
		"\5\u017c\u00bf\2\u0914\u091b\7v\2\2\u0915\u091b\7w\2\2\u0916\u091b\7x"+
		"\2\2\u0917\u091b\7y\2\2\u0918\u091b\7z\2\2\u0919\u091b\7E\2\2\u091a\u0912"+
		"\3\2\2\2\u091a\u0913\3\2\2\2\u091a\u0914\3\2\2\2\u091a\u0915\3\2\2\2\u091a"+
		"\u0916\3\2\2\2\u091a\u0917\3\2\2\2\u091a\u0918\3\2\2\2\u091a\u0919\3\2"+
		"\2\2\u091b\u0179\3\2\2\2\u091c\u091d\t\21\2\2\u091d\u017b\3\2\2\2\u091e"+
		"\u0923\5\u017e\u00c0\2\u091f\u0923\5\u0180\u00c1\2\u0920\u0923\7{\2\2"+
		"\u0921\u0923\7|\2\2\u0922\u091e\3\2\2\2\u0922\u091f\3\2\2\2\u0922\u0920"+
		"\3\2\2\2\u0922\u0921\3\2\2\2\u0923\u017d\3\2\2\2\u0924\u0928\7}\2\2\u0925"+
		"\u0927\5\u0182\u00c2\2\u0926\u0925\3\2\2\2\u0927\u092a\3\2\2\2\u0928\u0926"+
		"\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092b\3\2\2\2\u092a\u0928\3\2\2\2\u092b"+
		"\u092c\7\u00b2\2\2\u092c\u017f\3\2\2\2\u092d\u0931\7~\2\2\u092e\u0930"+
		"\5\u0184\u00c3\2\u092f\u092e\3\2\2\2\u0930\u0933\3\2\2\2\u0931\u092f\3"+
		"\2\2\2\u0931\u0932\3\2\2\2\u0932\u0934\3\2\2\2\u0933\u0931\3\2\2\2\u0934"+
		"\u0935\7\u00b2\2\2\u0935\u0181\3\2\2\2\u0936\u093b\5\u0186\u00c4\2\u0937"+
		"\u093b\7\u00ae\2\2\u0938\u093b\7\u00b0\2\2\u0939\u093b\7\u00b3\2\2\u093a"+
		"\u0936\3\2\2\2\u093a\u0937\3\2\2\2\u093a\u0938\3\2\2\2\u093a\u0939\3\2"+
		"\2\2\u093b\u0183\3\2\2\2\u093c\u0941\5\u0186\u00c4\2\u093d\u0941\7\u00ae"+
		"\2\2\u093e\u0941\7\u00b1\2\2\u093f\u0941\7\u00b4\2\2\u0940\u093c\3\2\2"+
		"\2\u0940\u093d\3\2\2\2\u0940\u093e\3\2\2\2\u0940\u093f\3\2\2\2\u0941\u0185"+
		"\3\2\2\2\u0942\u0947\5\36\20\2\u0943\u0944\7\u0086\2\2\u0944\u0946\5\36"+
		"\20\2\u0945\u0943\3\2\2\2\u0946\u0949\3\2\2\2\u0947\u0945\3\2\2\2\u0947"+
		"\u0948\3\2\2\2\u0948\u0950\3\2\2\2\u0949\u0947\3\2\2\2\u094a\u094c\7\u0087"+
		"\2\2\u094b\u094d\7\u00b6\2\2\u094c\u094b\3\2\2\2\u094d\u094e\3\2\2\2\u094e"+
		"\u094c\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0951\3\2\2\2\u0950\u094a\3\2"+
		"\2\2\u0950\u0951\3\2\2\2\u0951\u0187\3\2\2\2\u0952\u0953\t\22\2\2\u0953"+
		"\u0189\3\2\2\2\u0954\u0955\7\34\2\2\u0955\u0957\5\u01ae\u00d8\2\u0956"+
		"\u0958\5\u00e2r\2\u0957\u0956\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u095a"+
		"\3\2\2\2\u0959\u095b\5\u00e6t\2\u095a\u0959\3\2\2\2\u095a\u095b\3\2\2"+
		"\2\u095b";
	private static final String _serializedATNSegment1 =
		"\u095d\3\2\2\2\u095c\u095e\5\u00eav\2\u095d\u095c\3\2\2\2\u095d\u095e"+
		"\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u0961\5\u00f6|\2\u0960\u0962\7\u0088"+
		"\2\2\u0961\u0960\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u018b\3\2\2\2\u0963"+
		"\u0965\t\23\2\2\u0964\u0963\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0966\3"+
		"\2\2\2\u0966\u0967\7^\2\2\u0967\u0969\5\u01ae\u00d8\2\u0968\u096a\5\u00e2"+
		"r\2\u0969\u0968\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096c\3\2\2\2\u096b"+
		"\u096d\5\u0136\u009c\2\u096c\u096b\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096f"+
		"\3\2\2\2\u096e\u0970\5\u00eav\2\u096f\u096e\3\2\2\2\u096f\u0970\3\2\2"+
		"\2\u0970\u0971\3\2\2\2\u0971\u0973\5\u0138\u009d\2\u0972\u0974\7\u0088"+
		"\2\2\u0973\u0972\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u018d\3\2\2\2\u0975"+
		"\u0976\7:\2\2\u0976\u0978\5\u01ae\u00d8\2\u0977\u0979\5\u0142\u00a2\2"+
		"\u0978\u0977\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097b\3\2\2\2\u097a\u097c"+
		"\5\u0148\u00a5\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097e\3"+
		"\2\2\2\u097d\u097f\5\u00eav\2\u097e\u097d\3\2\2\2\u097e\u097f\3\2\2\2"+
		"\u097f\u0980\3\2\2\2\u0980\u0982\5\u00f6|\2\u0981\u0983\7\u0088\2\2\u0982"+
		"\u0981\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u018f\3\2\2\2\u0984\u0985\7\'"+
		"\2\2\u0985\u0987\5\u01ae\u00d8\2\u0986\u0988\5\u0150\u00a9\2\u0987\u0986"+
		"\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098b\5\u0152\u00aa"+
		"\2\u098a\u098c\7\u0088\2\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c"+
		"\u0191\3\2\2\2\u098d\u098e\7!\2\2\u098e\u098f\5\u010e\u0088\2\u098f\u0991"+
		"\5\u01ae\u00d8\2\u0990\u0992\5\u0142\u00a2\2\u0991\u0990\3\2\2\2\u0991"+
		"\u0992\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0995\7\u0083\2\2\u0994\u0996"+
		"\5\u0114\u008b\2\u0995\u0994\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0997\3"+
		"\2\2\2\u0997\u0999\7\u0084\2\2\u0998\u099a\5\u00eav\2\u0999\u0998\3\2"+
		"\2\2\u0999\u099a\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u099c\7\u0088\2\2\u099c"+
		"\u0193\3\2\2\2\u099d\u099e\7)\2\2\u099e\u09a7\5\b\5\2\u099f\u09a0\5\u0108"+
		"\u0085\2\u09a0\u09a1\7\u0088\2\2\u09a1\u09a8\3\2\2\2\u09a2\u09a3\5\u0110"+
		"\u0089\2\u09a3\u09a4\7\177\2\2\u09a4\u09a5\5\u0128\u0095\2\u09a5\u09a6"+
		"\7\u0080\2\2\u09a6\u09a8\3\2\2\2\u09a7\u099f\3\2\2\2\u09a7\u09a2\3\2\2"+
		"\2\u09a8\u0195\3\2\2\2\u09a9\u09aa\5\u0108\u0085\2\u09aa\u09ab\7\u0088"+
		"\2\2\u09ab\u0197\3\2\2\2\u09ac\u09ba\5\u0110\u0089\2\u09ad\u09ae\7\177"+
		"\2\2\u09ae\u09af\5\u011e\u0090\2\u09af\u09b4\7\u0080\2\2\u09b0\u09b1\7"+
		"\u0093\2\2\u09b1\u09b2\5\u010c\u0087\2\u09b2\u09b3\7\u0088\2\2\u09b3\u09b5"+
		"\3\2\2\2\u09b4\u09b0\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09bb\3\2\2\2\u09b6"+
		"\u09b7\5\u0172\u00ba\2\u09b7\u09b8\5L\'\2\u09b8\u09b9\7\u0088\2\2\u09b9"+
		"\u09bb\3\2\2\2\u09ba\u09ad\3\2\2\2\u09ba\u09b6\3\2\2\2\u09bb\u0199\3\2"+
		"\2\2\u09bc\u09bd\7\35\2\2\u09bd\u09be\5\b\5\2\u09be\u09bf\5\u0104\u0083"+
		"\2\u09bf\u09c0\7\u0088\2\2\u09c0\u019b\3\2\2\2\u09c1\u09c2\7`\2\2\u09c2"+
		"\u09c3\7\u0081\2\2\u09c3\u09c4\5\u0114\u008b\2\u09c4\u09cd\7\u0082\2\2"+
		"\u09c5\u09c6\7\177\2\2\u09c6\u09c7\5\u011e\u0090\2\u09c7\u09c8\7\u0080"+
		"\2\2\u09c8\u09ce\3\2\2\2\u09c9\u09ca\5\u0172\u00ba\2\u09ca\u09cb\5L\'"+
		"\2\u09cb\u09cc\7\u0088\2\2\u09cc\u09ce\3\2\2\2\u09cd\u09c5\3\2\2\2\u09cd"+
		"\u09c9\3\2\2\2\u09ce\u019d\3\2\2\2\u09cf\u09d0\7\u0092\2\2\u09d0\u09d1"+
		"\5\u01ae\u00d8\2\u09d1\u09d2\7\u0083\2\2\u09d2\u09d3\7\u0084\2\2\u09d3"+
		"\u09d4\5\u0134\u009b\2\u09d4\u019f\3\2\2\2\u09d5\u09d6\5\u01ae\u00d8\2"+
		"\u09d6\u09d8\7\u0083\2\2\u09d7\u09d9\5\u0114\u008b\2\u09d8\u09d7\3\2\2"+
		"\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09dc\7\u0084\2\2\u09db"+
		"\u09dd\5\u0132\u009a\2\u09dc\u09db\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09de"+
		"\3\2\2\2\u09de\u09df\5\u0134\u009b\2\u09df\u01a1\3\2\2\2\u09e0\u09e2\5"+
		"\u01a4\u00d3\2\u09e1\u09e3\5\u00e2r\2\u09e2\u09e1\3\2\2\2\u09e2\u09e3"+
		"\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e6\7\u0083\2\2\u09e5\u09e7\5\u0114"+
		"\u008b\2\u09e6\u09e5\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8"+
		"\u09ea\7\u0084\2\2\u09e9\u09eb\5\u00eav\2\u09ea\u09e9\3\2\2\2\u09ea\u09eb"+
		"\3\2\2\2\u09eb\u09f1\3\2\2\2\u09ec\u09f2\5\u0112\u008a\2\u09ed\u09ee\5"+
		"\u0172\u00ba\2\u09ee\u09ef\5L\'\2\u09ef\u09f0\7\u0088\2\2\u09f0\u09f2"+
		"\3\2\2\2\u09f1\u09ec\3\2\2\2\u09f1\u09ed\3\2\2\2\u09f2\u01a3\3\2\2\2\u09f3"+
		"\u09f9\5\u01ae\u00d8\2\u09f4\u09f5\5\u01ae\u00d8\2\u09f5\u09f6\7\u0097"+
		"\2\2\u09f6\u09f7\5\u01ae\u00d8\2\u09f7\u09f9\3\2\2\2\u09f8\u09f3\3\2\2"+
		"\2\u09f8\u09f4\3\2\2\2\u09f9\u0a01\3\2\2\2\u09fa\u09fc\5\4\3\2\u09fb\u09fa"+
		"\3\2\2\2\u09fb\u09fc\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u09fe\7\u0085\2"+
		"\2\u09fe\u0a00\5\u01ae\u00d8\2\u09ff\u09fb\3\2\2\2\u0a00\u0a03\3\2\2\2"+
		"\u0a01\u09ff\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u01a5\3\2\2\2\u0a03\u0a01"+
		"\3\2\2\2\u0a04\u0a05\7H\2\2\u0a05\u0a06\5\u012e\u0098\2\u0a06\u0a08\7"+
		"\u0083\2\2\u0a07\u0a09\78\2\2\u0a08\u0a07\3\2\2\2\u0a08\u0a09\3\2\2\2"+
		"\u0a09\u0a0a\3\2\2\2\u0a0a\u0a10\5\u01a8\u00d5\2\u0a0b\u0a0d\7\u0086\2"+
		"\2\u0a0c\u0a0e\78\2\2\u0a0d\u0a0c\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a0f"+
		"\3\2\2\2\u0a0f\u0a11\5\u01a8\u00d5\2\u0a10\u0a0b\3\2\2\2\u0a10\u0a11\3"+
		"\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0a18\7\u0084\2\2\u0a13\u0a19\5\u0134"+
		"\u009b\2\u0a14\u0a15\5\u0172\u00ba\2\u0a15\u0a16\5L\'\2\u0a16\u0a17\7"+
		"\u0088\2\2\u0a17\u0a19\3\2\2\2\u0a18\u0a13\3\2\2\2\u0a18\u0a14\3\2\2\2"+
		"\u0a19\u01a7\3\2\2\2\u0a1a\u0a1b\5\b\5\2\u0a1b\u0a1e\5\u01ae\u00d8\2\u0a1c"+
		"\u0a1d\7\u0093\2\2\u0a1d\u0a1f\5\36\20\2\u0a1e\u0a1c\3\2\2\2\u0a1e\u0a1f"+
		"\3\2\2\2\u0a1f\u01a9\3\2\2\2\u0a20\u0a22\7\u0083\2\2\u0a21\u0a23\5\32"+
		"\16\2\u0a22\u0a21\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24"+
		"\u0a25\7\u0084\2\2\u0a25\u01ab\3\2\2\2\u0a26\u0a28\7\u0083\2\2\u0a27\u0a29"+
		"\5\32\16\2\u0a28\u0a27\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u0a2a\3\2\2\2"+
		"\u0a2a\u0a2c\7\u0084\2\2\u0a2b\u0a2d\5Z.\2\u0a2c\u0a2b\3\2\2\2\u0a2c\u0a2d"+
		"\3\2\2\2\u0a2d\u01ad\3\2\2\2\u0a2e\u0a2f\t\24\2\2\u0a2f\u01af\3\2\2\2"+
		"\u0156\u01b1\u01b4\u01b9\u01bd\u01c7\u01ce\u01d1\u01d6\u01da\u01e1\u01e3"+
		"\u01eb\u01f3\u01f9\u01fd\u0202\u020c\u0213\u0219\u021c\u0220\u0228\u022d"+
		"\u0237\u0244\u024c\u0252\u0254\u025b\u0263\u026b\u0273\u027b\u0283\u028d"+
		"\u028f\u0295\u029a\u02a2\u02aa\u02b2\u02b4\u02b7\u02be\u02c3\u02ca\u02ce"+
		"\u02d0\u02ec\u02f0\u02f5\u02f9\u0301\u0304\u0309\u030d\u0311\u0317\u0325"+
		"\u032b\u0337\u033b\u0340\u0344\u034a\u0352\u035b\u036d\u0370\u0375\u0378"+
		"\u0387\u038d\u0391\u0397\u039c\u039f\u03a7\u03af\u03ba\u03bf\u03c4\u03c6"+
		"\u03cf\u03d7\u03de\u03e6\u03ea\u03f3\u03f8\u03fa\u0403\u040b\u040f\u0414"+
		"\u0416\u041b\u041f\u0426\u042e\u0430\u0434\u0437\u043a\u0442\u044c\u045d"+
		"\u0464\u0468\u0472\u0477\u047e\u0487\u048c\u0493\u049f\u04aa\u04b2\u04b7"+
		"\u04c0\u04c9\u04d2\u04d8\u04dd\u04e1\u04e5\u04e9\u04ed\u04f4\u04fc\u0509"+
		"\u0513\u0529\u052d\u0531\u0536\u054a\u054f\u0554\u055b\u055e\u0574\u0580"+
		"\u0584\u058c\u0596\u059d\u05a1\u05a6\u05a9\u05ae\u05b6\u05bb\u05c2\u05c8"+
		"\u05d0\u05d8\u05db\u05e2\u05e9\u05ed\u05f0\u05f6\u05fa\u0600\u060e\u0613"+
		"\u0617\u061a\u0621\u062c\u0631\u0635\u0638\u063b\u0642\u0648\u0650\u0656"+
		"\u0660\u0668\u066e\u0679\u067d\u067f\u0684\u0688\u068f\u0698\u069f\u06a2"+
		"\u06a5\u06a9\u06ae\u06bb\u06c5\u06cc\u06d8\u06df\u06eb\u06f1\u06f5\u06f9"+
		"\u06ff\u0705\u0707\u070e\u0712\u0715\u0719\u0723\u0726\u072d\u0730\u0735"+
		"\u073a\u073c\u073f\u0742\u0748\u074b\u0757\u075b\u075e\u0768\u076b\u0771"+
		"\u078c\u0799\u079f\u07a8\u07ae\u07b1\u07b9\u07bd\u07c3\u07c9\u07cf\u07da"+
		"\u07de\u07e0\u07ea\u07f0\u07f3\u0800\u0806\u0809\u080c\u0813\u0818\u081c"+
		"\u0820\u0831\u0834\u0839\u083d\u0841\u084a\u084d\u0852\u0856\u085b\u085f"+
		"\u0861\u086c\u0870\u0872\u0877\u087c\u0883\u0889\u088e\u0894\u0898\u089e"+
		"\u08a5\u08af\u08b2\u08b5\u08ba\u08c0\u08c4\u08c6\u08cd\u08d4\u08dc\u08e0"+
		"\u08ef\u08f3\u08fc\u0900\u0904\u091a\u0922\u0928\u0931\u093a\u0940\u0947"+
		"\u094e\u0950\u0957\u095a\u095d\u0961\u0964\u0969\u096c\u096f\u0973\u0978"+
		"\u097b\u097e\u0982\u0987\u098b\u0991\u0995\u0999\u09a7\u09b4\u09ba\u09cd"+
		"\u09d8\u09dc\u09e2\u09e6\u09ea\u09f1\u09f8\u09fb\u0a01\u0a08\u0a0d\u0a10"+
		"\u0a18\u0a1e\u0a22\u0a28\u0a2c";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}