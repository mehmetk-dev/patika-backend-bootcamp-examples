package Hafta1.prework;

import java.util.Scanner;

public class NarcissisticNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");

        while (!scanner.hasNextInt()) {
            System.out.println("Geçersiz Giriş! Lütfen bir tam sayı giriniz.");
            scanner.next();  // ❗ Hatalı girdiyi temizle
        }
        int num = scanner.nextInt();
        scanner.close();

        int digitCount = 0, sum = 0, lastDigit = 0;
        int tempNumber = num;  // Orijinal sayıyı değiştirmemek için kopyasını aldık

        // ✅ Basamak sayısını hesapla
        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCount++;
        }

        tempNumber = num; // Tekrar başlangıca döndür

        // ✅ Armstrong kontrolü
        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;  // Son basamağı al
            int powerResult = 1;  // Her basamak için üs hesaplayacağız

            // ✅ lastDigit ^ digitCount hesapla (Kendi pow fonksiyonumuz)
            for (int i = 0; i < digitCount; i++) {
                powerResult *= lastDigit;
            }

            sum += powerResult; // ✅ Üs işlemini toplama ekle
            tempNumber /= 10;  // ✅ Bir basamak azalt
        }

        // ✅ Armstrong kontrolü
        if (sum == num) {
            System.out.println("Girdiğiniz Sayı Armstrongtur.");
        } else {
            System.out.println("Girdiğiniz sayı Armstrong değildir. (Toplam: " + sum + ")");
        }
    }
}