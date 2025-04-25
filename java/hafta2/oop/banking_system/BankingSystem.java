package hafta2.oop.banking_system;

import java.util.Scanner;

public class BankingSystem {

    private static Customer[] customers = new Customer[10];

    public static void main(String[] args) {


        Customer customer = new Customer("Mehmet","Kerem","mehmet619","12118421202");
        customers[0] = customer;
        menu();
    }

    public static void menu(){

        Scanner sc = new Scanner(System.in);

        validatePassword(sc);

        int choise;
        do {
            printMenu();

            choise = sc.nextInt();

            switch (choise){
                case 1:
                    createBankAccount(sc);
                    break;

                case 2:
                   customers[0].listAccount();
                   break;

                case 3:
                    customers[0].listAccount();
                    System.out.println("İşlem yapmak istediniz hesabı seçiniz");
                    int selectedIndex = sc.nextInt();
                    selectedIndex -=1;
                    BankAccount selectedAccount = customers[0].getBankAccounts()[selectedIndex];

                    int subChoise;
                    do {

                        System.out.println("---" + selectedAccount.getAccountNumber() + "hesabı için işlem yapıyorsunz!");
                        System.out.println("1-Bakiye sorgulama");
                        System.out.println("2-Para Yatır");
                        System.out.println("3-Para çek");
                        System.out.println("0-Ana menüye dön...");

                        subChoise = sc.nextInt();

                        switch (subChoise){
                            case 1:
                                System.out.println(selectedAccount.getAccountNumber() + " " +selectedAccount.getBalance()
                                        + " " +selectedAccount.getCurrencyType().getSymbol());
                                break;
                            case 2:
                                System.out.println("Ne kadar para yatırmak istiyorsunuz");
                                double amount = sc.nextDouble();
                                selectedAccount.deposit(amount);
                                break;
                            case 3:
                                System.out.println("Ne kadar para çekmek istiyorsunuz");
                                double drawAmount = sc.nextDouble();
                                selectedAccount.withDraw(drawAmount);
                                break;
                            case 0:
                                System.out.println("Ana menüye Dönüyorsunuz");
                                break;
                        }
                    }while(subChoise != 0);
                    break;


                case 4:
                    System.out.println("Çıkış Yapılıyor");
                    break;

                default:
                    System.out.println("Geçersiz işlem");
            }
        }while(choise !=4);

        System.out.println("Çıkış yaptınız");
    }

    private static void printMenu() {
        System.out.println("------Bankacılım işlemleri------");
        System.out.println("1-Yeni Hesap Aç");
        System.out.println("2-Hesaplarını listele");
        System.out.println("3-Hesap seç ve işlem yap");
        System.out.println("4-Çıkış yap");
        System.out.print("Seçiminizi Yapınız: ");
    }

    private static void createBankAccount(Scanner sc) {
        System.out.print("Başlangıç Bakiyesini Giriniz: ");
        double amount = sc.nextDouble();
        System.out.println("Para Birimini Seçiniz 1-TL | 2-DOLAR | 3-EURO | 4-ALTIN");
        int currency = sc.nextInt();
        CurrencyType currencyType =switch (currency){
            case 1 -> CurrencyType.TL;
            case 2 -> CurrencyType.DOLAR;
            case 3 -> CurrencyType.EURO;
            case 4 -> CurrencyType.GOLD;
            default -> {
                System.out.println("Yanlış birim seçtiniz ");
                yield CurrencyType.TL;
            }
        };
        String customerName = customers[0].getName();
        String accountNumber = customerName.charAt(0) + "-"+ customerName.length()+ "" + currency;

        BankAccount bankAccount = new BankAccount(currencyType,amount,accountNumber);

        customers[0].addAccount(bankAccount);
    }

    private static void validatePassword(Scanner sc) {
        System.out.println("Merhaba " + customers[0].getName());
        int wrongPasswordCounter=0;

        do {
            System.out.println("Şifrenizi Giriniz");
            String password = sc.nextLine();

            if (!password.equals(customers[0].getPassword())){
                System.out.println("Yanlış şifre girdiniz");
                wrongPasswordCounter++;
            }else{
                System.out.println("Şifrenizi doğru girddiniz bankacılık menüsüne aktarılıyorsunuz");
                break;
            }
        }while(wrongPasswordCounter<4);
    }
}
