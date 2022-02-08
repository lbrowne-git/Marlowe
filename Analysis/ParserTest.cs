using Microsoft.VisualStudio.TestTools.UnitTesting;
using Marlowe.Analysis;
using System.IO;

namespace Marlowe.Tests.Analysis
{
    [TestClass]
    public class ParserTest
    {

        private Parser Setup(string text)
        {
            Antlr4.Runtime.AntlrInputStream inputStream = new Antlr4.Runtime.AntlrInputStream(text);
            CSharpLexer codeLexer = new CSharpLexer(inputStream);
            Antlr4.Runtime.CommonTokenStream commonTokenStream = new Antlr4.Runtime.CommonTokenStream(codeLexer);
            Parser CodeParser = new Parser(commonTokenStream);

            return CodeParser;
        }

        [TestMethod]
        public void FileInput()
        {
            string fileName = "dummy.ss";
            string FileContents = File.ReadAllText(fileName);

            Parser parser = Setup(FileContents);
            Visitor visitor = new Visitor();

            // Parser Pattern Entry Point
            var context = parser.compilation_unit();
            visitor.Visit(context);

            /* The amount of Tokens that should 
               should be present in:
                    int x = 2 + 4; //7 */
            Assert.AreEqual(7, visitor.Variables.Count);
        }
        
        [TestMethod]
        public void SpecifyInput()
        {
            Parser parser = Setup("int x = 2 + 4;");
            Visitor visitor = new Visitor();

            // Parser Pattern Entry Point
            var context = parser.compilation_unit();
            visitor.Visit(context);

            /* The amount of Tokens that should 
               should be present in:
                    int x = 2 + 4; //7 */
            Assert.AreEqual(7, visitor.Variables.Count);
        }

        [TestMethod]
        public void TestWrongLine()
        {
        }
    }
}