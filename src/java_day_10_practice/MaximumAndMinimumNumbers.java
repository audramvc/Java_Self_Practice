package java_day_10_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {

        //Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int maxNumber = Collections.max(list);
        System.out.println("Maximum number is " + maxNumber);

        int minNumber = Collections.min(list);
        System.out.println("Minimum number is " + minNumber);
    }
}
