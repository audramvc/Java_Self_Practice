package java_day_07_practice;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your gender:");
        String gender = input.next();
        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state name:");
        String stateName = input.next();

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();

        input.close();

        System.out.println("Full name: " + fullName + "\nAge: " + age + "\nGender: " + gender
                + "\nPhone number: " + phoneNumber + "\nAddress:\n\t" + buildingNumber + " "
                + streetName + "\n\t" + cityName + ", " + stateName + " " + zipCode);


    }
}
