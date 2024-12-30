//4. Write a program to compute the series. 1 + 3 + 6 + 10 + ………..+ n

import java.util.Scanner;

class PlusSeries
{
	public static void main(String[] arge)
	{	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number ");	
	int num = sc.nextInt();
	
	int fterm = 0;

	for(int i =1;num>=i;i++)
	{
	fterm = fterm+i;
	System.out.println(fterm);
	}
	}
}
