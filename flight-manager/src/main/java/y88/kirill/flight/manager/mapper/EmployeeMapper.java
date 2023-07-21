package y88.kirill.flight.manager.mapper;

import org.springframework.stereotype.Component;
import y88.kirill.flight.manager.dto.request.employee.Employee;
import y88.kirill.flight.manager.entity.EmployeeEntity;

@Component
public class EmployeeMapper {



    public EmployeeEntity toEmployeeEntity(Employee employee){
        return EmployeeEntity.builder()
                .id(Long.valueOf( employee.iD))
                .gender(employee.gender)
                .fleet(employee.fleet)
                .build();
    }


}
