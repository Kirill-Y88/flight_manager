package y88.kirill.flight.manager.dto.request.roster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Crew{
    @JsonProperty("FO")
    public int fO;
    @JsonProperty("CPT") 
    public int cPT;
}
