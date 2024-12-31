/*
17. Categorize a person’s weight as underweight, normal, overweight, or obese based on BMI value.
    - Example: If BMI is 22 (normal 18.5-24.9), the output should be "Normal weight."
*/

import java.util.Scanner;

class PersonWeight
{

	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the height:");
	int heg = sc.nextInt();
	
	System.out.println("Enter the weights:");
	int weg = sc.nextInt();
	
	int bmi = heg/weg;
	
	if (bmi <= 18.5)
	{
	System.out.println("UnderWeight");
	}
	else if (bmi >= 19)
	{
	System.out.println("NormalWeight");
	}
	else if (bmi >=25)
	{
	System.out.println("OverWeight");
	}
	else 
	{
	System.out.println("Invaild Number...");
	}
	}
}
