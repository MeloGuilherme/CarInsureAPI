package com.audsat.carinsureapi.domain.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "car_drivers") // Motoristas dos Veiculos
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class CarDrivers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Drivers driver; // Id do motorista que sera condutor do veiculo

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Cars car; // Id do carro

    @Column(name = "is_main_driver")
    private Boolean isMainDriver; // Flag que sinaliza se o motorista 'is' o principal condutor do veiculo
}
