package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.eclipse.microprofile.openapi.models.parameters.Parameter;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@Jacksonized
public class ProposalDetailsDTO {

    private Long proposalId;

    private String customer;

    private BigDecimal priceTonne;

    private Integer tonners;

    private String country;

    private Integer proposalValidityDays;

}
