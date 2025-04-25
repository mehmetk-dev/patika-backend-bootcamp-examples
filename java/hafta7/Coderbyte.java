package hafta7;

public class Coderbyte {

    /*  Have the function ArrayAddition(arr) take the array of numbers stored in arr and return
    the string true if any combination of numbers in the array (excluding the largest number)
    can be added up to equal the largest number in the array, otherwise return the string false.
    For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because 4 + 6 + 10 + 3 = 23.*/

    public static boolean ArrayAddition(int[] arr) {

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        int[] nums = new int[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != maxIndex) {
                nums[index++] = arr[i];
            }
        }

        int n = nums.length;
        int totalComb = 1 << n;

        for (int i = 1; i < totalComb; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += nums[j];
                }
            }
            if (sum == max) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testArr1 = {4, 6, 23, 10, 1, 3};
        System.out.println(ArrayAddition(testArr1)); // true

        int[] testArr2 = {3, 5, -1, 8, 12};
        System.out.println(ArrayAddition(testArr2)); // true

        int[] testArr3 = {5, 2, 1};
        System.out.println(ArrayAddition(testArr3)); // false


    }
}


