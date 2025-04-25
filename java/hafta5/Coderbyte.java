package hafta5;

import java.util.Scanner;

public class Coderbyte {

        public static String RunLength(String str) {

            String result = "";
            int sayac = 1;

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    sayac++;
                } else {
                    result += sayac + "" +str.charAt(i);
                    sayac = 1;
                }
            }
            result += sayac + "" +str.charAt(str.length() - 1);
            return result;
        }


        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(RunLength(s.nextLine()));
        }
}
