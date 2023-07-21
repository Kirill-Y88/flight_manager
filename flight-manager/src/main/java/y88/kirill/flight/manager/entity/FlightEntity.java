package y88.kirill.flight.manager.entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
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
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
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

//    @OneToOne(mappedBy = "flight")
//    private LegEntity leg;


    @Override
    public String toString() {
        return "FlightEntity{" +
                "id=" + id +
                ", flightNum=" + flightNum +
                ", stationDeparture='" + stationDeparture + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                ", dateTimeDeparture='" + dateTimeDeparture + '\'' +
                ", dateTimeArrival='" + dateTimeArrival + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(Integer flightNum) {
        this.flightNum = flightNum;
    }

    public String getStationDeparture() {
        return stationDeparture;
    }

    public void setStationDeparture(String stationDeparture) {
        this.stationDeparture = stationDeparture;
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }

    public String getDateTimeDeparture() {
        return dateTimeDeparture;
    }

    public void setDateTimeDeparture(String dateTimeDeparture) {
        this.dateTimeDeparture = dateTimeDeparture;
    }

    public String getDateTimeArrival() {
        return dateTimeArrival;
    }

    public void setDateTimeArrival(String dateTimeArrival) {
        this.dateTimeArrival = dateTimeArrival;
    }
}
