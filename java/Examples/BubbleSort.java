package Examples;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int[] bubbleSortBasic(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int holder = array[i];
                array[i] = array[i + 1];
                array[i + 1] = holder;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] numbers = {12, 10, 8, 14, 6, 2, 3, 1};
//        for (int i = 0; i < numbers.length -1; i++) {
//            bubbleSortBasic(numbers);
//        }
//        System.out.println(Arrays.toString(numbers));

        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
