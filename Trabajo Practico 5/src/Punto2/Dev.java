package Punto2;

import java.time.LocalDateTime;

public class Dev extends Tarea {

    //Constructor.
    public Dev(LocalDateTime fechaInicio, LocalDateTime fechaFin, String responsable) {
        super(fechaInicio, fechaFin, responsable);
    }

    @Override
    public String tareaAsignada() {
        return "Desarrollo de software";
    }
}
