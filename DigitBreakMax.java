// digit break and max number 

import java.util.Scanner;
	
class DigitBreakMax
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	int rem =0;
	int count =0;
	int max=0;
	int secmax =0;
	
	
	while(num !=0)
	{
	rem = num% 10;
	if (rem>max )
	{
	secmax = max;
	max= rem;
	
	}
	else if(rem >secmax && rem!= max )
	{
	secmax = rem;
	}
	num = num /10;
	}
	System.out.println("max of digit:"+max);
	System.out.println("Secmax of digit:"+secmax);
	}

}