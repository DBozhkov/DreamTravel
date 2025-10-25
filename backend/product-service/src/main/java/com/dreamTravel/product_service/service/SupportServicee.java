package com.dreamTravel.product_service.service;

import com.dreamTravel.product_service.entity.SupportService;
import java.util.List;

public interface SupportServicee {
    SupportService createSupportService(SupportService supportService);
    SupportService getSupportServiceById(Long id);
    List<SupportService> getAllSupportServices();
    SupportService updateSupportService(Long id, SupportService supportService);
    void deleteSupportService(Long id);
}
