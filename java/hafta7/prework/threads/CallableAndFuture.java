package hafta7.prework.threads;

import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);
        
        Future<?> future = service.submit(new Callable<Integer>() {
           public Integer call() throws Exception {

               Random random = new Random();
               System.out.println("Thread is working...");

               int time = random.nextInt(1000) + 2000;
               try {
                   Thread.sleep(time);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               return time;
           }
        });
        service.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
