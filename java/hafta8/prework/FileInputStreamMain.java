package hafta8.prework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Prework\\veriler.txt");
        System.out.println(file.getAbsolutePath());

        System.out.println(file.length());

        FileInputStream fis = new FileInputStream(file);

        int bayt;

        while ((bayt = fis.read()) != -1){
            System.out.println((char) bayt + " - " + bayt);
        }


    }
}
