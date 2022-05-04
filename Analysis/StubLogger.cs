using Marlowe.Logger;
using Marlowe.Utilities;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Tests
{
    internal class StubLogger : ILogger
    {

        public List<object> MessageCall = new List<object>();
        void ILogger.LogSymbolTable(SymbolTable symbolTable)
        {
            MessageCall.Add(symbolTable);
        }

        void ILogger.WriteClassTable(SymbolTable symbolTable)
        {
            MessageCall.Add(symbolTable);
        }

        void ILogger.WriteContent(string content)
        {
            MessageCall.Add(content);
        }

        void ILogger.WriteContent(string content, ILogger.Levels level)
        {
            MessageCall.Add(content);
        }

        void ILogger.WriteFunctionNode(IDictionary<string, SymbolFunctionNode> dictonary, string header)
        {
            MessageCall.Add(dictonary);
        }

        void ILogger.WriteHeader(string heading)
        {
            MessageCall.Add(heading);
        }

        void ILogger.WriteHeader(string heading, ILogger.Levels level)
        {
            MessageCall.Add(heading);
        }

        void ILogger.WriteSymbolNode(IDictionary<string, SymbolNode> dictonary, string header)
        {
            MessageCall.Add(dictonary);
        }
    }
}
