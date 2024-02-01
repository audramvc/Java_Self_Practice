package java_day_05_practice;


public class Rectangle {
    public static void main(String[] args) {

        int row = 9;
        int column = 8;

        for (int i = 1; i < column; i++) {

            for (int j = 1; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
