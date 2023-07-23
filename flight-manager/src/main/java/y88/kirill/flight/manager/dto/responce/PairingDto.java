package y88.kirill.flight.manager.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PairingDto {

    private Long id;
    private String fleet;
    private String dateTimeStart;
    private String dateTimeEnd;

}
