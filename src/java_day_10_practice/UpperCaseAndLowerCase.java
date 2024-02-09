package java_day_10_practice;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        // Given a string, return true if the total number of uppercase characters is equal to the total number
        // of lowercase characters

        String str = "JAVA java";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)){
                upperCaseCount += 1;
            }if (Character.isLowerCase(each)){
                lowerCaseCount += 1;
            }
        }boolean result = upperCaseCount == lowerCaseCount;
        System.out.println(result);

//        String str = "JAVA java";
//        String firstWord = str.substring(0, str.indexOf(" "));
//        String secondWord = str.substring(str.indexOf(" ") + 1);
//
//        System.out.println(firstWord.toLowerCase().equals(secondWord));


    }
}
