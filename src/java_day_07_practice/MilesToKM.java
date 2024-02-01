package java_day_07_practice;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles:");
        double miles = input.nextDouble();

        double kilometers = miles * 1.61;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");

    }
}
