package Hafta3.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        ArrayList<Integer> numbList = new ArrayList();
        System.out.print("Kaç eleman girmek istiyorsunuz?");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Girmek istediğiniz elemanı yazınız!");
            numbList.add(sc.nextInt());
        }

        int largestNum = numbList.getFirst(),smallestNum = numbList.getFirst();

        /*
        for (Integer numbers : numbList){
            if (numbers > largestNum) largestNum = numbers;
            if (numbers < smallestNum) smallestNum = numbers;
            System.out.println(numbers);
        }
        */

        largestNum = Collections.max(numbList);
        smallestNum = Collections.min(numbList);
        System.out.println("Dizideki en büyük sayı: " + largestNum + "\nEn küçük sayı: " + smallestNum);

    }
}
