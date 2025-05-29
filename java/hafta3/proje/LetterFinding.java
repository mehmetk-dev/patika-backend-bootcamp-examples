package hafta3.proje;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LetterFinding {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<>();

        while (array.size() < 4) {
            Random random = new Random();
            //'a' ASCII değeri 97 olduğundan, buna 0 ile 25 arası bir sayı eklenerek 'a' ile 'z' arasında rastgele bir harf seçilir.
            char randomChar = (char) ('a' + random.nextInt(26));
            array.add(String.valueOf(randomChar)); //Array'e ekleyebilmek için String'e dönüştürüyoruz.
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Bir harf giriniz");
            String chars = scanner.nextLine();
            if (array.contains(chars)) { // Array'de girilen harf kontrolü
                int index = array.indexOf(chars);
                array.set(index, "found"); //Set metoduyla girdiğimiz index'teki değeri değiştiriyoruz.
            } else {
                array.add(chars);
            }
        }
        System.out.println(array);
    }
}
