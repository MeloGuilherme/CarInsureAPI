package com.audsat.carinsureapi.domain.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "insurances") // Seguros
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@Entity
public class Insurances {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers costumer; //  Id do cliente

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_dt", columnDefinition = "timestamp without time zone default now()")
    private Date creationDate = new Date(); // data da solicitacao do orcamento

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_dt", columnDefinition = "timestamp without time zone default now()")
    private Date updateDate = new Date(); // data da atualizacao do orcamento

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Cars car; // Id do carro

    @Column(name = "is_active")
    private Boolean isActive; // Flag se o orcamento 'is' ativo
}
