package java_day_10_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipOddNumber {
    public static void main(String[] args) {

        // Given an ArrayList, multiply each odd number by 2

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
       // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 != 0){
               list.set(i, num * 2);
            }
        }
        System.out.print(list);
    }
}
