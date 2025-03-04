package projeler;

import java.util.Scanner;

public class aritmetikIslemler {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A,B,C Sayılarını Sırayla Giriniz :");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();

        System.out.println("İşlem sonucu : " + (((numA + numB) * numC)- numB));
    }
    /*
        Soru: Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın.

        İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.

        Örnek: Kullanıcıdan alınan sayılar 10, 2 ve 3 olsun. Yapılacak işlem ise 10+2*3-2 şeklinde olsun.

        İşlemleri kullanıcı girmeyecek olup kodunuzda yazmış olmalısınız.

        İpucu 1: Kullanıcıdan veri almak için `Scanner` sınıfını kullanabilirsiniz.

        İpucu 2: Sonucu ekrana yazdırmak için `System.out.println()` metodunu kullanabilirsiniz.
 */
}
