package Hafta1.Projeler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Gir");
        int sayi = scanner.nextInt();

        int num1 = 0, num2 = 1;
        for (int i = 0; i < sayi; i++) {
            System.out.println(" ," + num2 );
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }

    }
}
