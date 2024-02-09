package java_day_10_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {

        // Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida",
                "Ebrahim", "Farida"));

//        list.removeIf(name -> name.toLowerCase().charAt(0) == name.toLowerCase().charAt(name.length()-1));
//
//        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().charAt(0) == list.get(i).charAt(list.get(i).length() - 1)) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
    }
}
