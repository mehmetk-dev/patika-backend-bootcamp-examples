package hafta11.oneToOne;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Student {

    @Id
    private long id;
    private int number;
    private String  name;

    @OneToOne
    private Computer computer;

    public Student(long id, int number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
    }

    public Student(long id, int number, String name, Computer computer) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.computer = computer;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", computer=" + computer +
                '}';
    }
}
