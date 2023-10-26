/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: Check whether a number is even or odd
 */

import  java.util.Scanner;
public class EvenNumber {

    public static boolean isEven( int num){
        //if statement to check if the number is even
        if(num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void printEven(boolean isEven) {
        //if the isEven boolean is true it will print "is even"
        if (isEven) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public static void main(String[] args) {
        //in order to read the input
        Scanner sc = new Scanner(System.in);
        //asks the user to enter their number
        System.out.println("Enter a number: ");
        //reads the input as a integer called 'num'
        int num = sc.nextInt();
        //calls the method printEven to know if it prints "is Even" or "is Odd"
        boolean isInputEven = isEven(num);
        //prints the output
        printEven(isInputEven);
        }
    }
