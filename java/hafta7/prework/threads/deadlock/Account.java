package hafta7.prework.threads.deadlock;

public class Account {
    private int balance = 10000;

    public void withdrawMoney(int amount){
        balance -= amount;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public static void moneyTransfer(Account account1,Account account2,int amount){
        account1.withdrawMoney(amount);
        account2.deposit(amount);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
