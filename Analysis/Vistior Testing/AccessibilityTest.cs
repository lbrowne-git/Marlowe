
using Marlowe.CSharp;
using Marlowe.Utilities;
using Marlowe.Visitors;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Linq;

namespace Marlowe.Tests
{
    [TestClass()]
    public class AccessibilityTest : AnalyserStub
    {
        IClassVisitor<SymbolNode> ClassVisitor;
        CSharpParser CSharpParser;


        public AccessibilityTest()
        {
            Setup(SourceConstructor.GenerateClass("dummyClass"));
        }
        public override void Setup(string text)
        {
            base.Setup(text);
            ClassVisitor = (IClassVisitor<SymbolNode>)Visitor;
            CSharpParser = (CSharpParser)Parser;
        }

        [TestMethod()]
        public void CheckClassNamespace()
        {
            ClassVisitor.VisitClass_definition(CSharpParser.class_definition());
            string ClassName = ((CSharpVisitor)ClassVisitor).ClassName;
            Assert.IsTrue(ClassName == "dummyClass");
        }
        [TestMethod()]
        public void CheckIfVariableIsPublic()
        {
            ClassVisitor.VisitClass_definition(CSharpParser.class_definition());
            var visitor = ((CSharpVisitor)ClassVisitor).Variables.ToArray();
            Assert.IsTrue(visitor[0].Value.Accessibility == "public");
        }

        [TestMethod()]
        public void CheckIfFunctionIsPublic()
        {
            ClassVisitor.VisitClass_body(CSharpParser.class_body());
            Assert.IsTrue(((CSharpVisitor)ClassVisitor).Functions.Count > 0);
        }
    }
}