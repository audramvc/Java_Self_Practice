package java_day_07_practice;

import java.util.Scanner;

public class FamilyMembers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int peopleNumber = input.nextInt();
        if (peopleNumber < 3){
            System.out.println("Live with less than three people.");
        } else if (3 <= peopleNumber && peopleNumber <= 6) {
            System.out.println("Live with 3 - 6 people.");
        }else {
            System.out.println("Live with more than six people.");
        }
        input.close();

    }
}
