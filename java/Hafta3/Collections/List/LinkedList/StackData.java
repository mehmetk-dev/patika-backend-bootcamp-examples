package Hafta3.Collections.List.LinkedList;

import java.util.LinkedList;

public class StackData {
    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();

        //eleman ekleme
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);

        //eleman çıkarma
        int removedElement = stack.pop();
        System.out.println("Çıkartılan eleman: " + removedElement);
        System.out.println("Stack durumu: " + stack);

        // Stack'in en üstündeki elemanı görmek (peek)
        int topElement = stack.peek();
        System.out.println("Stack'in en üstündeki eleman: " + topElement);
    }
}
