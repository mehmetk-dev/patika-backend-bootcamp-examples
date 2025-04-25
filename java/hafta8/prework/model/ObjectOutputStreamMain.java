package hafta8.prework.model;

import java.io.*;

public class ObjectOutputStreamMain {

    public static void main(String[] args) {

        Address adress = new Address("Edirne","Keşan","22");
        Person person  = new Person("mustafa",22,adress,"gizlisifre31");


        try(ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream("person.ser"))) {

            ops.writeObject(person);
            System.out.println("Person nesnesi yazıldı");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
