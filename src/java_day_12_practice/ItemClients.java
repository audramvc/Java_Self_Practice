package java_day_12_practice;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item("Strawberries", 4.59, 2);
        System.out.println(item1);
        System.out.println(item1.getName());
        System.out.println(item1.calcCost());

        Item item2 = new Item("Milk", 4.56, 1);
        System.out.println(item2.getName());
        System.out.println(item2);
    }
}
