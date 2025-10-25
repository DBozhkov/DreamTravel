package com.dreamTravel.product_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tip")
@Data
public class Tip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String advice;

}