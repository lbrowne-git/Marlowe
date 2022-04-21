using System.Collections.Generic;

namespace Marlowe.Utilities
{
    /// <summary>
    ///  Returns an <see langword="abstract"/> class containing collections of <see cref="ISymbolNode"/>s with different class properties.
    /// </summary>
    public abstract class SymbolTable
    {
        public  Dictionary<string, SymbolNode> Variables = new Dictionary<string, SymbolNode>();
        public  Dictionary<string, SymbolFunctionNode> Functions = new Dictionary<string, SymbolFunctionNode>();
        public  Dictionary<string, SymbolNode> Directives = new Dictionary<string,SymbolNode>();

        public Analyser Analyser;

        public SymbolNode SearchSymbolTable(string key)
        {
            foreach (KeyValuePair<string, SymbolNode> symbols in Variables)
            {
                if(symbols.Key == key)
                {
                    return symbols.Value;
                }
            }
            foreach(KeyValuePair<string, SymbolFunctionNode> symbolFunctions in Functions)
            {
                if(symbolFunctions.Key == key)
                {
                    return symbolFunctions.Value;
                }
                else
                {
                    foreach (KeyValuePair<string, SymbolNode> param in symbolFunctions.Value.Paramaters)
                    {
                        if(param.Key == key)
                        {
                            return param.Value;
                        }
                    }
                }
            }
            return null;
        }
    }

    /// <summary>
    ///     A switch used to determine if there is a valid entrypoint into a <see cref="SymbolTable"/> collection.
    /// </summary>
    public partial class EntryPointCriteria
    {
        private bool MainFunctionExists { get; set; }
        private bool MainArgs { get; set; }

        public void SetMainFunctionExists(bool mainFunction)
        {
            MainFunctionExists = mainFunction;
        }

        public void SetMainArgs(bool mainArgs)
        {
            MainArgs = mainArgs;
        }

        public bool EntryPointFound()
        {
            if(MainFunctionExists && MainArgs)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
