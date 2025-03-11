package Hafta2.Projeler;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikkat Edilmesi Gerekenler\n" +
                "1-En az 8 karakter içermeli\n" +
                "2-Space karakteri içermemeli\n" +
                "3-İlk harf büyük harf olmalı\n" +
                "4-Son karakteri ? olmalı");
        System.out.print("Lütfen Şifrenizi Giriniz:");
        String inputPassword = scanner.nextLine();

        if (inputPassword.length() >= 8 && !inputPassword.contains(" ")  //Girilen şifrenin uzunluk ve boşluk kontrolü
                && Character.isUpperCase(inputPassword.charAt(0)) && inputPassword.endsWith("?")) { //İlk harf büyük mü ve ? ile mi bitiyor kontrolü
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }
    }
}
