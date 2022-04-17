using Antlr4.Runtime;
using System;

namespace Marlowe.Utilities
{
    public static class SemanticAnalyser
    {

        public enum Operators { PLUS, MINUS, MOD, MULT, DIV, FLOAT };
        private static ISymbolNode symbolNode = new SymbolNode();



        //
        // Summary:
        //      Using LR parsing this function check if two nodes are off the 
        //      same primative type and performs an operation merging both of these expressions.
        //
        // Parameters:
        //   LNode:
        //     The Left-hand expression, which the operation is happening to.
        //   RNode:
        //      The Right-hand expression, which is performing an action against the left-hand node.
        //   OP:
        //      A Operation provided by the SemanticAnalyser to be used by this function.
        //
        // Returns:
        //      A SymbolNode comprising of the input Left and Right SymbolNode.
        // 
        //
        public static ISymbolNode OperationExpression(ISymbolNode LNode, ISymbolNode RNode, Operators OP){
            symbolNode = LNode;
            try
            {
                if(IsNumericType(LNode.Variable) && IsNumericType(RNode.Variable))
                {
                    switch (OP)
                    {
                        case Operators.PLUS:
                            symbolNode.Variable = Convert.ToDouble(LNode.Variable) + Convert.ToDouble(RNode.Variable);
                            break;
                        case Operators.MINUS:
                            symbolNode.Variable = Convert.ToDouble(LNode.Variable) - Convert.ToDouble(RNode.Variable);
                            break;
                        case Operators.MULT:
                            symbolNode.Variable = Convert.ToDouble(LNode.Variable) * Convert.ToDouble(RNode.Variable);
                            break;
                        case Operators.DIV:
                            symbolNode.Variable = Convert.ToDouble(LNode.Variable) / Convert.ToDouble(RNode.Variable);
                            break;
                        case Operators.MOD:
                            symbolNode.Variable = Convert.ToDouble(LNode.Variable) % Convert.ToDouble(RNode.Variable);
                            break;
                    }
                }
                else if(LNode.Type == typeof(string) && RNode.Type == typeof(string)){
                    symbolNode.Variable = "" + LNode.Variable + RNode.Variable;
                }
                else {
                    throw new Exception($"{LNode.Variable} and {RNode.Variable} are different types");
                }
                return symbolNode;
            }
            catch (Exception e)
            {
                throw e;
            }
        }

        /*
         * Summary:
         *      Determines if an object is capable of numeric computation. Through 
         *      converting the object to type double and using the value in an equation.
         *  Parameters:
         *      t:
         *          an object of generic type.
         *  Returns:
         *      True if the input object is capable of numeric computation.
         *      False if it is not or if null;
         */      

        private static bool IsNumericType(object t)
        {
            double doubleOutput;
            try
            {
                doubleOutput = Convert.ToDouble((string)t);
                doubleOutput += 1;
                return true;
            }
            catch
            {
                return false;
            }
        }
    }
}
