package hafta11.oneToOne_birateral;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student02 {

    @Id
    private long id;
    private int number;
    private String  name;

    @OneToOne
    @JoinColumn
    private Computer02 computer;

    public Student02() {
    }

    public Student02(long id, int number, String name, Computer02 computer) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Student02{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", computer=" + computer +
                '}';
    }
}
