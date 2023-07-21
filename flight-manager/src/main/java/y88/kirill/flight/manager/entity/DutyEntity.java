package y88.kirill.flight.manager.entity;

import javax.persistence.*;
//import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "duty")
@Data
@NoArgsConstructor
public class DutyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_time_start")
    private String dateTimeStart;

    @Column(name = "date_time_end")
    private String dateTimeEnd;

    @ManyToOne
    @JoinColumn(name = "pairing_id")
    private PairingEntity pairing;

}
