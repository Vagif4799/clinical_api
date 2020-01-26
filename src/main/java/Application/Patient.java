package Application;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @Column(name = "id")
    private final int id;
    @Column(name = "last_name")
    private final String lastName;
    @Column(name = "first_name")
    private final String firstName;
    @Column(name = "age")
    private final int age;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "patient")
    private List<ClinicalData> clinicalData;

}
