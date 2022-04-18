using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace Marlowe.Utilities
{

    /**
     *      An intermediary layer for all Lexers and Parsers. it provides connections
     *          to abstract implementation of ANTLR4's run time libraries, which
     *          can be used to extend this analyser for any language built this way.
     */
    public abstract class Analyser
    {
        public virtual AntlrInputStream Stream { set; get; }
        public virtual Lexer Lexer { set; get ; }
        public virtual Parser Parser { set; get; }
        public virtual IParseTreeVisitor<object?> Visitor { set;get ; }
        public virtual CommonTokenStream CommonTokenStream { set; get ; }

        public int MyProperty { get; set; }
    }
}
