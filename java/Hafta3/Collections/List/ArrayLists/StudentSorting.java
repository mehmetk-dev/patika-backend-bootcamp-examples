package Hafta3.Collections.List.ArrayLists;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " - Not Ortalaması: " + grade;
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ahmet", 85.5));
        students.add(new Student("Zeynep", 92.0));
        students.add(new Student("Mehmet", 76.3));
        students.add(new Student("Elif", 89.4));

        System.out.println("Orijinal Liste:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Not ortalamasına göre büyükten küçüğe sıralama
        students.sort(Comparator.comparingDouble(s -> s.grade));

        System.out.println("\nNot Ortalamasına Göre (Büyükten Küçüğe) Sıralanmış Liste:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
