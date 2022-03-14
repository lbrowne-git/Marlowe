using Antlr4.Runtime;
using System;

namespace Marlowe.CSharp
{
    public static class Logger
    {
        private static bool writable = false;
        public enum Levels : ushort
        {
            Info = 0,
            Notice = 1,
            Warring = 2,
            Error = 4
        };

        private static Levels level = Levels.Info;

        
        private static void CreateHeader(string heading = null)
        {
            if (heading != null){
                Console.WriteLine("*******************************************\n\t\t{0}\n*******************************************", heading);
            }
            else{
                Console.WriteLine($"*******************************************\n\t\t{level}\n*******************************************");
            }
        }

        public static void GenerateContext(CSharpVisitor cSharpVisitor)
        {
            CreateHeader("Namespace");
            Console.WriteLine($"Total: {cSharpVisitor.Namespace.Count}");

            foreach (var item in cSharpVisitor.Namespace)
            {
                Console.WriteLine(item.Key + "\t:\t:" + item.Value);
            }
            CreateHeader("Variables");
            Console.WriteLine($"Total: {cSharpVisitor.Variables.Count}");
            foreach (var item in cSharpVisitor.Variables)
            {
                Console.WriteLine(item.Key + "\t:\t:" + item.Value);
            }
        }

        public static void CreateContext(RuleContext context)
        {
            CreateHeader(context.GetText());
            Console.WriteLine("Invoke State:\t\t {0}", context.invokingState.ToString());
            Console.WriteLine("Type:\t\t\t {0}", context.GetType().Name);
            Console.WriteLine("PayLoad:\t\t\t {0}", context.Payload.GetText());

        }
    }
}
