package hafta11.oneToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "room01")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String renk;

    public Room(String renk) {
        this.renk = renk;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", renk='" + renk + '\'' +
                '}';
    }
}
