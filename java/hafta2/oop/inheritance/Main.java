package hafta2.oop.inheritance;

public class Main {
    public static void main(String[] args) {

        Manager worker = new Manager("Mehmet", "Kerem", "IT", 31);

        worker.showInfermation();
        worker.working();
        worker.setNewDepartment("Jr Java Developer");
        worker.showInfermation();
    }
}
