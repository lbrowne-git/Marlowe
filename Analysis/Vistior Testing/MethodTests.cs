using Marlowe.Utilities;
using Marlowe.Visitors;

namespace Marlowe.Tests
{
    public class MethodTests : AnalyserStub
    {
        IMethodVisitor<SymbolNode> VariableVisitor;
        CSharpParser CSharpParser;

        public MethodTests()
        {
            Setup(SourceConstructor.GenerateClass("dummyClass"));
        }
        public override void Setup(string text)
        {
            base.Setup(text);
            VariableVisitor = (IMethodVisitor<SymbolNode>)Visitor;
            CSharpParser = (CSharpParser)Parser;
        }
    }
}
