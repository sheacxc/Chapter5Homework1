/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: Ask the user for a number, and generate the Fibonacci sequence with that many numbers
 * resources: used this code from the previous assignment:
 * int num1=0;
 *         int num2=1;
 *         int num3;
 *         int count=30;
 *         System.out.print(num1 + " " + num2);
 *         int i;
 *         for (i=2; i<=count; ++i){
 *             num3= num2 + num1;
 *             System.out.print(" " + num3);
 *             num1=num2;
 *             num2=num3;
 *             }
 */


import java.util.Scanner;
public class Fibonacci {
    public static void printFib( int n) {
        //assigns 0 to the first number
        int num1 = 0;
        //assigns 1 to the second number
        int num2 = 1;

        //prints out the first two numbers of the code so far
        System.out.print(num1 + " " + num2);

        int i;
        //for loop so that the code will continue to add the previous number together for as many times the user inputs
        for( i=2; i <= n; ++i){
            int num3 = num2 + num1;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sequence = true;

        //while loop so that the user can do however many sequences they choose
        while(sequence){
            System.out.println("Enter the amount of fibonacci numbers you would like to generate.");
            int n = sc.nextInt();

            printFib(n);

            System.out.println("\n Do you want to print another sequence?");
            String answer = sc.nextLine();
            sequence = answer.equals("yes");

        }

    }
}
