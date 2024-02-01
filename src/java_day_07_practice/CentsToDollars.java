package java_day_07_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cents:");

        int cents = input.nextInt();

        int dollar;
        dollar=cents/100;
        int remainder;
        remainder=cents%100;

        input.close();

        System.out.println(cents + " cents" + " is equal to "+ dollar + " dollars and " + remainder + " cents");

    }
}
