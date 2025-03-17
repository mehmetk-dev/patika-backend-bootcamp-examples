package Hafta1.prework;

public class CarpimTablosu extends ArraysAlistirma {
    public static void main(String[] args) { //MultiplicationTable

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = "  +(i * j) + " \t");
            }
            System.out.println();
        }
    }
}
