/*3. Assign a letter grade (A, B, C, D, F) based on a given score.
   - Example: If the score is 85, the output should be "Grade is B."
*/


import java.util.Scanner;

class LetterGrade
{
	public static void main(String[] arge)
	{	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the score:");
	int num = sc.nextInt();

		
	if ( num>90)
	{
	System.out.println("Grade A"+num);
	}
	else if ( num>80)
	{
	System.out.println("Grade B"+num);
	}
	else if (num>70)
	{
	System.out.println("Grade C"+num);
	}
	else if (num>60)
	{
	System.out.println("Grade D"+num);
	}
	else if (num>50)
	{
	System.out.println("Grade E"+num);
	}
	else if (num>40)
	{
	System.out.println("Grade F"+num);
	}
	else if (num>35)
	{
	System.out.println("Grade G");
	}
	else
	{
	System.out.println("Faild....");
	}

	
	}	
}