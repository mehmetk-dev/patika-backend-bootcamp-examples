package hafta1.prework;

import java.util.Scanner;

public class ArraysAlistirma {
    public static void Metd(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Tane Dizi Elemanı gireceksiniz");
        int digit = scanner.nextInt();
        int[] numbers = new int[digit];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + 1 + ". Sayıyı Giriniz:");
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0], max = numbers[0];
        for (int numbe : numbers) {
            if (min < numbe) {
                min = numbe;
            }
            if (max > numbe) {
                max = numbe;
            }
        }
        System.out.println(digit + " elemanlı bir dizi girdiniz, en büyük sayı: " + max + " , en küçük sayı :" + min);
    }

}
