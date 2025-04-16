package Hafta5.Prework.Stream;

import java.util.List;
import java.util.Optional;

public class IntermadiateExample {

    public static void main(String[] args) {


        List<Student> student = List.of(
                new Student("Mehmet",List.of(new Course("Matematik"))),
                new Student("Burak",List.of(new Course("Türkçe"),new Course("Matematik"))),
                new Student("Fatmagül",List.of(new Course("Psikoloji"), new Course("Matematik")))
        );

        List<Course> matematik = student.stream()
                .flatMap(student1 -> student1.getCourses().stream())
                .filter(course -> course.getName().equals("Matematik"))
                .toList();

        System.out.println(matematik);

        Optional<String> matematik1 = student.stream()
                .flatMap(student1 -> student1.getCourses().stream())
                .filter(course -> course.getName().equals("Matematik"))
                .map(course -> course.getName().toUpperCase())
                .findFirst();

        System.out.println(matematik1.get());

        List<String> list = student.stream()
                .filter(student1 -> student1.getName().equals("Mehmet"))
                .map(student1 -> student1.getName())
                .peek(name -> name.trim())
                .filter(string -> string.endsWith("t"))
                .toList();
        System.out.println(list);
    }
}
