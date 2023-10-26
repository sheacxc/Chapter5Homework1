/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: create a method that returns true if the string is a palindrome and false if not
 * resources:For this assignment, I used the previous Palindrome codes we created in class.
 */
import java.util.Scanner;
public class isPalindrome {
    public boolean isPalindrome(String str) {
        String result = "";

        //for loop to go through and check each letter
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //removes any character that is not a letter
            if ((ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z')) {
                continue;
            }
            result += Character.toLowerCase(ch);
        }

        //checks to see if the first and last are the same and so on in the input word
        int low = 0;
        int high = str.length() - 1;

        while (low < high) {
            //if they do not match, it returns that it is not a palindrome
            if (str.charAt(low) != str.charAt(high))
                return false;

            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a palindrome: ");
        String pal = input.nextLine().toLowerCase();

        boolean isPalindrome = true;
        if (isPalindrome) {
            System.out.println(pal + " is a Palindrome");
        } else {
            System.out.println(pal + " is not a Palindrome");
        }
    }
}