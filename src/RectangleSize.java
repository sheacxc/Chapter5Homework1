/**
 * Name: Andrea Caldcleugh
 * Course: ITEC 2140 - Section 13
 * Description: create a code that calculates teh area of a rectangle and then returns whether the rectangle is
 * large or small depending on if the area is greater than or less than 300.
 */

import java.util.Scanner;
public class RectangleSize {
    static double width;
    static double height;

    //calculates the area
    public static double calculateArea() {
        double area = height * width;
        return area;
    }

    //decides whether the rectangle is large or not. Considered large if the area is greater than 300
    public static boolean isLarge() {
        double area = calculateArea();
        return area >300;
    }

    //depending on the answer from isLarge, this will print if it is a large or small rectangle
    public static void printSize( boolean isLarge) {
        if( isLarge ){
            System.out.println("This is a large rectangle");
        } else {
            System.out.println("This is a small rectangle");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rectangles height: ");
        double height = sc.nextDouble();

        System.out.println("Enter the rectangles width: ");
        double width = sc.nextDouble();

        System.out.println("Area: " + width * height);



    }
}
