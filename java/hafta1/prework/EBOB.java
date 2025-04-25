package hafta1.prework;

import java.util.Scanner;

public class EBOB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int s1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int s2 = scanner.nextInt();

        System.out.println("İki sayının ebobu : " + ebobHesaplama(s1,s2));
    }

    public static double ebobHesaplama(int sayi1,int sayi2){
        int ebob = 1;
        for (int i = 1; i<=sayi1 && i<= sayi2 ; i++){
            if ((sayi1 % i == 0) && (sayi2 % i == 0)){
                ebob = i;
            }
        }
        return ebob;
    }
}
