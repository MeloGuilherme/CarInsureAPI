package com.audsat.carinsureapi.domain.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "customers") // Clientes
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Nome do cliente

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Drivers driver; // Id dos dados de motorista
}
