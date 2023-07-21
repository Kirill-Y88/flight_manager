package y88.kirill.flight.manager.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import y88.kirill.flight.manager.dto.request.fight.Flight;
import y88.kirill.flight.manager.entity.FlightEntity;
import y88.kirill.flight.manager.mapper.FlightMapper;
import y88.kirill.flight.manager.repository.FlightRepositoryCustomImpl;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightMapper flightMapper;
    private final FlightRepositoryCustomImpl flightRepository;

    public void saveFlights(List<Flight> flights){

        List<FlightEntity> flightEntities = flights.stream()
                .map(flightMapper::toFlightEntity)
                .toList();

        flightRepository.saveAllFlights(flightEntities);

    }



}
