/*
20. Determine the appropriate clothing suggestion (light, moderate, heavy) based on the temperature.
    - Example: If the temperature is 5°C (light > 20, moderate 10-20), the output should be "Heavy clothing."
*/

import java.util.Scanner;

class ClothSug
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the temperature here :");
	int tep = sc.nextInt();
	
	if (tep <10)
	{
	System.out.println("Heavy clothing...");
	}
	else if (tep < 20)
	{
	System.out.println("Moderate clothing...");
	}
	else if (tep < 30  )
	{
	System.out.println("Light clothing...");
	}
	}
}