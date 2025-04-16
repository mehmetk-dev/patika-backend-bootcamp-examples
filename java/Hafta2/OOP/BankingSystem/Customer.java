package Hafta2.OOP.BankingSystem;

public class Customer {

    private String name;
    private String surname;
    private String password;
    private String identity;
    private BankAccount[] bankAccounts;
    private int bankAccountCounter = 0;

    public Customer(String name, String surname, String password, String identity) {
        if (password.length() < 8 || password.length() >= 12){
            System.out.println("Şifreniz 8 haneden uzun olmalıdır ve en fazla 12 haneli olabilir.");
        }else{
            this.name = name;
            this.surname = surname;
            this.password = password;
            this.identity = identity;
            bankAccounts = new BankAccount[4];
            System.out.println("Kullanıcı oluşturuldu" + this);
        }
    }

    public void addAccount(BankAccount bankAccount){
        if (bankAccountCounter < bankAccounts.length){
            bankAccounts[bankAccountCounter] = bankAccount;
            bankAccountCounter++;
            System.out.println("Yeni hesap eklendi " + bankAccount.getAccountNumber());
        }else{
            System.out.println("Maksimum hesap limitine ulaşıldı.");
        }
    }
    public void listAccount(){
        for (BankAccount account: bankAccounts)
            System.out.println(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
