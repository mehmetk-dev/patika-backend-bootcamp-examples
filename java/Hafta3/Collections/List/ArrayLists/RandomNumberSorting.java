package Hafta3.Collections.List.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomNumberSorting {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(10,100));
        }
        System.out.println("Original List");
        System.out.println(numbers);

        System.out.println("Inline list");
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
