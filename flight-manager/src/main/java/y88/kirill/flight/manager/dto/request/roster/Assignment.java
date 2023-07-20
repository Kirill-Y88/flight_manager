package y88.kirill.flight.manager.dto.request.roster;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assignment{
    @JsonProperty("EmployeeID")
    public String employeeID;
    @JsonProperty("Rank") 
    public String rank;
    @JsonProperty("Activity") 
    public String activity;
    @JsonProperty("PairingIBMID") 
    public String pairingIBMID;
    @JsonProperty("PairingID") 
    public int pairingID;
    @JsonProperty("Station") 
    public String station;
    @JsonProperty("DateTimeStart") 
    public String dateTimeStart;
    @JsonProperty("DateTimeEnd") 
    public String dateTimeEnd;
    @JsonProperty("WorkCredit") 
    public int workCredit;
    @JsonProperty("Actual") 
    public int actual;
}
