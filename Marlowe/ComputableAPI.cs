using Marlowe.Logger;
using Marlowe.Utilities;
using System.Collections.Generic;

namespace Marlowe
{
    /// <summary>
    ///         Acts as a form of Data Layer for objects used throughout the application.
    /// </summary>
    public class ComputableAPI
    {
        public static readonly List<SymbolTable> symbolTables = new List<SymbolTable>();
        public static ILogger.Levels Level = ILogger.Levels.Error;
        public static ILogger Logger;
        public static bool ShowSymbolTable = false;
        public readonly List<object> NodeObjects = new List<object>();
    }
}