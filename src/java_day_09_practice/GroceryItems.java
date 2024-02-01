package java_day_09_practice;

import java.util.Arrays;

public class GroceryItems {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        // Print the following output: (add \t between two words)
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");

        //Print the following output: (add \t between two words)
        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");

        //Print the following output: (add \t between two words)
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }

//        System.out.println(Arrays.deepToString(items));
//        System.out.println("------------------------------------");
//
//        //Print the following output: (add \t between two words)
//        System.out.println(items[0][0] + "\t" + items[0][1] + "\t" + items[0][2] + "\t" + items[0][3]);
//        System.out.println(items[1][0] + "\t" + items[1][1] + "\t" + items[1][2] + "\t" + items[1][3]);
//        System.out.println(items[2][0] + "\t" + items[2][1] + "\t" + items[2][2] + "\t" + items[2][3] + "\t" + items[2][4]);
//        System.out.println("------------------------------------");
//
//
//        //Print the following output: (add \t between two words)
//        System.out.println(items[0][3] + "\t" + items[0][2] + "\t" + items[0][1] + "\t" + items[0][0]);
//        System.out.println(items[1][3] + "\t" + items[1][2] + "\t" + items[1][1] + "\t" + items[1][0]);
//        System.out.println(items[2][4] + "\t" + items[2][3] + "\t" + items[2][2] + "\t" + items[2][1] + "\t" + items[2][0]);
//        System.out.println("------------------------------------");
//
//
//        System.out.println(items[3][0] + "\t" + items[3][1] + "\t" + items[3][2] + "\t" + items[3][3] + "\t" + items[3][4]);
//        System.out.println(items[1][0] + "\t" + items[1][1] + "\t" + items[1][2] + "\t" + items[1][3]);
//        System.out.println(items[0][0] + "\t" + items[0][1] + "\t" + items[0][2] + "\t" + items[0][3]);



    }
}
