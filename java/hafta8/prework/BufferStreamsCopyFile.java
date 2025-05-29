package hafta8.prework;

import java.io.*;

public class BufferStreamsCopyFile {


    public static void main(String[] args) {

        var source = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Prework\\source.txt");
        var destination = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Prework\\destination.txt");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[1024];
            int read;

            while ((read = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, read);
            }

            System.out.println("Dosya başarıyla kopyalandı.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
