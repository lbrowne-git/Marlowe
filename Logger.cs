using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe
{
    class Logger
    {
        public bool writable { get; set; }
        public enum Levels : ushort
        {
            Info = 0,
            Notice = 1,
            Warring = 2,
            Error = 4
        };

        private Levels level;

        public Logger(bool writable, Levels level = Levels.Info)
        {
            this.writable = writable;
            this.level = level;
        }
        

        public void CreateLog(string Message,string heading)
        {
            CreateHeader();
            Console.WriteLine(Message);
        }

        private void CreateHeader(string heading = null)
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

        internal void CreateTokenLog(ITokenStream tokens)
        {
            CreateHeader("Token");
        }

        internal void CreateLexerLog(ITokenSource lexer)
        {
            CreateHeader("Lexer");
            Console.WriteLine("Size: \t\t{0}", lexer.InputStream.Size);
            Console.WriteLine("Position:\t{0}", lexer.Column);
        }
    }
}
