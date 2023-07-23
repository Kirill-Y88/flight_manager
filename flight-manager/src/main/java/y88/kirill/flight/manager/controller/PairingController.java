package y88.kirill.flight.manager.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import y88.kirill.flight.manager.dto.request.roster.RosterRequestDto;
import y88.kirill.flight.manager.dto.responce.PairingDto;
import y88.kirill.flight.manager.service.AssignmentService;
import y88.kirill.flight.manager.service.PairingService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pairing")
@RequiredArgsConstructor
public class PairingController {

    private final PairingService pairingService;
    private final AssignmentService assignmentService;

    @PostMapping
    public void uploadPairings(@RequestBody RosterRequestDto requestDto){
        pairingService.savePairing(requestDto.pairings);
        assignmentService.saveAssignment(requestDto.assignments);
    }

    @GetMapping("/{id}")
    public List<PairingDto> findAllPairingByEmployee(@PathVariable Long id){
        return pairingService.findAllPairingsByEmployee(id);
    }

}
