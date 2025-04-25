package hafta1.projeler;

import java.util.Scanner;

public class UcakBiletiProgrami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi KM Türünden Giriniz: ");
        double distance = scanner.nextDouble();

        System.out.print("Yaşınızı Giriniz: ");
        double age = scanner.nextDouble();

        System.out.print("1)Tek Yön;\n2)Gidiş-Dönüş;\nYolculuk Tipini Seçiniz: ");
        int type = scanner.nextInt();

        //Hatalı Veri Kontrolü
        if (distance <= 0 || age <= 0 || type != 1 && type != 2) {
            System.out.println("Hatalı Veri Girdiniz");
        } else {
            //KM Başına ücret hesaplaması
        double price = distance * 0.10;
        double discount;

        //Yaş Kontrolü
        if (age<12){
            //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
            discount = price * 0.50;
            price = price - discount;
        } else if(age >= 12 &&  age < 24){
            //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
            discount = price * 0.10;
            price = price - discount;
        } else if(age > 65){
            //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
            discount = price * 0.30;
            price = price - discount; }
        // Bilet Tipi kontrolü
        if (type == 2){
            // Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
            price *= 1.6;
        }
        //Toplam tutarı yazdırma
        System.out.println("Toplam Tutar : " + price);
        }
    }
}
