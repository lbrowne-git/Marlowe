using Antlr4.Runtime;
using Marlowe.Analysis;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.IO;

namespace Marlowe.Tests.Analysis
{
    [TestClass]
    public class ParserTest : IAnalyser
    {

        #region Attribs
        private AntlrInputStream stream;
        private CSharpLexer lexer;
        private Marlowe.Analysis.CodeParser parser;
        private Visitor visitor;
        private CommonTokenStream commonTokenStream;
        #endregion

        /* The source gathering for this compiler is
         * done by the vistor which creates a symbol tree.   */

        private void Setup(string text)
        {
            stream = new AntlrInputStream(text);
            lexer = new CSharpLexer(stream);
            commonTokenStream = new CommonTokenStream(lexer);
            parser = new Marlowe.Analysis.CodeParser(commonTokenStream);
            visitor = new Visitor();    
        }

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

            var context = parser.compilation_unit();
            visitor.VisitCompilation_unit(context);
            commonTokenStream.Fill();
            List<IToken> tokens = FilterTokens(commonTokenStream.GetTokens());
            Assert.AreEqual(13, tokens.Count);
        }

        [TestMethod]
        public void SpecifyInput()
        {
            Setup("int x = 2 + 4;");
            var context = parser.compilation_unit();
            visitor.VisitCompilation_unit(context);

            commonTokenStream.Fill();
            IList<Antlr4.Runtime.IToken> tokens = commonTokenStream.GetTokens();
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



        #region Getter & Setters
        public AntlrInputStream Stream { get => stream; set => stream = value; }
        public CSharpLexer Lexer { get => lexer; set => lexer = value; }
        public Marlowe.Analysis.CodeParser Parser { get => parser; set => parser = value; }
        public Visitor Visitor { get => visitor; set => visitor = value; }

        public CommonTokenStream CommonTokenStream => commonTokenStream;

        CSharpParser IAnalyser.Parser => throw new System.NotImplementedException();
        #endregion
    }
}