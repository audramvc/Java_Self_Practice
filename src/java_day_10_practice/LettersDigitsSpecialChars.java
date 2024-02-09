package java_day_10_practice;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        //1.1 Given a string, retrieve and display the letters, digits, and special characters separately.

        String str = "Wooden Spoon123!";
        String letters = "";
        String numbers = "";
        String specialChars = "";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                letters += each;
            }
            if (Character.isDigit(each)){
                numbers += each;
            }
            if (!(Character.isLetterOrDigit(each))){
                specialChars += each;}
            }

        System.out.println("letters = " + "\"" +letters + "\";" + "\nDigits = " + "\"" + numbers + "\";" +
                        "\nspecialChars = " + "\"" + specialChars + "\";");

        }
    }
