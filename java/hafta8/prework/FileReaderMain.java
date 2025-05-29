package hafta8.prework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

    public static void main(String[] args) {

        var file = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Prework\\output.txt");

        try (FileReader fr = new FileReader(file)) {

            int character;

            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
