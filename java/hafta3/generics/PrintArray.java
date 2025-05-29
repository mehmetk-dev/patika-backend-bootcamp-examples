package hafta3.generics;

public class PrintArray {

    private static <T> void printArray(T[] dizi) {
        for (T element : dizi) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Generics", "Ödev"};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        printArray(intArray);
        printArray(stringArray);
        printArray(doubleArray);
    }


}
