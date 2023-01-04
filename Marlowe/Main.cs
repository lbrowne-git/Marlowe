using Marlowe.CSharp;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.IO;


namespace Marlowe
{
    ///<summary>
    ///      The entry point of this application. Reads HLL 
    ///      source code and passes it onto the Analyser.
    ///      
    ///</summary>
    public class Program : CommandObjectHandler
    {

        private static void Main(string[] args)
        {
            Timer.Start();

            CommandHandler.ParseArguments(args);

            //Entry point into interpetation.
            Interpeter interpeter = new Interpeter(Files, Logger);
            interpeter.Execute();
            if (ShowSymbolTable)
            {
                interpeter.LogExecutedSymbolTable();
            }
            TimeSpan timeSpan = Timer.Elapsed;
            Console.WriteLine($"the application took {timeSpan.Milliseconds}ms to complete this run");
        }
    }
}