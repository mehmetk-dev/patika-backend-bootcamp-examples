package hafta2.prework;

public class RecursiveMethods {
    public static void main(String[] args) {
        System.out.println(fibanocci(7));
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    } // 0,1,1,2,3,5,8,13,21,34

    public static int fibanocci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibanocci(number - 1) + fibanocci(number - 2);
    }
}
