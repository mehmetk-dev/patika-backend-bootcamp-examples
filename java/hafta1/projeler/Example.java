package hafta1.projeler;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ters yıldız yazan program

//        for (int i = 10; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();}
//
//              fibonacci

//        System.out.println("Bir sayı giriniz");
//        int num =  scanner.nextInt();
//
//        int n1 = 1, n2 = 1;
//        int NextNumber;
//        while (n2<num){
//            System.out.println(" ,"+ n2);
//            NextNumber = n1+n2;
//            n1 = n2;
//            n2= NextNumber;}

        // mükemmel sayı
//        int sum = 0;
//        System.out.println("Bir saayı giriniz: ");
//        int num = scanner.nextInt();
//
//        for (int i = 1; i < num; i++) {
//            if (num % i==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum == num ? num + "Sayı Mükemmeldir" : num + "sayı mükemmel değildir");

        //asal sayı

        System.out.println("Bir sayı girinizz");
        int num = scanner.nextInt();
        boolean prime = true;

        for (int i = 2; i < num; i++) {
            if (num%i ==0 ){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? num + " sayı asaldır" : num + " sayı asal değildir");
    }
}
