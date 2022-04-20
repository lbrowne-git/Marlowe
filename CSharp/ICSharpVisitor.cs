namespace Marlowe.CSharp
{

    ///
    /// <summary>
    ///     Acts a layer of abstraction for the CSharpVistor.
    ///     which allows for the seamless conversion of generic types between
    ///     the generated antlr visitor and Marlowe's implementation.
    /// </summary>
    public interface ICSharpVisitor<Result> : INamespaceVisitor<Result>, ICSharpParserVisitor<Result>
    {
    }
}
