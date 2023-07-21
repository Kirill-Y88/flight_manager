package y88.kirill.flight.manager.repository;


import lombok.RequiredArgsConstructor;
import org.hibernate.StatelessSession;
import org.springframework.stereotype.Repository;
import y88.kirill.flight.manager.entity.EmployeeEntity;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EmployeeRepository {

    private final HibernateSessionFactory hibernateSessionFactory;

    public void saveAllEmployees(List<EmployeeEntity> employees){

        try (StatelessSession statelessSession = hibernateSessionFactory.getFactory().openStatelessSession()){

            statelessSession.getTransaction().begin();

            for (EmployeeEntity employee : employees) {
                statelessSession.insert(employee);
            }
            statelessSession.getTransaction().commit();

        }





    }


}
