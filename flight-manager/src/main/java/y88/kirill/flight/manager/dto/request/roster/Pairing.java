package y88.kirill.flight.manager.dto.request.roster;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Pairing{
    @JsonProperty("ID") 
    public int iD;
    @JsonProperty("TypePairing")
    public String typePairing;
    @JsonProperty("IBMID") 
    public String iBMID;
    @JsonProperty("DateTimeStart") 
    public String dateTimeStart;
    @JsonProperty("DateTimeEnd") 
    public String dateTimeEnd;
    @JsonProperty("RestEnd") 
    public String restEnd;
    @JsonProperty("Fleet") 
    public String fleet;
    @JsonProperty("FlightCredit") 
    public int flightCredit;
    @JsonProperty("WorkCreditInMonth") 
    public int workCreditInMonth;
    @JsonProperty("FlightCreditInMonth") 
    public int flightCreditInMonth;
    @JsonProperty("Crew") 
    public ArrayList<Crew> crew;
    @JsonProperty("Duties") 
    public ArrayList<Duty> duties;
    @JsonProperty("Station") 
    public String station;
}
