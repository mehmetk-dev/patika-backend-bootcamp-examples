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
public class Computer02 {

    @Id
    private long id;

    private String brand;
    private String model;

    @OneToOne(mappedBy = "computer")
    private Student02 student02;

    public Computer02(long id, String brand, String model, Student02 student02) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.student02 = student02;
    }

    public Computer02(long id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Computer02() {
    }

    @Override
    public String toString() {
        return "Computer02{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", student02=" + student02.getName() +
                '}';
    }
}
