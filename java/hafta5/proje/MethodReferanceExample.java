package hafta5.proje;

import java.util.ArrayList;
import java.util.List;

public class MethodReferanceExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Geleneksel yöntemle liste elemanlarını yazdırma

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        // Method referance ile tek satırda yazıldı.
        names.forEach(System.out::println);
    }
}
