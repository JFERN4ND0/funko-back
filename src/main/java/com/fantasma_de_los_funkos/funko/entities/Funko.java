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
    private String nombre;
    private String serie;
    private String descripcion;
    private String estatus;
    private String pertenece;
    private String ruta;
    private double precio_compra;
    private double precio_venta;
}
