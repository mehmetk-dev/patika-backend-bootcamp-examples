package projeler;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi KM Türünden Giriniz: ");
        double distance = scanner.nextDouble();

        System.out.print("Yaşınızı Giriniz: ");
        double age = scanner.nextDouble();

        System.out.print("1)Tek Yön;\n2)Gidiş-Dönüş;\nYolculuk Tipini Seçiniz: ");
        int type = scanner.nextInt();

        if (distance <= 0 || age <= 0 || type != 1 && type != 2) {
            System.out.println("Hatalı Veri Girdiniz");
        } else {
        double price = distance * 0.10;
        double discount;

            if (age<12){
            discount = price * 0.50;
            price = price - discount;
            if (type == 2){
                price *= 0.8 * 2;
            } }
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
            System.out.println("Toplam Tutar : " + price);
        }
    }
}
