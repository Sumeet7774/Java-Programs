// Write a program to find the greatest of 3 numbers by taking value from user

import java.util.*;

class Greatest
{
	public static void main(String args[])
	{
		int a,b,c,max;

		Scanner scan =  new Scanner(System.in);

		System.out.print("Enter your first number: ");
		a = scan.nextInt();
		
		System.out.print("Enter your second number: ");
		b = scan.nextInt();

		System.out.print("Enter your third number: ");
		c = scan.nextInt();

		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);	

		System.out.println("Maximum number is: " + max);
		scan.close();
	}
}