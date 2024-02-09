package java_day_09_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {

        // Given an ArrayList, duplicate each element in the list

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
        list.addAll(list);
        System.out.println(list);


    }
}
