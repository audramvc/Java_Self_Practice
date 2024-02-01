package java_day_07_practice;

public class Address {

    public int buildingNumber;
    public String street, city, state, zipCode;

    public void address(){
        System.out.println(buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode);
    }

    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
