/*4. Check if a number is positive, negative, or zero.
   - Example: If the number is -5, the output should be "Number is negative."
*/

import java.util.Scanner;

class PosNegZero
{
	public static void main(String[] arge)	
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	if(num>0)
	{
	System.out.println("Number is +ve" + num);
	}
	else if(num<0)
	{
	System.out.println("Number is -ve" + num);
	}
	else if(num==0)
	{
	System.out.println("Number is zero");
	}
	
	}
}