package Hafta1.prework;

public class multiarray {
    public static void main(String[] args) {

        int[][] numbers = new int[2][3];
        numbers[0][0]= 1;
        numbers[0][1]= 2;
        numbers[0][2]= 3;
        numbers[1][0]= 4;
        numbers[1][1]= 5;
        numbers[1][2]= 6;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        int[][] numbers2 = {
                {1,2,3}, // [0,0],[0,1],[0,2]
                {3,2,4}, // [1,0],[1,1],[1,2]
                {1,2,33}, // [2,0],[2,1],[2,2]
        };
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if (i == j){
                    sum += numbers2[i][j];
                }
            }
        }
        System.out.println(sum);


        int[][] matrix = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix.length; x++)
        {
            int[] row = matrix[x];

            for (int y = 0; y < row.length; y++)
            {
                row[y] = number;
                number++;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
}
