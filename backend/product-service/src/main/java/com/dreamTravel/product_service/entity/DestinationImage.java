package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "destination_image")
@Data
public class DestinationImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Destination destination;
}