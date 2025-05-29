package hafta7.prework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};

        //System.out.println(numbers[6]);//unCheckedException

        try {
            Scanner scanner = new Scanner(new File("text.txt"));
        } catch (ArithmeticException | IOException e) {
            System.out.println("Dosya bulunamadı.  " + e);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
