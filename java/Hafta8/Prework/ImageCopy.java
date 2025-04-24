package Hafta8.Prework;

import java.io.*;

public class ImageCopy {

    public static void main(String[] args) {

        var input = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Prework\\resim.jpg");
        var output = new File("C:\\Users\\Mehme\\IdeaProjects\\java-dersleri\\java\\Hafta8\\Prework\\yeniresim.jpg");

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output))){

            byte[] buffer = new byte[1024];
            int read;

            while((read = bis.read(buffer)) != -1){

                bos.write(buffer,0,read);
            }
            System.out.println("Resim kopyalandı.");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
