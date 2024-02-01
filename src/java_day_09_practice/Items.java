package java_day_09_practice;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {

        // Give arrays with the same length
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] price = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        // Find the first index number of "Gloves"
        System.out.println(Arrays.binarySearch(items, "Gloves"));

        // Check if "iPad" is contained in the item list
        for (String item : items) {
            if (item.equalsIgnoreCase("IPad"))
            System.out.println(true);
        }
        // Print the report for each shopping item in the format:
        //   				name - price - #ID
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + price[i] + " - " + "#" + itemIDs[i]);
        }
    }
}
