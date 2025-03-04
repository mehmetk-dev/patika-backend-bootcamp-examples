package projeler;

import java.util.Scanner;

public class aritmetikIslemler {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("3 Sayı Giriniz :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(num1 + (num2 * num3) - num2);
    }
}
