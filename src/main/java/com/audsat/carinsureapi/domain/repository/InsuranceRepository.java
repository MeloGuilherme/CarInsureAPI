package com.audsat.carinsureapi.domain.repository;

import com.audsat.carinsureapi.domain.model.entity.Insurances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurances, Long> {
}
