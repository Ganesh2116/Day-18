/*
8. Determine the month name based on a given number (1 for January, 2 for February, etc.).
   - Example: If the input is 7, the output should be "July."
*/

import java.util.Scanner;

class Months
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num  = sc.nextInt();
	
	if(num == 1)
	{
	System.out.println("jan");
	}
	else if(num == 2)
	{
	System.out.println("feb");
	}
	else if(num == 3)
	{
	System.out.println("march");
	}
	else if(num == 4)
	{
	System.out.println("April");
	}
	else if(num == 5)
	{
	System.out.println("may");
	}
	else if(num == 6)
	{
	System.out.println("jun");
	}
	else if(num == 7)
	{
	System.out.println("july");
	}
	else if(num == 8)
	{
	System.out.println("Aug");
	}
	else if(num == 9)
	{
	System.out.println("Sep");
	}
	else if(num == 10)
	{
	System.out.println("Oct");
	}
	else if(num == 11)
	{
	System.out.println("Nov");
	}
	else if(num == 12)
	{
	System.out.println("Dec");
	}
	else
	{
	System.out.println("Invaild number...");
	}
	}
}