package y88.kirill.flight.manager.dto.request.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class FleetsPer{
    @JsonProperty("Fleet")
    public String fleet;
    @JsonProperty("Rank") 
    public String rank;
    @JsonProperty("FleetSkills") 
    public ArrayList<String> fleetSkills;
    @JsonProperty("IndexPort") 
    public String indexPort;
    @JsonProperty("UnskilledFor") 
    public ArrayList<Integer> unskilledFor;
    @JsonProperty("MentorFor") 
    public ArrayList<Integer> mentorFor;
}
