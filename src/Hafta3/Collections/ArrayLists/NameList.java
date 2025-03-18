package Hafta3.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class NameList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç isim girmek istiyorsunuz?");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("İsim giriniz: ");
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("Girdiğiniz isimler: " + names);
    }
}