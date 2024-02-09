package java_day_10_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros {
    public static void main(String[] args) {

        //Given an ArrayList, move all zeros to the last indexes of the ArrayList

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        //System.out.println(list);
        Collections.sort(list);
        //System.out.println(list);
        Collections.rotate(list, 4);
        System.out.println(list);

    }
}
