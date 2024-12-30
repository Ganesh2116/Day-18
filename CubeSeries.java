//3. Write a program to compute the series. 1 + 8 + 27 + 64 + ……..+ n

import java.util.Scanner;

class CubeSeries
{
	public static void main(String[] arge)
	{	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number ");	
	int num = sc.nextInt();
	
	for(int i =1;num>=i;i++)
	{
	int cubeseries = i*i*i;
	System.out.println(cubeseries);
	}
	}
}