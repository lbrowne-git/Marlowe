using System;

namespace Tester
{
	public class SampleClass
	{
		private string x = "hello ";
		private string y = "harry";

		public string z = x + y;

		public static void Main(string args)
		{
			string hello = FindName();
			string args = "hello";
			if(x == "hello " || y == "harry"){
				return "goodbye " + y;

			}
            
            {
				return "hello ";
            }
		}

		public string FindName()
        {
			return x;
        }
	}
}