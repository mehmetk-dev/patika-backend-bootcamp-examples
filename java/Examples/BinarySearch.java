package Examples;

import java.util.ArrayList;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) + 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return recursiveBinarySearch(array, target, low + 1, high);
        } else {
            return recursiveBinarySearch(array, target, low, high - 1);
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 6, 123, 544, 3212, 5433, 13123};

        System.out.println(binarySearch(numbers, 544));
    }
}
