package hafta3.collections.list.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class ReserveList {

    //Kolay: Kullanıcıdan alınan ArrayList<String> içindeki tüm elemanları tersten yazdıran bir program yaz.

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList();
        System.out.print("Kaç eleman girmek istiyorsunuz?");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("Girmek istediğiniz elemanı yazınız!");
            String names = sc.nextLine();
            nameList.add(names);
        }

        System.out.println(nameList);

        for (String names : nameList) {
            StringBuilder reserved = new StringBuilder(names);
            System.out.println(reserved.reverse());
        }
    }
}
