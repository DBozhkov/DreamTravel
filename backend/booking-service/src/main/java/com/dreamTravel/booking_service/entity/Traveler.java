package com.dreamTravel.booking_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "traveler")
@Data
public class Traveler {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthdate;
    private String passportNumber;
    private String gender;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
}