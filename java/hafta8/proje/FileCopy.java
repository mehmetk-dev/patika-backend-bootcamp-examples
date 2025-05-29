package hafta8.proje;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {
    public static List<Integer> content = new ArrayList<>();

    public static void copyFile(String fileName) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);

            for (Integer values : content) {
                fileOutputStream.write(values);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() {

        try {
            File file = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\hafta8\\proje\\mars.mp3");
            FileInputStream fileInputStream = new FileInputStream(file);

            int reader;

            while ((reader = fileInputStream.read()) != -1) {
                content.add(reader);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        readFile();
        copyFile("marş2.mp3");

    }
}
