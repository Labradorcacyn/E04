package com.salesianos.edu.EJERCICIO041.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CreateAlumnoDto {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private Long direcciónId;
    private Long cursoId;

}
