package hafta3.collections.maps;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> films = new TreeMap<>();

        films.put(2010, "Inceptıon");
        films.put(2021, "Dune");
        films.put(1974, "Chinatown");
        films.put(2018, "Green Book");
        films.put(1954, "Seven Samurai");

        System.out.println(films.entrySet());

        for (Map.Entry<Integer, String> entir : films.entrySet()) {
            System.out.println(entir.getValue() + " = " + entir.getKey());
        }
    }
}
