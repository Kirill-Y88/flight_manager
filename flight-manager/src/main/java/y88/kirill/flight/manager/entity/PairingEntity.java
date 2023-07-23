package y88.kirill.flight.manager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "pairing")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PairingEntity {

    @Id
    private Long id;

    @Column(name = "fleet")
    private String fleet;

    @Column(name = "date_time_start")
    private String dateTimeStart;

    @Column(name = "date_time_end")
    private String dateTimeEnd;

    @OneToMany(mappedBy = "pairing")
    private List<DutyEntity> dutyEntities;

    @OneToMany(mappedBy = "pairing")
    private List<AssignmentEntity> assignmentEntities;


    @ManyToMany
    @JoinTable(name = "paring_flight",
            joinColumns = @JoinColumn(name = "paring_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id"))
    private List<FlightEntity> flightEntities;


}
