package Hafta3.Generics;

public class GenericMethodExample {

    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }
}
