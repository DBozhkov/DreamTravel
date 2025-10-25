package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "travel_offer_image")
@Data
public class TravelOfferImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "travel_offer_id")
    private TravelOffer travelOffer;
}