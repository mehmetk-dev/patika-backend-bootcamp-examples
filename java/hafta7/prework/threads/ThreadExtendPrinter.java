package hafta7.prework.threads;

public class ThreadExtendPrinter extends Thread{

    private String name;

    public ThreadExtendPrinter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " working thread...");

        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " thread writing : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted...");
            }
        }
        System.out.println(name + " finished its work...");
    }
}
