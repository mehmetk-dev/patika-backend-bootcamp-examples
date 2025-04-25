package hafta1.projeler;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı gir");
        int num = scanner.nextInt();

        boolean asal = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                asal = false;
                break;
            }
        }
        if (asal){
            System.out.println(num + " asaldır");
        }else{
            System.out.println(num + " Asal değildir");
        }

        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i + " asaldır");
            }
            else{
                System.out.println(i + " asal değildir");
            }
        }
    }
}
