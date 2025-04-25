package hafta2.oop.atm;

import java.util.Scanner;

public class ATM {

    public void work(Account account) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza hoş geldiniz...");
        System.out.println("************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("************************");

        int entryCounter = 3;
        while (true) {
            if (login.login(account)) {
                System.out.println("Giriş başarılı...");
                break;
            } else {
                entryCounter--;
                System.out.println("Giriş başarısız! Kalan giriş hakkınız: " + entryCounter);
            }
            if (entryCounter == 0) {
                System.out.println("Giriş hakkınız bitti...");
                return;
            }
        }

        // **İşlem Menüsünü Döngü İçine Aldık**
        while (true) {
            System.out.println("************************");
            System.out.println("İşlem seçiniz");
            System.out.println("1 - Bakiye Görüntüle");
            System.out.println("2 - Para Yatır");
            System.out.println("3 - Para Çek");
            System.out.println("Çıkmak için 'q' ya basınız");
            System.out.println("************************");

             // Kullanıcı giriş yapıyor

            while (true) {
                System.out.println("İşlem seçiniz");


                String result = scanner.nextLine(); // Kullanıcı giriş yapıyor

                switch (result) {
                    case "1":
                        System.out.println("Bakiyeniz: " + account.getBalance());
                        break;
                    case "2":
                        System.out.println("Yatırmak istediğiniz miktarı giriniz:");
                        int depositAmount = scanner.nextInt();
                        scanner.nextLine();  // Buffer temizleme
                        account.deposit(depositAmount);
                        break;
                    case "3":
                        System.out.println("Çekmek istediğiniz miktarı giriniz:");
                        int withdrawAmount = scanner.nextInt();
                        scanner.nextLine();  // Buffer temizleme
                        account.withDraw(withdrawAmount);
                        break;
                    case "q":
                        System.out.println("İşlem sonlandırılıyor...");
                        return; // Döngüyü kır ve çık
                    default:
                        System.out.println("Geçersiz işlem! Lütfen tekrar deneyin.");
                }
            }
        }
    }
}