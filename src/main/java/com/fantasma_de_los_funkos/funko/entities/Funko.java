package com.fantasma_de_los_funkos.funko.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "funko")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Funko {
    @Id @Column(name = "id_funko")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_funko;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "name")
    private String name;

    @Column(name = "serie")
    private String serie;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "belong")
    private String belong;

    @Column(name = "route")
    private String route;

    @Column(name = "buy_price")
    private double buy_price;

    @Column(name = "sale_price")
    private double sale_price;
}
