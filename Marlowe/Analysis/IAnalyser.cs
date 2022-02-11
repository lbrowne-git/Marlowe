using Antlr4.Runtime;

namespace Marlowe.Analysis
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
        CSharpLexer Lexer { get; }
        CodeParser Parser { get; }
        CommonTokenStream CommonTokenStream { get; }
        Visitor Visitor { get; }
    }
}
