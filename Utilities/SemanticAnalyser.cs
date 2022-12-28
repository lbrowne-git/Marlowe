using Marlowe.Logger;
using System;

namespace Marlowe.Utilities
{
    public class SemanticAnalyser
    {

        public enum Operators { PLUS, MINUS, MOD, MULT, DIV, FLOAT };
        public enum Logical { EQ, NEQ, OR, AND, DIV, FLOAT, GT, LS, GTE, LSE };

        private static SymbolNode symbolNode;

        public static ILogger Logger { get; set; }

        /// <summary>
        ///  Using LR parsing this function checks if two nodes are off the same primative type and performs an operation merging both of these expressions.
        /// </summary>
        /// <param name="LNode">The Left-hand expression, which the operation is happening to.</param>
        /// <param name="RNode"> The Right-hand expression, which is performing an action against the left-hand node.</param>
        /// <param name="OP"> A Operation provided by the SemanticAnalyser to be used by this function.</param>
        /// <returns>A new <see cref="SymbolNode"/> comprising of the input Left and Right <see cref="SymbolNode"/></returns>
        public static SymbolNode OperationExpression(SymbolNode LNode, SymbolNode RNode, Operators OP)
        {
            symbolNode = new SymbolVariableNode
            {// Node must be created this way to eliminate object referencing.
                ClassName = LNode.ClassName,
                Namespace = LNode.Namespace,
                ClassType = LNode.ClassType,
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
                else if (LNode.ClassType == typeof(string) && RNode.ClassType == typeof(string))
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
                else if (LNode.ClassType == typeof(string) || RNode.ClassType == typeof(string))
                {// concatenates a string and another type
                    if (OP == Operators.PLUS)
                    {
                        if (LNode.ClassType == typeof(string))
                        {
                            LNode.Variable = LNode.Variable.ToString().TrimEnd('"');
                            symbolNode.Variable = "" + LNode.Variable + RNode.Variable.ToString() + '"';
                        }
                        else
                        {
                            RNode.Variable = RNode.Variable.ToString().TrimStart('"');

                            //symbolMode is made of LNode passed into this method, this converts it type to a string.
                            symbolNode.ClassType = typeof(string);
                            symbolNode.Variable = "\"" + LNode.Variable + RNode.Variable.ToString();

                        }
                    }
                    else
                    {
                        throw new Exception($"{LNode.Variable} and {RNode.Variable} can only be concatenated using the + operator.");
                    }
                }
                else
                {
                    if (LNode.ClassType == typeof(bool) && RNode.ClassType == typeof(bool))
                    {
                        throw new Exception($"{LNode.Variable} and {RNode.Variable} are both booleans and cannot be added together");
                    }
                    else if (LNode.ClassType == typeof(object) && RNode.ClassType == typeof(object))
                    {
                        throw new Exception($"{LNode.Variable} and {RNode.Variable} are both objects of generic type and cannot be added together");
                    }
                    else
                    {
                        throw new Exception($"{LNode.Variable}({LNode.ClassType.Name}) and {RNode.Variable}({RNode.ClassType.Name}) are different types");

                    }

                }
                return symbolNode;
            }
            catch
            {
                //Logger.WriteContent("Error handling semantic analysis assuming problem with left or right node", ILogger.Levels.Error);
                if (LNode != null)
                {
                    return LNode;
                }
                else if (RNode != null)
                {
                    return RNode;
                }
                return null;
            }
        }



        /// <summary>
        ///         Determines if an object is capable of numeric computation. 
        ///     Through converting the object to type double and using the value in an equation.
        ///     
        /// </summary>
        /// <param name="t">An object of generic type.</param>
        /// <returns>True if the input object is capable of numeric computation False if it is not or if null</returns>
        public static bool IsNumericType(object t)
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
                try
                {
                    int output = Convert.ToInt32(t);
                    output += 1;
                    return true;
                }
                catch
                {
                    return false;
                }
            }
        }


        /// <summary>
        /// Determines if an object stored in a SymbolNode is the type it was declared as.
        /// </summary>
        /// <param name="sn">A SymbolNode with a variable and type.</param>
        /// <returns><see langword="True"/> if the input object is the specified type. <see langword="False"/> if it is not or if null.</returns>
        public static bool IsCorrectVariableType(SymbolNode sn)
        {
            try
            {
                Convert.ChangeType(sn.Variable, sn.ClassType);
                return true;
            }
            catch
            {
                Logger.WriteContent($"{sn.Variable} is not an object of type {sn.ClassType}", ILogger.Levels.Warning);
                return false;
            }
        }
        public static SymbolNode LogicalOperationExpression(SymbolNode lNode, SymbolNode rNode, Logical logic)
        {
            try
            {

                SymbolVariableNode bufferNode = new SymbolVariableNode()
                {
                    ClassName = lNode.ClassName,
                    Variable = lNode.Variable,
                    Namespace = lNode.Namespace,
                    ClassType = typeof(bool)
                };
                if (lNode.ClassType == rNode.ClassType || (lNode.ClassType == typeof(int) && rNode.ClassType == typeof(double) || (rNode.ClassType == typeof(double) && lNode.ClassType == typeof(int))))
                {
                    switch (logic)
                    {
                        case Logical.EQ:
                            bufferNode.Variable = lNode.Variable.Equals(rNode.Variable);
                            break;
                        case Logical.NEQ:
                            if (!lNode.Variable.Equals(rNode.Variable))
                            {
                                bufferNode.Variable = true;
                                break;
                            }
                            bufferNode.Variable = false;
                            break;
                        case Logical.GT:
                            if (IsNumericType(lNode.Variable) && IsNumericType(rNode.Variable))
                            {
                                double rn = Convert.ToDouble(rNode.Variable);
                                double ln = Convert.ToDouble(lNode.Variable);
                                bufferNode.Variable = ln > rn;
                                Logger.WriteContent($"{ln} > {rn} = {bufferNode.Variable}", ILogger.Levels.Info);
                            }
                            break;
                        case Logical.LS:
                            if (IsNumericType(lNode.Variable) && IsNumericType(rNode.Variable))
                            {
                                double rn = Convert.ToDouble(rNode.Variable);
                                double ln = Convert.ToDouble(lNode.Variable);
                                bufferNode.Variable = ln < rn;
                            }
                            break;
                        case Logical.GTE:
                            if (IsNumericType(lNode.Variable) && IsNumericType(rNode.Variable))
                            {
                                double rn = Convert.ToDouble(rNode.Variable);
                                double ln = Convert.ToDouble(lNode.Variable);
                                bufferNode.Variable = ln >= rn;
                            }
                            break;
                        case Logical.LSE:
                            if (IsNumericType(lNode.Variable) && IsNumericType(rNode.Variable))
                            {
                                double rn = Convert.ToDouble(rNode.Variable);
                                double ln = Convert.ToDouble(lNode.Variable);
                                bufferNode.Variable = ln <= rn;
                            }
                            break;
                        case Logical.AND:
                            if ((bool)lNode.Variable && (bool)rNode.Variable)
                            {
                                bufferNode.Variable = true;
                                break;
                            }
                            bufferNode.Variable = false;
                            break;
                        case Logical.OR:
                            if ((bool)lNode.Variable || (bool)rNode.Variable)
                            {
                                bufferNode.Variable = true;
                                break;
                            }
                            bufferNode.Variable = false;
                            break;
                        default:
                            break;
                    }
                }
                else
                {
                    Logger.WriteContent($"Logical operation of {lNode.Variable} and {rNode.Variable} as they are not the same type {lNode.ClassType.Name}, {rNode.ClassType.Name}", ILogger.Levels.Warning);
                }
                return bufferNode;
            }
            catch
            {
                if (lNode == null && rNode == null)
                {
                    Logger.WriteContent("There are no paramaters in a logical operations", ILogger.Levels.Warning);
                }
                else if (lNode == null)
                {
                    Logger.WriteContent($"The left logical operation relating to '{logic} {rNode.Variable}' is empty.", ILogger.Levels.Warning);
                }
                else
                {
                    Logger.WriteContent($"The right logical operation relating to '{lNode.Variable} {logic}' is empty.", ILogger.Levels.Warning);
                }
                return new SymbolVariableNode();
            }
        }

        public static bool IsStringLiteral(string text)
        {
            if (text.StartsWith('"') && text.EndsWith('"'))
            {
                return true;
            }
            else
            {
                return false;
            }
        }



        /// <summary>
        ///     Determines if a value is number, bool or string and returns that type.
        /// </summary>
        /// 
        /// <remarks>This isn't really an concrete solution to determining a type on the fly but it works as an error handler.</remarks>
        /// <param name="expression"></param>
        /// <returns></returns>
        public static Type GatherContextType(string expression)
        {
            Type type;
            if (IsNumericType(expression))
            {
                type = typeof(double);
            }
            if (IsBooleanLiteral(expression))
            {
                type = typeof(bool);
            }
            else
            {
                type = typeof(string);
            }
            return type;
        }

        /// <summary>
        ///     Parsers an object to determinf it is a boolean
        /// </summary>
        /// <param name="t"></param>
        /// <returns>a true or false if the object is a boolean or not</returns>
        public static bool IsBooleanLiteral(object t)
        {
            try
            {
                return Convert.ToBoolean((string)t);
            }
            catch
            {
                return false;
            }
        }

        public static object ReturnObjectOfType(object obj, Type type)
        {
            return Convert.ChangeType(obj, type);
        }
    }
}
