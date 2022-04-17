using Antlr4.Runtime;
using System;

namespace Marlowe.Utilities
{
    public static class SemanticAnalyser
    {

        public enum Operators { PLUS, MINUS, MOD, MULT, DIV, FLOAT };
        private static ISymbolNode symbolNode;



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
            symbolNode = new SymbolNode{ // Node must created this way to illiminate object referencing.
                                ClassName = LNode.ClassName,
                                Namespace = LNode.Namespace, 
                                Type = LNode.Type, 
                                Variable = LNode.Variable
            };
            try
            {
                if (IsNumericType(LNode.Variable) && IsNumericType(RNode.Variable))
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
                else if (LNode.Type == typeof(string) && RNode.Type == typeof(string))
                {// concatenates two strings
                    symbolNode.Variable = "" + LNode.Variable + RNode.Variable;
                }
                else if (LNode.Type == typeof(string) || RNode.Type == typeof(string))
                {// concatenates a string and another type
                    symbolNode.Variable = "" + LNode.Variable + RNode.Variable.ToString();
                }
                else
                {
                    if (LNode.Type == typeof(bool) && RNode.Type == typeof(bool))
                    {
                        throw new Exception($"{LNode.Variable} and {RNode.Variable} are both booleans and cannot be added together");
                    }
                    else
                    {
                        throw new Exception($"{LNode.Variable}({LNode.Type.Name}) and {RNode.Variable}({RNode.Type.Name}) are different types");

                    }

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
