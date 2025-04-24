package Hafta8.Prework.Model;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private Address adress;
    private transient String password;

    public Person(String name, int age, Address adress, String password) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                ", password='" + password + '\'' +
                '}';
    }
}
