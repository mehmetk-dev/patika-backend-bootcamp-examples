package Hafta3.Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz: ");
        String word = scanner.nextLine().toLowerCase(); //Kullanıcıdan veri alınması ve küçük harflere dönüştürülmesi

        // TreeMap kullanıyoruz çünkü sıralama gereksinimimiz var
        Map<Character,Integer> chars = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {
            Integer tekrarSayisi = 0; // Her harf için sayaç sıfırlanıyor

            for (int j = 0; j < word.length(); j++) {
                if (Character.isLetter(word.charAt(i))){ //Gelen karakter harf olup olmadığının kontrolü

                    if (word.charAt(i) == word.charAt(j)){ //Harf tekrarı kontrolü
                        tekrarSayisi++;
                    }
                    chars.put(word.charAt(i),tekrarSayisi);
                }
            }
        }
        //Harfleri ve tekrarlarını ekrana yazdırma
        for (Map.Entry<Character,Integer> entry : chars.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
