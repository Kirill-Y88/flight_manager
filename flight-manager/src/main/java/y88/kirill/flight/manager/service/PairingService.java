package y88.kirill.flight.manager.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import y88.kirill.flight.manager.dto.request.roster.Pairing;
import y88.kirill.flight.manager.dto.responce.PairingDto;
import y88.kirill.flight.manager.entity.PairingEntity;
import y88.kirill.flight.manager.mapper.PairingMapper;
import y88.kirill.flight.manager.repository.PairingRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PairingService {

    private final PairingMapper pairingMapper;
    private final PairingRepository pairingRepository;

    public void savePairing(List<Pairing> pairings){

        List<PairingEntity> pairingEntities = pairings.stream()
                .map(pairingMapper::toPairingEntity)
                .toList();

        pairingRepository.saveAllPairing(pairingEntities);

    }

    public List<PairingDto> findAllPairingsByEmployee(Long employeeId){
        return pairingRepository.findAllPairingsByEmployee(employeeId).stream()
                .map(pairingMapper::toDto)
                .toList();
    }




}
