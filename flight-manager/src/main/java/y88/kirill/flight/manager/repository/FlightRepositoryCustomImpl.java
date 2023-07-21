package y88.kirill.flight.manager.repository;


import lombok.RequiredArgsConstructor;
import org.hibernate.StatelessSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import y88.kirill.flight.manager.entity.FlightEntity;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FlightRepositoryCustomImpl {

    private final StatelessSession statelessSession;


    public void saveAllFlights(List<FlightEntity> flights){
        statelessSession.getTransaction().begin();

        for (FlightEntity flight : flights) {
            statelessSession.insert(flight);
        }

        statelessSession.getTransaction().commit();

    }


}
