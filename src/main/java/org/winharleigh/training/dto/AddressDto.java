package org.winharleigh.training.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private String addressLineOne;
    private String addressLineTwo;
    private String town;
    private String postcode;
}
