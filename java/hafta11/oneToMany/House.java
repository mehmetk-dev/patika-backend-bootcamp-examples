package hafta11.oneToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "house01")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int alan;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "house_id")
    private List<Room> rooms = new ArrayList<>();

    public House(int alan) {
        this.alan = alan;
    }

    public House() {
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", alan=" + alan +
                ", rooms=" + rooms +
                '}';
    }
}
