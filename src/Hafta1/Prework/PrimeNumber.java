package Hafta1.Prework;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (prime(i)){
                System.out.println(i);
            }
        }



    }
    public static boolean prime(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}

