package y88.kirill.flight.manager.entity;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pairing")
@Data
@NoArgsConstructor
public class PairingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fleet")
    private String fleet;

    @Column(name = "date_time_departure")
    private String dateTimeDeparture;

    @Column(name = "date_time_arrival")
    private String dateTimeArrival;




}
