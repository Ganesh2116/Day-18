// 1.Write a program to compute the series. 1 + 3 + 5 + 7 + 9 + ………..+ n

import java.util.Scanner;

class OddNumSeries
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	for(int i =1;num>i;i++)
	{
	if (i%2 != 0)
	{
	System.out.println(i);
	}
	}
	}
}