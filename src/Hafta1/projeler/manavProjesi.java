package Hafta1.projeler;

import java.util.Scanner;

public class manavProjesi {
    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        double armutKg = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKg = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKg = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKg = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlıcanKg = scanner.nextDouble();

        double toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) +
                (patlıcan * patlıcanKg);

        System.out.println("Toplam Fiyat : " + toplam  + " TL");


    }
}