using System;
using System.Collections.Generic;
using Utilities;

namespace CSharp
{
    internal class VisitorTree : ITreeNode
    {
        public Dictionary<string, object> Variables { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
        public Dictionary<string, object> Functions { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
        public Dictionary<string, object> Namespace { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
    }
}
