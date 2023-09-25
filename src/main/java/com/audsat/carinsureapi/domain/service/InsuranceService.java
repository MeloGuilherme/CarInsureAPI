package com.audsat.carinsureapi.domain.service;

import com.audsat.carinsureapi.api.dto.InsuranceRequest;
import com.audsat.carinsureapi.domain.model.entity.Insurances;
import com.audsat.carinsureapi.domain.repository.InsuranceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;

    public Insurances createInsurance(InsuranceRequest request) {

        // criar um novo seguro com base nos dados em request
        Insurances insurance = new Insurances();

        // add logica

        return insuranceRepository.save(insurance);
    }

    public Insurances getInsuranceById(Long insuranceId) {

        // buscar um seguro pelo ID
        return insuranceRepository.findById(insuranceId).orElse(null);
    }

    public Insurances updateInsurance(Long insuranceId, InsuranceRequest request) {

        // atualizar um seguro com base no ID e nos dados em request
        Insurances existingInsurance = insuranceRepository.findById(insuranceId).orElse(null);

        if (existingInsurance != null) {
            return insuranceRepository.save(existingInsurance);
        }

        else {
            return null;
        }
    }

    public void deleteInsurance(Long insuranceId) {

        // remover um seguro com base no ID
        insuranceRepository.deleteById(insuranceId);
    }
}
