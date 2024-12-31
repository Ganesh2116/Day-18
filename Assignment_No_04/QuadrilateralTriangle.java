/*
16. Determine the type of quadrilateral (square, rectangle, parallelogram, trapezoid) based on side lengths and angles.
    - Example: If all sides are equal and all angles are 90 degrees, the output should be "Square."
*/

import java.util.Scanner;

class QuadrilateralTriangle
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the four angles");
	int ang1 = sc.nextInt();
	int ang2 = sc.nextInt();
	int ang3 = sc.nextInt();
	int ang4 = sc.nextInt();

	if (ang1 == ang2 && ang2 == ang3 && ang3 == ang4)
	{
	System.out.println("Square...");
	}
	else if (ang1 == ang3 && ang2 == ang4 )
	{
	System.out.println("Rectangle...");
	}
	else if(ang1 == ang2 && ang3 == ang4)
	{
	System.out.println("Parallelogram...");
	}
	else if (ang1 == ang2 || ang3 == ang4)
	{
	System.out.println("Trapexoid...");	
	}
	}

} 