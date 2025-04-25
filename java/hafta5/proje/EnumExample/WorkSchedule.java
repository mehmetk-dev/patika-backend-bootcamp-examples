package hafta5.proje.EnumExample;

import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir gün giriniz(Örneğin: MONDAY):");
        String inputDay = scanner.nextLine().toUpperCase();

        //Alınan değerin kontrolü
        if (Day.isValidDay(inputDay)) {
            Day day = Day.valueOf(inputDay);
            System.out.println(inputDay + " için çalışma saati " + day.getWorkHours());
        } else {
            System.out.println("Geçersiz bir gün girdiniz.");
        }
    }

}
