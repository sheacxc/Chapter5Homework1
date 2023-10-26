/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: create a code that asks for the name and the high score and then prints them out in the main
 */

import java.util.Scanner;
public class GetGameScore {
    static Scanner sc = new Scanner(System.in);
    public static String userName() {
        //to enter the name
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        return name;
    }

    public static int userScore() {
        //to enter the high score
        System.out.println("Enter your high score: ");
        int score = sc.nextInt();
        return score;
    }

    public static void printScore() {
        //method to actually print the name and the high score
        String name = userName();
        int score = userScore();
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        //then the main calls the methods and returns the name and high score entered
        printScore();


    }
}
