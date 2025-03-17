package Hafta2.OOP.BankingSystem;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private CurrencyType currencyType;

    public BankAccount(CurrencyType currencyType, double balance, String accountNumber) {
        if (balance < 0){
            System.out.println("Eksi bakiye ile hesap oluşturamazsınız!!!");
        }
        this.currencyType = currencyType;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + " " +currencyType.getSymbol() + " eklendi güncel bakiyeniz : " + balance +currencyType.getSymbol());
        }
        else {
            System.out.println("Eksi bakiye yatıramazsınız");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", currencyType=" + currencyType +
                '}';
    }

    public void withDraw(double amount){
        if (amount > 0 &&  amount<= balance){
            balance-=amount;
            System.out.println(amount + currencyType.getSymbol() + " çekildi.Güncel bakiye: " + balance + currencyType.getSymbol());
        }else if(amount>balance){
            System.out.println("Yetersiz bakkiye");
        }else{
            System.out.println("Geçersiz tutar!");
        }
    }
}
