package java_day_09_practice;

public class ArrayElements {
    public static void main(String[] args) {

        int[] numbers = new int[100]; // Create an array of integers with a length of 100.

        // Assign values from 1 to 100 to the indexes of the array.
        // Display the array elements in a single line separated by spaces.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("------------------");

        //Display the array elements in a single line in reversed order, separated by spaces.
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("------------------");

        //Display all evenly divisible elements by 5 in a single line separated by spaces.
        for (int number : numbers) {
            if (number % 5 == 0){
                System.out.print(number + " ");
            }
        }
    }
}
