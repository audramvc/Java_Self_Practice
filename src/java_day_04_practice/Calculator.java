package java_day_04_practice;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 24,
                n2 = 4;
        char mathOperator = '+';

        switch (mathOperator){
            case '-':
                System.out.println(n1 - n2);
              break;
            case '+':
                System.out.println(n1 + n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
