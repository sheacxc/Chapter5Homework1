/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: create a code that asks for the name and address in one method, and the city nad state in another.
 * Then print out the full address in the main method.
 */

import java.util.Scanner;
public class GetAddress {
    //create a scanner to read the inputs
    static Scanner sc = new Scanner(System.in);
    //create the variable names for each needed part of the address.
    static String name;
    static String address;
    static String city;
    static String state;


    //method to enter the name and address
    public static void nameAddress(){
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your address: ");
        address = sc.nextLine();
    }

    //method to enter the city and state
    public static void cityState() {
        System.out.println("Enter your city: ");
        city = sc.nextLine();

        System.out.println("Enter your state: ");
        state = sc.nextLine();
    }

    //then the main that calls both methods and prints out the full address
    public static void main(String[] args) {
        nameAddress();
        cityState();
        System.out.println(address + " " + city + ", " + state );


    }
}
