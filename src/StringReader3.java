/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description:
 */

import java.util.Scanner;
public class StringReader3 {
    public static String readString() {
        //create a scanner to read the inputs
        Scanner sc = new Scanner(System.in);
        //ask the user to enter the string
        System.out.println("Enter a string: ");
        //Reads the input as a string named 'str'
        String str = sc.nextLine();
        //returns the string
        return str;
    }

    public static void main(String[] args) {

    }
}
