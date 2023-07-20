package y88.kirill.flight.manager.dto.request.roster;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class RosterRequestDto {
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Caption") 
    public String caption;
    @JsonProperty("Fleets") 
    public String fleets;
    @JsonProperty("Crew") 
    public String crew;
    @JsonProperty("Version") 
    public String version;
    @JsonProperty("StartDate") 
    public String startDate;
    @JsonProperty("EndDate") 
    public String endDate;
    @JsonProperty("Created") 
    public String created;
    @JsonProperty("Type") 
    public String type;
    @JsonProperty("Class") 
    public String clazz;
    @JsonProperty("Pairings") 
    public ArrayList<Pairing> pairings;
    @JsonProperty("Assignments") 
    public ArrayList<Assignment> assignments;
}
