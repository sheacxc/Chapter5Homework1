/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description:
 */

import java.util.Scanner;
public class StringReader2 {
    public static String readString(Scanner sc) {
        //Asks the user to enter a string
        System.out.println("Enter a string: ");
        //Reads the input as a String named 'str'
        String str = sc.nextLine();
        //returns the string back to the user
        return str;
    }

    public static void main(String[] args) {
        //a scanner to read the input from the method
        Scanner sc = new Scanner(System.in);
        //calling the string from the method
        String str = readString(sc);
        //returning the string back to the user
        System.out.println(str);
    }
}