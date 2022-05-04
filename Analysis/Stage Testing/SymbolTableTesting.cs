using Antlr4.Runtime;
using Marlowe.Utilities;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;

namespace Marlowe.Tests
{
    /// <summary>
    /// Tests for items existing in SymbolTable to ensure visitor is collecting variables.
    /// </summary>
    [TestClass()]
    public class SymbolTableTesting : InterpeterStub
    {
        public SymbolTableTesting() : base(){}
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
            Assert.IsNotNull(variables);
        }

        [TestMethod()]
        public void TestFunctionCollection()
        {
            List<Dictionary<string, SymbolFunctionNode>> functions = new List<Dictionary<string, SymbolFunctionNode>>();
            foreach (var item in symbolTables)
            {
                if (item.Variables.Count > 0)
                {
                    functions.Add(item.Functions);
                }
            }
            Assert.IsNotNull(functions);
        }
        [TestMethod()]
        public void TestDirectiveCollection()
        {
            List<Dictionary<string, SymbolNode>> directives = new List<Dictionary<string, SymbolNode>>();
            foreach (var item in symbolTables)
            {
                if (item.Variables.Count > 0)
                {
                    directives.Add(item.Directives);
                }
            }
            Assert.IsNotNull(directives);
        }
    }
}