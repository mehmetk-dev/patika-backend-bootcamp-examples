package hafta8.prework;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

    public static void main(String[] args) {

        System.out.println(System.getProperty("file.separator"));

        Path path = Paths.get("java-dersleri/Hafta8");
        System.out.println("Dosya yolu " + path);

        Path path1 = Paths.get("Hafta9/Prework");
        System.out.println(path1.toAbsolutePath());


        File directory = new File("yeni klasör");
        if (!directory.exists()) {
            boolean isCreated = directory.mkdir();
            System.out.println("Klasör oluşturuldu mu : " + isCreated + " " + directory.getAbsolutePath());
            directory.delete();
        }

        System.out.println("---------------------------");

        var file = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\Hafta9\\Prework");

        if (!file.exists()) {
            System.out.println(file.mkdir());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getParent());
        }
    }
}
