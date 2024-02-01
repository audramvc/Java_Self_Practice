package java_day_08_practice;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email:");

        String email = input.nextLine();
        input.close();

        if (email.contains("_") && email.contains("@") && email.contains(".")) {
            int underscore = email.indexOf("_");
            int at = email.indexOf("@");
            int domain = email.indexOf(".");
            if (underscore < at && at < domain) {
                String Firstname = email.substring(0, underscore);
                String Lastname = email.substring(underscore + 1, at);
                String Domain = email.substring(at + 1, domain);

                System.out.println("Firstname : " + Firstname);
                System.out.println("Lastname : " + Lastname);
                System.out.println("Domain : " + Domain);

            } else {
                System.out.println("pls re-enter");
            }
        }
    }
}
