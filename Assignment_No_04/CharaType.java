/*
7. Check if a character is a vowel, consonant, digit, or special character.
   - Example: If the character is 'e', the output should be "Vowel."
*/

import java.util.Scanner;

class CharaType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char num = sc.next().charAt(0);

        if (num >= '0' && num <= '9') {
        System.out.println("This is a Digit");
        }
        else if (num == '@' || num == '#' || num == '$' || num == '%' || num == '&') {
        System.out.println("This is a special character");
        }

        else if (num == 'a' || num == 'e' || num == 'i' || num == 'o' || num == 'u' ||
                 num == 'A' || num == 'E' || num == 'I' || num == 'O' || num == 'U') {
        System.out.println("This is a vowel");
        }
 
        else if ((num >= 'a' && num <= 'z') || (num >= 'A' && num <= 'Z')) {
            System.out.println("This is a consonant");
        } 
	else {
            System.out.println("Invalid input");
        }

       
    }
}
