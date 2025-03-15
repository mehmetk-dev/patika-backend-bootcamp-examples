package Hafta2.OOP.Game;

public class Character {

    protected String name;
    protected int health;
    protected int attackDamage;

    public Character(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public void attack(){
        System.out.println(name + " karakteri atak yapıyor " + attackDamage + " hasar verdi.");
    }
    public void getStatus(){
        System.out.println("-------------------------");
        System.out.println("Karakter "+ name);
        System.out.println("Canı " + health);
        System.out.println("Hasarı " + attackDamage);
        System.out.println("-------------------------");
    }
}
