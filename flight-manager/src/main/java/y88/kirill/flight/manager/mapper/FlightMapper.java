package y88.kirill.flight.manager.mapper;

import org.springframework.stereotype.Component;
import y88.kirill.flight.manager.dto.request.fight.Flight;
import y88.kirill.flight.manager.dto.responce.FlightDto;
import y88.kirill.flight.manager.entity.FlightEntity;

@Component
public class FlightMapper {

    public FlightDto toDto(FlightEntity entity) {

        return FlightDto.builder()
                .id(entity.getId())
                .flightNum(entity.getFlightNum())
                .dateTimeArrival(entity.getDateTimeArrival())
                .dateTimeDeparture(entity.getDateTimeDeparture())
                .stationArrival(entity.getStationArrival())
                .stationDeparture(entity.getStationDeparture())
                .build();
    }

    public FlightEntity toFlightEntity(Flight flight) {

        return FlightEntity.builder()
                .id(Long.valueOf(flight.iD))
                .flightNum(Integer.valueOf(flight.flightNum))
                .stationDeparture(flight.stationDeparture)
                .stationArrival(flight.stationArrival)
                .dateTimeDeparture(flight.dateTimeDeparture)
                .dateTimeArrival(flight.dateTimeArrival)
                .build();
    }

}
