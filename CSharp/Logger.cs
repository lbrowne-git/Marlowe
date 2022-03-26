using Marlowe.Utilities;
using Marlowe.Visitor;
using System;
using System.Collections.Generic;

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
                Console.WriteLine($"*******************************************\n\t\t{heading}\n*******************************************");
            }
            else{
                Console.WriteLine($"*******************************************\n\t\t{level}\n*******************************************");
            }
        }

        public static void GenerateContext(CSharpVisitor cSharpVisitor)
        {
            CreateHeader("Namespace");
            Console.WriteLine($"Total: {cSharpVisitor.Namespace.Count}");
            DictonaryHandler(cSharpVisitor.Namespace);


            CreateHeader("Variables");
            Console.WriteLine($"Total: {cSharpVisitor.Variables.Count}");
            DictonaryHandler(cSharpVisitor.Variables);
        }

        private static void DictonaryHandler<T,K>(Dictionary<T, K> dictonary){
            foreach (var item in dictonary)
            {
                Console.WriteLine($"{item.Key}\t:\t{item.Value}");
            }
        }
    }
}
