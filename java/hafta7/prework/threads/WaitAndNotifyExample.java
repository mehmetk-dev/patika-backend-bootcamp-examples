package hafta7.prework.threads;

import java.util.Scanner;

public class WaitAndNotifyExample {

    public void thread1Function() throws InterruptedException {

        synchronized (this) {
            System.out.println("Thread 1 is working...");
            System.out.println("Thread 1 is waiting for Thread 2 to wake up.");

            wait();

            System.out.println("Thread 1 is wake up.");
        }
    }


    public void thread2Function() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this) {
            System.out.println("Thread 2 is working...");

            System.out.println("If you want to continue, press any key.");

            scanner.nextLine();

            notify();

            System.out.println("I woke up Thread 1 and I'm leaving.");
        }
    }
}
