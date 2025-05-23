package hafta11.oneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Computer {

    @Id
    private long id;

    private String brand;
    private String model;

    public Computer(long id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Computer(long id) {
        this.id = id;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
