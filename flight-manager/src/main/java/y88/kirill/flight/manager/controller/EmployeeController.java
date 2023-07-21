package y88.kirill.flight.manager.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import y88.kirill.flight.manager.dto.request.employee.EmployeeRequestDto;
import y88.kirill.flight.manager.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @PostMapping
    public void uploadEmployees(@RequestBody EmployeeRequestDto employeeRequestDto){

        employeeService.saveEmployees(employeeRequestDto.employees);


    }



}
