package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departure_date")
@Data
public class DepartureDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private Boolean isRecommended;

    private Integer minTourists;

    private Integer maxTourists;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "travel_offer_id")
    private TravelOffer travelOfferDate;

    @ManyToOne
    @JoinColumn(name = "stay_id")
    private Stay stayDate;


    @OneToMany(mappedBy = "departureDate", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RoomTypePrice> roomPrices = new ArrayList<>();
}