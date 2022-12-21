namespace Marlowe.Tests
{
    internal static class SourceConstructor
    {
        public static string NamespaceName(string Namespace)
        {
            return "\r\nnamespace " + Namespace + " {\r\n";
        }
        public static string GenerateNamespace(string Namespace, string NameOfClass)
        {
            return NamespaceName(Namespace)
                + ClassName(NameOfClass)
                + ClassBody()
                + ClosingBrace();

        }

        public static string GenerateNamespaceWithUsingDirectives(string Namespace, string NameofClass, string directive)
        {
            return UsingDirectives(directive)
                + GenerateNamespace(Namespace, NameofClass);
        }

        private static string UsingDirectives(string directive)
        {
            return $"using {directive};\r\n";
        }

        public static string GenerateClass(string NameOfClass)
        {
            return ClassName(NameOfClass)
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
                   + "public " + DeclareInt("x", 4)
                   + "public " + DeclareInt("y", 25)
                   + "private " + DeclareFunction("void", "TestFunction")
                   + ClosingBrace();
        }

        public static string DeclareFunction(string returnType, string Name)
        {
            if (returnType.ToLower() != "void")
            {
                return "public static " + returnType + " Name() {\r\n"
                    + DeclareInt("testInt", 5)
                    + "return null"
                    + ClosingBrace();
            }
            else
            {
                return "public static " + returnType + " Name() {\r\n"
                    + DeclareInt("testInt", 5)
                    + ClosingBrace();
            }
        }

        public static string ClosingBrace()
        {
            return "\r\n}\n";
        }

        public static string ClassName(string Classname)
        {
            return "\r\n class " + Classname + "{\r\n";
        }

        public static string DeclareString(string? variable, string value)
        {
            return $"string {variable} = \"{value}\";\r\n";
        }

        public static string DeclareInt(string? variable, int value)
        {
            if (variable == null)
            {

            }
            return $"int {variable} = {value};\r\n";
        }

        public static string PerformAdditiveExpressionWithDeclaredVariables(string variable, string x, string y)
        {
            return $"double {variable} = {x} + {y};";
        }
    }
}
