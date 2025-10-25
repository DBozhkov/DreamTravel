package com.dreamTravel.product_service.service.impl;

import com.dreamTravel.product_service.entity.SupportService;
import com.dreamTravel.product_service.repository.SupportServiceRepository;
import com.dreamTravel.product_service.service.SupportServicee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SupportServiceImpl implements SupportServicee {
    private SupportServiceRepository supportServiceRepository;

    @Override
    public SupportService createSupportService(SupportService supportService) {
        return supportServiceRepository.save(supportService);
    }

    @Override
    public SupportService getSupportServiceById(Long id) {
        Optional<SupportService> optionalSupportService = supportServiceRepository.findById(id);
        return optionalSupportService.orElse(null);
    }

    @Override
    public List<SupportService> getAllSupportServices() {
        return supportServiceRepository.findAll();
    }

    @Override
    public SupportService updateSupportService(Long id, SupportService supportService) {
        if (supportServiceRepository.existsById(id)) {
            supportService.setId(id);
            return supportServiceRepository.save(supportService);
        }
        return null;
    }

    @Override
    public void deleteSupportService(Long id) {
        supportServiceRepository.deleteById(id);
    }
}
