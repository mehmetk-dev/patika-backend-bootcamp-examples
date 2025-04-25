package hafta8.prework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Prework\\output.txt");

        System.out.println("Dosya mevcut mu? : " + file.exists());

        FileOutputStream fos = new FileOutputStream(file);

        String data = "Java Öğreniyorum ";

        fos.write(data.getBytes());

        fos.close();
    }
}
