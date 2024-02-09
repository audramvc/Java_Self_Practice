package java_day_10_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {

        // Given an ArrayList of characters, remove all the letters
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        list.removeIf(character -> Character.isLetter(character));
        System.out.print(list);

    }
//        for (int i = 0; i < list.size(); i++) {
//            char character = list.get((i));
//            if (Character.isLetter(character)){
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(list);


//        for (Character each : list) {
//            if (!Character.isLetter(each)) {
//                System.out.print(each);
//            }
//        }
//       System.out.println();

    }





