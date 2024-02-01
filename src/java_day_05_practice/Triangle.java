package java_day_05_practice;

public class Triangle {
    public static void main(String[] args) {

        for (int row = 1; row < 11; row++) {
            for (int columns = 1; columns < row; columns++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
