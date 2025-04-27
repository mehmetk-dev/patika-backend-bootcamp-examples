package hafta7.proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListWorker {

        Random random = new Random();

        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myList2 = new ArrayList<>();

        public Object lock1 = new Object();
        public Object lock2 = new Object();

    public void addValueList1() throws InterruptedException {

//        for (int i = 0; i < 2000; i++) {
//            myList1.add(i);
//            Thread.sleep(1);
//        }
        synchronized (lock2){
            myList1.add(random.nextInt());
        }


    }

    public void addValueList2() throws InterruptedException {

//        for (int i = 0; i < 2000; i++) {
//            myList2.add(i);
//            Thread.sleep(1);
//        }
        synchronized (lock2){
            myList2.add(random.nextInt(100));
        }
    }

    public void assignValue() throws InterruptedException {

        for (int i = 0; i < 1000; i++) {
        addValueList1();
        addValueList2();
        }
    }

    public void work() throws InterruptedException {

        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    assignValue();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 =  new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    assignValue();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long finish =  System.currentTimeMillis();
        System.out.println("List1 size = " + myList1.size() + " - List2 size = " + myList2.size());
        System.out.println("elapsed time = " + (finish - start));

    }
}
