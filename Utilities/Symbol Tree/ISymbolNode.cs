using System;

namespace Marlowe.Utilities
{
    public interface ISymbolNode
    {
        public object Variable { get; set; }

        public string Namespace { get; set; }

        public string ClassName { get; set; }
        
        public Type Type { get; set; }


    }
}
