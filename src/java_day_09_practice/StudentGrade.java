package java_day_09_practice;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = {'A', 'B', 'C'};

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > 100 || scores[i] < 0 ) {
                System.err.println("Invalid score");
            }else if (scores[i] > 89){
                grades[i] = 'A';
            } else if (scores[i]> 79) {
                grades[i] = 'B';
            } else if (scores[i] > 69) {
                grades[i] = 'C';
            } else if (scores[i] > 59) {
                grades[i] = 'D';
            }else {
                grades[i] = 'F';
            }
        }
        System.out.println("grades = " + Arrays.toString(grades));

        for (int j = 0; j < 3; j++) {
            System.out.println(names[j] + "'s score is " + scores[j] + ", and grade is "+ grades[j]);
        }
    }
}
