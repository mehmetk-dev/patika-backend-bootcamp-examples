package Hafta3.Collections.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < (cumle.length() / 2); i++){
            char c = cumle.charAt(i);
            stack.push(c);
        }
        if (isPalindrom(cumle,stack)){
            System.out.println("Cümle palindromdir");
        }else{
            System.out.println("Cümle palidrom değildir");
        }
        System.out.println(stack);

    }

    public static boolean isPalindrom(String cumle,Stack<Character> stack){
        for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {
            if (cumle.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }
}
