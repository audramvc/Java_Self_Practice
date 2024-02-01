package java_day_04_practice;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygenLevel = 46;
        String result;

        if (oxygenLevel >= 90 && oxygenLevel <=100){
            result = "Your tank is full";
        } else if (oxygenLevel >=80 && oxygenLevel <= 89) {
            result = "Still okay";
        } else if (oxygenLevel >= 70 && oxygenLevel <=79) {
            result = "Don't go too far";
        } else if (oxygenLevel >= 60 && oxygenLevel <= 69) {
            result = "Start to head back";
        } else if (oxygenLevel >= 50 && oxygenLevel <= 59) {
            result = "Be careful, you're at 50%";
        }else {
            result = "Your tank is almost empty";
        }

        System.out.println(result);
    }
}
