package com.audsat.carinsureapi.api.controller;

import com.audsat.carinsureapi.api.dto.InsuranceRequest;
import com.audsat.carinsureapi.api.dto.InsuranceResponse;
import com.audsat.carinsureapi.domain.service.InsuranceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    private final InsuranceService insuranceService;

    @PostMapping("/budget")
    public ResponseEntity<InsuranceResponse> createInsurance(@RequestBody InsuranceRequest request) {
        return ResponseEntity.ok(new InsuranceResponse());
    }

    @GetMapping("/budget/{insuranceId}")
    public ResponseEntity<InsuranceResponse> getInsurance(@PathVariable Long insuranceId) {
        return ResponseEntity.ok(new InsuranceResponse());
    }

    @PutMapping("/budget/{insuranceId}")
    public ResponseEntity<InsuranceResponse> updateInsurance(@PathVariable Long insuranceId, @RequestBody InsuranceRequest request) {
        return ResponseEntity.ok(new InsuranceResponse());
    }

    @DeleteMapping("/budget/{insuranceId}")
    public ResponseEntity<String> deleteInsurance(@PathVariable Long insuranceId) {
        return ResponseEntity.ok("DELETE OK");
    }
}
