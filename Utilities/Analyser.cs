using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace Marlowe.Utilities
{

    /// <summary>
    /// An intermediary layer for all <see cref="Antlr4.Runtime"/> Lexers and Parsers. It provides connections to abstract implementation of ANTLR4's run time libraries, which can be used to extend this analyser for any language built this way.
    /// </summary>
    public abstract class Analyser
    {
        public virtual AntlrInputStream Stream { set; get; }



        /// <summary>
        /// <see langword="abstract"/> <see cref="Antlr4.Runtime.Lexer"/> to be substituted with any <see href="https://www.antlr.org/">ANTLR</see> generated Lexers.
        /// </summary>
        public virtual Lexer Lexer { set; get; }


        /// <summary>
        /// <see langword="abstract"/> <see cref="Antlr4.Runtime.Parser"/> to be substituted with any <see href="https://www.antlr.org/">ANTLR</see> generated parsers.
        /// </summary>
        public virtual Parser Parser { set; get; }


        /// <summary>
        /// <see langword="abstract"/> <see cref="Antlr4.Runtime.Tree.IParseTreeVisitor{Result}"/> to be substituted with any <see href="https://www.antlr.org/">ANTLR</see> generated visitors.
        /// </summary>
        public virtual IParseTreeVisitor<object> Visitor { set; get; }


        public virtual CommonTokenStream CommonTokenStream { set; get; }

    }
}
