package com.audsat.carinsureapi.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class InsuranceUpdateOutput {

    private Long id;
    private Long customerId;
    private Date creationDate;
    private Long carId;
    private Boolean isActive;
}
