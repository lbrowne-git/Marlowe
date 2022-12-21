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
            files.Add(SourceConstructor.GenerateNamespaceWithUsingDirectives("dummyNamesapce", "dummyClass", "system"));
            ExecuteAnalyser(files);
        }



    }
}
