/*6. Categorize a number as small, medium, or large based on given thresholds.
   - Example: If the number is 15 (thresholds: small < 10, medium < 20), the output should be "Medium."
*/

import java.util.Scanner;

class Thresholds
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	
	if (num <11)
	{
	System.out.println("Small");
	}
	else if (num <20)
	{
	System.out.println("Medium");
	}
	else
	{
	System.out.println("Large");
	}
}
}