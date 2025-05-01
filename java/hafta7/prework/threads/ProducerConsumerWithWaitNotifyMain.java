package hafta7.prework.threads;

public class ProducerConsumerWithWaitNotifyMain {

    public static void main(String[] args) throws InterruptedException {

        ProducerConsumerWithWaitNotify np = new ProducerConsumerWithWaitNotify();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    np.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    np.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
