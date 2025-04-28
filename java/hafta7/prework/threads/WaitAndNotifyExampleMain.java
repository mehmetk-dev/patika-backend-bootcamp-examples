package hafta7.prework.threads;

public class WaitAndNotifyExampleMain {

    public static void main(String[] args) throws InterruptedException {

        WaitAndNotifyExample wn = new WaitAndNotifyExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    wn.thread1Function();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    wn.thread2Function();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
