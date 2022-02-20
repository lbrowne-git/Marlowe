using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Analysis
{
    public class Node : ITerminalNode
    {
        #region Attributes
        private IToken symbol;

        private IRuleNode parent;

        private Interval sourceInterval;

        private object payload;

        private int childCount;

        IParseTree IParseTree.Parent { get; }

        ITree ITree.Parent { get; }
        #endregion

        public T Accept<T>(IParseTreeVisitor<T> visitor)
        {
            throw new NotImplementedException();
        }

        public IParseTree GetChild(int i)
        {
            throw new NotImplementedException();
        }

        public string GetText()
        {
            throw new NotImplementedException();
        }

        public string ToStringTree(Parser parser)
        {
            throw new NotImplementedException();
        }

        public string ToStringTree()
        {
            throw new NotImplementedException();
        }

        ITree ITree.GetChild(int i)
        {
            throw new NotImplementedException();
        }

        #region Getters & Setters
        public IToken Symbol { get => symbol; set => symbol = value; }
        public IRuleNode Parent { get => parent; set => parent = value; }
        public Interval SourceInterval { get => sourceInterval; set => sourceInterval = value; }
        public object Payload { get => payload; set => payload = value; }
        public int ChildCount { get => childCount; set => childCount = value; }
        #endregion


    }
}
