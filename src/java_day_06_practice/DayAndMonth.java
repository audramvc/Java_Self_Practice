package java_day_06_practice;

import java.sql.SQLOutput;

public class DayAndMonth {
    public static void main(String[] args) {

        day(5);
        monthName(6);
        daysInMonth(6);
    }

    public static void day(int daysOfTheWeek) {

        switch (daysOfTheWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number");
        }
    }

    public  static void monthName(int month){
        switch (month){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid number");
        }
    }

    public static void daysInMonth(int days){

        if (days == 1){
            System.out.println("January has 31 days");
        } else if (days == 2) {
            System.out.println("February has 29 days");
        }else if (days == 3) {
            System.out.println("March has 31 days");
        }else if (days == 4){
            System.out.println("April has 30 days");
        } else if (days == 5) {
            System.out.println("May has 31 days");
        } else if (days == 6) {
            System.out.println("June has 30 days");
        } else if (days == 7) {
            System.out.println("July has 31 days");
        } else if (days == 8) {
            System.out.println("August has 31 days");
        } else if (days == 9) {
            System.out.println("September has 30 days");
        } else if (days == 10) {
            System.out.println("October has 31 days");
        } else if (days == 11) {
            System.out.println("November has 30 days");
        } else if (days == 12) {
            System.out.println("December has 31 days");
        }else {
            System.out.println("Invalid Number");
        }

    }
}


/*
4. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */