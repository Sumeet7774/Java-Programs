// Program to add 2 numbers

import java.util.*;

class Add
{
	public static void main(String args[])
	{
		int num1, num2, ans;
		
		Scanner scan =  new Scanner(System.in);
		System.out.print("Enter your first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter your second number: ");
		num2 = scan.nextInt();
		
		ans = num1 + num2;
		System.out.print("The addition is: " + ans);
		scan.close();
	}
}