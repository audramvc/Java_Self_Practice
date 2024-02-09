package java_day_11_practice;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Max", 29, 10993,'A', "B33",11,
                                                    "Cydeo", "Java");

        CydeoStudent student2 = new CydeoStudent("Svetlana", 31, 11234, 'A',"B33", 11,
                                        "Cydeo", "Java");
        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();
        System.out.println();

        student2.study();
        student2.attendClass();
        student2.printSchoolName();
        student2.printProgLanguage();
    }
}
