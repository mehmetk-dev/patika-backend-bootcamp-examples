package Hafta5.Prework.Stream;


public class Course {

    public String name;

    public String getName() {
        return name;
    }

    public Course (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
