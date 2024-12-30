//reverse num

import java.util.Scanner;

class ForLoopRev
{

	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();

	for(; 0< num;num--)
	{
	
	System.out.println(num);
	}
	}
}