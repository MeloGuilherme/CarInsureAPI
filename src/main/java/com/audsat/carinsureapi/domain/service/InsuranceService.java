package com.audsat.carinsureapi.domain.service;

import com.audsat.carinsureapi.api.assembler.InsuranceAssembler;
import com.audsat.carinsureapi.api.dto.*;
import com.audsat.carinsureapi.domain.model.entity.Insurances;
import com.audsat.carinsureapi.domain.repository.InsuranceRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class InsuranceService {

    private final InsuranceAssembler insuranceAssembler;
    private final InsuranceRepository insuranceRepository;

    @Transactional
    public InsuranceCreateOutput createInsurance(@Valid InsuranceCreateInput json) {

        Insurances entity = insuranceAssembler.toEntity(json);

        insuranceRepository.save(entity);

        return insuranceAssembler.toCreateOutput(entity);
    }

    public InsuranceSearchOutput getInsuranceById(Long insuranceId) {

        if (insuranceId == null || insuranceId <= 0)
            return null; // ALterar para um throw

        Insurances insurance = insuranceRepository.findById(insuranceId).orElse(null);

        if (insurance != null) {

            InsuranceSearchOutput output = insuranceAssembler.toSearchOutput(insurance);

            output.setCalculatedValue(null);

            return output;
        }

        return null; // Tratar melhor posteriormente
    }

    public InsuranceUpdateOutput updateInsurance(Long insuranceId, @Valid InsuranceUpdateInput json) {

        Insurances existingInsurance = insuranceRepository.findById(insuranceId).orElse(null);

        if (existingInsurance != null) {

            existingInsurance = insuranceAssembler.toEntityForPartialUpdate(existingInsurance, json);

            insuranceRepository.save(existingInsurance);

            return insuranceAssembler.toUpdateOutput(existingInsurance);
        }

        return null; // Tratar melhor posteriormente
    }

    public String deleteInsurance(Long insuranceId) {

        insuranceRepository.deleteById(insuranceId);

        return "DELETE OK!";
    }
}
