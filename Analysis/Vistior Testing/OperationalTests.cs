
using Marlowe.Utilities;
using Marlowe.Visitors;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Marlowe.Tests{
    [TestClass()]
    public class OperationalTests : AnalyserStub
    {
        ILogicalOperationsVisitor<SymbolNode> NamespaceVisitor;
        CSharpParser CSharpParser;


        public OperationalTests()
        {
            Setup(SourceConstructor.GenerateNamespace("dummyNamespace", "dummyClass"));
        }
        public override void Setup(string text)
        {
            base.Setup(text);
            NamespaceVisitor = (ILogicalOperationsVisitor<SymbolNode>)Visitor;
            CSharpParser = (CSharpParser)Parser;
        }
    }
}
