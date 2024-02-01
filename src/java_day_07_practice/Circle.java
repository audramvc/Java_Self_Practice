package java_day_07_practice;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // radius * (3.14 * radius) --> circle area formula
        // radius * 3.14 * 2 --> circle perimeter formula

        System.out.println("Enter the radius of the circle:");
        int radius = input.nextInt();
        //input.nextLine();
        System.out.println("The area of the Circle is " + radius * (3.14 * radius));
        System.out.println("The perimeter of the Circle is " + radius * 3.14 * 2);
        input.close();
    }
}
