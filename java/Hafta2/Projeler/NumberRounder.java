package Hafta2.Projeler;

import java.util.Scanner;

public class NumberRounder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ondalıklı bir sayı giriniz: ");
        double num = scanner.nextDouble();
        //Kullanıcıdan sayı alıyoruz

        System.out.println("Aşağı yuvarlama: " + (int)Math.floor(num)); // Aşağı yuvarlamak için floor kullanıyoruz
        System.out.println("Yukarı yuvarlama: " + (int)Math.ceil(num)); // Yukarı yuvarlamak için ceil kullanıyoruz
        System.out.println("En Yakın Tam Sayı: " + Math.round(num));    // En yakına yuvarlamak için round kullanıyoruz
    }
}
