
using Marlowe.CSharp;
using Marlowe.Utilities;
using Marlowe.Visitors;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Marlowe.Tests
{
    [TestClass()]
    public class ClassTests : AnalyserStub
    {
        IClassVisitor<SymbolNode> ClassVisitor;
        CSharpParser CSharpParser;


        public ClassTests()
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
        public void CheckClassVariblesAreStoredInSymbolTable()
        {
            ClassVisitor.VisitClass_body(CSharpParser.class_body());
            Assert.IsTrue(((CSharpVisitor)ClassVisitor).Variables.Count == 3);
        }

        [TestMethod()]
        public void CheckClassFunctionsAreStoredInSymbolTable()
        {
            ClassVisitor.VisitClass_body(CSharpParser.class_body());
            Assert.IsTrue(((CSharpVisitor)ClassVisitor).Functions.Count > 0);
        }
    }
}