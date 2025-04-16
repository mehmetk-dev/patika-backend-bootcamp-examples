package Hafta2.Prework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAPIFormating {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        DateTimeFormatter dataformati = DateTimeFormatter.ISO_DATE;
        System.out.println(today.format(dataformati));
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        String date = "11/03/2026";

        DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localdaste = LocalDate.parse(date,formatterr);

        System.out.println(localdaste.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
    }
}
