package hafta7.prework.threads;

public class ThreadExample  {

    public static void main(String[] args) {

        ThreadExtendPrinter threadExtendPrinter1 = new ThreadExtendPrinter("Mehmet");
        ThreadExtendPrinter threadExtendPrinter2 = new ThreadExtendPrinter("Enes");


        //threadExtendPrinter2.start();
        //threadExtendPrinter1.start();

        Thread thread1 = new Thread(new RunnableImplementsPrinter("Mehmet"));
        Thread thread2 = new Thread(new RunnableImplementsPrinter("Enes"));

        thread1.start();
        thread2.start();

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" working thread...");

                for (int i = 1; i <= 10; i++) {
                    System.out.println(" thread writing : " + i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread was interrupted...");
                    }
                }
                System.out.println(" finished its work...");
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread");
            }
        }).start();

        System.out.println("Main thread is worked");
    }
}
