// digit break and min number 

import java.util.Scanner;
	
class DigitBreakMin
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	int rem =0;
	int count =0;
	int min=9;
	int secmin =8;
	
	
	while(num !=0)
	{
	rem = num% 10;
	if (rem<min && rem != 0 )
	{
	secmin = min;
	min= rem;
	
	}
	else if(rem <secmin && rem!= min)
	{
	secmin = rem;
	}
	num = num /10;
	}
	System.out.println("min of digit:"+min);
	System.out.println("Secmin of digit:"+secmin);
	}

}