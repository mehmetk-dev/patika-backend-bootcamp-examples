package Hafta5.Prework.Lambdas;

import java.util.Scanner;

public class CalculatorTest {


    public static void main(String[] args) {

        Calculator addition = (a,b) -> a + b;
        Calculator subtraction = (a,b) -> a - b;
        Calculator multiplication = (a,b) -> a * b;
        Calculator division = (a,b) -> {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            return a / b;
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Choise your operation: + - * /");

        String choise = scanner.nextLine();


        double result = 0;

        switch (choise){
            case "+":
                result = addition.numbers(num1,num2);
                break;
            case "-":
                result = subtraction.numbers(num1,num2);
                break;
            case "*":
                result = multiplication.numbers(num1,num2);
                break;
            case "/":
                result = division.numbers(num1,num2);
                break;
            default:
                System.out.println(choise);
                System.out.println("Invalid operation!!!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
