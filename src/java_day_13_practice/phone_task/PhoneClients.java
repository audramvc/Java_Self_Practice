package java_day_13_practice.phone_task;

public class PhoneClients {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","MaxPro", "528", 1_500, "Silver");
        Samsung samsung = new Samsung("Galaxy", "flip5", "128", 1_000, "Black");

        System.out.println(iphone);
        System.out.println(samsung);

        iphone.text(iphone.phoneNumber);
        iphone.call(iphone.phoneNumber);
        samsung.faceTime(samsung.phoneNumber);
        samsung.text(samsung.phoneNumber);
    }
}
