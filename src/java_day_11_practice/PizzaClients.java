package java_day_11_practice;

public class PizzaClients {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.pizzaInfo("small", 4, 2);

        Pizza pizza2 = new Pizza();
        pizza2.pizzaInfo("Large", 2, 5);

        Pizza pizza3 = new Pizza();
        pizza3.pizzaInfo("medium", 3, 1);

        System.out.println(pizza1.calcCost());
        System.out.println(pizza2.calcCost());
        System.out.println(pizza3.calcCost());

    }
}
