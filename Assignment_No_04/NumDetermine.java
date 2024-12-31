/*
19. Determine the type of number (even, odd, positive, negative, zero).
    - Example: If the number is -6, the output should be "Negative even number."
*/


import java.util.Scanner;

class NumDetermine
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number here");
	int num = sc.nextInt();
	
	if (num%2 == 0 && num < 0)
	{
	System.out.println("Negative Even number..");
	}
	else if (num%2 != 0 && num < 0)
	{
	System.out.println("Negative Odd number..");
	}
	else if (num%2 == 0 && num > 0)
	{
	System.out.println("positive Even number..");
	}
	else if (num%2 != 0 && num > 0)
	{
	System.out.println("Positive Odd number..");
	}
	else if (num == 0)
	{
	System.out.println("The number is Zero");
	}
	}
}