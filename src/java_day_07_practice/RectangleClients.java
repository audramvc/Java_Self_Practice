package java_day_07_practice;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 2.4;
        rectangle1.length = 4.6;

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);
        System.out.println("-------------------------------");


        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 15.4;
        rectangle2.length = 1.6;

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        System.out.println(rectangle2);
        System.out.println("-------------------------------");
    }
}
