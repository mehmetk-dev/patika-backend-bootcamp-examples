package projeler;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {


        /*
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        */
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

        //Yaş Kontrolü ve Uçuş tipi kontrolleri
        if (age<12){
            discount = price * 0.50;
            price = price - discount;
                if (type == 2){
                price *= 0.8 * 2;
                }
        }
        else if(age >= 12 &&  age < 24){
            discount = price * 0.10;
            price = price - discount;
                if (type == 2){
                    price *= 0.8 * 2;
                }
        }
        else if(age > 65){
            discount = price * 0.30;
            price = price - discount;
                if (type == 2){
                    price *= 0.8 * 2;
                }
        } else {
                if (type == 2){
                    price *= 0.8 * 2;
                }
        }
        //Toplam tutarı yazdırma
        System.out.println("Toplam Tutar : " + price);
        }
    }
}
