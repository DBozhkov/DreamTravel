package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "price")
@Data
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "travel_offer_id")
    private TravelOffer travelOffer;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomTypePrice roomType;

    private Date date;

    private BigDecimal price;

    private String occupancy;
}
