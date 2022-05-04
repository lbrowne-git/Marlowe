using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Tests
{
    internal static class SourceConstructor
    {
        public static string NamespaceName(string Namespace)
        {
            return "\r\nnamespace "+Namespace+"{\n";
        }

        public static string GenerateClass(string Namespace, string NameOfClass)
        {
            return NamespaceName(Namespace)
                + ClassName(NameOfClass)
                + ClassBody()
                + ClosingBrace();
        }
        public static string GenerateClass()
        {
            return NamespaceName("dummyNamespace")
                + ClassName("dummyClass")
                + ClassBody()
                + ClosingBrace();
        }

        public static string ClassBody()
        {
            return DeclareString("greeting", "hello world")
                   + DeclareInt("x", 4)
                   + DeclareInt("y", 25)
                   + ClosingBrace();
        }

        public static string ClosingBrace()
        {
            return "\r\n}\n";
        }

        public static string ClassName(string Classname)
        {
            return "\r\npublic class "+Classname+"{\r\n";
        }

        public static string DeclareString(string? variable, string value)
        {
            return $"string {variable} = \"{value}\";\r\n";
        }

        public static string DeclareInt(string? variable, int value)
        {
            if(variable == null)
            {

            }
            return $"int {variable} = {value};\r\n";
        }

        public static string PerformAdditiveExpressionWithDeclaredVariables(string variable, string x, string y){
            return $"double {variable} = {x} + {y};";
        }
    }
}
