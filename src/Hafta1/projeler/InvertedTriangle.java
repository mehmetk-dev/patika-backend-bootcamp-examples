package Hafta1.projeler;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = scanner.nextInt();

        // Satırları kontrol eden dış döngü
        for (int i = n; i >= 1; i--) {
            // Her satırda yıldızları çizen iç döngü
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Bir alt satıra geç
        }

        scanner.close(); // Scanner'ı kapat
    }
}