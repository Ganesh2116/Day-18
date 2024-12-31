/*
18. Assign a tax rate based on income levels.
    - Example: If income is $75,000 (tax rate: 20% for $50,000-$100,000), the output should be "Tax rate is 20%."
*/

import java.util.Scanner;

class TaxRate
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);	

	System.out.println("Enter the income here :");
	int inco = sc.nextInt();
	
	if (50000 >inco)
	{
	System.out.println("Tax NOT applied ..");
	}
	else if (50000 <= inco && inco <= 100000 )
	{
	System.out.println("Tax rate 20%");
	}
	else if (100000 <= inco && inco <= 150000 )
	{
	System.out.println("Tax rate 30%");
	}
	else if (150000 <= inco && inco <= 200000 )
	{
	System.out.println("Tax rate 40%");
	}
	else {
	System.out.println("Tax rate 50%");
	}
	}
}