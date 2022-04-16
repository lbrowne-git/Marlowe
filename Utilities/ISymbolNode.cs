using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace Marlowe.Utilities
{
    public interface ISymbolNode
    {
        public object Variable { get; set; }

        public string Namespace { get; set; }

        public string ClassName { get; set; }


    }
}
