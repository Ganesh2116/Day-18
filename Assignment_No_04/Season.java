/*
11. Determine the season (winter, spring, summer, fall) based on a given month.
    - Example: If the month is 12 (December), the output should be "Winter."
*/

import java.util.Scanner;

class Season
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the month ");
	int num = sc.nextInt();
	
	if(num == 10 || num == 11 || num == 12)
	{
	System.out.println("Winter");
	}
	else if(num == 1 || num == 2 || num == 3)
	{
	System.out.println("Spring ");
	}
	else if(num == 4 || num == 5 || num == 6)
	{
	System.out.println("Summer");
	}
	else if(num == 7 || num == 8 || num == 9)
	{
	System.out.println("Fall");
	}
	}
}