package java_day_09_practice;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {

        int[] arr1 = {10, 0, 5, 0, 1, 0};
        Arrays.sort(arr1);
        int[] arr2 = new int[arr1.length];
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
