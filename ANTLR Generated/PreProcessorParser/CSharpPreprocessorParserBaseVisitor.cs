//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from CSharpPreprocessorParser.g4 by ANTLR 4.9

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="ICSharpPreprocessorParserVisitor{Result}"/>,
/// which can be extended to create a visitor which only needs to handle a subset
/// of the available methods.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9")]
[System.Diagnostics.DebuggerNonUserCode]
[System.CLSCompliant(false)]
public partial class CSharpPreprocessorParserBaseVisitor<Result> : AbstractParseTreeVisitor<Result>, ICSharpPreprocessorParserVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by the <c>preprocessorDeclaration</c>
	/// labeled alternative in <see cref="CSharpPreprocessorParser.preprocessor_directive"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreprocessorDeclaration([NotNull] CSharpPreprocessorParser.PreprocessorDeclarationContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>preprocessorConditional</c>
	/// labeled alternative in <see cref="CSharpPreprocessorParser.preprocessor_directive"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreprocessorConditional([NotNull] CSharpPreprocessorParser.PreprocessorConditionalContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>preprocessorLine</c>
	/// labeled alternative in <see cref="CSharpPreprocessorParser.preprocessor_directive"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreprocessorLine([NotNull] CSharpPreprocessorParser.PreprocessorLineContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>preprocessorDiagnostic</c>
	/// labeled alternative in <see cref="CSharpPreprocessorParser.preprocessor_directive"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreprocessorDiagnostic([NotNull] CSharpPreprocessorParser.PreprocessorDiagnosticContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>preprocessorRegion</c>
	/// labeled alternative in <see cref="CSharpPreprocessorParser.preprocessor_directive"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreprocessorRegion([NotNull] CSharpPreprocessorParser.PreprocessorRegionContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>preprocessorPragma</c>
	/// labeled alternative in <see cref="CSharpPreprocessorParser.preprocessor_directive"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreprocessorPragma([NotNull] CSharpPreprocessorParser.PreprocessorPragmaContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by the <c>preprocessorNullable</c>
	/// labeled alternative in <see cref="CSharpPreprocessorParser.preprocessor_directive"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreprocessorNullable([NotNull] CSharpPreprocessorParser.PreprocessorNullableContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CSharpPreprocessorParser.directive_new_line_or_sharp"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitDirective_new_line_or_sharp([NotNull] CSharpPreprocessorParser.Directive_new_line_or_sharpContext context) { return VisitChildren(context); }
	/// <summary>
	/// Visit a parse tree produced by <see cref="CSharpPreprocessorParser.preprocessor_expression"/>.
	/// <para>
	/// The default implementation returns the result of calling <see cref="AbstractParseTreeVisitor{Result}.VisitChildren(IRuleNode)"/>
	/// on <paramref name="context"/>.
	/// </para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	public virtual Result VisitPreprocessor_expression([NotNull] CSharpPreprocessorParser.Preprocessor_expressionContext context) { return VisitChildren(context); }
}
