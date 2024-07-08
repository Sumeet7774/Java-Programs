// Program to find the next meaning it will print the line until we wont press enter

import java.util.*;

class Next
{
	public static void main(String args[])
	{
		String a;
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Enter your line: ");
		a = scanner.next();
		
		System.out.print("Your entered line is: " + a);
		scanner.close();
	}
}