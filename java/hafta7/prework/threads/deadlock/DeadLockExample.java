package hafta7.prework.threads.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {

    private Account account1 = new Account();
    private Account account2 = new Account();
    private Random random = new Random();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void lockControl(Lock lock1,Lock lock2){

        boolean lock1_control =  false;
        boolean lock2_control = false;

        while (true){

            lock1_control = lock1.tryLock();
            lock2_control = lock2.tryLock();

            if (lock1_control == true && lock2_control == true){
                return;
            }
            if(lock1_control){
                lock1.unlock();
            }
            if (lock2.tryLock()) {
                lock2.unlock();
            }
        }
    }

    public void thread1Function() {

        lockControl(lock1,lock2);

        for (int i = 0; i < 5000; i++) {
            Account.moneyTransfer(account1,account2,random.nextInt(100));
        }
        lock2.unlock();
        lock1.unlock();
    }

    public void thread2Function() {

        lockControl(lock1,lock2);

        for (int i = 0; i < 5000; i++) {
            Account.moneyTransfer(account2,account1,random.nextInt(100));
        }

        lock1.unlock();
        lock2.unlock();
    }

    public void overThread() {

        System.out.println("Account 1 Balance = " + account1.getBalance() + " " + "Account 2 Balance = " + account2.getBalance());
        System.out.println("Total Balance = " + (account2.getBalance() + account1.getBalance()));
    }
}
