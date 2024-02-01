package java_day_08_practice;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first words:");
        String twoWords = input.next();
        String twoWords1 = twoWords.substring(1);
        System.out.println("Enter second word:");
        String twoWords2 = input.next();
        String twoWords3 = twoWords2.substring(1);

        input.close();

        System.out.println(twoWords1 + twoWords3);
    }
}
