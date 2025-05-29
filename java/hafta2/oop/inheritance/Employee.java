package hafta2.oop.inheritance;

public class Employee {

    private String name;
    private String salary;
    private String department;

    public Employee(String name, String salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void showInfermation() {
        System.out.println("Name is " + this.name);
        System.out.println("Salary is " + this.salary);
        System.out.println("Departman is " + this.department);
    }

    public void working() {
        System.out.println("Employee is working");
    }

    public void setNewDepartment(String department) {
        System.out.println("Your former department is " + this.department);
        this.department = department;
        System.out.println("Your new department is " + this.department);
    }
}
