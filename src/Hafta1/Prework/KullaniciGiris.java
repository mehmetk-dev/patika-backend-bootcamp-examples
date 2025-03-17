package Hafta1.Prework;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String myUser = "mehmetkerem", myPassword = "mehmet619";
        int girisHakki = 3;

        while(true){
            System.out.println("Kullanıcı Adınızı Giriniz");
            String userId = scanner.nextLine();
            System.out.println("Lütfen Şifrenizi Giriniz");
            String password = scanner.nextLine();
            if (girisHakki==0){
                System.out.println("Hakkınız Kalmamıştır");
                break;
            }
            if (userId.equals(myUser)){
                if (password.equals(myPassword)){
                    System.out.println("Bilgiler Doğru giriş Yapılıyor");
                    break;
                } else{
                    System.out.println("Şifre Yanlış Tekrar Deneyin Kalan Hak= " + girisHakki);
                    girisHakki--;
                }
            }
            else{
                System.out.println("Kullanıcı Adı Yanlış Tekrar Deneyiniz Kalan Hak= " + girisHakki);
                girisHakki--;
            }
        }

    }
}
