package hafta7.prework.threads;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    Semaphore semaphore = new Semaphore(3);

    public void threadFonksiyonu(int i) {

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Semaphore starting... ID: " + i);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release();
    }
}
