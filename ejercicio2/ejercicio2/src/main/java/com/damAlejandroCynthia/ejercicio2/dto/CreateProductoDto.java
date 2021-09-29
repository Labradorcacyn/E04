package com.damAlejandroCynthia.ejercicio2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CreateProductoDto {

    private String nombre;
    private int desc;
    private double pvp;
    private String[] imagenes;
    private Long idCategoria;

}
