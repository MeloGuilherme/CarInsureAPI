package com.audsat.carinsureapi.domain.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "cars") // Veiculos
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model; // Modelo do veiculo
    private String manufacturer; // Fabricante do veiculo
    private String production_year; // Ano do Modelo do veiculo (alterado para nao ter problema com o banco H2)

    @Column(name = "fipe_value")
    private Float fipeValue; // Valor do veiculo
}
