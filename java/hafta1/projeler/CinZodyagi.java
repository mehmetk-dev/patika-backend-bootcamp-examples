package hafta1.projeler;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        int dateOfBirth = scanner.nextInt();

        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        int zodiac = dateOfBirth % 12;

        String result = switch (zodiac) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Geçersiz sayı girdiniz";
        };
        System.out.println("Çin Zodyağı Burcunuz : " + result);
    }
}
