package com.audsat.carinsureapi.domain.service;

import com.audsat.carinsureapi.domain.model.entity.Claims;
import com.audsat.carinsureapi.domain.repository.ClaimRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RisckCalculatorService {

    private final ClaimRepository claimRepository;

    public boolean isAgeRisk(int driverAge) {
        return driverAge >= 18 && driverAge <= 25;
    }

    public boolean isDriverHistoryRisk(Long driverId) {

        Claims claim = claimRepository.findByDriverId(driverId);

        return claim != null;
    }

    public boolean isVehicleHistoryRisk(Long carId) {

        Claims claim = claimRepository.findByCarId(carId);

        return claim != null;
    }
}
