package Hafta2.Prework;

import java.util.Scanner;

public class PowerNumberExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi =  scanner.nextInt();
        System.out.println("Kaçıncı üssünü almak istersiniz?");
        int üs =  scanner.nextInt();

        System.out.println(powNum(3,3));
    }

    public static int powNum(int base, int power){
        if (power == 0) return 1;

        return base * powNum(base,power-1);
        // 3 * pownum(3,3)
        // 3 * pownum(3,2)
        // 3 * pownum(3,1)
    }
}
