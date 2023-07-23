package y88.kirill.flight.manager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import y88.kirill.flight.manager.dto.request.fight.FlightRequestDto;
import y88.kirill.flight.manager.dto.responce.FlightDto;
import y88.kirill.flight.manager.service.FlightService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;

    @PostMapping
    public void uploadFlights(@RequestBody FlightRequestDto flightRequestDto){
        flightService.saveFlights(flightRequestDto.flights);
    }

    @GetMapping("/{id}")
    public List<FlightDto> findAllFlightsByEmployee(@PathVariable Long id){
        return flightService.findAllFlightByEmployee(id);
    }

}
