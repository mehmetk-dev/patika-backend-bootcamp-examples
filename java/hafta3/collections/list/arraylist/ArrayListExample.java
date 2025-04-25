package hafta3.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {


    public static void main(String[] args) {

//    List<String> myArrayList = new ArrayList<>();
//    List<String> myLinkedList = new LinkedList<>();
//
//        for (int i = 0; i < 1000000; i++) {
//            myLinkedList.add(String.valueOf(i));
//        }
//        System.out.println(myLinkedList);

        int size = 1_000_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // DOLDURMA
        long start1 = System.nanoTime();
        for (int i = 0; i < size; i++) arrayList.add(i);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        for (int i = 0; i < size; i++) linkedList.add(i);
        long end2 = System.nanoTime();

        System.out.println("ArrayList ekleme süresi: " + (end1 - start1) + " ns");
        System.out.println("LinkedList ekleme süresi: " + (end2 - start2) + " ns");

        // ORTAYA EKLEME
        long start3 = System.nanoTime();
        arrayList.add(size / 2, -1);
        long end3 = System.nanoTime();

        long start4 = System.nanoTime();
        linkedList.add(size / 2, -1);
        long end4 = System.nanoTime();

        System.out.println("ArrayList ortaya ekleme: " + (end3 - start3) + " ns");
        System.out.println("LinkedList ortaya ekleme: " + (end4 - start4) + " ns");

        int a = 130;
        byte b = (byte) a;
        System.out.println(b);

        Iterable<String> asd = new ArrayList<>();
        Collection collection = new ArrayList();
    }
}
