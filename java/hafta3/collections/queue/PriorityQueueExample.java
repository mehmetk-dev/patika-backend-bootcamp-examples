package hafta3.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // PriorityQueue oluşturuyoruz
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Eleman ekliyoruz (enqueue)
        queue.offer(30);
        queue.offer(10);
        queue.offer(20);
        queue.offer(40);

        // Kuyruktan eleman çıkarıyoruz (dequeue)
        System.out.println("Kuyruktan çıkarılan eleman: " + queue.poll());  // 10 çıkarılır
        System.out.println("Kuyruk durumu: " + queue);

        // Kuyruğun en başındaki öğeyi görmek
        System.out.println("Kuyruğun en başındaki eleman: " + queue.peek());  // 20
    }
}