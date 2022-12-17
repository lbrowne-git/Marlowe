using Marlowe.Logger;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Marlowe
{

    /// <summary>
    ///     This is is an abstract minimanl implementation of the what is used by defaults entrypoints into 
    /// </summary>
    public abstract class CommandObjectHandler
    {
        public static readonly Stopwatch Timer = new Stopwatch();
        public static ILogger.Levels Level = ILogger.Levels.Info;
        public static ILogger Logger;
        public static bool ShowSymbolTable = false;
        public static readonly List<SymbolTable> SymbolTables = new List<SymbolTable>();
        public readonly List<object> NodeObjects = new List<object>();
        public static List<string> Files = new List<string>();

    }
}
