package hafta8.prework;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

    public static void main(String[] args) {

        String content = "merhaba merhaba merhaba merhaba";

        try(FileWriter fw = new FileWriter("writer.txt",true)){

            fw.write(content);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
