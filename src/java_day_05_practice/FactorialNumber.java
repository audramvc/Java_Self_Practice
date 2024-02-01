package java_day_05_practice;

public class FactorialNumber {
    public static void main(String[] args) {

        int num = 5;
        int numFactorial = 1;

        for (int i = 1; i <= num ; i++) {
            numFactorial *= i;
        }
        System.out.println(numFactorial);
    }
}
