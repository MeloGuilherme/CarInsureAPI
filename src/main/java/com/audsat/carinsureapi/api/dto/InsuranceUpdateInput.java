package com.audsat.carinsureapi.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsuranceUpdateInput {

    private Long carId;
    private Boolean isActive;
}
