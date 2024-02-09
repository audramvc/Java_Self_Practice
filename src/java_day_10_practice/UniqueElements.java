package java_day_10_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        // Given an ArrayList, display the unique elements without using any loops
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        list.removeIf(element -> list.indexOf(element) != list.lastIndexOf(element));

        System.out.println(list);
    }
}
