package Hafta2.OOP.Game;

public class Game {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thor");
        Mage mage = new Mage("MantarKafa");
        Archer archer = new Archer("Legokafa");

        warrior.attack();
        mage.attack();
        archer.attack();

        warrior.getStatus();
        mage.getStatus();
        archer.getStatus();
    }
}
