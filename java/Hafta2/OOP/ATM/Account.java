package Hafta2.OOP.ATM;

public class Account {

    private String userId;
    private String password;
    private int balance;

    public Account(String userId, String password, int balance) {
        this.userId = userId;
        this.password = password;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println(amount + " TL yatırıldı. Yeni bakiyeniz: "+ balance);
    }

    public void withDraw(int amount){
        if (balance<amount){
            System.out.println("Yeterli bakiyeniz yok.");
        }else{
            balance -= amount;
            System.out.println(amount + " TL eklendi. Yeni bakiye: " + balance);
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
