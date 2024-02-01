package java_day_07_practice;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Jenny";
        employee1.age = 26;
        employee1.gender = 'F';
        employee1.jobTitle = "Marketing assistant";
        employee1.salary = 60_000;

        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Gender: " + employee1.gender);
        System.out.println("Job Title: " + employee1.jobTitle);
        System.out.println("Salary: $" + employee1.salary);

        employee1.work();

        System.out.println(employee1);
        System.out.println("----------------------------");

        Employee employee2 = new Employee();
        employee2.name = "Chris";
        employee2.age = 31;
        employee2.gender = 'M';
        employee2.jobTitle = "Marketing supervisor";
        employee2.salary = 80_000;

        System.out.println("Name: " + employee2.name);
        System.out.println("Age: " + employee2.age);
        System.out.println("Gender: " + employee2.gender);
        System.out.println("Job Title: " + employee2.jobTitle);
        System.out.println("Salary: " + employee2.salary);

        employee2.work();

        System.out.println(employee2);
        System.out.println("-------------------------------");

    }
}
