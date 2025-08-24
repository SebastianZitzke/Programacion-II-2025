package Punto2;

import java.time.LocalDateTime;

public class Publicidad extends  Tarea{

    //Constructor
    public Publicidad(LocalDateTime fechaInicio, LocalDateTime fechaFin, String responsable) {
        super(fechaInicio, fechaFin, responsable);
    }

    @Override
    public String tareaAsignada() {
        return "Realizar estrategia de publicidad";
    }


}
