package java_day_13_practice.phone_task;

public class PhoneClients {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","MaxPro", "528", 1_500, "Silver");
        Samsung samsung = new Samsung("Galaxy", "flip5", "128", 1_000, "Black");
        Nokia nokia = new Nokia("Nokia", "3320", "258", 500, "White");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.text(iphone.phoneNumber);
        iphone.call(iphone.phoneNumber);
        samsung.faceTime(samsung.phoneNumber);
        samsung.text(samsung.phoneNumber);
        nokia.call(nokia.phoneNumber);
        nokia.text(nokia.phoneNumber);
    }
}
