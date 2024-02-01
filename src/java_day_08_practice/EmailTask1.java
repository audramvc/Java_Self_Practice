package java_day_08_practice;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your email:");
        String email = input.nextLine();

        if (email.contains("_")){
            int emailUnderScore = email.indexOf("_") ;
            int emailAt = email.indexOf("@");
            email = email.substring(0,emailUnderScore) + email.substring(emailUnderScore,emailAt);
            email = email.substring(emailUnderScore + 1,emailAt) + "_" + email.substring(0,emailUnderScore) + "@gmail.com";
            System.out.println("Output: " + email);
        } else {
            System.out.println("Output: " + email);
        }
    }
}
