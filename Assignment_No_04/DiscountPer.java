/*
14. Determine the discount percentage based on the total purchase amount.
    - Example: If the amount is $250 (discount: 10% for $100-$500), the output should be "Discount is 10%."
*/

import java.util.Scanner;

class DiscountPer
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter amount here :");
	int num = sc.nextInt();
	
	if(num <= 500)
	{
	System.out.println("Discount is 10%");
	}
	else if(num <= 1000)
	{
	System.out.println("Discount is 20%");
	}
	else if(num <= 1500)
	{
	System.out.println("Discount is 30%");
	}
	}
}