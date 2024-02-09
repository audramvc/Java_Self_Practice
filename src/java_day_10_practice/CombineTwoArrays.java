package java_day_10_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        //Given two String arrays, combine them into one ArrayList
        
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        // giving first string array to the arraylist
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1));

        // adds second string array to the first one
        list.addAll(Arrays.asList(arr2));
        System.out.print("list ==> {");

        for (int i = 0; i < list.size(); i++) {
            System.out.print("\"" + list.get(i) + "\"");
            if (i < list.size() -1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
