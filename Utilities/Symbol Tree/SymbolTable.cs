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

        public SymbolNode SearchSymbolTable(string key, string className)
        {
            foreach (KeyValuePair<string, SymbolNode> symbols in Variables)
            {
                if (symbols.Key == key && symbols.Value.ClassName == className)
                {
                    return symbols.Value;
                }
            }
            foreach (KeyValuePair<string, SymbolFunctionNode> symbolFunctions in Functions)
            {
                if (symbolFunctions.Key == key && symbolFunctions.Value.ClassName == className)
                {
                    return symbolFunctions.Value;
                }
                else
                {
                    foreach (KeyValuePair<string, SymbolNode> param in symbolFunctions.Value.Paramaters)
                    {
                        if (param.Key == key && symbolFunctions.Value.ClassName == className)
                        {
                            return param.Value;
                        }
                    }
                }
            }
            return null;
        }
        public List<string> GatherNamespaces()
        {
            List<string> Namespaces = new List<string>();
            foreach (var variables in Variables)
            {
                try
                {       //Exists to catch variables without a namespace
                    if (!Namespaces.Contains(variables.Value.Namespace))
                    {
                        Namespaces.Add(variables.Value.Namespace);
                    }
                }
                catch
                {

                }
                
            }
            foreach (var function in Functions)
            {
                if (!Namespaces.Contains(function.Value.Namespace))
                {
                    Namespaces.Add(function.Value.Namespace);
                }
            }
            return Namespaces;
        }
        public List<string> GatherClasses()
        {
            List<string> Classes = new List<string>();
            foreach (var variables in Variables)
            {
                try
                {       // Exists to catch Variables without classes
                    if (!Classes.Contains(variables.Value.ClassName))
                    {
                        Classes.Add(variables.Value.ClassName);
                    }
                }
                catch
                {

                }
                
            }

            foreach (var functions in Functions)
            {
                if (!Classes.Contains(functions.Value.ClassName))
                {
                    Classes.Add(functions.Value.ClassName);
                }
            }
            return Classes;
        }

        public List<SymbolTable> SortSymbolTableToClassTables()
        {
            List<string> Namespaces = GatherNamespaces();
            List<string> Classes = GatherClasses();
            List<SymbolTable> symbolTables = new List<SymbolTable>();
            foreach (var bufferSymbolTable in Variables)
            {
                foreach (string Class in Classes)
                {
                    foreach (var variables in Variables)
                    {
                        if (variables.Value.ClassName == Class)
                        {
                        }
                    }
                    foreach (var function in Functions)
                    {

                    }

                }
            }
            return symbolTables;
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
