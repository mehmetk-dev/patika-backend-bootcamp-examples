package Examples;

public class AnagramControl {

    public static void main(String[] args) {

        System.out.println(areAnagrams("listen", "silent"));  // true
        System.out.println(areAnagrams("hello", "holle"));    // false
        System.out.println(areAnagrams("race", "care"));      // true
    }

    public static boolean areAnagrams(String word1, String word2) {

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        boolean[] used = new boolean[chars1.length];

        for (int i = 0; i < chars1.length; i++) {
            boolean found = false;

            for (int j = 0; j < chars2.length; j++) {

                if (!used[i] && chars1[i] == chars2[j]){
                    used[i] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }

    /*
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
     */
}
