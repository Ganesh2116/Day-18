/*
15. Classify an angle as acute, right, obtuse, or straight based on its degree measure.
    - Example: If the angle is 45 degrees, the output should be "Acute angle."
*/

import java.util.Scanner;

class CheckTriangle
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the angle Degree :");
	int ang = sc.nextInt();
	
	if (ang == 45 )
	{
	System.out.println("Acute angle.");
	}
	else if (ang == 60 )
	{
	System.out.println("Right angle.");
	}
	else if(ang == 90)
	{
	System.out.println("Obtuse angle.");	
	}
	else if(ang == 180)
	{
	System.out.println("Straight angle.");
	}
	else 
	{
	System.out.println("Invaild Number...");
	}
	}
}