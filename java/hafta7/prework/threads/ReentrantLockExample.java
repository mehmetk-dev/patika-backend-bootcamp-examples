package hafta7.prework.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();


    public void increase(){
        for (int i = 0; i < 10000; i++) {
            say++;
        }
    }
    public void function1() {

        lock.lock();

        increase();

        try {
            condition.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        lock.unlock();
    }

    public void function2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        lock.lock();

        increase();
        condition.signal();

        lock.unlock();
    }

    public void threadOver() {
        System.out.println("Say value is " + say);
    }
}
