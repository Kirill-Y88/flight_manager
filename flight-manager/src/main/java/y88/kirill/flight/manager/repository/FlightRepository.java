package y88.kirill.flight.manager.repository;

import lombok.RequiredArgsConstructor;
import org.hibernate.StatelessSession;
import org.springframework.stereotype.Repository;
import y88.kirill.flight.manager.entity.FlightEntity;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FlightRepository {

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

    public List<FlightEntity> findAllFlightByEmployee(Long employeeId) {

        try (StatelessSession statelessSession = hibernateSessionFactory.getFactory().openStatelessSession()) {

            statelessSession.getTransaction().begin();

            List<FlightEntity> flightEntities = statelessSession
                    .createNativeQuery("select f.id, f.flight_num, f.station_departure, f.station_arrival, f.date_time_departure, f.date_time_arrival  \n" +
                            "from flight f \n" +
                            "right join leg l on f.id = l.flight_id \n" +
                            "right join duty d on d.id = l.duty_id \n" +
                            "left join pairing p on d.pairing_id = p.id \n" +
                            "left join \"assignment\" a on a.pairing_id = p.id \n" +
                            "where a.employee_id = :employee_id", FlightEntity.class)
                    .setParameter("employee_id", employeeId)
                    .getResultList();

            statelessSession.getTransaction().commit();
            return flightEntities;
        }
    }

}
