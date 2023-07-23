package y88.kirill.flight.manager.repository;


import lombok.RequiredArgsConstructor;
import org.hibernate.StatelessSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import y88.kirill.flight.manager.entity.DutyEntity;
import y88.kirill.flight.manager.entity.LegEntity;
import y88.kirill.flight.manager.entity.PairingEntity;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PairingRepository {

    private final HibernateSessionFactory hibernateSessionFactory;

    public void saveAllPairing(List<PairingEntity> pairings){

        try(StatelessSession statelessSession = hibernateSessionFactory.getFactory().openStatelessSession()){

            statelessSession.getTransaction().begin();

            for (PairingEntity pairing : pairings) {
                statelessSession.insert(pairing);
            }

            List<DutyEntity> dutyEntities = pairings.stream()
                            .flatMap(pairing -> pairing.getDutyEntities().stream()
                                    .peek(dutyEntity -> dutyEntity.setPairing(pairing)))
                                    .toList();

            for (DutyEntity dutyEntity : dutyEntities) {
                dutyEntity.setId((Long)statelessSession.insert(dutyEntity));
            }

            List<LegEntity> legEntities = dutyEntities.stream()
                            .flatMap(duty -> duty.getLegEntities().stream()
                                    .peek(leg-> leg.setDuty(duty)))
                                    .toList();

            for (LegEntity legEntity : legEntities) {
                statelessSession.insert(legEntity);
            }

            statelessSession.getTransaction().commit();
        }
    }

    public List<PairingEntity> findAllPairingsByEmployee(Long employeeId){

        try(StatelessSession statelessSession = hibernateSessionFactory.getFactory().openStatelessSession()){

            statelessSession.getTransaction().begin();

            List<PairingEntity> pairingEntities = statelessSession
                    .createNativeQuery(
                            "select p.id, p.fleet, p.date_time_start, p.date_time_end  from pairing p \n" +
                                    "right join \"assignment\" a on p.id = a.pairing_id \n" +
                                    "where a.employee_id = :employee_id",PairingEntity.class)
                    .setParameter("employee_id", employeeId)
                    .getResultList();

            statelessSession.getTransaction().commit();

            return pairingEntities;
        }

    }
}
