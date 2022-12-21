
using Marlowe.CSharp;
using Marlowe.Utilities;
using Marlowe.Visitors;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Marlowe.Tests
{
    [TestClass()]
    public class NamespaceTests : AnalyserStub
    {
        INamespaceVisitor<SymbolNode> NamespaceVisitor;
        CSharpParser CSharpParser;


        public NamespaceTests()
        {
            Setup(SourceConstructor.GenerateNamespace("dummyNamespace", "dummyClass"));
        }
        public override void Setup(string text)
        {
            base.Setup(text);
            NamespaceVisitor = (INamespaceVisitor<SymbolNode>)Visitor;
            CSharpParser = (CSharpParser)Parser;
        }

        [TestMethod()]
        public void CheckNamespaceName()
        {
            NamespaceVisitor.VisitNamespace_declaration(CSharpParser.namespace_declaration());
            string NameofNamespace = ((CSharpVisitor)NamespaceVisitor).Namespace;
            Assert.IsTrue(NameofNamespace == "dummyNamespace");
        }
        [TestMethod()]
        public void CheckIfClassesExistInNamespace()
        {
            NamespaceVisitor.VisitNamespace_declaration(CSharpParser.namespace_declaration());
            CSharpVisitor visitor = (CSharpVisitor)NamespaceVisitor;
            Assert.IsTrue(visitor.Namespace == "dummyNamespace" && visitor.ClassName == "dummyClass");
        }

        [TestMethod()]
        public void CheckNamespaceIsCapableOfStoringMultipleClasses()
        {

        }

        [TestMethod()]
        public void CheckNamespaceIsCapableOfReferencingLocalNamespaces()
        {
        }
    }
}
