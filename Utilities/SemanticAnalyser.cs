using Antlr4.Runtime;
using System;

namespace Marlowe.Utilities
{
    public static class SemanticAnalyser
    {

        public enum Operators { PLUS, MINUS, MOD, MULT, DIV, FLOAT };

        private static Type type;

        public static ISymbolNode OperationExpression(ParserRuleContext[] contexts, Operators operation)
        {
            foreach (ParserRuleContext context in contexts)
            {
                GatherTextContent(context.GetText());
                if (contexts.Length > 1)
                {
                    switch (operation){
                        case Operators.PLUS:
                            //GatherTextContent(context.GetText()). + GatherTextContent(context.GetText());
                            break;
                    }
                }
            }
            return null;

        }

        private static ISymbolNode GatherTextContent(object? contextText)
        {
            string value = contextText.ToString();
            if (int.TryParse(value, out int intValue))
            {
                if (intValue != 0)
                {
                    return new SymbolNode() { Variable = intValue };
                }
            }
            else if (double.TryParse(value, out double doubleValue))
            {
                if (doubleValue != 0)
                {
                    return new SymbolNode() { Variable = doubleValue };
                }
            }
            else if (float.TryParse(value, out float floatValue))
            {
                if (floatValue != 0)
                {
                    return new SymbolNode() { Variable = floatValue };
                }
            }
            return new SymbolNode() { Variable = null };
        }
    }
}
