package hafta3.collections.maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümle giriniz: ");
        String cumle = scanner.nextLine();

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.charAt(i);

            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> maps : map.entrySet()) {
            System.out.println(maps.getKey() + " " + maps.getValue());
        }
    }
}
