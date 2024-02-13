package java_day_12_practice;

public class CandyClients {
    public static void main(String[] args) {

        final String GREEN_BOLD = "\033[0;32m";;

        Candy candy1 = new Candy("Snickers", 2, 1.29, true);
        System.out.println(GREEN_BOLD + candy1.getBrand());
        System.out.println(candy1);

        Candy candy2 = new Candy("Milka", 1, 0.0, false);
        System.out.println(candy2.getBrand());
        System.out.println(candy2);

    }
}
