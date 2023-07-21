package y88.kirill.flight.manager.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "leg")
@Data
@NoArgsConstructor
public class LegEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "duty_id")
    private DutyEntity duty;

    @OneToOne
    @JoinColumn(name = "flight_id")
    private FlightEntity flight;

    @Column(name = "type")
    private String type;

}
