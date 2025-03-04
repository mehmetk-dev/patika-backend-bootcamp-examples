package projeler;

import java.util.Scanner;

public class boyKiloIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Giriniz (Örnek : 1,75) : ");
        double height = scanner.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        double weight = scanner.nextDouble();

        double bmi = weight /(height * height);

        System.out.println("Vücut Kitle İndeksiniz : "+ bmi);
    }
}