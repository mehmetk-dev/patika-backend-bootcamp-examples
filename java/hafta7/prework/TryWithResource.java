package hafta7.prework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        String filePath = "text.txt";

        try (var in = new FileInputStream(filePath);
             var out = new FileOutputStream("output.txt")) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
