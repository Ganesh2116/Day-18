/*
13. Check the type of day (weekday, weekend, or holiday) based on a given day of the week.
    - Example: If the day is "Saturday," the output should be "Weekend."
*/

import java.util.Scanner;

class TypeDay
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Monday for enter :1 ");	
	System.out.println("Tuesday for enter :2 ");
	System.out.println("Wednesday for enter :3 ");
	System.out.println("Thursday for enter :4 ");
	System.out.println("Firday for enter :5 ");
	System.out.println("Saturday for enter :6 ");
	System.out.println("Sunday for enter :7 ");
	
	
	System.out.println("Enter here number: ");
	int sa = sc.nextInt();
	
	if (sa == 7)
	{
	System.out.println("Holiday..");
	}
	else if (sa == 1 || sa == 2 || sa == 3 || sa == 4 || 
	sa == 5 )
	{
	System.out.println("Weekday..");
	}
	else if (sa == 6)
	{
	System.out.println("Weekend");
	}
	}
}
