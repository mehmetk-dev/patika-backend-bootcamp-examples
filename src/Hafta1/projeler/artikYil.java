package Hafta1.projeler;

import java.util.Scanner;

public class artikYil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Artık yıl hesaplaması yapmak istediğiniz yılı giriniz: ");
        int year = scanner.nextInt();

        /*Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

        1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir. */

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
            System.out.println(year + " Artık yıldır.");
        }
        else{
            System.out.println(year + " artık yıl değildir.");
        }

    }
}
