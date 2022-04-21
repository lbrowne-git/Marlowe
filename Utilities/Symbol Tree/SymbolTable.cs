using System.Collections.Generic;

namespace Marlowe.Utilities
{
    /// <summary>
    ///  Returns an <see langword="abstract"/> class containing collections of <see cref="ISymbolNode"/>s with different class properties.
    /// </summary>
    public abstract class SymbolTable
    {
        public  Dictionary<string, SymbolNode> Variables = new Dictionary<string, SymbolNode>();
        public  Dictionary<string, SymbolNode> Functions = new Dictionary<string, SymbolNode>();
        public  Dictionary<string, SymbolNode> Directives = new Dictionary<string,SymbolNode>();

        public readonly Analyser Analyser;

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
