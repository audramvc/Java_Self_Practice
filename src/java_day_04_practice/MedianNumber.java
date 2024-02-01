package java_day_04_practice;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        String result;

        if (a > b && b < c) {
            result = b + " is the median number";
        } else if (b > a && a < c) {
            result = a + " is the median number";
        } else if (a > c && c < b) {
            result = c + "is the median number";
        } else if (b > c && c < a) {
            result = c + "is the median number";
        } else if (c > a && a < b) {
            result = a + "is the median number";
        } else if (c > b && b < a) {
            result = b + "is the median number";
        } else {
            result = "Numbers are equal.";
        }

        System.out.println(result);
    }
}
