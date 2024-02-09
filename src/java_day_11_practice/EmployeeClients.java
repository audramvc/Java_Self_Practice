package java_day_11_practice;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.employeeInfo("John", 29, 'M', "Sales representative", 67_000);

        Employee employee2 = new Employee();
        employee2.employeeInfo("Stacy", 37, 'F', "Sales manager", 85_000);

        employee1.work();
        employee2.work();

    }
}
