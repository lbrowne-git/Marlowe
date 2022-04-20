using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;

namespace Marlowe.Utilities
{

    /// <summary>
    ///  An element containg properties about variables and methods calls. Allows for extension by different languages to meet their syntax. 
    /// </summary>
    /// <remarks>
    ///     Extends <see cref="ISymbolNode"/>
    /// </remarks>
    public abstract class SymbolNode : ISymbolNode
    {

        /// <summary>
        ///     The <see langword="object"/> representation of the value taken after the assignment call.
        /// </summary>
        ///
        private object variable { get; set; }

        private string nodeNamespace { get; set; }

        private string className { get; set; }
        
        private Type type { get; set; }


        #region Getters & Setters
        public object Variable { get => variable; set => variable = value; }
        public string Namespace { get => nodeNamespace; set => nodeNamespace = value; }
        public string ClassName { get => className; set => className = value; }
        public Type Type { get => type; set => type = value; }

        public void HandleArthimatic(ParserRuleContext[] multiplicative_expressionContexts, string arthmatic)
        {
            SymbolVariableNode buffer = new SymbolVariableNode();
            switch (arthmatic)
            {
                case "-":
                    break;
                case "+":
                    Console.WriteLine("IAm here");
                    break;
                default:
                    break;
            }
        }


        #endregion


        public override string ToString()
        {
            return $"{variable}\t:\t{className}\t:\t{nodeNamespace}\t:\t{Type}"; 
        }
    }
}
