package com.damAlejandroCynthia.ejercicio2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private int desc;
    private double pvp;
    @ElementCollection // Sirve para crear una nueva tabla que la vincula con la tabla de Producto
    private List<String> imagenes;
    @ManyToOne
    private Categoria categoria;

    public Producto(String nombre, int desc, double pvp, List<String> imagenes) {
        this.nombre = nombre;
        this.desc = desc;
        this.pvp = pvp;
        this.imagenes = imagenes;
    }
}
