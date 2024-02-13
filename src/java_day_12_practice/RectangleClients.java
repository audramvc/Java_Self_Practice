package java_day_12_practice;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3.2, 7.5);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

        Rectangle rectangle2 = new Rectangle(11.2, 14.7);
        System.out.println(rectangle2);
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());

        Rectangle rectangle3 = new Rectangle(2.3, -3);
        System.out.println(rectangle3);
        System.out.println(rectangle3.getLength());
        System.out.println(rectangle3.getWidth());




    }
}
