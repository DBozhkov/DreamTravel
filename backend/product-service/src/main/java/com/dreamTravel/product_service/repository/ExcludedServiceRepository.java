package com.dreamTravel.product_service.repository;

import com.dreamTravel.product_service.entity.ExcludedService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcludedServiceRepository extends JpaRepository<ExcludedService, Long> {
}
