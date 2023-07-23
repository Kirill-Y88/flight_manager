package y88.kirill.flight.manager.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "duty")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @OneToMany(mappedBy = "duty")
    private List<LegEntity> legEntities;

}
