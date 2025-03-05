package projeler;

import java.util.Scanner;

public class numAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        int counter = 0, sum = 0;

        // 0'dan başlayarak num'a kadar olan sayıları kontrol et
        for (int i = 0; i <= num; i++) {
            if (i % 4 == 0 && i % 3 == 0) {
                sum += i;
                counter++;
                System.out.println("Bulunan sayı: " + i);
            }
        }

        // Sayı bulunamazsa hata mesajı ver
        if (counter == 0) {
            System.out.println("Girdiğiniz aralıkta 3 ve 4’e bölünebilen hiçbir sayı yok.");
        } else {
            double avg = (double) sum / counter;
            System.out.println("0 ile " + num + " arasındaki 3 ve 4’e bölünebilen sayıların ortalaması: " + avg);
        }

        scanner.close(); // Scanner'ı kapat
    }
}
