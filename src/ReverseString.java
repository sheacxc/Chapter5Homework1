/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: Create a method reverseString which takes a String as a parameter
 * and returns a String with all the characters reversed.
 * resources: https://www.geeksforgeeks.org/reverse-a-string-in-java/
 */
import java.util.Scanner;
public class ReverseString {
    public static String reverseString(String input) {
        //this is what goes through and reverses the input
        StringBuilder reverse = new StringBuilder(input);
        return reverse.reverse().toString();
    }

    public static void main(String[] args) {
        //then this allows the user to input and then prints the original and the reversed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String sent = sc.nextLine();


        System.out.println("Original: " + sent);
        System.out.println("Reversed: " + reverseString(sent));
    }
}
