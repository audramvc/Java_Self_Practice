package java_day_07_practice;


public class Rectangle {

    public double width;
    public double length;

    public void calculateArea(){
        System.out.println("Area of rectangle: " + width * length);
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of rectangle: " + 2*(length + width));
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
