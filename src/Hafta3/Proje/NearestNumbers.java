package Hafta3.Proje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NearestNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 adet pozitif ve benzersiz sayı giriniz");

        //Numbers listesinin 10 tane elemanı olana kadar döngü devam eder
        while(numbers.size() < 10) {
            int num = scanner.nextInt();
            if (num < 0 || numbers.contains(num)){
                // Eğer sayı negatifse veya daha önceden girilmişse kabul edilmez
                System.out.println("Yanlış sayı girişi");
            }
            else{
                numbers.add(num);
                System.out.println(numbers.size() +". Numara: " + num);
            }
        }
        findClosestPair(numbers);
    }

    public static void findClosestPair(ArrayList<Integer> numbers){
        Collections.sort(numbers); // Numbers listesini sıralıyoruz.

        int minDifference = Integer.MAX_VALUE; // Farkı en başta en büyük alıyoruz ki diff değişkeni ne olursa olsun güncellesin diye.
        int closestPairFirst = -1, closestPairSecond = -1;

        for (int i = 0; i < numbers.size() - 1; i++) {
            int diff = numbers.get(i+1) - numbers.get(i); //diff değişkeni numbers'in 1. ve 2. elemanının birbirinden farkını tutar.
            if (diff < minDifference){//Eğer sıradaki fark daha azsa sayıları ve farkı günceller
                minDifference = diff;
                closestPairFirst = numbers.get(i);
                closestPairSecond = numbers.get(i+1);
            }
        }
        System.out.println("En yakın iki sayı: " + closestPairFirst + " ve " + closestPairSecond);
    }
}

