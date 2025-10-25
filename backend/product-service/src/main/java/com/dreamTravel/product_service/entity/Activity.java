package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "activity")
@Data
public class Activity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private Integer minAge;

    private Integer maxAge;

    @ManyToOne
    @JoinColumn(name = "travel_offer_id")
    private TravelOffer travelOffer;
}