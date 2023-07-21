package y88.kirill.flight.manager.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "flight")
@Getter
@Setter
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
