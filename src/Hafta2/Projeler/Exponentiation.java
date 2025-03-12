package Hafta2.Projeler;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayıyı Giriniz: ");
        int base = scan.nextInt();
        System.out.println("Üssünü Giriniz: ");
        int exponent = scan.nextInt();

        System.out.println(powerCalculate(base,exponent));
    }
    public static int powerCalculate(int num,int pow){
        if (pow == 1) return num;
        if (pow == 0 || num == 1) return 1;

        return num * powerCalculate(num,pow-1);
    }
}
