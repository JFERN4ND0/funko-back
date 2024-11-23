package com.fantasma_de_los_funkos.funko.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@EqualsAndHashCode
public class Funko {
    private String id;
    private int cantidad;
    private String name;
    private String serie;
    private String description;
    private String status;
    private String belong;
    private String route;
    private double buy_price;
    private double sale_price;
}
