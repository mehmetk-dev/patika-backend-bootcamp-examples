package hafta3.collections.list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AlphabeticList {
    public static void main(String[] args) {


        List<String> cities = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç şehir girmek istiyorsunuz");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Şehir giriniz: ");
            String name = scanner.nextLine();
            cities.add(name);
        }
        Collections.sort(cities);
        System.out.println(cities);
    }
}
