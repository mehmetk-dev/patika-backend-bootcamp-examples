package Examples;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {
// Bir string içerisindeki ilk tekrar eden karakteri bulun. Eğer tekrar eden karakter yoksa null döndürün.
        System.out.println(repeat("abc"));

    }

    public static Character repeat(String value){

        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < value.length(); i++) {
            if (!set.add(value.charAt(i))){
                return value.charAt(i);
            }
        }
        return null;
    }
}

