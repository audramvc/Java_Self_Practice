package java_day_04_practice;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 154;
        String result = "";

        if (age >= 0 && age < 150) {
            if (age >= 0 && age <= 20) {
                result = "Teenager";
            } else if (age >= 21 && age <= 54) {
                result = "Adult";
            } else if (age >= 55) {
                result = "Senior";
            } else if (age < 0) {
                result = "Invalid";
            }

        }else{
            result = "Invalid";
        }
        System.out.println(result);
    }

    }

