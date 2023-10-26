/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description:
 */

import java.util.Scanner;
public class StringReader4 {
    public static String readString(Scanner sc){
        //asks the user to enter a string and then names it
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        return str;
    }

    public static void main(String[] args) {
        //uses a scanner and then calls the method and prints the string
        Scanner sc = new Scanner(System.in);
        String str = readString(sc);
        System.out.println(str);
    }
}
