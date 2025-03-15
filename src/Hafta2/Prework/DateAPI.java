package Hafta2.Prework;

import java.time.LocalDate;

public class DateAPI {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().plusMonths(1));

        LocalDate tarih2 = LocalDate.now();
        var tarih = LocalDate.of(2050,11,24);
        System.out.println(tarih);

        var expireDate = LocalDate.of(2024,10,12);

        System.out.println(tarih2.isBefore(expireDate));
    }
}
