using System;


namespace Marlowe.Utilities

{
    /// <summary>
    ///  An <see langword="interface"/> providing extendability for the <see cref="SymbolTable"/>. While containing no functionality,
    ///  it allows for scalability of this system.
    /// </summary>
    public interface ISymbolNode
    {
 
        public object Variable { get; set; }


        public string Namespace { get; set; }

        public string ClassName { get; set; }
        
        public Type Type { get; set; }


    }
}
