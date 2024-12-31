/*5. Determine the type of a triangle (equilateral, isosceles, or scalene) based on its side lengths.
   - Example: If the sides are 5, 5, and 8, the output should be "Isosceles Triangle."
*/


import java.util.Scanner;

class TriType
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the 1st side :");
	int num = sc.nextInt();
	
	System.out.println("Enter the 2nd side :");
	int num2 = sc.nextInt();
	
	System.out.println("Enter the 3rd side :");
	int num3 = sc.nextInt();
	
	if (num==num2 && num2==num3)
	{
	System.out.println("Isosceles Triagnle..");
	}
	else if (num == num2 || num2==num3||num==num3)
	{
	System.out.println("Equilateral Triagnle..");
	}
	else
	{
	System.out.println("Scalence Triagnle..");
	}
	
	}
}


