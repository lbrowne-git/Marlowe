namespace Marlowe.Utilities
{
    public class SymbolNodeFactory
    {

        public ISymbolNode GetSymbolNode()
        {
            return new SymbolVariableNode();
        }
    }
}
