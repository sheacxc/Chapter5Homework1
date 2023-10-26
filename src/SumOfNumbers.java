/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: Create a method named sum that takes two numbers and returns the sum of these two numbers.
 */

import java.util.Scanner;
public class SumOfNumbers {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public int sum2(int num1 , int num2){
        return num1 + num2;
    }
    public double sum3( double num1, double num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num: ");
        int num1 = sc.nextInt();

        System.out.println("Enter your second num: ");
        int num2 = sc.nextInt();

        //System.out.println("Sum of int: " +  );
        //System.out.println("Sum of double " + );

    }
}
