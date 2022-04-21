using Marlowe.Utilities;
using Marlowe.Logger;
using System.Collections.Generic;

namespace Marlowe
{
    public class ComputableAPI
    {
        public static readonly List<SymbolTable> symbolTables = new List<SymbolTable>();
        public static ILogger.Levels Level = ILogger.Levels.Error;
        public static ILogger Logger;
        public static bool ShowSymbolTable = false;
        public readonly List<object> NodeObjects = new List<object>();
    }
}