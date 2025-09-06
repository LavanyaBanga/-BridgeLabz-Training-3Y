public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Lavanya", 20, 50000.0);
        emp.displayEmployee();
    }
}
