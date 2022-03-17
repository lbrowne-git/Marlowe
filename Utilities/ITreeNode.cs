using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Text;

namespace Utilities
{
    public interface ITreeNode 
    {
        public Dictionary<string, object?> Variables { get; set; }

        public Dictionary<string, object?> Functions { get; set; }

        public Dictionary<string, object?> Namespace { get; set; }



    }
}
