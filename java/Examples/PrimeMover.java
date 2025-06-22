package Examples;

public class PrimeMover {

    public static void main(String[] args) {

        System.out.println(primeMoverCall(9));
    }

    public static int primeMoverCall(int num){

        int count = 0;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)){
                count++;
                if (count == num){
                    return i;
                }
            }
        }
        return 0;
    }

    public static boolean isPrime(int num){

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
