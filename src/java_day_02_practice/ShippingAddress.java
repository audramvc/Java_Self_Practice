package java_day_02_practice;

public class ShippingAddress {

    public static void main(String[] args) {

        String fullName = "Aaron Kissinger";
        int buildingNumber = 13621;
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        int zipCode = 22030;

        System.out.println("Your Shipping address is:" + "\n\t\t\t\t" + fullName + "\n\t\t\t\t" + buildingNumber +
                " " + streetName + "\n\t\t\t\t" + city + ", " + state + " " + zipCode);
    }
}
