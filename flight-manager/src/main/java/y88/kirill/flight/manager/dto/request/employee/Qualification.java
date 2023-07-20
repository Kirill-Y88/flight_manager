package y88.kirill.flight.manager.dto.request.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Qualification{
    @JsonProperty("Type")
    public String type;
    @JsonProperty("StartDate") 
    public String startDate;
    @JsonProperty("EndDate") 
    public String endDate;
    @JsonProperty("SabType") 
    public String sabType;
    @JsonProperty("Prim") 
    public String prim;
    @JsonProperty("Fleet") 
    public String fleet;
}
