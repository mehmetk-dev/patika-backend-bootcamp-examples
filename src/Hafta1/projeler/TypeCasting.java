package Hafta1.projeler;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int num = scanner.nextInt();
        System.out.printf("Bir ondalıklı sayı giriniz: ");
        double decimalNum = scanner.nextDouble();

        // Integerden double'a dönüştürüyoruz
        System.out.println("Girdiğiniz tam sayının ( " + num + " ) ondalıklı şekli: " + (double) num );

        // double'dan integer'a dönüştürüyoruz
        System.out.println("Girdiğinniz ondalıklı sayının ( " + decimalNum + " ) tam sayı şekli: " + (int) decimalNum);

    }

}
