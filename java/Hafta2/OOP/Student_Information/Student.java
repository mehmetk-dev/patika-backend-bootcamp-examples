package Hafta2.OOP.Student_Information;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private int studentNo;
    private Course[] courses = new Course[5];

    public Student(String name, String surname, LocalDate birthDate, int studentNo) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.studentNo = studentNo;
    }

    public void addCourse(Course course,int index){
        if (index>=0 && index <courses.length){
            courses[index] = course;
        }else {
            System.out.println("Maximum ders sayısını aştınız.");
        }
    }

    public void addNote(Course course,int note){
        for (Course c1: getCourse()){
            if (c1.getName().equals(course.getName())){
                c1.setNote(note);
                System.out.println(c1.getName() + " dersi için notunuz "+ note + " girilmiştir.");
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public Course[] getCourse() {
        return courses;
    }

    public void setCourse(Course[] course) {
        this.courses = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", studentNo=" + studentNo +
                '}';
    }
}
