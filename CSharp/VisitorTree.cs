using System;
using System.Collections.Generic;
using Utilities;

namespace CSharp
{
    public class VisitorTree : ITreeNode
    {
        public Dictionary<string, object> Variables { get; set; }
        public Dictionary<string, object> Functions { get; set; }
        public Dictionary<string, object> Namespace { get; set; }
    }
}
