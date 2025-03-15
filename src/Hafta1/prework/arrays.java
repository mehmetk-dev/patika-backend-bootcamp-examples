package Hafta1.prework;

public class arrays {
    public static void main(String[] args) {
        int [] number = new int[3];
        int number1[] = new int[5];
        String cities[] = new String[5];
        String[] cities1 = new String[3];
        number[1] = 10;

        int number3[] = {1,2,3,4,5,6,7,89,10};

        for (int num : number3){
            System.out.println(num);
        }

        arraysalistirma ar = new arraysalistirma();
        ar.Metd(2);


        arraysalistirma ar1 = new CarpimTablosu();
    }
}
