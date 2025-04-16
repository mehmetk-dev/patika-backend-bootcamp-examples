package Hafta1.Prework;

public class Transpose {
    public static void main(String[] args) {

        int [][] numbers = {
                {2,3,4},
                {5,6,4}
        };
        int rows = numbers.length;  // Orijinal matrisin satır sayısı
        int cols = numbers[0].length; // Orijinal matrisin sütun sayısı

        int[][] transpose = new int[cols][rows]; // Yeni matris: sütunlar ve satırlar yer değişti

        // Orijinal matrisi ekrana yazdır
        System.out.println("Matris: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + "\t"); // "\t" ile düzgün hizalama sağlıyoruz
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = numbers[i][j];
            }
        }
        System.out.println("Transpoze matris: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}
/*
package Hafta1.prework;

public class transpoz {
    public static void main(String[] args) {

        int [][] numbers = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int rows = numbers.length;      // Orijinal matrisin satır sayısı
        int cols = numbers[0].length;   // Orijinal matrisin sütun sayısı

        int[][] transpose = new int[cols][rows]; // Transpoz matrisini oluşturduk

        // Orijinal matrisi ekrana yazdır
        System.out.println("Matris: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + "\t"); // "\t" ile düzgün hizalama sağlıyoruz
            }
            System.out.println();
        }

        // Transpoz işlemi (satır ve sütun yer değiştiriliyor)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = numbers[i][j];
            }
        }

        // Transpoz matrisini ekrana yazdır
        System.out.println("Transpoze: ");
        for (int i = 0; i < cols; i++) {  // Transpoz matrisinin satır sayısı = cols
            for (int j = 0; j < rows; j++) {  // Transpoz matrisinin sütun sayısı = rows
                System.out.print(transpose[i][j] + "\t"); // "\t" ile hizalama
            }
            System.out.println(); // Satır tamamlanınca alt satıra geç
        }
    }
} */
