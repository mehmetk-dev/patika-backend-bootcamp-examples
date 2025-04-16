package Hafta2.OOP.Game;

public class Warrior extends Character{

    public Warrior(String name) {
        super(name, 1500, 250);
    }

    @Override
    public void attack() {
        System.out.println(name + " kılıcını savuruyor " + attackDamage +" vurdu.");
    }
}
