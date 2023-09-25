package com.audsat.carinsureapi.domain.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "drivers") // Motoristas
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class Drivers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String document; // CNH do motorista
    private Date birthdate; // Data de nascimento do motorista
}

