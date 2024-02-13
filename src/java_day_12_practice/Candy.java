package java_day_12_practice;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("The quantity of candy cannot be set to zero or a negative value.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("The price of candy cannot be set to a negative value.");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean getHasPeanuts() {
        return hasPeanuts;
    }

    private void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        if (price == 0) {
            return "Candy{" +
                    "brand = '" + brand + '\'' +
                    ", quantity = " + quantity +
                    ", price = \"free\"" +
                    '}';
        } else {
            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity = " + quantity +
                    ", price = " + price +
                    '}';
        }
    }
}
