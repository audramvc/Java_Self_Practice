package java_day_09_practice;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int oddNum = 0;
        int evenNum = 0;

        // counts even and odd numbers
        for (int i : array) {
            if (i % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        System.out.println("The array has " + oddNum + " odd numbers and " + evenNum + " even numbers");

    }

}
