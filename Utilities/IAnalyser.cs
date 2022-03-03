using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace Marlowe.Utilities
{
    /*      *      *      *      *      *      *      *      *      *      *       *  
     *      Name:   Lewis Browne                                                   *
     *      Date:   26/01/2022                                                     * 
     *      Desc:   An interface allowing for instaction of lexer and parser       *
     *              between multiple classes                                       *
     *                                                                             *
     *     *      *      *      *      *      *      *      *      *      *        */ 
    public interface IAnalyser
    {
        Lexer Lexer { get; }
        Parser Parser { get; }
        CommonTokenStream CommonTokenStream { get; }
        IParseTreeVisitor<object?> Visitor { get; }
    }
}
