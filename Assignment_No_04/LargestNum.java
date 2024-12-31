/*2. Find the largest of three numbers.
   - Example: If the numbers are 4, 9, and 2, the output should be "Largest number is 9."*/

import java.util.Scanner;

class LargestNum
{
	public static void main(String[] arge)
	{	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number;");
	int num1 = sc.nextInt();

	System.out.println("Enter the first number;");
	int num2 = sc.nextInt();

	System.out.println("Enter the first number;");
	int num3 = sc.nextInt();
	
	if ( num1>num2)
	{
	System.out.println("Largrest Number is "+num1);
	}
	else if ( num2>num3)
	{
	System.out.println("Largrest Number is "+num2);
	}
	else 
	{
	System.out.println("Largrest Number is "+num3);
	}
	
	}	
}