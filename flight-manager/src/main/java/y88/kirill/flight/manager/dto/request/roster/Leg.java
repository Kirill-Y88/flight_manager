package y88.kirill.flight.manager.dto.request.roster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Leg{

    @JsonProperty("Type")
    public String type;
    @JsonProperty("FlightID") 
    public String flightID;
}
