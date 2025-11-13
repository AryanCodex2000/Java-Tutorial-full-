public class Employee {
    String name;
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public void showInfo() {
        System.out.println(name + " - " + jobTitle + " earns " + salary);
    }
}