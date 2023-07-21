package y88.kirill.flight.manager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import y88.kirill.flight.manager.dto.request.fight.FlightRequestDto;
import y88.kirill.flight.manager.service.FlightService;

@RestController
@RequestMapping("/api/v1/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;


    @PostMapping
    public void uploadFlights(@RequestBody FlightRequestDto flightRequestDto){

        flightService.saveFlights(flightRequestDto.flights);


    }



}
