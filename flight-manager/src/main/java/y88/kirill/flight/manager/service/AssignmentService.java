package y88.kirill.flight.manager.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import y88.kirill.flight.manager.dto.request.roster.Assignment;
import y88.kirill.flight.manager.entity.AssignmentEntity;
import y88.kirill.flight.manager.mapper.AssignmentMapper;
import y88.kirill.flight.manager.repository.AssignmentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssignmentService {

    private final AssignmentMapper assignmentMapper;
    private final AssignmentRepository assignmentRepository;

    public void saveAssignment(List<Assignment> assignments){

        List<AssignmentEntity> assignmentEntities = assignments.stream()
                .filter(assignment -> assignment.activity.equals("pairing"))
                .map(assignmentMapper::toAssignmentEntity)
                .toList();

        assignmentRepository.saveAllAssignment(assignmentEntities);
    }

}
