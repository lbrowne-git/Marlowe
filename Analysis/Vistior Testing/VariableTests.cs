using Marlowe.Utilities;
using Marlowe.Visitors;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Marlowe.Tests
{
    [TestClass()]
    public class VariableTests : AnalyserStub
    {
        IVariableVisitor<SymbolNode> VariableVisitor;
        CSharpParser CSharpParser;


        public VariableTests()
        {
            Setup(SourceConstructor.GenerateClass("dummyClass"));
        }
        public override void Setup(string text)
        {
            base.Setup(text);
            VariableVisitor = (IVariableVisitor<SymbolNode>)Visitor;
            CSharpParser = (CSharpParser)Parser;
        }
    }
}
