using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Text;

namespace Cobol
{
    internal class Node : ITerminalNode
    {
        IToken ITerminalNode.Symbol => throw new NotImplementedException();

        IRuleNode ITerminalNode.Parent => throw new NotImplementedException();

        IParseTree IParseTree.Parent => throw new NotImplementedException();

        ITree ITree.Parent => throw new NotImplementedException();

        Interval ISyntaxTree.SourceInterval => throw new NotImplementedException();

        object ITree.Payload => throw new NotImplementedException();

        int ITree.ChildCount => throw new NotImplementedException();

        T IParseTree.Accept<T>(IParseTreeVisitor<T> visitor)
        {
            throw new NotImplementedException();
        }

        IParseTree IParseTree.GetChild(int i)
        {
            throw new NotImplementedException();
        }

        ITree ITree.GetChild(int i)
        {
            throw new NotImplementedException();
        }

        string IParseTree.GetText()
        {
            throw new NotImplementedException();
        }

        string IParseTree.ToStringTree(Parser parser)
        {
            throw new NotImplementedException();
        }

        string ITree.ToStringTree()
        {
            throw new NotImplementedException();
        }
    }
}
