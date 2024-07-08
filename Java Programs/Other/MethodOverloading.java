class MethodOverloading
{
	static int addition(int a,int b)
	{
		return a+b;
	}
	
	static double addition(double num1,double num2)
	{
		return num1+num2;
	}

	static String addition(String str1, String str2)
	{
		return str1+str2;
	}

	public static void main(String args[])
	{
		int a = 10;
		int b = 10;
		double num1 = 20.0;
		double num2 = 20.0;
		String str1 = "Hello";
		String str2 = "World";

		int result1 = addition(a, b);
    		double result2 = addition(num1, num2);
    		String result3 = addition(str1, str2);
	
    		System.out.println("Result 1: " + result1);
    		System.out.println("Result 2: " + result2);
    		System.out.println("Result 3: " + result3);
	}
}