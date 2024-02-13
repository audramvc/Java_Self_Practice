package java_day_12_practice;

import static java.lang.Math.PI;

public class Circle {

    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius(){
        if (radius <= 0){
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
        }
        return radius;
    }

    public void setRadius( double radius){
        if (radius == 0){
            System.err.println("Invalid input for radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }


    public double calcArea(){

        return radius * radius * PI;
    }

    public double calcPerimeter(){

        return 2 * radius * PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea() +
                ",perimeter=" + calcPerimeter() +
        '}';
    }
}
