package y88.kirill.flight.manager.mapper;

import org.springframework.stereotype.Component;
import y88.kirill.flight.manager.dto.request.roster.Duty;
import y88.kirill.flight.manager.dto.request.roster.Leg;
import y88.kirill.flight.manager.dto.request.roster.Pairing;
import y88.kirill.flight.manager.dto.responce.PairingDto;
import y88.kirill.flight.manager.entity.DutyEntity;
import y88.kirill.flight.manager.entity.FlightEntity;
import y88.kirill.flight.manager.entity.LegEntity;
import y88.kirill.flight.manager.entity.PairingEntity;

import java.util.ArrayList;
import java.util.List;

@Component
public class PairingMapper {

    public PairingEntity toPairingEntity(Pairing pairing){

        List<FlightEntity> flightEntities;

        PairingEntity pairingEntity = PairingEntity.builder()
                .id((long) pairing.iD)
                .fleet(pairing.fleet)
                .dateTimeStart(pairing.dateTimeStart)
                .dateTimeEnd(pairing.dateTimeEnd)
                .build();

        List<DutyEntity> dutyEntities;
        if(pairing.duties == null){
            dutyEntities = new ArrayList<>();
            flightEntities = new ArrayList<>();

        }else {
            dutyEntities = pairing.duties.stream().map(this::toDutyEntity).toList();
            flightEntities = dutyEntities.stream().flatMap(dutyEntity -> dutyEntity.getLegEntities()
                    .stream())
                    .map(LegEntity::getFlight)
                    .toList();
        }

        pairingEntity.setDutyEntities(dutyEntities);

        pairingEntity.setFlightEntities(flightEntities);

        return pairingEntity;
    }

    public PairingDto toDto(PairingEntity pairing){
        return PairingDto.builder()
                .id(pairing.getId())
                .fleet(pairing.getFleet())
                .dateTimeStart(pairing.getDateTimeStart())
                .dateTimeEnd(pairing.getDateTimeEnd())
                .build();
    }



    public DutyEntity toDutyEntity (Duty duty) {

        List<LegEntity> legEntities = duty.legs.stream().map(this::toLegEntity).toList();

        return DutyEntity.builder()
                .dateTimeStart(duty.dateTimeStart)
                .dateTimeEnd(duty.dateTimeEnd)
                .legEntities(legEntities)
                .build();
    }

    public LegEntity toLegEntity(Leg leg){
        return LegEntity.builder()
                .flight(FlightEntity.builder().id(Long.valueOf(leg.flightID)).build())
                .type(leg.type)
                .build();
    }

}
