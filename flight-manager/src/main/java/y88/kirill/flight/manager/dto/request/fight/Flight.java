package y88.kirill.flight.manager.dto.request.fight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flight{
    @JsonProperty("ID")
    public String iD;
    @JsonProperty("Carrier") 
    public String carrier;
    @JsonProperty("FlightNum") 
    public String flightNum;
    @JsonProperty("Fleet") 
    public String fleet;
    @JsonProperty("AircraftType") 
    public String aircraftType;
    @JsonProperty("StationDeparture") 
    public String stationDeparture;
    @JsonProperty("StationArrival") 
    public String stationArrival;
    @JsonProperty("CountryDeparture") 
    public String countryDeparture;
    @JsonProperty("CountryArrival") 
    public String countryArrival;
    @JsonProperty("ServiceType") 
    public String serviceType;
    @JsonProperty("TerminalDeparture") 
    public String terminalDeparture;
    @JsonProperty("DateTimeDeparture") 
    public String dateTimeDeparture;
    @JsonProperty("DateTimeArrival") 
    public String dateTimeArrival;
    @JsonProperty("TimeArrivalShift") 
    public String timeArrivalShift;
    @JsonProperty("KatMeteoMin") 
    public String katMeteoMin;
    @JsonProperty("IndexPort") 
    public String indexPort;
    @JsonProperty("TimeDepartureShift") 
    public String timeDepartureShift;
    @JsonProperty("TerminalArrival") 
    public String terminalArrival;
    @JsonProperty("Cancelled") 
    public boolean cancelled;
}
