package java_day_10_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // Given an ArrayList of integers, remove duplicated numbers
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 7, 2, 3, 3, 4, 5, 5, 6, 7));
                                                            //  0  1  2  3  4  5  6  7  8  9  10
//        for (int i = 0; i < list.size(); i++) {
//            if (i == list.get(i)){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);

        ArrayList<Integer> result = new ArrayList<>(Arrays.asList());
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (!result.contains(num)){
                result.add(num);
            }

        }System.out.println(result);

    }
}
