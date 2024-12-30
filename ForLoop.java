//for loops useing table 

import java.util.Scanner;
class ForLoop
{

	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();

	for(int i =1; i<=10;i++)
	{
	int mu = num *i;
	System.out.println(mu);
	}
	}
}