package java_day_06_practice;

public class SalaryCalculator {
    public static void main(String[] args) {

        double income = salary(45, 40);
        System.out.println(income);

    }

    public static double salary(double hourlyRate, int weeklyHours){

        double salary = hourlyRate * weeklyHours * 52;

        return salary;
    }
}
