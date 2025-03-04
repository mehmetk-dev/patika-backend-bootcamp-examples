package projeler;

import java.util.Scanner;

public class aritmetikIslemler {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan 3 tane değişken alıyoruz.
        System.out.print("A,B,C Sayılarını Sırayla Giriniz :");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();

        // Soruda istendiği gibi işlem önceliğine göre hesaplama yapıyoruz
        // İşlem sırası : a + b * c - b
        System.out.println("İşlem sonucu : " + (((numA + numB) * numC) - numB));
    }
}
