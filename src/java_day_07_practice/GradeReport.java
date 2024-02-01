package java_day_07_practice;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");

        int grade = input.nextInt();

        if (grade >= 0 && grade <= 100) {
            if (grade <= 100 && grade >= 90) {
                System.out.println("Your grade is A");
            } else if (grade < 90 && grade >= 80) {
                System.out.println("Your grade is B");
            } else if (grade < 80 && grade >= 70) {
                System.out.println("Your grade is C");
            } else if (grade < 70 && grade >= 60) {
                System.out.println("Your grade is D");
            } else if (grade < 60 && grade >= 50) {
                System.out.println("Your grade is F");
            }else{
                System.out.println(" You failed.");
            }
        }else {
            System.out.println("Invalid Score.");
        }
        input.close();
    }
}
