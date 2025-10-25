package com.dreamTravel.product_service.controller;

import com.dreamTravel.product_service.entity.SupportService;
import com.dreamTravel.product_service.service.SupportServicee;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/support")
@AllArgsConstructor
public class SupportController {
    private SupportServicee supportService;

    @PostMapping
    public ResponseEntity<SupportService> createSupportService(@RequestBody SupportService newSupportService) {
        SupportService savedSupportService = supportService.createSupportService(newSupportService);
        return new ResponseEntity<>(savedSupportService, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupportService> getSupportServiceById(@PathVariable("id") Long id) {
        SupportService foundSupportService = supportService.getSupportServiceById(id);
        return ResponseEntity.ok(foundSupportService);
    }

    @GetMapping
    public ResponseEntity<List<SupportService>> getAllSupportServices() {
        List<SupportService> supportServices = supportService.getAllSupportServices();
        return ResponseEntity.ok(supportServices);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupportService> updateSupportService(@PathVariable("id") Long id, @RequestBody SupportService supportServiceToUpdate) {
        SupportService updatedSupportService = supportService.updateSupportService(id, supportServiceToUpdate);
        return ResponseEntity.ok(updatedSupportService);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSupportService(@PathVariable("id") Long id) {
        supportService.deleteSupportService(id);
        return ResponseEntity.ok("Support service deleted successfully");
    }
}
