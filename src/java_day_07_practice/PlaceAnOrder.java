package java_day_07_practice;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name:");
        String productName = input.nextLine();

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = input.nextInt();

        System.out.println("Enter your first name");
        String firstName = input.next();

        input.close();

        System.out.println(firstName + ", your oder for " + quantity + " "  + productName
                        + " has been placed. Your total is " + quantity * price);

    }
}
