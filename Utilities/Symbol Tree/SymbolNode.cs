using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;

namespace Marlowe.Utilities
{

    /// <summary>
    ///  An <see langword="abstract"/> node element containg properties about variables and methods calls. Allows for extension by different languages to meet their syntax. 
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
        public object Variable { get; set; }
        public string Namespace { get; set; }
        public string ClassName { get; set; }
        public string Accessibility { get; set; }
        public Type Type { get; set; }

        public ParserRuleContext RuleContext { get; set; }

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

        public override string ToString()
        {
            return $"Value:\t\t{Variable}\n" +
                   $"Class:\t\t{ClassName}\n" +
                   $"Namespace:\t{Namespace}";
        }
    }
}
