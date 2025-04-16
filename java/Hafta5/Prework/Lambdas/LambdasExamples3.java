package Hafta5.Prework.Lambdas;

public class LambdasExamples3 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run...");
            }
        };
        Runnable runnable1 = () -> System.out.println("runnable run...");


    }
}
