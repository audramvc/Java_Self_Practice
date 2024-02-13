package java_day_12_practice;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            System.err.println("The width cannot be set to a negative or zero");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            System.err.println("The length cannot be set to a negative or zero");
            System.exit(1);
        }
        this.length = length;
    }

    public double calcArea() {
        //double result1;
       double result1 = length * width;
        return result1;
    }

    public double calcPerimeter() {
        //double result2;
       double result2 = 2 * (length + width);
        return result2;

    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
