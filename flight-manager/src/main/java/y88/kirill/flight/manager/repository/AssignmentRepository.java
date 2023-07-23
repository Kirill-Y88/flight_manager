package y88.kirill.flight.manager.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.StatelessSession;
import org.springframework.stereotype.Repository;
import y88.kirill.flight.manager.entity.AssignmentEntity;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AssignmentRepository {

    private final HibernateSessionFactory hibernateSessionFactory;

    public void saveAllAssignment(List<AssignmentEntity> assignmentEntities){

        try(StatelessSession statelessSession = hibernateSessionFactory.getFactory().openStatelessSession()) {

            statelessSession.getTransaction().begin();

            for (AssignmentEntity assignmentEntity : assignmentEntities) {
                statelessSession.insert(assignmentEntity);
            }

            statelessSession.getTransaction().commit();
        }

    }





}
