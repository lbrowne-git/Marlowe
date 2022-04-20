using Antlr4.Runtime;
using System;

namespace Marlowe.Utilities
{
    public static class SemanticAnalyser
    {

        public enum Operators { PLUS, MINUS, MOD, MULT, DIV, FLOAT };
        public enum Logical { EQ, NEQ, OR, AND , DIV, FLOAT };

        private static ISymbolNode symbolNode;

        /// <summary>
        ///  Using LR parsing this function check if two nodes are off the same primative type and performs an operation merging both of these expressions.
        /// </summary>
        /// <param name="LNode">The Left-hand expression, which the operation is happening to.</param>
        /// <param name="RNode"> The Right-hand expression, which is performing an action against the left-hand node.</param>
        /// <param name="OP"> A Operation provided by the SemanticAnalyser to be used by this function.</param>
        /// <returns>A new <see cref="ISymbolNode"/> comprising of the input Left and Right <see cref="ISymbolNode"/></returns>
        public static ISymbolNode OperationExpression(ISymbolNode LNode, ISymbolNode RNode, Operators OP){
            symbolNode = new SymbolVariableNode{// Node must be created this way to eliminate object referencing.
                                ClassName = LNode.ClassName,
                                Namespace = LNode.Namespace, 
                                Type = LNode.Type, 
                                Variable = LNode.Variable
            };
            try
            {
                if (IsNumericType(LNode.Variable) && IsNumericType(RNode.Variable)){
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
                    if (OP == Operators.PLUS)
                    {
                        symbolNode.Variable = "" + LNode.Variable.ToString().TrimEnd('"') + RNode.Variable.ToString().TrimStart('"');
                    }
                    else
                    {
                        throw new Exception($"{LNode.Variable} and {RNode.Variable} are strings that can only be added together.");
                    }
                }
                else if (LNode.Type == typeof(string) || RNode.Type == typeof(string))
                {// concatenates a string and another type
                    if(OP == Operators.PLUS){
                        symbolNode.Variable = "" + LNode.Variable + RNode.Variable.ToString();
                    }
                    else
                    {
                        throw new Exception($"{LNode.Variable} and {RNode.Variable} can only be concatenated using the + operator.");
                    }
                }
                else
                {
                    if (LNode.Type == typeof(bool) && RNode.Type == typeof(bool))
                    {
                        throw new Exception($"{LNode.Variable} and {RNode.Variable} are both booleans and cannot be added together");
                    }
                    else if (LNode.Type == typeof(object) && RNode.Type == typeof(object)){
                        throw new Exception($"{LNode.Variable} and {RNode.Variable} are both objects of generic type and cannot be added together");
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



        /// <summary>
        ///         Determines if an object is capable of numeric computation. 
        ///     Through converting the object to type double and using the value in an equation.
        ///     
        /// </summary>
        /// <param name="t">An object of generic type.</param>
        /// <returns>True if the input object is capable of numeric computation False if it is not or if null</returns>
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


        /// <summary>
        /// Determines if an object stored in a SymbolNode is the type it was declared as.
        /// </summary>
        /// <param name="sn">A SymbolNode with a variable and type.</param>
        /// <returns><see langword="True"/> if the input object is the specified type. <see langword="False"/> if it is not or if null.</returns>

        public static bool IsCorrectVariableType(ISymbolNode sn)
        {
            try{
                Convert.ChangeType(sn.Variable, sn.Type);
                return true;
            }
            catch
            {
                Console.WriteLine($"{sn.Variable} is not an object of type {sn.Type}");
                return false;
            }
        }

        public static ISymbolNode LogicalOperationExpression(ISymbolNode lNode, ISymbolNode rNode, Logical logic)
        {
            SymbolVariableNode bufferNode = new SymbolVariableNode()
            {
                ClassName = lNode.ClassName,
                Variable = lNode.Variable,
                Namespace = lNode.Namespace,
                Type = typeof(bool)
            };
            switch (logic)
            {
                case Logical.EQ:
                    bufferNode.Variable = (string)lNode.Variable == (string)rNode.Variable;
                    break;
                case Logical.NEQ:
                    bufferNode.Variable = lNode.Variable != rNode.Variable;
                    break;
                default:
                    break;
            }
            return bufferNode;
        }
    }
}
