package Hafta2.Prework;

import java.util.Scanner;

public class PalidromNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scanner.nextInt();

        System.out.println(palidromControl(num));

        for (int i = 0; i < 1000; i++) {
            if (palidromControl(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean palidromControl(int n){
        int originalNum = n;
        int reservedNum = 0;

        while (n>0){
            int digit = n % 10;
            reservedNum = (reservedNum * 10) + digit;
            n /= 10;
        }
       return reservedNum == originalNum;
    }
}
