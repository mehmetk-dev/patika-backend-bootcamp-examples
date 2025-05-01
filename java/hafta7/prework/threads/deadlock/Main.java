package hafta7.prework.threads.deadlock;

public class Main {

    public static void main(String[] args) {

        DeadLockExample deadlock = new DeadLockExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread1Function();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread2Function();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        deadlock.overThread();
    }
}
