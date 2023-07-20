package y88.kirill.flight.manager.dto.request.fight;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class FlightRequestDto {
    @JsonProperty("Caption")
    public String caption;
    @JsonProperty("Version") 
    public int version;
    @JsonProperty("Created") 
    public String created;
    @JsonProperty("Division") 
    public String division;
    @JsonProperty("Flights") 
    public ArrayList<Flight> flights;
}
