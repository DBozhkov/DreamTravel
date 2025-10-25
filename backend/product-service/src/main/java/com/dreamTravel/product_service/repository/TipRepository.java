package com.dreamTravel.product_service.repository;

import com.dreamTravel.product_service.entity.Tip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipRepository extends JpaRepository<Tip, Long> {
}
