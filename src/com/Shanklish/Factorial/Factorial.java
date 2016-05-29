package com.Shanklish.Factorial;
import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		String choice = "y";
			
		do 
			{			
			
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please enter an integer from 1 to 10");
				int n = scan.nextInt();
				
				String garbage = scan.nextLine(); // Catches empty line 
				
				long x = (int)(myFactorial(n));
				
				System.out.println("The factorial of " + n + " is " + x + ". Would you like to enter another integer? (y/n)");
				choice = scan.nextLine();
					
			}   while (choice.equalsIgnoreCase("y"));
	}
	
	// Recursive Method to return a Factorial
	static int  myFactorial(int n)
	{
		if (n==1)
			return 1;
		else 
		{
			return n * myFactorial(n-1);
		}
		
	}

}
