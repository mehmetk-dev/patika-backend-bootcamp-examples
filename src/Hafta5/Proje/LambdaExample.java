package Hafta5.Proje;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
//        // Sayıları iki katına çıkarma (Geleneksel yöntem)
//        for (int i = 0; i < numbers.size(); i++) {
//            numbers.set(i, numbers.get(i) * 2);
//        }
//        // Sonuçları yazdırma
//        for (int number : numbers) {
//           System.out.println(number);
//        }

        //Function<Integer,Integer> square = x -> x * x;
        Function<Integer,Double> square = x -> Math.pow(x,2);

        numbers.forEach(n -> System.out.println(square.apply(n)));
    }






}


