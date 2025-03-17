package Hafta2.OOP.Beyblade;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Beyblade Programına Hoşgeldiniz");
        System.out.println("Çıkmak için 'q'ye basınız.");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Hangi beybladeyi üretmek istiyorsunuz??");
            String islem = scanner.nextLine();

            if (islem.equalsIgnoreCase("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade == null){
                    System.out.println("Lütfen geçerli bir bayblade ismi giriniz..." + islem);
                }else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarıCikar();
                }
            }
        }
    }
}
