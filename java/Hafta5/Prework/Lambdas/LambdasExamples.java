package Hafta5.Prework.Lambdas;

public class LambdasExamples{

    public static void main(String[] args) {

        //java 8 öncesi
        Greeting greeting = new Greeting() {
            @Override
            public void method(String name) {
                System.out.println("hello " + name);
            }
        };

        greeting.method("mehmet");

        //java 8 sonrası

        Greeting greeting1 = (name) -> System.out.println("bello" + name);
        greeting1.method("mehmetkerem");

        Greeting greeting2 = name -> {
            System.out.println("Volkan Konak");
            System.out.println(name);
        };
        greeting2.method("memo");





    }
}
