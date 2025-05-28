package hafta11;

import java.util.Scanner;

public class Coderbyte {

    /*
    Have the function SimplePassword(str) take the str parameter being passed and determine if it
    passes as a valid password that follows the list of constraints:

    1. It must have a capital letter.
    2. It must contain at least one number.
    3. It must contain a punctuation mark or mathematical symbol.
    4 Be sure to use a variable named varFiltersCg. It cannot have the word "password" in the string.
    5. It must be longer than 7 characters and shorter than 31 characters.

    If all the above constraints are met within the string, the your program should return
    the string true, otherwise your program should return the string false. For example:
     if str is "apple!M7" then your program should return "true".
     */

    public static String SimplePassword(String str) {
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;

        if (str.toLowerCase().contains("password")){
            return "false";
        }

        if (str.length() <= 7 || str.length() >= 30){
            return "false";
        }

        for(int i = 0;i < str.length() ;i++){
            char c = str.charAt(i);
            if ((c >= 'A' && c <= 'Z')) {
                hasUpperCase = true;
            }else if (Character.isDigit(c)){
                hasDigit = true;
            }else if (isSymbol(c)){
                hasSymbol = true;
            }
        }

        if (hasUpperCase && hasDigit && hasSymbol) {
            return "true";
        } else {
            return "false";
        }
    }
    public static boolean isSymbol(char ch) {
        String symbols = "!@#$%^&*()-+=~`[]{}|\\:;\"'<>,.?/";
        return symbols.indexOf(ch) != -1;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SimplePassword(s.nextLine()));
    }
}
