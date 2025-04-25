package hafta8.prework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterMain {

    public static void main(String[] args) {


        try(FileReader fr = new FileReader("writer.txt");
            FileWriter fw = new FileWriter("writer2.txt");
        ){
            int character;

            while((character = fr.read()) != -1){

                fw.write(character);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
