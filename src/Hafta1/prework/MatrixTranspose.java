package Hafta1.prework;

public class MatrixTranspose {
    public static void main(String[] args) {

        int[][] matris = {
                {13, 23, 42},
                {95, 76, 59}
        }; // 2x3 Bir matris oluşturuyoruz

        int rows = matris.length; // Matrisimizin satır sayısını alıyoruz.
        int cols = matris[0].length; // Matrisimizin sütun sayısını alıyoruz.
        int[][] transposeMatris = new int[cols][rows]; // Transpoz matrisi tanımlayıp satır ve sütunların yerini değiştiriyoruz.

        System.out.println("Orijinal Matris");//Orijinal Matrisi Yazdırıyoruz
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matris[i][j] + "\t"); // düzgün hizalama için \t kullanıyoruz.
            }
            System.out.println(); // Her sütun bittikten sonra alt satıra geçmek için println kullanıyoruz.
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatris[j][i] = matris[i][j]; // Sırayla satır ve sütunları yer değiştiriyoruz.
            } // transposematris[2][0] = matris[0][2]  şeklinde değişiyor.
        }

        System.out.println("Transpose Matris"); // Transpoz matrisi yazdırıyoruz.
        for (int i = 0; i < cols; i++) {    // Transpoz matrisin satır sayısı cols
            for (int j = 0; j < rows; j++) {// Transpoz matrisin sütun sayısı rows
                System.out.print(transposeMatris[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
