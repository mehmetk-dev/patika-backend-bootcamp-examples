package projeler;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Artık yıl hesaplaması yapmak istediğiniz yılı giriniz: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
            System.out.println(year + " Artık yıldır.");
        }
        else{
            System.out.println(year + " artık yıl değildir.");
        }
    }
}
