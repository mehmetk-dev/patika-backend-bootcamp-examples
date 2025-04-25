package hafta3.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        //HashSet
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1); //aynı değeri bir daha almıyor
        numbers.add(null);

        System.out.println(numbers);
        System.out.println("Mehmet".hashCode());

        // LinkedHashSet
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("İstanbul");
        cities.add("Keşan");
        cities.add("Edirne");
        cities.add("Edirne");
        System.out.println(cities);

        //TreeSet otomatik alfabetik ve küçükten büyüğe sıralar
        TreeSet<String> city = new TreeSet<>();
        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(12);
        numbers1.add(1);
        numbers1.add(-23);

        city.add("Zonguldak");
        city.add("Bursa");
        city.add("Edirne");
        city.add("Adana");
        System.out.println(city);
        System.out.println(numbers1);
    }
}
