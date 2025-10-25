package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "room_type_price")
@Data
public class RoomTypePrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String roomType;

    private String guestComposition;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "departure_date_id")
    private DepartureDate departureDate;
}