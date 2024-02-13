package java_day_12_practice;

import java.util.Arrays;

public class CircleClient {
    public static void main(String[] args) {

        Circle circle1 = new Circle(7.2);
        Circle circle2 = new Circle(14.5);
        Circle circle3 = new Circle(-3.3);

        System.out.println(circle1.getRadius());
        System.out.println(circle1);

        System.out.println(circle2.getRadius());
        System.out.println(circle2);

        System.out.println(circle3.getRadius());
        System.out.println(circle3);
    }
}
