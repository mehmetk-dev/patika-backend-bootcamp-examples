package hafta2.oop.atm;

import java.util.Scanner;

public class Login {
    public boolean login(Account account){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz");
        String userId = scanner.nextLine();
        System.out.println("Şifrenizi giriniz");
        String password = scanner.nextLine();

        if (account.getUserId().equals(userId) && account.getPassword().equals(password)){
            return true;
        }else{
            System.out.println("Kullanıcı adı veya şifre yanlış tekrar deneyiniz.");
            return false;
        }
    }
}
