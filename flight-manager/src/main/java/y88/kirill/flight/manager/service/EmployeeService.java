package y88.kirill.flight.manager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import y88.kirill.flight.manager.dto.request.employee.Employee;
import y88.kirill.flight.manager.entity.EmployeeEntity;
import y88.kirill.flight.manager.mapper.EmployeeMapper;
import y88.kirill.flight.manager.repository.EmployeeRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    public void saveEmployees(List<Employee> employees){

        List<EmployeeEntity> employeeEntities = employees.stream()
                .map(employeeMapper::toEmployeeEntity)
                .toList();

        employeeRepository.saveAllEmployees(employeeEntities);
    }
}
