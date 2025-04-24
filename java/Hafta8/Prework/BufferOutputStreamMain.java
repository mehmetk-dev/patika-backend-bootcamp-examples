package Hafta8.Prework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamMain {

    public static void main(String[] args) {


        String content = """
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
                BufferedInputStream ile yazılan data-BufferedInputStream ile yazılan data
               """;

        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))){

            bos.write(content.getBytes());
            bos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
