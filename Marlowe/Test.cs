using System;

namespace Tester
{
	public class SampleClass
	{
		private static string y = "hello";
		private int x = 1;
		public static void Main(string args)
		{
			int z = MyAge();
			y = "Lewis";
		}

		public string MyName()
        {
			return "Lewis";
        }

		public int MyAge()
        {
			return 23;
        }
	}
}