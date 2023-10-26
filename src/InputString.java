/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: ask the user to input a string and then return it back to them
 */

import java.util.Scanner;
public class InputString {
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine();
        return sent;
        // this allows for the user to enter the string
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String userInput = getString();
        System.out.println(userInput);
        //this then returns the string back to them
    }

}
