package Hafta1.Projeler;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı al
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        int sum = 0;

        // 1'den num'a kadar bölenleri topla
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Sonucu kontrol et ve ekrana yazdır
        if (sum == num) {
            System.out.println(num + " sayısı mükemmel sayıdır. ");
        } else {
            System.out.println(num + " sayısı mükemmel sayı değildir. ");
        }

        scanner.close(); // Scanner'ı kapat
    }
}
