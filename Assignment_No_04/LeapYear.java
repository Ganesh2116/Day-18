/*
9. Check if a year is a leap year, century year, or a regular year.
   - Example: If the year is 1900, the output should be "Century year."
*/


import java.util.Scanner;

class LeapYear
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the year:");
	int num = sc.nextInt();
	
	if (num%100 == 0)
	{
	System.out.println("This is Century year");
	}
	else if (num%4 == 0)
	{
	System.out.println("This is Leap year");
	}
	else 
	{
	System.out.println("This is Regular year");
	}
	
	}
}