package y88.kirill.flight.manager.repository;


import lombok.RequiredArgsConstructor;
//import org.hibernate.StatelessSession;
import org.hibernate.Session;
import org.hibernate.StatelessSession;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
import y88.kirill.flight.manager.entity.FlightEntity;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FlightRepositoryCustomImpl {

    private final HibernateSessionFactory hibernateSessionFactory;


    public void saveAllFlights(List<FlightEntity> flights) {

        try (StatelessSession statelessSession = hibernateSessionFactory.getFactory().openStatelessSession()) {

            statelessSession.getTransaction().begin();

            for (FlightEntity flight : flights) {
                statelessSession.insert(flight);
            }
            statelessSession.getTransaction().commit();
        }
    }

}
