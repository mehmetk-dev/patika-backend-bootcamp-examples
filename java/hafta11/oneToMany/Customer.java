package hafta11.oneToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", columnDefinition = "serial")
    private int id;

    @Column(name = "customer_name", nullable = false, length = 100)
    private String name;

    @Column(name = "customer_mail", nullable = false, unique = true)
    private String mail;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_gender")
    private GENDER gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "customer_on_date")
    private LocalDate onDate;

    public enum GENDER {
        MALE,
        FEMALE
    }

    public Customer() {
    }

    public Customer(String name, String mail, GENDER gender, LocalDate onDate) {
        this.name = name;
        this.mail = mail;
        this.gender = gender;
        this.onDate = onDate;
    }
}
