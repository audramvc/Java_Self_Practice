package java_day_07_practice;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Iphone";
        item1.unitPrice = 1_200;
        item1.quantity = 1;

        System.out.println("Item name: " + item1.itemName);
        System.out.println("Item price: $" + item1.unitPrice);
        System.out.println("Quantity: " + item1.quantity);

        item1.calcCost();
        System.out.println(item1);
        System.out.println("---------------------------");

        Item item2 = new Item();
        item2.itemName = "Ipad";
        item2.unitPrice = 1_000;
        item2.quantity = 3;

        System.out.println("Item name: " + item2.itemName);
        System.out.println("Item price: $" + item2.unitPrice);
        System.out.println("Quantity: " + item2.quantity);

        item2.calcCost();
        System.out.println(item2);
    }
}
