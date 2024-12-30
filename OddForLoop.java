// odd number 1 to n

import java.util.Scanner;

class OddForLoop
{
	public static void main(String[] arge)
	{	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the list number");
	int num = sc.nextInt();

	for (;num>=0;num++)
	{
	if(num%2 !=0){
	System.out.println(num);
	}
	}
	}
}