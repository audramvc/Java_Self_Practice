package java_day_05_practice;

public class Alphabets {
    public static void main(String[] args) {

        for (char camel = 'A'; camel <= 'E'; camel++) {

            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.print(camel + "" + lower + " ");
            }

            System.out.println();
        }
    }
}
