package hafta2.oop.inheritance;

public class Manager extends Employee {
    public int managerID;

    public Manager(String name, String salary, String department, int managerID) {
        super(name, salary, department);
        this.managerID = managerID;
    }

    @Override
    public void showInfermation() {
        super.showInfermation();
        System.out.println("Manager ID : " + this.managerID);
    }
}
