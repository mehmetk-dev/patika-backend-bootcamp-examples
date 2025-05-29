package hafta2.prework;

public class StrPool {
    public static void main(String[] args) {

        String h1 = "hello world";
        String h2 = "hello world";

        System.out.println(h1 == h2);
        System.out.println(h1.equals(h2));

        String h3 = "hello world";
        String h4 = new String("hello world");

        System.out.println(h3 == h4);
        System.out.println(h3.equals(h4));

        String h5 = "hello world";
        String h6 = new String("hello world").intern();

        System.out.println(h5 == h6);
    }
}
