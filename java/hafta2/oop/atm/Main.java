package hafta2.oop.atm;

public class Main {
    public static void main(String[] args) {


        ATM atm = new ATM();
        Account acc = new Account("a", "a", 2000);

        atm.work(acc);
        System.out.println("Programdan çıkılıyor...");
    }

}
