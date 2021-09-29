package com.salesianos.edu.EJERCICIO041;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String tipo;
    private String tutor;
    private int aula;

    public Curso(String nombre, String tipo, String tutor, int aula) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tutor = tutor;
        this.aula = aula;
    }
}
