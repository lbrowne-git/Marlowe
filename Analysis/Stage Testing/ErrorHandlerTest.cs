using System;
using System.Collections.Generic;
using System.Text;

namespace Marlowe.Tests
{
    public class ErrorHandlerTest : InterpeterStub
    {
        public ErrorHandlerTest()
        {
            Setup();
        }
        public override void Setup()
        {
            Logger = new StubLogger();
            base.Setup();
        }


        
    }
}
