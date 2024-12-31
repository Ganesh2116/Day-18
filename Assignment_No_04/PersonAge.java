/*1. Classify a person's age into child, teenager, adult, or senior.
   - Example: If the age is 15, the output should be "Teenager."*/

import java.util.Scanner;

class PersonAge
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the person age :");
	int age = sc.nextInt();
	
	if (age<=12)
	{
	System.out.println("Child...");
	}
	else if (age<=20)
	{
	System.out.println("Teenager...");
	}
	else if (age<=40)
	{
	System.out.println("Adult...");
	}
	else if (age<=110)
	{
	System.out.println("Senior...");
	}
	else if(110 >= age)
	{
	System.out.println("Invaild number...");
	}

	}
}