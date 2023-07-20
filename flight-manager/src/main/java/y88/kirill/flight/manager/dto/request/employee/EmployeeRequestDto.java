package y88.kirill.flight.manager.dto.request.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class EmployeeRequestDto {
    @JsonProperty("Caption")
    public String caption;
    @JsonProperty("Created") 
    public String created;
    @JsonProperty("Division") 
    public String division;
    @JsonProperty("Fleets") 
    public ArrayList<String> fleets;
    @JsonProperty("Version") 
    public String version;
    @JsonProperty("Employees") 
    public ArrayList<Employee> employees;
}
