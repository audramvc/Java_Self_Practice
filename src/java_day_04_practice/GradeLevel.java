package java_day_04_practice;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeLevel = 11;
        String result;

        if (gradeLevel >= 1 && gradeLevel <= 5){
            result = "Elementary school";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            result = "Middle school";
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            result = "High school";
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            result = "College";
        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            result = "Grad School";
        }else {
            result = "Invalid grade level.";
        }

        System.out.println(result);
    }
}
