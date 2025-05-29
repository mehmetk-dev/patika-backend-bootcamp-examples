package hafta12;

public class Coderbyte {

    /*
     Have the function DistinctList(arr) take the array of numbers stored in arr and determine the total
     number of duplicate entries. For example if the input is [1, 2, 2, 2, 3] then your program should
     output 2 because there are two duplicates of one of the elements.
     */

    public static void main(String[] args) {

        int[] array = {0, -2, -2, 5, 5, 5};

        System.out.println(DistinctList(array));
    }
//
//    public static int DistinctList(int[] arr) {
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            for (int j = i + 1; j < arr.length - 1; j++) {
//                if (arr[i] == arr[j] && arr[j] == arr[j+1]){
//                    continue;
//                }
//                if (num == arr[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }


    public static int DistinctList(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Daha önce sayılmış mı kontrolü:
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Eğer daha önce sayılmadıysa, tüm listeyi tara
            if (!isDuplicate) {
                int freq = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        freq++;
                    }
                }

                if (freq > 1) {
                    count += (freq - 1); // sadece fazlalıkları ekle
                }
            }
        }

        return count;
    }
}
