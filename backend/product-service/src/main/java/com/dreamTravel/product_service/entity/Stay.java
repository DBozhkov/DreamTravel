package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stay")
@Data
public class Stay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Integer rating;

    private String address;

    private String amenities;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Destination destination;

    @OneToMany(mappedBy = "stay", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StayImage> images = new ArrayList<>();

    @OneToMany(mappedBy = "stayDate", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DepartureDate> departureDates = new ArrayList<>();
}