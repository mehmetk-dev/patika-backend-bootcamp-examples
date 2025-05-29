package hafta3.collections.list.linkedlist;


import java.util.LinkedList;
import java.util.Scanner;

public class ReservedNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.println("Bir sayı giriniz");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


//        StringBuilder reserved = new StringBuilder(String.valueOf(numbers));
//        System.out.println(reserved.reverse());

        while (num > 0) {
            numbers.add(num % 10);
            num /= 10;
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }
    }


}
