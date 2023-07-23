package y88.kirill.flight.manager.mapper;

import org.springframework.stereotype.Component;
import y88.kirill.flight.manager.dto.request.roster.Assignment;
import y88.kirill.flight.manager.entity.AssignmentEntity;
import y88.kirill.flight.manager.entity.EmployeeEntity;
import y88.kirill.flight.manager.entity.PairingEntity;

@Component
public class AssignmentMapper {

    public AssignmentEntity toAssignmentEntity(Assignment assignment) {
        return AssignmentEntity.builder()
                .pairing(PairingEntity.builder().id(assignment.pairingID).build())
                .employee(EmployeeEntity.builder().id(Long.valueOf(assignment.employeeID)).build())
                .rank(assignment.rank)
                .build();
    }

}
