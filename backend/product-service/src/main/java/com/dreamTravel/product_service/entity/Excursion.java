package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "excursion")
@Data
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal priceAdult;

    private BigDecimal priceChild;

    private Integer minAge;

    private Integer maxAge;

    private String startingPoint;

    private String duration;

    @ManyToOne
    @JoinColumn(name = "travel_offer_id")
    private TravelOffer travelOffer;
}
