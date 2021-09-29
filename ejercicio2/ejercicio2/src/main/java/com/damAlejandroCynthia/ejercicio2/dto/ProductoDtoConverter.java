package com.damAlejandroCynthia.ejercicio2.dto;

import com.damAlejandroCynthia.ejercicio2.model.Producto;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ProductoDtoConverter {

    public Producto createProductoDtoToProducto(CreateProductoDto c) {
        return new Producto(
                c.getNombre(),
                c.getDesc(),
                c.getPvp(),
                Arrays.asList(c.getImagenes())
        );
    }

    public GetProductoDto productoToGetProductoDto(Producto p) {
        return GetProductoDto.builder()
                .nombre(p.getNombre())
                .pvp(p.getPvp())
                .imagen(p.getImagenes().get(0))
                .categoria(p.getCategoria().getNombre())
                .build();
    }

}
