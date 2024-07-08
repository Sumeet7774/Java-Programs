// Program to add 2 numbers by float value

import java.util.*;

class Addition
{
	public static void main(String args[])
	{
		float num1, num2, ans;
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		num1 = scan.nextFloat();
		
		System.out.println("Enter your second number: ");
		num2 = scan.nextFloat();
		
		ans = num1 + num2;
		System.out.print("The addition is: " + ans);
		
		scan.close();
	}
}