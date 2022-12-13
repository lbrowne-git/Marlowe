using Antlr4.Runtime;
using Marlowe.Utilities;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;

namespace Marlowe.Tests
{
    /// <summary>
    /// Tests for items existing in SymbolTable to ensure visitor is operating.
    /// </summary>
    [TestClass()]
    public class SymbolTableTesting : InterpeterStub
    {
        public SymbolTableTesting() : base(){}

        public override void Setup()
        {
            files.Add(SourceConstructor.GenerateNamespaceWithUsingDirectives("dummyNamesapce", "dummyClass","system"));
            ExecuteAnalyser(files);
        }
        [TestMethod()]
        public void TestVariableCollection(){
            List<Dictionary<string, SymbolNode>> variables = new List<Dictionary<string, SymbolNode>>();
            foreach (var item in symbolTables)
            {
                if(item.Variables.Count > 0)
                {
                    variables.Add(item.Variables);
                }
            }
            Assert.IsTrue(variables.Count > 0);
        }

        [TestMethod()]
        public void TestFunctionCollection()
        {
            List<Dictionary<string, SymbolFunctionNode>> functions = new List<Dictionary<string, SymbolFunctionNode>>();
            foreach (var item in symbolTables)
            {
                if (item.Functions.Count > 0)
                {
                    functions.Add(item.Functions);
                }
            }
            Assert.IsTrue(functions.Count > 0);
        }
        [TestMethod()]
        public void TestDirectiveCollection()
        {
            List<Dictionary<string, SymbolNode>> directives = new List<Dictionary<string, SymbolNode>>();
            foreach (var item in symbolTables)
            {
                if (item.Directives.Count > 0)
                {
                    directives.Add(item.Directives);
                }
            }
            Assert.IsTrue(directives.Count > 0);
        }
    }
}