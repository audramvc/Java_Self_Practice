package java_day_07_practice;

public class AddressClients {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.buildingNumber = 25;
        address1.street = "Silver St.";
        address1.city = "Philadelphia";
        address1.state = "PA";
        address1.zipCode = "14220";

        address1.address();
        System.out.println("-------------------");

        Address address2 = new Address();
        address2.buildingNumber = 182;
        address2.street = "Corintian St.";
        address2.city = "Philadelphia";
        address2.state = "PA";
        address2.zipCode = "12541";

        address2.address();
    }
}
