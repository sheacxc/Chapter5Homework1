/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description:
 */

import java.util.Scanner;
public class StringReader {
    public static String readString() {
        //create a scanner to read the inputs
        Scanner sc = new Scanner(System.in);
        //ask the user to enter the string
        System.out.println("Enter a String:");
        //reads the user input as a String named 'str'
        String str = sc.nextLine();
        return str;
    }

    public static void main(String[] args) {
        //call the method
        String str = readString();
        //returns the string back to the user
        System.out.println(str);
    }
}
