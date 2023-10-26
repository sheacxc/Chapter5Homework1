/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: Write a method, getInput, that allows the user to enter a String and returns this value
 * to be printed using your printString method defined above.
 */

import java.util.Scanner;
public class UserInput {
    public String getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        return str;
    }

    public static void main(String[] args) {

    }
}
