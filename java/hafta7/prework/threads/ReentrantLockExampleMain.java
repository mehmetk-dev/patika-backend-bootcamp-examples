package hafta7.prework.threads;

public class ReentrantLockExampleMain {

    public static void main(String[] args) {

        ReentrantLockExample rl = new ReentrantLockExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rl.function1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rl.function2();
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

        rl.threadOver();
    }
}
