package com.dreamTravel.booking_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "booking")
@Data
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String oktaUserId;

    private Long travelOfferId;

    private LocalDate departureDate;

    private Long stayId;

    private Long roomTypePriceId;

    private String status;

    private BigDecimal totalPrice;

    private LocalDate bookingDate;

    @ElementCollection
    private List<Long> paidServiceIds;

    @ElementCollection
    private List<Long> excursionIds;

    @ElementCollection
    private List<Long> activityIds;

    @OneToMany(mappedBy = "booking")
    private List<Traveler> travelers;
}