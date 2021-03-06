using Antlr4.Runtime;
using Marlowe.CSharp;
using Marlowe.Logger;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;



namespace Marlowe
{
    /// <summary>
    ///     The executation engine of <see cref="Marlowe"/>. Interprets the content
    ///     generated by the Symbol Table collection and attempts to execute the codes entrypoint.
    /// </summary>
    internal class Interpeter : ComputableAPI, IInterpetable
    {
        private static List<SymbolTable> SymbolTables = new List<SymbolTable>();
        private readonly EntryPointCriteria Criteria;
        private SymbolTable EntryPoint;
        private SymbolFunctionNode MainFunction;

        public Interpeter(List<SymbolTable> symbolTables)
        {
            Criteria = new EntryPointCriteria();
            SymbolTables = symbolTables;
        }
        public Interpeter(List<SymbolTable> symbolTables, ILogger logger)
        {
            Criteria = new EntryPointCriteria();
            SymbolTables = symbolTables;
            Logger = logger;
        }

        /// <summary>
        ///     Executes the Interpeter engines. discovers entrypoint into the provided code and
        ///     intepeters the context.
        /// </summary>
        public void Execute()
        {
            if (HasEntryPoint())
            {

                AddUsingDirective();
                // Executes Entrypoint methods.
                CSharpVisitor visitor = (CSharpVisitor)EntryPoint.Analyser.Visitor;
                visitor.criteria = Criteria;
                visitor.ClassName = MainFunction.ClassName;
                visitor.Namespace = MainFunction.Namespace;
                visitor.VisitMethod_body((CSharpParser.Method_bodyContext)MainFunction.RuleContext);
                if (Logger != null)
                {
                    List<object> newClassObjects = new List<object>();
                    object newType = SymbolNodeToClassBuilder.CreateNewObject(visitor);
                    newClassObjects.Add(newType);
                    //Console.WriteLine("Sucessfully created class \t" + newType.GetType() + " \nIt has the following properities:");
                    //foreach (var item in newClassObjects.GetType().GetProperties()){
                    //    Console.WriteLine(item);
                    
                    //Logger.LogSymbolTable(visitor);


                }
                

                //foreach (KeyValuePair<string, SymbolNode> directives in EntryPoint.Directives)
                //{
                //    SearchSymbolTable(directives.Key);

                //}

            }

            else
            {
                if (Logger != null)
                {
                    Logger.WriteContent("No EntryPoint exists in this code.");
                    if(SymbolTables.Count > 0)
                    {
                        foreach (SymbolTable symbolTable in SymbolTables)
                        {
                            Logger.LogSymbolTable(symbolTable);
                        }
                    }
                }
            }

        }

        private void AddUsingDirective()
        {
            foreach (var directive in EntryPoint.Directives)
            {
                foreach (var SymbolTable in SymbolTables)
                {
                    foreach (var item in SymbolTable.Variables)
                    {
                        if(item.Value.Namespace == directive.Key)
                        {
                            EntryPoint.Variables.Add(item.Key, item.Value);
                        }
                    }
                    foreach (var item in SymbolTable.Functions)
                    {
                        if (item.Value.Namespace == directive.Key)
                        {
                            EntryPoint.Functions.Add(item.Key, item.Value);
                        }
                    }
                }
            }
        }

        public List<object> GenerateClassContext()
        {
            List<object> newClassObjects = new List<object>();
            foreach (SymbolTable symbolTable in SymbolTables)
            {
                object newType = (SymbolNodeToClassBuilder.CreateNewObject(symbolTable));
                newClassObjects.Add(newType);
                Console.WriteLine("Sucessfully created class \t" + newType.GetType() + " \nIt has the following properities:");

            }
            return newClassObjects;
        }
        private bool HasEntryPoint()
        {
            foreach (SymbolTable symbolTable in SymbolTables)
            {
                foreach (KeyValuePair<string, SymbolFunctionNode> functions in symbolTable.Functions)
                {
                    if (functions.Key.ToUpper().Equals("MAIN")) // Checks for main function in class
                    {
                        SymbolFunctionNode paramatars = (SymbolFunctionNode)functions.Value;
                        Criteria.SetMainFunctionExists(true);
                        foreach (KeyValuePair<string, SymbolNode> param in paramatars.Paramaters)
                        {
                            if (param.Key.ToUpper().Equals("ARGS") && param.Value.Type == typeof(string))   // Checks for string args array
                            {
                                Criteria.SetMainArgs(true);
                                MainFunction = functions.Value;
                                break;
                            }
                            else
                            {
                                Criteria.SetMainFunctionExists(false);
                            }
                        }
                    }
                }
                if (Criteria.EntryPointFound())
                {
                    EntryPoint = symbolTable;
                    break;
                }
            }
            return Criteria.EntryPointFound();
        }
    }
}
