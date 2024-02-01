package java_day_08_practice;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();
        input.close();

        String word1 = word.replaceFirst("x", "a");
        System.out.println(word1);
    }
}
