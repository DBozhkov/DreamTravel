package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "travel_offer")
@Data
public class TravelOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String type;

    private Integer duration;

    private String transportType;

    private BigDecimal basePrice;

    private String currency;

    private String itinerary;

    @OneToMany(mappedBy = "travelOffer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelOfferImage> images = new ArrayList<>();

    @OneToMany(mappedBy = "travelOfferDate", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DepartureDate> departureDates = new ArrayList<>();
}