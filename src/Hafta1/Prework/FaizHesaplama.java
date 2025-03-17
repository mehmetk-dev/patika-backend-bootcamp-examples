package Hafta1.Prework;

import java.util.Scanner;

public class FaizHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç para yatırmak istediğinizi giriniz.");
        int balance = scanner.nextInt();
        System.out.println("Kaç Yıl Vade istiyorsunuz?");
        int term = scanner.nextInt();
        double balanceWithInterest= balance;
        final double interestRate = 0.06;

        for (int i = 1; i <= term; i++) {
            balanceWithInterest += balanceWithInterest * (interestRate);
            System.out.println(i +".Yıl Paranız = " + (int)balanceWithInterest );
        }
    }
}
