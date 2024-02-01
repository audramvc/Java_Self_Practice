package java_day_04_practice;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 2;
        String result;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> result = " 31 days";
            case 4, 6, 9, 11 -> result = "30 days.";
            case 2 -> result = "28 days";
            default -> result = "Invalid";
        }
        System.out.println(result);
    }
}
