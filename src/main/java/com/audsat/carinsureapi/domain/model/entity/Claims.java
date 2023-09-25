package com.audsat.carinsureapi.domain.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "claims") // Sinistros
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class Claims {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Cars car;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Drivers driver;

    @Column(name = "event_date")
    private Date eventDate;
}
