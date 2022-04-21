using Antlr4.Runtime.Misc;

namespace Marlowe.CSharp
{

    /// <summary>
    /// Segregated functionality of <see cref="ICSharpParserVisitor{Result}"/>. Contains the abstract implementation of the Namespace contexts related to the <see cref="CSharpParser"/>
    /// </summary>
    /// <typeparam name="Result"></typeparam>
    public interface INamespaceVisitor<Result>

    {
    /// <summary>
        /// Visit a parse tree produced by <see cref="CSharpParser.namespace_or_type_name"/>.
        /// </summary>
        /// <param name="context">The parse tree.</param>
        /// <return>The visitor result.</return>
	    Result VisitNamespace_or_type_name([NotNull] CSharpParser.Namespace_or_type_nameContext context);
    /// <summary>
        /// Visit a parse tree produced by <see cref="CSharpParser.namespace_member_declarations"/>.
        /// </summary>
        /// <param name="context">The parse tree.</param>
        /// <return>The visitor result.</return>
        Result VisitNamespace_member_declarations([NotNull] CSharpParser.Namespace_member_declarationsContext context);
	/// <summary>
        /// Visit a parse tree produced by <see cref="CSharpParser.namespace_member_declaration"/>.
        /// </summary>
        /// <param name="context">The parse tree.</param>
        /// <return>The visitor result.</return>
        Result VisitNamespace_member_declaration([NotNull] CSharpParser.Namespace_member_declarationContext context);
    /// <summary>
        /// Visit a parse tree produced by <see cref="CSharpParser.namespace_declaration"/>.
        /// </summary>
        /// <param name="context">The parse tree.</param>
        /// <return>The visitor result.</return>
        Result VisitNamespace_declaration([NotNull] CSharpParser.Namespace_declarationContext context);
	/// <summary>
        /// Visit a parse tree produced by <see cref="CSharpParser.namespace_body"/>.
        /// </summary>
        /// <param name="context">The parse tree.</param>
        /// <return>The visitor result.</return>
        Result VisitNamespace_body([NotNull] CSharpParser.Namespace_bodyContext context);
    /// <summary>
        /// Visit a parse tree produced by <see cref="CSharpParser.qualified_identifier"/>.
        /// </summary>
        /// <param name="context">The parse tree.</param>
        /// <return>The visitor result.</return>
        Result VisitQualified_identifier([NotNull] CSharpParser.Qualified_identifierContext context);
    }
}