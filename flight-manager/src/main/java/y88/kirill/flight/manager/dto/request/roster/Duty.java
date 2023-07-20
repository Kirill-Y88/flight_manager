package y88.kirill.flight.manager.dto.request.roster;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Duty{
    @JsonProperty("DateTimeStart")
    public String dateTimeStart;
    @JsonProperty("DateTimeEnd") 
    public String dateTimeEnd;
    @JsonProperty("Legs") 
    public ArrayList<Leg> legs;
}
