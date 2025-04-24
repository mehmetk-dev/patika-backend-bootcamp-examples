package Hafta8.Prework.Model;

import java.io.*;

public class ObjectInputStreamMain {


    public static void main(String[] args){



        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {

            Person person = (Person) ois.readObject();
            System.out.println(person);
        }catch (StreamCorruptedException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
