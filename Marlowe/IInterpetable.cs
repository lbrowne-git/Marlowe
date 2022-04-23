using System.Collections.Generic;

namespace Marlowe
{
    internal interface IInterpetable
    {
        void Execute();
        List<object> GenerateClassContext();
    }
}