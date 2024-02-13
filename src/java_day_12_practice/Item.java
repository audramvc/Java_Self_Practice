package java_day_12_practice;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantinty(quantity);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()){
            System.err.println("The name cannot be empty or blank");
            System.exit(1);
        }

        for (char each : name.toCharArray()){
            if (!Character.isLetterOrDigit(each) && !Character.isSpaceChar(each)){
                System.err.println("The name cannot contain any special characters other than space.");
                System.exit(1);
            } else if (!Character.isLetter(name.charAt(0))) {
                System.err.println("The name must start with letters.");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        if (unitPrice < 0){
            System.err.println("The unitPrice cannot be negative.");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantinty(int quantity){
        if (this.quantity < 0){
            System.err.println("The quantity cannot be negative.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
    }
}
