package Hafta5.Prework.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {


        List<String> names = List.of("mehmet", "enes", "emre", "fatmagül", "mehmet", "fatma", "enes", "emre");

        List<String> list = names.stream()
                .filter(filt -> filt.startsWith("m"))
                .toList();

        System.out.println(list);

        List<String> list1 = names.stream()
                .collect(Collectors.toSet()).stream().toList();

        Set<String> collect = names.stream().collect(Collectors.toSet());

        System.out.println(list1);
        System.out.println(collect);

        Map<String, Integer> map1 = list1.stream()
                .collect(Collectors.toMap(name -> name, String::length));

        System.out.println(map1);


        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Integer result = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(result);


        Integer result2 = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(result2);

        List<Integer> sayilar = List.of(10, 20, 30, 40, 50);

        boolean isTrue = sayilar.stream()
                .allMatch(n -> n > 5);

        System.out.println(isTrue);

        boolean buyukMu = sayilar.stream()
                .anyMatch(n -> n > 40);

        System.out.println(buyukMu);

        boolean kucukMu = sayilar.stream()
                .noneMatch(n -> n % 3 == 0);

        System.out.println(kucukMu);
    }
}
