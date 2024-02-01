package java_day_08_practice;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Split or No Split (Yes or No):");
        String splitOrNo = input.next();

        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();

        System.out.println("Service quality (Excellent/Great/Good/Fair/Poor):");
        String serviceQuality = input.next();

        input.close();

        double totalTip = 0;

        switch (serviceQuality){
            case "Excellent" -> totalTip = 0.25 * checkAmount;
            case "Great" -> totalTip = 0.2 * checkAmount;
            case "Good" -> totalTip = 0.15 * checkAmount;
            case "Fair" -> totalTip = 0.1 * checkAmount;
            case "Poor" -> totalTip = 0.05 * checkAmount;
            default -> totalTip = 0;
        }
        double totalAmount = checkAmount + totalTip;
        double totalPerPerson = totalAmount / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;
        String result = "";

        if (splitOrNo.equals("Yes")){

             result = ("Number of people entered: " + numberOfPeople + "\nTotal to pay: " + totalAmount
                    + "\nTotal tip: " + totalTip + "\nTotal per person: " + totalPerPerson
                    + "\nTip per person: " + tipPerPerson);
        } else if (splitOrNo.equals("No")) {
            result = ("Number of people entered: " + numberOfPeople + "\nTotal to pay: " + totalAmount
                    + "\nTotal tip: " + totalTip);
//            System.out.println("Number of people entered: " + numberOfPeople);
//            System.out.println("Total to pay: " + totalAmount);
//            System.out.println("Total tip: " + totalTip);
//            System.out.println("Total per person: " + noSplit);
//            System.out.println("Tip per person: " + noSplit);
        }
        System.out.println(result);
    }
}
