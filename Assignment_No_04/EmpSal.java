/*
12. Categorize an employee's salary into low, medium, or high based on given thresholds.
    - Example: If the salary is $50,000 (low < $30,000, medium < $70,000), the output should be "Medium salary."
*/

import java.util.Scanner;
	
class EmpSal
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);	

	System.out.println("Enter the employee salary ");
	int num = sc.nextInt();
	
	if(num < 30000)
	{
	System.out.println("Salary is Low ");
	}else if(num < 70000)
	{
	System.out.println("Salary is Medium ");
	}else if(num < 80000)
	{
	System.out.println("Salary is High");
	} 	
	}
}