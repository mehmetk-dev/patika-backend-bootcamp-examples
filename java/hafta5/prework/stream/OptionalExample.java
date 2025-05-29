package hafta5.prework.stream;

import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String name = null;
        String name1 = "Mehmet";
        //System.out.println(name.length());

        Optional<String> optionalString = Optional.of("Empty");
        System.out.println(optionalString.get());
        System.out.println(optionalString.isEmpty());


        Optional<String> name3 = Optional.ofNullable("isEmpty");
        System.out.println(name3.isPresent());

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty.isPresent());

        if (optionalString.isPresent()) {
            System.out.println(optionalString.get());
        } else System.out.println("Boş");

        System.out.println(optionalEmpty.orElse("Hello"));
        optionalString.ifPresent(n -> System.out.println(n));

        String result = optionalString.orElse("Bilinmeyen kullanıcı");
        System.out.println(result);

        optionalString.orElseGet(() -> "bilinmeyen kullanıcı");

        //optionalEmpty.orElseThrow(() -> new NegativeArraySizeException("Hatalısın gardaşım"));

        List<String> names = List.of("Ahmet", "Mehmet", "Burhan", "Fatma");
        Optional<String> m = names.stream()
                .filter(n -> n.startsWith("F"))
                .findAny();
        System.out.println(m.get());

        List<Integer> list = names.stream()
                .map(names1 -> names1.length())
                .toList();

        list.forEach(System.out::println);
    }
}
