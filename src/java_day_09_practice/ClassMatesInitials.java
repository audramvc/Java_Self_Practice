package java_day_09_practice;

public class ClassMatesInitials {
    public static void main(String[] args) {

        //   2.1 Create an array of strings named classmates.
        //   2.2 Store full names of 10 classmates.
        String[] classmates = {"Anna Lubura", "Anna Platon", "Dejan Lubura", "Falana Little", "Kamal Mezali",
                "Maksym Drizd", "Zakaria Saber", "Yassir Elkhemalli", "Samira Firman", "Jowell Hanna"};

        // Print the initials of each student's name in separate lines.
        for (int i = 0; i < classmates.length; i++) {
          String initials = "" + classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
          System.out.println(initials);
        }



    }

}
