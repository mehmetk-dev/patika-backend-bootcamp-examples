package hafta7.prework.threads;

public class ThreadSafe {

    public static int count = 0;

    public synchronized static void increase(){
        count++;
    }

    public static void workThread(){

       Thread thread1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 5000; i++) {
                   increase();
               }
           }
       });

       Thread thread2 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 5000; i++) {
                   increase();
               }
           }
       });

       thread1.start();
       thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        ThreadSafe threadSafe = new ThreadSafe();

        workThread();


    }
}
