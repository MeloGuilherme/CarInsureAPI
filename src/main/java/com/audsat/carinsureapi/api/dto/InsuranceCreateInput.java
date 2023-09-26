package com.audsat.carinsureapi.api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsuranceCreateInput {

    @NotNull(message = "Customer id cannot be null.")
    private Long customerId;

    @NotNull(message = "Car id cannot be null.")
    private Long carId;
}
