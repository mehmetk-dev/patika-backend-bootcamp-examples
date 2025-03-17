package Hafta2.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {

        Manager worker = new Manager("Mehmet","Kerem","IT",31);

        worker.showInfermation();
        worker.working();
        worker.setNewDepartment("Jr Java Developer");
        worker.showInfermation();
    }
}
