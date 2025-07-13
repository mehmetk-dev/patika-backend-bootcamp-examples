package Examples;

public class LetterCount {

    //LetterCountI(str) adlı fonksiyon, kendisine parametre olarak verilen str ifadesindeki
    // kelimelerden, içinde en çok tekrar eden harfi barındıran ilk kelimeyi döndürmelidir.

    public static void main(String[] args) {
        System.out.println(letterCount("Helo world"));
    }

    public static String letterCount(String str) {
        //hello world
//
//        String[] word = str.split(" ");
//        for (String currentWord : word) {
//            for (int j = 0; j < currentWord.length(); j++) {
//                char currentChar = currentWord.charAt(j);
//                for (int k = j + 1; k < currentWord.length(); k++) {
//                    if (currentChar == currentWord.charAt(k)) {
//                        return currentWord;
//                    }
//                }
//            }
//        }
//        return null;

        String[] words = str.split(" ");
        int maxLetterCount = 1;
        String wordWithMostRepeatLetter = "";

        for (String word : words) {
            char[] characters = word.toCharArray();
            for (char c : characters) {
                int letterCount = word.length() - word.replace(String.valueOf(c), "").length();
                if (letterCount > maxLetterCount) {
                    maxLetterCount = letterCount;
                    wordWithMostRepeatLetter = word;
                }
            }
        }
        if (maxLetterCount > 1) {
            return wordWithMostRepeatLetter;
        }
        return "-1";
    }

    public static String letterCount1(String str) {

        String[] words = str.split(" ");
        int maxRepeat = 0;
        String result = "-1";


        for (String word : words) {
            int[] freq = new int[26];

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    freq[Character.toLowerCase(c) - 'a']++;
                }
            }

            int currentMax = 0;
            for (int count : freq) {
                if (count > currentMax) {
                    currentMax = count;
                }
            }

            if (currentMax > 1 && currentMax > maxRepeat) {
                maxRepeat = currentMax;
                result = word;
            }
        }

        return result;

    }
}
