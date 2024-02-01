package java_day_04_practice;

public class Finra {

    public static void main(String[] args) {

        int num = 15;
        String result;
        if (num %3 == 0){
            result = "FIN";
            if (num %5 == 0) {
                result = "FINRA";
            }
        } else if (num %5 == 0) {
            result = "RA";
        } else {
            result = "";
        }
        System.out.println(result);
    }
}

