package com.salesianos.edu.EJERCICIO041.dto;

import com.salesianos.edu.EJERCICIO041.model.Alumno;
import org.springframework.stereotype.Component;

@Component
public class AlumnoDtoConverter {

    public Alumno createAlumnoDtoToAlumno(CreateAlumnoDto a){
        return new Alumno(
                a.getNombre(),
                a.getApellido1(),
                a.getApellido2(),
                a.getTelefono(),
                a.getEmail()
        );
    }

    public GetAlumnoDto alumnoToGetAlumnoDto(Alumno al){
        GetAlumnoDto resultado = new GetAlumnoDto();
        resultado.setNombre(al.getNombre());
        resultado.setApellidos(al.getApellido1() + " " + al.getApellido2());
        resultado.setEmail(al.getEmail());
        resultado.setCurso(al.getCurso().getNombre());
        resultado.setDireccion(al.getDireccion().getTipoVia() + " " + al.getDireccion().getLinea1() + " "  +
                al.getDireccion().getPoblacion() + " " + al.getDireccion().getProvincia() + " " +
                al.getDireccion().getCp());
        return resultado;
    }
}
