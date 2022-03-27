using Antlr4.Runtime;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.IO;

namespace Marlowe.Tests
{
    [TestClass]
    internal class LexicalTesting : TestAnalyser
    {
        private List<IToken> FilterTokens(IList<IToken> tokens)
        {
            List<IToken> buffer_tokens = new List<IToken>();
            foreach (IToken token in tokens)
            {
                if (token.Text != " ")
                {
                    if (!token.Text.Contains("\r\n"))
                    {
                        buffer_tokens.Add(token);
                    }
                }
            }
            return buffer_tokens;

        }

        [TestMethod]
        public void FileInput()
        {
            string fileName = "dummy.ss";
            string FileContents = File.ReadAllText(fileName);
            Setup(FileContents);

            var context = Parser.compilation_unit();
            Visitor.VisitCompilation_unit(context);
            CommonTokenStream.Fill();
            List<IToken> tokens = FilterTokens(CommonTokenStream.GetTokens());
            Assert.AreEqual(13, tokens.Count);
        }

        [TestMethod]
        public void SpecifyInput()
        {
            Setup("int x = 2 + 4;");
            var context = Parser.compilation_unit();
            Visitor.VisitCompilation_unit(context);

            CommonTokenStream.Fill();
            IList<Antlr4.Runtime.IToken> tokens = CommonTokenStream.GetTokens();
            for (int i = 0; i < tokens.Count; i++)
            {
                if (tokens[i].Text == " ")
                {
                    tokens.Remove(tokens[i]);
                }
            }
            Assert.AreEqual(8, tokens.Count);
        }

        [TestMethod]
        public void TestWrongLine()
        {
        }
    }
}