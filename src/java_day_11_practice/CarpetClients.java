package java_day_11_practice;

public class CarpetClients {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        carpet1.carpetInfo(12.5,10.5, 5,true);

        Carpet carpet2 = new Carpet();
        carpet2.carpetInfo(10.5, 7.5, 2, false);


        System.out.println(carpet1.calcCost());
        System.out.println(carpet2.calcCost());
    }
}
