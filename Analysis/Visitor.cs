using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Analysis
{
    public class Visitor : CSharpParserBaseVisitor<object?>
    {
        public RuleContext ruleContext;
        public Dictionary<string, object> Variables { get; } = new Dictionary<string, object>();

        public override object VisitAssignment([NotNull] CSharpParser.AssignmentContext context){
            var varName = context.GetText();
            var value = Visit(context.expression());
            Variables[varName] = value;
            return null;
        }

        public override object VisitCompilation_unit([NotNull] CSharpParser.Compilation_unitContext context)
        {
            var varName = context.GetText();
            var value = Visit(context);
            Variables[varName] = value;
            return null;
        }

        internal Dictionary<string, object> getTokens()
        {
            return Variables;
        }
    }
}
