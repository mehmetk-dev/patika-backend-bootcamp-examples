package hafta7.proje;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuterServiceMain {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int i = 1; i <= 5; i++) {
            executorService.submit(new ExecuterServiceExample(String.valueOf(i),i));
        }

        executorService.shutdown();

        executorService.awaitTermination(1, TimeUnit.DAYS);

        /*Thread thread11 = new Thread(new Worker("1",1));
        Thread thread2 = new Thread(new Worker("2",2));
        Thread thread3 = new Thread(new Worker("3",3));
        Thread thread4 = new Thread(new Worker("4",4));
        Thread thread5 = new Thread(new Worker("5",5));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();

        thread5.start();
        */

    }
}
