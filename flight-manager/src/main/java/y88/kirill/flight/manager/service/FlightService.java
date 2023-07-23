package y88.kirill.flight.manager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import y88.kirill.flight.manager.dto.request.fight.Flight;
import y88.kirill.flight.manager.dto.responce.FlightDto;
import y88.kirill.flight.manager.entity.FlightEntity;
import y88.kirill.flight.manager.mapper.FlightMapper;
import y88.kirill.flight.manager.repository.FlightRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightMapper flightMapper;
    private final FlightRepository flightRepository;

    public void saveFlights(List<Flight> flights){
        List<FlightEntity> flightEntities = flights.stream()
                .map(flightMapper::toFlightEntity)
                .toList();
        flightRepository.saveAllFlights(flightEntities);
    }

    public List<FlightDto> findAllFlightByEmployee(Long employeeId){
        return flightRepository.findAllFlightByEmployee(employeeId).stream()
                .map(flightMapper::toDto)
                .toList();
    }
}
