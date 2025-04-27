package hafta7.prework.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    Random random = new Random();
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);


    public void produce() throws InterruptedException {

        while(true){
            Thread.sleep(1000);

            Integer value = random.nextInt(100);

            System.out.println("Producer produces: " + value);

            queue.put(value);
        }
    }

    public void consume() throws InterruptedException {

        while(true) {
            Thread.sleep(5000);
            Integer value = queue.take();
            System.out.println("Consumer to consume: " + value);
            System.out.println("Queue size: " + queue.size());
        }
    }
}
