
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Marlowe.Visitors;
using Marlowe.Utilities;
using Marlowe.CSharp;
using System.Diagnostics.CodeAnalysis;

namespace Marlowe.Tests{
    [TestClass()]
    public class ClassTests : AnalyserStub
    {
        ClassNameTest ClassVisitor;
        CSharpParser CSharpParser;


        public ClassTests()
        {
            Setup(SourceConstructor.GenerateClass("DummyNamespace", "dummyClass"));
        }

        public ClassTests(string text) : base(text)
        {
            Setup(text);
        }
        public override void Setup(string text)
        {
            base.Setup(text);
            ClassVisitor = (ClassNameTest)Visitor;
            CSharpParser = (CSharpParser)Parser;
        }

        [TestMethod()]
        public void CheckClassNamespace(){
            ClassVisitor.VisitClass_body(CSharpParser.class_body());
            Assert.IsTrue(ClassVisitor.Variables.Count > 0);
        }
    }
}