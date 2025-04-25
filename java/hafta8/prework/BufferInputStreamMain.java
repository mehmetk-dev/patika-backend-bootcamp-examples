package hafta8.prework;

import java.io.*;

public class BufferInputStreamMain {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Prework\\veriler.txt");

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {

            int data;
            int counter = 0;

            while((data = bis.read()) != -1){
                counter++;
            }
            System.out.println("Toplam okunan byte sayısı: " + counter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;



    }
}
