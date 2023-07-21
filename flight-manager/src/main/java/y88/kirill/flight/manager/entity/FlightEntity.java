package y88.kirill.flight.manager.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "flight")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightEntity {

    @Id
    private Long id;

    @Column(name = "flight_num")
    private Integer flightNum;

    @Column(name = "station_departure")
    private String stationDeparture;

    @Column(name = "station_arrival")
    private String stationArrival;

    @Column(name = "date_time_departure")
    private String dateTimeDeparture;

    @Column(name = "date_time_arrival")
    private String dateTimeArrival;


}
