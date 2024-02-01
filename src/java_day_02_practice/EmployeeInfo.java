package m10_variables_data_types;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        double salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee name: " + employeeName + "\n" + "Gender: " + gender);
        System.out.println("Age: " + age + "\n" + "Employee ID: " + employeeId);
        System.out.println("Job title: " + jobTitle + "\n" + "Company name: " + companyName);
        System.out.println("Full time: " + isFullTime + "\n" + "Years of work experience: " + yearsOfExperience);
        System.out.println("Salary: $" + salary + "\n" + "Married: " + isMarried);

    }
}
