package java_day_08_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RegularFormat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you first name:");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();
        input.close();

        String fullName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase()
                        + " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(fullName);

    }
}
