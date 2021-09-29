package com.damAlejandroCynthia.ejercicio2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class GetProductoDto {

    private String nombre;
    private double pvp;
    private String imagen;
    private String categoria;

}
