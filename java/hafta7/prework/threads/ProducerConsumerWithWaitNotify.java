package hafta7.prework.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerWithWaitNotify {

    Random random = new Random();
    Object lock = new Object();
    int limit = 10;
    Queue queue = new LinkedList();

    public void produce() throws InterruptedException {

        while (true) {
            Thread.sleep(1000);

            synchronized (lock) {


                if (queue.size() == limit) {
                    lock.wait();
                }

                int value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer produces = " + value);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        while (true) {
            Thread.sleep(2000);

            synchronized (lock) {


                if (queue.size() == 0) {
                    lock.wait();
                }

                Integer value = (Integer) queue.poll();
                System.out.println("Consumer consume = " + value);
                System.out.println("Queue size = " + queue.size());
                lock.notify();
            }
        }
    }
}