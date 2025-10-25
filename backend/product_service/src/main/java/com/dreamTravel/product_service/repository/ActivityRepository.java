package com.dreamTravel.product_service.repository;

import com.dreamTravel.product_service.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
