package java_day_09_practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] reverseArray = new int[arr1.length];

        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j ++) {
            reverseArray[j] = arr1[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
