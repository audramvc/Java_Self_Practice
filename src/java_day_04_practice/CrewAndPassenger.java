package java_day_04_practice;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int number = 75;
        String result;

        if (number == 50){
            result = "20 crew, 30 passengers";
        } else if (number == 75) {
            result = "25 crew, 50 passengers";
        } else if (number == 100) {
            result = "30 crew, 70 passengers";
        }else {
            result = "Invalid number";
        }

        System.out.println(result);
    }
}
