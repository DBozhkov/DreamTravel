package com.dreamTravel.product_service.repository;

import com.dreamTravel.product_service.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
