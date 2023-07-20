package y88.kirill.flight.manager.dto.request.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Employee{
    @JsonProperty("ID")
    public String iD;
    @JsonProperty("Gender") 
    public String gender;
    @JsonProperty("Fleet") 
    public String fleet;
    @JsonProperty("MaxFlightHours") 
    public String maxFlightHours;
    @JsonProperty("Citizenship") 
    public String citizenship;
    @JsonProperty("Skills") 
    public ArrayList<String> skills;
    @JsonProperty("FleetsPers") 
    public ArrayList<FleetsPer> fleetsPers;
    @JsonProperty("Qualifications") 
    public ArrayList<Qualification> qualifications;
    @JsonProperty("AirPortQual") 
    public ArrayList<AirPortQual> airPortQual;
    @JsonProperty("NotFlight") 
    public ArrayList<Integer> notFlight;
    @JsonProperty("Home") 
    public String home;
    @JsonProperty("Base") 
    public String base;
}
