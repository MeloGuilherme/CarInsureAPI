package com.audsat.carinsureapi.domain.repository;

import com.audsat.carinsureapi.domain.model.entity.Claims;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claims, Long> {

    Claims findByDriverId(Long driverId);

    Claims findByCarId(Long carId);
}
