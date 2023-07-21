package y88.kirill.flight.manager.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import y88.kirill.flight.manager.dto.request.fight.Flight;
import y88.kirill.flight.manager.entity.FlightEntity;
import y88.kirill.flight.manager.mapper.FlightMapper;
import y88.kirill.flight.manager.repository.FlightRepository;
import y88.kirill.flight.manager.repository.FlightRepositoryCustomImpl;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {

   // private final FlightRepository flightRepository;
    private final FlightMapper flightMapper;
    private final FlightRepositoryCustomImpl flightRepositoryCustom;

//    public void saveFlights(List<Flight> flights){
//
//        for (Flight flight : flights) {
//            flightRepository.save(flightMapper.toFlightEntity(flight));
//        }
//
//    }

    public void saveFlights(List<Flight> flights){

        List<FlightEntity> flightEntities = flights.stream()
                .map(flightMapper::toFlightEntity)
                .toList();

        System.out.println("----" + flightEntities.get(0).getFlightNum());
        System.out.println("----" + flightEntities.get(0).getDateTimeDeparture());
        System.out.println("----" + flightEntities.get(0).getStationArrival());
        System.out.println("----" + flightEntities.get(0).getDateTimeArrival());
        System.out.println("----" + flightEntities.get(0).getStationDeparture());

        flightRepositoryCustom.saveAllFlights(flightEntities);

    }



}
