package java_day_07_practice;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;

    public void calcCost(){

        System.out.println("Total cost of " + itemName + " " + (quantity * unitPrice));
    }

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
