package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "travel_offer")
@Data
public class StayImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "stay_id")
    private Stay stay;
}