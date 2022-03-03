using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Utilities
{
    internal static class Logger
    {
        private static bool writable;
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
            if(heading == null)
            switch (level)
            {
                case Levels.Info:
                    Console.WriteLine("*******************************************\n\t\t\tINFO\n*******************************************");
                    break;
                case Levels.Notice:
                    Console.WriteLine("*******************************************\n\t\t\tNotice\n*******************************************");
                    break;
                case Levels.Warring:
                    Console.WriteLine("*******************************************\n\t\t\tWarning\n*******************************************");

                    break;
                case Levels.Error:
                    Console.WriteLine("*******************************************\n\t\t\tError\n*******************************************");
                    break;
                default:
                    break;
            }
            else
            {
                Console.WriteLine("*******************************************\n\t\t{0}\n*******************************************",heading);
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
