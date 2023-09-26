package com.audsat.carinsureapi.api.controller;

import com.audsat.carinsureapi.api.dto.*;
import com.audsat.carinsureapi.domain.service.InsuranceService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    private final InsuranceService insuranceService;

    @PostMapping("/budget")
    public ResponseEntity<InsuranceCreateOutput> createInsurance(@Valid @RequestBody InsuranceCreateInput json) {
        return ResponseEntity.ok(insuranceService.createInsurance(json));
    }

    @GetMapping("/budget/{insuranceId}")
    public ResponseEntity<InsuranceSearchOutput> getInsurance(@PathVariable Long insuranceId) {
        return ResponseEntity.ok(insuranceService.getInsuranceById(insuranceId));
    }

    @PutMapping("/budget/{insuranceId}")
    public ResponseEntity<InsuranceUpdateOutput> updateInsurance(@PathVariable Long insuranceId, @Valid @RequestBody InsuranceUpdateInput json) {
        return ResponseEntity.ok(insuranceService.updateInsurance(insuranceId, json));
    }

    @DeleteMapping("/budget/{insuranceId}")
    public ResponseEntity<String> deleteInsurance(@PathVariable Long insuranceId) {
        return ResponseEntity.ok(insuranceService.deleteInsurance(insuranceId));
    }
}
