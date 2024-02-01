package java_day_06_practice;

public class MathUtility {
    public static void main(String[] args) {

        int sum = calculate(10, '+', 20);
        System.out.println(sum);

        double sum1 = calculate(2.5, '*', 3.0);
        System.out.println(sum1);

        int sum2 = square(8);
        System.out.println(sum2);

        double sum3 = square(1.5);
        System.out.println(sum3);

        int sum4 = cube(3);
        System.out.println(sum4);

        double sum5 = cube(2.5);
        System.out.println(sum5);
    }

    public static int calculate(int num1, char operator, int num2) {

        int result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        return result;
    }

    public static double calculate(double num1, char operator, double num2) {

        double result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        return result;
    }

    public static int square(int num) {
        int result = num * num;
        return result;
    }

    public static double square(double num) {
        double result = num * num;
        return result;
    }

    public static int cube(int num){
        int result = num * num;
        return result;
    }

    public static double cube(double num) {
        double result = num * num * num;
        return result;
    }
}
