package hafta12;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Table(name = "customers001")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column(unique = true, nullable = true)
    private String email;

    @Column
    private int age;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Product> products;
}


