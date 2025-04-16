package Hafta2.Prework;

public class StrBuilder {
    public static void main(String[] args) {

        String name = "Mehmet";
        System.out.println(name);

        name = name.replace("h","H");
        System.out.println(name);

        StringBuilder str = new StringBuilder();

        str.append("Mehmet");

        StringBuilder alpabet = new StringBuilder();
        for (char current = 'a'; current <= 'z';current++ ){
            alpabet.append(current);
        }
        System.out.println(alpabet);
        String asd = "mehemt";
        System.out.println(asd.charAt(0));
    }
}
