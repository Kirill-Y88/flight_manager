package y88.kirill.flight.manager.dto.request.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirPortQual{
    @JsonProperty("Port")
    public String port;
    @JsonProperty("Kat") 
    public String kat;
    @JsonProperty("EndDate") 
    public String endDate;
}
