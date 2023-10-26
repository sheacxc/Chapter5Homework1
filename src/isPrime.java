/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: create a code that checks whether the input number is even or odd
 * resources:
 *  Scanner sc= new Scanner(System.in);
 *         System.out.println("Enter an integer: ");
 *         int num= sc.nextInt();
 *         if(num%2!=0 || num%3!=0){
 *             System.out.println(num + " is a prime number.");
 *         } else{
 *             System.out.println(num + " is not a prime number.");
 */

import java.util.Scanner;
public class isPrime {
    public static boolean isPrime(int num){
        //checks if the num is less than or equal to 1
        if( num <= 1){
            return false;
        }
        //checks if the number is divisible by 2 or 3
        if( num % 2 == 0 || num % 3 == 0){
            //then checks if the num is divisible by 5
            return false;
        } else {
            return true;
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrimeAnswer = isPrime(num);
        if(isPrimeAnswer){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
