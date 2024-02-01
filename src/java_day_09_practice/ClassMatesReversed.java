package java_day_09_practice;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {

        //    Create an array of strings named classmates.
        //    Store full names of 10 classmates.
        String[] classmates = {"Anna Lubura", "Anna Platon", "Dejan Lubura", "Falana Little", "Kamal Mezali",
                "Maksym Drizd", "Zakaria Saber", "Yassir Elkhemalli", "Samira Firman", "Jowell Hanna"};

        String[] classMatesReverse = new String[classmates.length];
        String[] nameReverse = new String[classMatesReverse.length];

        //Reverse each student's name and print them on separate lines
        for (int i = classmates.length - 1, j = 0; i >= 0; i--, j ++) {
            classMatesReverse[j] = "\n" + classmates[i].substring(classmates[i].indexOf(" ") + 1) + " " +
                       classmates[i].substring(0, classmates[i].indexOf(" "));
        }
        System.out.println(Arrays.toString(classMatesReverse));
    }
}
