//2. Write a program to compute the series. 1 + 4 + 9 + 16 + ……..+ n

import java.util.Scanner;

class SquareSeries
{
	public static void main(String[] arge)
	{	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number ");	
	int num = sc.nextInt();
	
	for(int i =1;num>=i;i++)
	{
	int cubeseries = i*i;
	System.out.println(cubeseries);
	}
	}
}
