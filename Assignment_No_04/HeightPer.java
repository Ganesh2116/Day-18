/*10. Classify a person's height as short, average, or tall.
    - Example: If the height is 170 cm (short < 160, average < 180), the output should be "Average."
*/

import java.util.Scanner;

class HeightPer
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the person height:");
	int num = sc.nextInt();

	if(num < 160)
	{
	System.out.println("height is Short");
	}
	else if(num < 180)
	{
	System.out.println("height is Average");
	}
	else if(num < 200)
	{
	System.out.println("height is Tall");
	}
		}
}