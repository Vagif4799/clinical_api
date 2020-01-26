package Application;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "clinicaldata")
public class ClinicalData {

    @Id
    @Column(name = "id")
    private final int id;
    @Column(name = "component_name")
    private final String ComponentName;
    @Column(name = "component_value")
    private final String ComponentValue;
    @Column(name = "measured_date_time")
    private final Timestamp measuredDataTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

}
