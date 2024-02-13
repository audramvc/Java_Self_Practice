package java_day_13_practice.phone_task;

public class Iphone {
    private String brand, model, size;
    private double price;
    private  String color;
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String RESET = "\033[0m";
    public int phoneNumber;

    public Iphone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank() || brand.isEmpty()){
            System.err.println("Brand must not be null, empty, or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()){
            System.err.println("Module must not be null, empty, or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price == 0){
            System.err.println("Price must be greater than zero");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()){
            System.err.println("Color must not be null, empty, or blank");
            System.exit(1);
        }
        this.color = color;
    }

    public void call( int phoneNumber){
        //Phone ConsoleColors;
        System.out.println(GREEN_BOLD_BRIGHT + "Calling the number " + phoneNumber + RESET);
    }

    public void text( int phoneNumber){
        System.out.println("Texting to the number " + phoneNumber);
    }

    public void faceTime(int phoneNumber){
        System.out.println("Facetiming with the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
