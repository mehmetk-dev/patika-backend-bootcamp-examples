package hafta2.projeler;

import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");// kontrol edilecek sayı
        int num = scan.nextInt();

        boolean result = isPrime(num, num / 2); //böleni (divisor)/2 olarak alıyoruz

        if (result) {
            System.out.println(num + " sayısı ASALDIR!");
        } else {
            System.out.println(num + " sayısı ASAL değildir !");
        }
        // Exponentiation ex = new Exponentiation();
        Exponentiation.powerCalculate(1, 2);
        Exponentiation ex = new Exponentiation();
        ex.pow(1);

    }

    public static boolean isPrime(int number, int divisor) {
        if (number <= 1) { // eğer sayı 1'se asal değildir
            return false;
        }
        if (divisor == 1) { // eğer bölen 1'e kadar gelebildiyse sayı asaldır
            return true;
        }
        if (number % divisor == 0) { // eğer number , divisor'a tam bölünüyorsa asal değildir
            return false;
        }
        return isPrime(number, divisor - 1); // bir sonraki böleni kontrol et
    }
}
